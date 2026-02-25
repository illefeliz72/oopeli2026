package activity5;

public class Main {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Canidae", "Canis lupus", "Buddy", "Brown");
        Dog dog2 = new Dog("Canidae", "Canis lupus", "Max", "White");

       
        Cat cat1 = new Cat("Felidae", "Felis catus", "Whiskers", null);
        Cat cat2 = new Cat("Felidae", "Felis catus", "Luna", null);

        
        dog1.bark();
        dog2.bark();
        cat1.meow();
        cat2.meow();
    }
}
