package activity5;

public class Cat extends Animal {
    private String color;

    public Cat(String family, String specie, String name, String color) {
        super(family, specie, name);
        this.color = color;
    }
    public void meow(){
        System.out.println("cat said meow");
    }
}
