public class FindPrime extends Thread {
    private final int start;
    private final int end;

    FindPrime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.printf("Thread-%d: %d%n", threadId(), n);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Thread t1 = new FindPrime(1, 1000);
        Thread t2 = new FindPrime(1001, 2000);
        Thread t3 = new FindPrime(2001, 3000);

        t1.start();
        t2.start();
        t3.start();
    }
}

