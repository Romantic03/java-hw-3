package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ініціалізуємо лісту продуктів
        List<Product> products = new ArrayList<>();
        boolean addMoreProducts;

        // do...while - виконай "щось" доки addMoreProducts має вартість true
        do {
            System.out.println("Enter the name of product: ");
            String name = scanner.nextLine();
            System.out.println("Enter the quantity sold for product: ");
            int quantity = scanner.nextInt();
            System.out.println("Enter the price per unit for product: ");
            double price = scanner.nextDouble();
            System.out.println("Enter the number of days for product: ");
            int days = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product(name, price, quantity, days);
            products.add(product);

            System.out.println("Do you want to add more products? (y/n)");
            String res = scanner.nextLine();
            addMoreProducts = res.equals("y");
        } while (addMoreProducts);

        //метод forEach який є більш читабельний для мене в порівнянні по простого for
        int productNumber = 1;
        for (Product product : products) {
            System.out.printf("Product No %d: %s,\ntotal sales for %d days in EUR %.2f,\nsales by day in EUR %.2f.%n",
                    productNumber, product.getName(), product.getDays(), product.calculateTotalSales(), product.getSalesByDay());

            //за кожним разом збільшуємо номер позиції на 1
            productNumber++;
        }
    }
}