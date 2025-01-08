import java.util.Scanner;

public class IT24102907Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKg = scanner.nextDouble();

        // Calculate the total amount
        double totalAmount = pricePerKg * numberOfKg;

        // Apply a 10% discount
        double discount = 0.10 * totalAmount;
        double amountToPay = totalAmount - discount;

        // Display the results
        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to pay after discount: " + amountToPay);
    }
}
