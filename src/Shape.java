public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.color = colour;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String output = String.format("A shape with color of %s and ", color);
        if (isFilled()) {
            output += "filled.";
        } else {
            output += "not filled";
        }
        return output;
    }

    public static void main(String[] args) {
        Shape x = new Shape();
        System.out.println(x.isFilled());
        System.out.println(x);
    }
}