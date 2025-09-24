package ex_05_Arthimeticoperator;

public class Lab38_ArthimeticOperator {

    public static void main(String[] args) {

        // Initialize two integer variables
        int a = 20;
        int b = 8;

        // Also initialize a counter for increment/decrement examples
        int counter = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        System.out.println("------------------------------------");

        // 1. Addition (+)
        // Adds the values of the two operands.
        int sum = a + b;
        System.out.println("Addition (a + b): " + sum); // Output: 28

        // 2. Subtraction (-)
        // Subtracts the right operand from the left operand.
        int difference = a - b;
        System.out.println("Subtraction (a - b): " + difference); // Output: 12

        // 3. Multiplication (*)
        // Multiplies the values of the two operands.
        int product = a * b;
        System.out.println("Multiplication (a * b): " + product); // Output: 160

        // 4. Division (/)
        // Divides the left operand by the right operand.
        // Since 'a' and 'b' are integers, this is integer division, which truncates the decimal part.
        int quotient = a / b;
        System.out.println("Integer Division (a / b): " + quotient); // Output: 2 (20 / 8 = 2.5, but .5 is dropped)

        // To get a precise decimal result, at least one operand must be a floating-point number.
        double preciseQuotient = (double) a / b;
        System.out.println("Floating-Point Division ((double) a / b): " + preciseQuotient); // Output: 2.5

        // 5. Modulus (%)
        // Returns the remainder of the division.
        int remainder = a % b;
        System.out.println("Modulus (a % b): " + remainder); // Output: 4 (20 divided by 8 is 2, with a remainder of 4)

        System.out.println("------------------------------------");
        System.out.println("Initial counter value: " + counter);

        // 6. Increment (++)
        // Increases the value of a variable by 1.
        counter++; // counter is now 6
        System.out.println("After Increment (counter++): " + counter); // Output: 6

        // 7. Decrement (--)
        // Decreases the value of a variable by 1.
        counter--; // counter is now back to 5
        System.out.println("After Decrement (counter--): " + counter); // Output: 5
    }
}


