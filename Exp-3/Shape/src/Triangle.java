public class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValidTriangle() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double area() {
        if (!isValidTriangle()) return 0;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double circumference() {
        if (!isValidTriangle()) return 0;
        return a + b + c;
    }
}