import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("=========================================");
        System.out.println("Order ID: " + orderId);
        System.out.println("Items in Order:");
        
        if (products.isEmpty()) {
            System.out.println("  (No items in this order yet)");
        } else {
            for (Product p : products) {
                p.displayProductInfo();
            }
        }
        
        System.out.printf("Total Cost for %s: $%.2f%n", orderId, getTotalCost());
        System.out.println("=========================================\n");
    }
}