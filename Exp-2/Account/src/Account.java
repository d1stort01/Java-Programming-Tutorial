import java.util.Random;

public class Account {
    private String id;
    private String owner;
    private double balance;

    public Account() {
        this.id = null;
        this.owner = null;
        this.balance = 0.00;
    }

    public Account(String id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(String id, double amount) {
        if (this.id == null || !this.id.equals(id)) {
            System.out.println("帐号未知！");
            return;
        }
        balance += amount;
        System.out.printf("成功存款%.2f元,当前余额为%.2f元！%n", amount, balance);
    }

    public void withdraw(String id, double amount) {
        if (this.id == null || !this.id.equals(id)) {
            System.out.println("帐号未知！");
            return;
        }
        if (balance < amount) {
            System.out.println("余额不足！");
            return;
        }
        balance -= amount;
        System.out.printf("成功取款%.2f元，当前余额为%.2f元！%n", amount, balance);
    }

    public void queryBalance() {
        System.out.printf("%s %s: %.2f%n", id, owner, balance);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        Account acc1 = new Account();
        acc1.setID("10001");
        acc1.setOwner("张三");
        acc1.queryBalance();

        double in1 = Math.round(rand.nextDouble() * 100000) / 100.0;
        double out1 = Math.round(rand.nextDouble() * 100000) / 100.0;
        acc1.deposit("10001", in1);
        acc1.withdraw("10001", out1);
        acc1.queryBalance();

        Account acc2 = new Account("20002", "李四", 500.00);
        acc2.queryBalance();

        double in2 = Math.round(rand.nextDouble() * 100000) / 100.0;
        double out2 = Math.round(rand.nextDouble() * 100000) / 100.0;
        acc2.deposit("20002", in2);
        acc2.withdraw("20002", out2);
        acc2.queryBalance();
    }
}
