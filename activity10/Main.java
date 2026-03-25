package activity10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> shapes = new ArrayList<>();

        // 1. Adding objects to the list
        shapes.add(new Circle(5.0, "Red", true));
        shapes.add(new Circle(5.0, "Blue", false)); // Same radius as first
        shapes.add(new Rectangle(4.0, 10.0, "Green", true));
        shapes.add(new Rectangle(2.0, 5.0, "Yellow", false));

        // 2. Iterating and showing polymorphism
        System.out.println("--- Shape Details ---");
        for (GeometricObject shape : shapes) {
            System.out.println(shape.toString());
            System.out.printf("Area: %.2f | Perimeter: %.2f%n", shape.getArea(), shape.getPerimeter());
            System.out.println("----------------------");
        }

        // 3. Demonstrating equals()
        System.out.println("\n--- Testing Equality ---");
        boolean circlesMatch = shapes.get(0).equals(shapes.get(1));
        System.out.println("Circle 1 equals Circle 2 (Same Radius): " + circlesMatch);

        boolean rectMatch = shapes.get(2).equals(shapes.get(3));
        System.out.println("Rectangle 1 equals Rectangle 2 (Different Dims): " + rectMatch);
    }
}