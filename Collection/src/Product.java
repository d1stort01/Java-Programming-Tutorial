import java.util.*;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%s ￥%.2f %d个", name, price, quantity);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone15", 5999, 10));
        products.add(new Product("MacBookPro", 12999, 5));
        products.add(new Product("AirPods", 1299, 20));
        products.add(new Product("iPad", 3599, 8));

        products.forEach(System.out::println);
        System.out.println("sort");
        products.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        products.forEach(System.out::println);

    }
}


