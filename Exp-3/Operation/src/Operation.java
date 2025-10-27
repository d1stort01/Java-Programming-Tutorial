public abstract class Operation {
    protected int operand1;
    protected int operand2;
    protected char operator;

    public Operation(int operand1, int operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public abstract int operation();

    public abstract void printOperation();
}

