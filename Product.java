public class Product {
    // Private attributes protect each product's internal data.
    private String name;
    private double price;
    private int quantity;

    // Initialize a new product with its name, unit price, and stock count.
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate the value of all units of this product in stock.
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Getters allow other classes to read the private attributes.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
