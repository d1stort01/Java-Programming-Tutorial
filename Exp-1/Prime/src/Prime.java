public class Prime {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}