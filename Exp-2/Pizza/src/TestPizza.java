import java.util.Scanner;

public class TestPizza {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择想要制作的Pizza(1.培根Pizza;2.海鲜Pizza)");
            String choice = SC.nextLine().trim();
            Pizza p = null;
            switch (choice) {
                case "1":
                    p = createBacon();
                    System.out.println("想制作的培根披萨信息如下：");
                    break;
                case "2":
                    p = createSeafood();
                    System.out.println("想制作的海鲜披萨信息如下：");
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
                    continue;
            }
            p.show();
        }
    }

    private static BaconPizza createBacon() {
        System.out.println("选择的是培根披萨");
        System.out.print("请输入价格: ");
        double price = Double.parseDouble(SC.nextLine().trim());
        System.out.print("请输入尺寸大小: ");
        int size = Integer.parseInt(SC.nextLine().trim());
        System.out.print("请输入培根重量: ");
        double weight = Double.parseDouble(SC.nextLine().trim());
        return new BaconPizza(price, size, weight);
    }

    private static SeafoodPizza createSeafood() {
        System.out.println("选择的是海鲜披萨");
        System.out.print("请输入价格: ");
        double price = Double.parseDouble(SC.nextLine().trim());
        System.out.print("请输入尺寸大小: ");
        int size = Integer.parseInt(SC.nextLine().trim());
        System.out.print("请输入海鲜配料: ");
        String topping = SC.nextLine().trim();
        return new SeafoodPizza(price, size, topping);
    }
}
