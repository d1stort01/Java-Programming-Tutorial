public class Circle {
    private double radius;
    public Circle(){
        radius = 10.0;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean sameRadius(Circle other){
        return Math.abs(radius - other.getRadius()) < 0.001;
    }
}
