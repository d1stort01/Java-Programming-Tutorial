import java.util.Scanner;

public class DistinctWithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dist = new int[10];
        int count = 0;
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (dist[j] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                dist[count++] = num;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + dist[i]);
        }
    }
}