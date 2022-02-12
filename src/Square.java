public class Square extends Rectangle {
    public Square() {
        this.setLength(1.0);
        this.setWidth(1.0);
    }

    public Square(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        this.setLength(side);
        this.setWidth(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    @Override
    public String toString() {
        return String.format("A Square with side=%s, which is a subclass of %s", this.getWidth(), super.toString());
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
    public static void main(String[] args) {
        Square x = new Square(3.0);
        System.out.println(x);
        x.setLength(4.0);
        System.out.println(x);
    }
}