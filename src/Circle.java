public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return String.format("A circle with radius=%s, which is a subclass of %s", this.radius, super.toString());
    }

    public static void main(String[] args) {
        Circle x = new Circle(1);
        System.out.println(x.getArea());
        System.out.println(x.getPerimeter());
        System.out.println(x);
    }
}
