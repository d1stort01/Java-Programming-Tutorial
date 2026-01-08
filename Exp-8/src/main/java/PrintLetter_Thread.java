public class PrintLetter_Thread extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
            try {
                Thread.sleep((long) (Math.random() * 1001 + 1000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        new PrintLetter_Thread().start();
    }
}