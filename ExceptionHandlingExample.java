import java.util.Scanner;

public class ExceptionHandlingExample {
    // Method to divide two numbers (throws ArithmeticException)
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed!");
        }
        return a / b;
    }

    // Method to check age for voting (throws IllegalArgumentException)
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Error: Age must be 18 or above to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Handling division exception
        try {
            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();
            int result = divide(num, denom);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Handling age validation exception
        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
        System.out.println("Program execution completed.");
    }
}
