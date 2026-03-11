package activity8;

public class Main {
    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5, 5);
        MyRectangle2D r2 = new MyRectangle2D(3, 3, 2, 2);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("Contains point (3,3): " + r1.contains(3, 3));
        System.out.println("Contains r2: " + r1.contains(r2));
        System.out.println("Overlaps r2: " + r1.overlaps(r2));
    }
}
