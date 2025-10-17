public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c2.setRadius(20.0);

        System.out.println(c1.sameRadius(c2));
    }
}
