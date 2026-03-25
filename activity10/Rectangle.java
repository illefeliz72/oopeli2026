package activity10;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + ", Color: " + getColor() + ", Filled: "
                + isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Rectangle))
            return false;
        Rectangle other = (Rectangle) o;
        return Double.compare(this.width, other.width) == 0 &&
                Double.compare(this.height, other.height) == 0;
    }
}