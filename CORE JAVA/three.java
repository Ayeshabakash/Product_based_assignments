
class Shape {
    public double getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
public class three {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 10);
        System.out.println( rect.getArea());
    }
}
