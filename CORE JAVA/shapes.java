
abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        return length * width;
    }
    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends Shape {
    double a, b, c; 
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    double getPerimeter() {
        return a + b + c;
    }
}
public class shapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println( circle.getArea());
        System.out.println(  circle.getPerimeter());
        Shape rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.getArea());
        System.out.println( rectangle.getPerimeter());
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println( triangle.getArea());
        System.out.println( triangle.getPerimeter());
    }
}
