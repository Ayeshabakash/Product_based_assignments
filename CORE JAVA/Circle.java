class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();
        System.out.println(area);
        System.out.println( circumference);
    }
}
