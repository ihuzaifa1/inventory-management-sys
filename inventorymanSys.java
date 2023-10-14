import java.util.Scanner;

public class inventorymanSys {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store product data
        String[] productNames = new String[100];
        double[] productPrices = new double[100];
        int[] productQuantities = new int[100];
        int productCount = 0;

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();

                    // Add the product to the arrays
                    productNames[productCount] = productName;
                    productPrices[productCount] = productPrice;
                    productQuantities[productCount] = productQuantity;
                    productCount++;
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.println("Product List:");
                    for (int i = 0; i < productCount; i++) {
                        System.out.println("Name: " + productNames[i] + ", Price: $" + productPrices[i] + ", Quantity: " + productQuantities[i]);
                    }
                    break;
                case 3:
                    System.out.println("Exiting Inventory Management System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

