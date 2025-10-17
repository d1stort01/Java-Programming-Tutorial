public class Complex {
    private int realPart;
    private int imaginPart;

    public Complex() {
        this(0, 0);
    }

    public Complex(int r, int i) {
        realPart = r;
        imaginPart = i;
    }

    public Complex complexAdd(Complex a) {
        return new Complex(this.realPart + a.realPart,
                this.imaginPart + a.imaginPart);
    }

    public String toString() {
        return realPart + "+" + imaginPart + "*i";
    }
}
