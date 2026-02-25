package activity5;

public class Dog extends Animal {
    private String color;

    public Dog(String family, String specie, String name, String color) {
        super(family, specie, name);
        this.color = color;
    }

    public void bark() {
        System.out.println("dog said bark");
    }
}