import java.util.*;

public class Method {
    private static void print(int[] a) {
        Arrays.sort(a);
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + a[a.length - 1]);
        System.out.println("min = " + a[0]);
    }

    public static void nextLineMethod() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.nextLine();
            String[] strArr = str.split(" ");
            if (strArr.length > 10) {
                System.out.println("输入的整数个数超过了10个，请重新输入");
                continue;
            }
            if (strArr.length < 10) {
                System.out.println("输入的整数个数不足10个，请重新输入");
                continue;
            }
            int[] arr = new int[10];
            boolean flag = true;
            for (int i = 0; i < 10; i++) {
                try {
                    arr[i] = Integer.parseInt(strArr[i]);
                } catch (NumberFormatException e) {
                    System.out.println("输入包含非整数，请重新输入10个整数");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                print(arr);
                return;
            }
        }
    }

    public static void nextIntMethod() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[10];
        while (true) {
            for (count = 0; count < 10; count++) {
                try {
                    System.out.print((count+1)+": ");
                    int a = scan.nextInt();
                    arr[count] = a;
                } catch (InputMismatchException e) {
                    System.out.println("输入包含非整数，请重新输入10个整数");
                    scan.next();
                    count = 0;
                    break;
                }
            }
            if (count == 10) {
                print(arr);
                return;
            }
        }
    }
}
