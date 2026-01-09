class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public synchronized int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return balance;
        } else {
            return -1;   // 余额不足
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}

class DepositTask implements Runnable {
    private final Account account;
    private final int amount;

    public DepositTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            int newBal = account.deposit(amount);
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()
                    + " 完成存款，余额变为：" + newBal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WithdrawTask implements Runnable {
    private final Account account;
    private final int amount;

    public WithdrawTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            int newBal = account.withdraw(amount);
            Thread.sleep(2000);
            if (newBal != -1) {
                System.out.println(Thread.currentThread().getName()
                        + " 完成取款，余额变为：" + newBal);
            } else {
                System.out.println(Thread.currentThread().getName()
                        + " 取款失败，余额不足！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ATMSync {
    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account(200);          // 初始余额 200
        Thread tA = new Thread(new DepositTask(acc, 100), "用户A");
        Thread tB = new Thread(new WithdrawTask(acc, 50), "用户B");

        tA.start();
        tB.start();

        tA.join();
        tB.join();

        System.out.println("最终账户余额：" + acc.getBalance());
    }
}