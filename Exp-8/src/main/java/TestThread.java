public class TestThread {
    public static void main() {
        new NumberThread().start();
        new LetterThread().start();
    }
}

class NumberThread extends Thread {
    private int n = 1;

    public void run() {
        while (true) {
            synchronized (this) {
                if (n <= 26) {
                    try {
                        System.out.println(n);
                        n++;
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

class LetterThread extends Thread {
    private char ch = 'A';

    public void run() {
        while (true) {
            synchronized (this) {
                if (ch <= 'Z') {
                    try {
                        System.out.println(ch);
                        ch++;
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
