package app;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private int days;

    public Product(String name, double price, int quantity, int days) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double calculateTotalSales() {
        return quantity * price;
    }

    public double getSalesByDay() {
        return calculateTotalSales() / days;
    }
}
