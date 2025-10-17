public class SeafoodPizza extends Pizza {
    private String topping;

    public SeafoodPizza(double price, int size, String topping) {
        super("海鲜披萨", price, size);
        this.topping = topping;
    }

    public void show() {
        super.show();
        System.out.println("配料信息: " + topping + ";");
    }
}
