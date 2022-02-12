public class Point {
    double x, y;
    private String color;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        this.color = "black";
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "black";
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("A Point with x=%s, y=%s and color=%s.", this.x, this.y, this.color);
    }

    public static void main(String[] args) {
        Point p = new Point(4, 3);
        System.out.println(p);
    }
}
