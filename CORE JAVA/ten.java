
abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
public class ten {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println( circle.calculateArea());
        Shape rectangle = new Rectangle(4, 6);
        System.out.println( rectangle.calculateArea());
        Shape triangle = new Triangle(3, 7);
        System.out.println( triangle.calculateArea());
    }
}
