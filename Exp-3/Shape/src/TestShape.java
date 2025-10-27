import java.text.DecimalFormat;

public class TestShape {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        Triangle triangle = new Triangle(3.3, 4.4, 5.5);
        if (triangle.isValidTriangle()) {
            System.out.println("三角形面积: " + df.format(triangle.area()));
            System.out.println("三角形周长: " + df.format(triangle.circumference()));
        } else {
            System.out.println("三角形三条边不能构成一个三角形");
        }

        Rectangle rectangle = new Rectangle(5.5, 10.1);
        System.out.println("长方形面积: " + df.format(rectangle.area()));
        System.out.println("长方形周长: " + df.format(rectangle.circumference()));
    }
}