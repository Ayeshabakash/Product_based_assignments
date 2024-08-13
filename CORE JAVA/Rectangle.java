class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        System.out.println( area);
        System.out.println( perimeter);
    }
}

b