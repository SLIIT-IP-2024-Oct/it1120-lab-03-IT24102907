import java.util.Scanner;

public class IT24102907Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Validate that the number is a five-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input. Please enter a five-digit number.");
            return;
        }

        // Extract and print digits
        System.out.print("Output: ");
        for (char digit : String.valueOf(number).toCharArray()) {
            System.out.print(digit + " ");
        }
    }
}
