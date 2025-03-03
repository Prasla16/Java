import java.util.Scanner;
// Custom Exception for Age Validation
class AgeException extends Exception {
public AgeException(String message) {
super(message);
}
}
// Custom Exception for Bank Balance
class InsufficientBalanceException extends Exception {
public InsufficientBalanceException(String message) {
super(message);
}
}
public class UserDefinedExceptionExample {
// Method to check age for voting (throws AgeException)
public static void checkAge(int age) throws AgeException {
if (age < 18) {
throw new AgeException("Error: You must be 18 or older to vote.");
}
System.out.println("You are eligible to vote.");
}
// Method to withdraw money (throws InsufficientBalanceException)
public static void withdrawMoney(double balance, double amount) throws InsufficientBalanceException {
if (amount > balance) {
throw new InsufficientBalanceException("Error: Insufficient balance! Cannot withdraw " + amount);
}
System.out.println("Withdrawal successful! Remaining balance: " + (balance - amount));
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Handling AgeException
try {
System.out.print("Enter your age: ");
int age = scanner.nextInt();
checkAge(age);
} catch (AgeException e) {
System.out.println(e.getMessage());
}
// Handling InsufficientBalanceException
try {
System.out.print("Enter account balance: ");
double balance = scanner.nextDouble();
System.out.print("Enter withdrawal amount: ");
double amount = scanner.nextDouble();
withdrawMoney(balance, amount);
} catch (InsufficientBalanceException e) {
System.out.println(e.getMessage());
}
scanner.close();
System.out.println("Program execution completed.");
}
}