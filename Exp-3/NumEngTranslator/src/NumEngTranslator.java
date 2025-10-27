import java.util.*;

public class NumEngTranslator {
    private static final String[] x =
            {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] y =
            {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                    "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] z =
            {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static String numToEng(int n) {
        if (n < 10) return x[n];
        if (n < 20) return y[n - 10];
        int ten = n / 10;
        int one = n % 10;
        return z[ten - 2] + " " + x[one];
    }

    private static int engToNum(String line) {
        String[] parts = line.trim().toLowerCase().split("\\s+");
        int sum = 0;
        for (String w : parts) {
            int val = lookup(w);
            sum += val;
        }
        return sum;
    }

    private static int lookup(String w) {
        for (int i = 0; i < x.length; i++) if (x[i].equals(w)) return i;
        for (int i = 0; i < y.length; i++) if (y[i].equals(w)) return i + 10;
        for (int i = 0; i < z.length; i++) if (z[i].equals(w)) return (i + 2) * 10;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("输入：");
            String line = sc.nextLine().trim();
            try {
                int num = Integer.parseInt(line);
                if (num == -1) {
                    break;
                }
                System.out.println(numToEng(num));
            } catch (NumberFormatException e) {
                System.out.println(engToNum(line));
            }
        }
    }
}