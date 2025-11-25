import java.util.Scanner;

public class AddExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        String exp = scan.nextLine();
        try {
            result = addExpression(exp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = -1;
        }
        System.out.println("= " + result);

        exp = scan.nextLine();
        try {
            result = addExpression(exp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = -1;
        }
        System.out.println("= " + result);
    }

    private static int addExpression(String exp) throws Exception {
        if (exp.isEmpty()) {
            throw new Exception("empty");
        }
        String[] strArr = exp.split("\\+");
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            try {
                sum += Integer.parseInt(strArr[i]);
            } catch (Exception e) {
                throw new Exception("wrong number");
            }
        }
        return sum;
    }
}
