import java.util.Random;
public class TestOperation {
    private static final char[] OPS = {'+', '-', '*', '/'};
    private static final Random RAND = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a = RAND.nextInt(100) + 1;
            int b = RAND.nextInt(100) + 1;
            char op = OPS[RAND.nextInt(OPS.length)];
            Operation calc = new Calculation(a, b, op);
            calc.printOperation();
        }
    }
}


