package Prac1;

class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class MathOperation {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling overloaded methods
        System.out.println("Sum of 2 integers: " + math.add(5, 10));
        System.out.println("Sum of 3 integers: " + math.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + math.add(5.5, 2.3));
    }
}
