package practice.week1;
public class Main2 {
    public static void main(String[] args) {
        Device obj1 = new Device();
        obj1.brand = "Samsung";
        obj1.model = "Galaxy S21 5g";
        obj1.type = "Smartphone";
        obj1.storage = 128;
        obj1.memory = 8;

        Device obj2 = new Device();
        obj2.brand = "Samsung";
        obj2.model = "Galaxy Tab Active Pro";
        obj2.type = "Tablet";
        obj2.storage = 64;
        obj2.memory = 4;

        obj1.printItems();
        obj2.printItems();
    }
}