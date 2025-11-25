public class Triangle {
    private int x, y, z;

    public Triangle(int a, int b, int c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }
    private boolean isTriangle() {
        return x + y > z && x + z > y && y + z > x && x > 0 && y > 0 && z > 0;
    }
    public void showInfo(){
        if(!isTriangle()){
            throw new NoTriangleException("error");
        }
        System.out.println(x + " " + y + " " + z);
    }
    public double getArea(){
        if(!isTriangle()){
            throw new NoTriangleException("error");
        }
        double p = (x + y + z) / 2.0;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}
