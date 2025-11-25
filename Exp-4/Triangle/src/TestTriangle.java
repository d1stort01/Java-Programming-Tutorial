import java.util.Scanner;

public class TestTriangle
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Triangle t = new Triangle(a, b, c);
        t.showInfo();
        System.out.println(t.getArea());

        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();
        Triangle t1 = new Triangle(a1, b1, c1);
        t1.showInfo();
        System.out.println(t1.getArea());
    }
}
