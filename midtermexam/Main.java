public class Main {
    public static void main(String[] args) {
        
        Product p1 = new Product("P001", "Gaming Laptop", 1299.99);
        Product p2 = new Product("P002", "Wireless Mouse", 45.50);
        Product p3 = new Product("P003", "Mechanical Keyboard", 89.99);
        Product p4 = new Product("P004", "HD Monitor", 199.00);

        Order order1 = new Order("ORD-99301");
        Order order2 = new Order("ORD-99302");

        order1.addProduct(p1);
        order1.addProduct(p2);
        
        order2.addProduct(p4);
        order2.addProduct(p3);
        order2.addProduct(p2);

        System.out.println("Displaying Order 1 Details:");
        order1.displayOrderDetails();
        
        System.out.println("Displaying Order 2 Details:");
        order2.displayOrderDetails();
        
        System.out.println("--- Summary of Totals ---");
        System.out.printf("%s Total: $%.2f%n", order1.getOrderId(), order1.getTotalCost());
        System.out.printf("%s Total: $%.2f%n", order2.getOrderId(), order2.getTotalCost());
    }
}