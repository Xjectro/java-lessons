package Sources.Arithmetic.src;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        double quotient = (double) a / b; // Cast to double for accurate division
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    }
}
