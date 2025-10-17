public class BaconPizza extends Pizza {
    private double baconWeight;

    public BaconPizza(double price, int size, double baconWeight) {
        super("培根披萨", price, size);
        this.baconWeight = baconWeight;
    }

    public void show() {
        super.show();
        System.out.println("培根克数: " + baconWeight + "克;");
    }
}