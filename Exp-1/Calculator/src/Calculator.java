public class Calculator {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        System.out.println(yIf(t));
        System.out.println(ySwitch(t));
    }

    public static double yIf(double t) {
        double result = 0;
        if (t >= 0 && t < 1) {
            result = Math.pow(t, 2) - 1;
        } else if (t >= 1 && t < 3) {
            result = Math.pow(t, 3) - 2 * t - 2;
        } else if (t >= 3 && t < 5) {
            result = Math.pow(t, 2) - Math.sin(t);
        } else if (t >= 5 && t < 7) {
            result = t + 1;
        } else {
            result = t - 1;
        }
        return result;
    }

    static double ySwitch(double t) {
        int flag;
        if (t >= 0 && t < 1) flag = 0;
        else if (t >= 1 && t < 3) flag = 1;
        else if (t >= 3 && t < 5) flag = 2;
        else if (t >= 5 && t < 7) flag = 3;
        else flag = 4;

        switch (flag) {
            case 0:
                return Math.pow(t, 2) - 1;
            case 1:
                return Math.pow(t, 3) - 2 * t - 2;
            case 2:
                return Math.pow(t, 2) - Math.sin(t);
            case 3:
                return t + 1;
            default:
                return t - 1;
        }
    }
}
