public class Calculation extends Operation {

    public Calculation(int operand1, int operand2, char operator) {
        super(operand1, operand2, operator);
    }

    public int operation() {
        switch (operator) {
            case '+': return operand1 + operand2;
            case '-': return operand1 - operand2;
            case '*': return operand1 * operand2;
            case '/': return operand1 / operand2;
            default:  return -1;
        }
    }

    public void printOperation() {
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + operation());
    }
}