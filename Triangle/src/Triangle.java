public class Triangle {
    double length = 10.0;
    double height = 5.0;

    double area() {
        return length * height;
    }

    public static void main(String[] args) {
        double s;
        s = (new Triangle()).area();
        System.out.println("Area of Triangle is: " + s);
    }
}
