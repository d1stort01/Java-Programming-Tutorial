public class Pizza {
    private String name;
    private double price;
    private int size;

    public Pizza(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public void show() {
        System.out.println("名称: " + name + ";");
        System.out.println("价格: " + price + "元;");
        System.out.println("尺寸: " + size + "寸;");
    }
}