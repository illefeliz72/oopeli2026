public class Main {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.brand = "HP";
        obj1.storage = 512;
        obj1.screen = 12.5;
        obj1.model = "Probook 4540s";
        obj1.condition = "old";
        obj1.price = 35000;

        Laptop obj2 = new Laptop();
        obj2.brand = "Asus";
        obj2.storage = 256;
        obj2.screen = 12;
        obj2.model = "gyat";
        obj2.condition ="new";
        obj2.price = 67000;

        obj1.printDetails();
        obj2.printDetails();
       
    }
}