import java.util.Locale;
import javax.swing.JOptionPane;

public class InventoryApp {
    public static void main(String[] args) {
        // Create two separate objects for a fitness equipment store.
        Product product1 = new Product("Adjustable Dumbbell", 79.95, 8);
        Product product2 = new Product("Jump Rope", 14.50, 12);

        // Ask each object to calculate its own inventory value.
        double total = product1.calculateInventoryValue()
                + product2.calculateInventoryValue();

        // Build one report so console and dialog display the same details.
        String summary = "CHRIS'S FITNESS SUPPLY - INVENTORY\n\n"
                + describeProduct(product1) + "\n\n"
                + describeProduct(product2) + "\n\n"
                + String.format(Locale.US, "Total Inventory Value: $%.2f", total);

        System.out.println(summary);

        // Display the report in a graphical message dialog.
        JOptionPane.showMessageDialog(
                null,
                summary,
                "Fitness Supply Inventory",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Format a product's attributes and calculated value for both outputs.
    private static String describeProduct(Product product) {
        return String.format(
                Locale.US,
                "Product: %s\nUnit Price: $%.2f\nQuantity: %d\nInventory Value: $%.2f",
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.calculateInventoryValue()
        );
    }
}
