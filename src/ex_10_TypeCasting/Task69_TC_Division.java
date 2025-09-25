package ex_10_TypeCasting;

public class Task69_TC_Division {

    public static void main(String[] args) {

        // Initialize the two integer variables
        int a = 10;
        int b = 3;

        System.out.println("The two numbers are: a = " + a + ", b = " + b);
        System.out.println("----------------------------------------");

        // --- Incorrect Way: Integer Division ---
        // This performs integer division, so the result is 3, not 3.333...
        // The result is then stored as a double, becoming 3.0.
        double incorrectResult = a / b;
        System.out.println("Result without typecasting (a / b): " + incorrectResult);

        // --- Correct Way: Using Explicit Typecasting ---
        // We cast 'a' to a double before the division.
        // This forces floating-point division.
        double Result = (double) a / b;

        System.out.println("Result with typecasting ((double) a / b): " + Result);
    }
}


