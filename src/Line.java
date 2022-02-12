public class Line extends Point {
    private Point start;
    private Point end;
    private String color;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = "black";
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.start.x - this.end.x, 2) + Math.pow(this.start.y - this.end.y, 2));
    }

    public void setStart(Point p) {
        this.start = p;
    }

    public void setEnd(Point p) {
        this.end = p;
    }

    @Override
    public String toString() {
        return String.format("A line with: %s, and %s, with color %s ",
                start.toString(), end.toString(), this.color);
    }
    public static void main(String[] args) {
        Point a = new Point(1, 4);
        Point b = new Point(4, 8);
        Line x = new Line(a, b);
        System.out.println(x.getLength());
    }
}
