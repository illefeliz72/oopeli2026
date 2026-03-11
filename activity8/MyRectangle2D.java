package activity8;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    // constructor
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    // getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // methods
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public boolean contains(double x, double y) {
        return (x >= x - width / 2 &&
                x <= x + width / 2 &&
                y >= y - height / 2 &&
                y <= y + height / 2);

    }

    public boolean contains(MyRectangle2D r) {
        return contains(r.x - r.width / 2, r.y - r.height / 2) &&
                contains(r.x + r.width / 2, r.y - r.height / 2) &&
                contains(r.x - r.width / 2, r.y + r.height / 2) &&
                contains(r.x + r.width / 2, r.y + r.height / 2);
    }

    public boolean overlaps(MyRectangle2D r) {
        return Math.abs(this.x - r.x) < (this.width / 2 + r.width / 2) &&
                Math.abs(this.y - r.y) < (this.height / 2 + r.height / 2);
    }
}
