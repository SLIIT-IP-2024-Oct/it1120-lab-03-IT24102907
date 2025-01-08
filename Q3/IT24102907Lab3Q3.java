import java.util.Scanner;

public class IT24102907Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the rupee amount
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();

        // Denominations array
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] counts = new int[denominations.length];

        // Calculate the number of each denomination
        int remainingAmount = amount;
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = remainingAmount / denominations[i];
            remainingAmount %= denominations[i];
        }

        // Print the results
        System.out.println("Amount = " + amount);
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] >= 10) {
                System.out.println(denominations[i] + " Notes -- " + counts[i]);
            } else {
                System.out.println(String.format("%02d", denominations[i]) + " Coins -- " + counts[i]);
            }
        }
    }
}
