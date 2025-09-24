package ex_06_UnaryOperator;

public class Lab41_UnarycodewithEX {
    public static void main(String[] args) {

        // --- 1. Unary Plus (+) and Unary Minus (-) ---
        // These operators affect the sign of a numeric value.
        int positiveNumber = 10;

        // Unary minus negates the value.
        int negativeNumber = -positiveNumber; // negativeNumber is now -10

        // Unary plus indicates a positive value (largely for readability, as numbers are positive by default).
        int stillPositive = +positiveNumber; // stillPositive is still 10

        System.out.println("--- Unary Plus and Minus ---");
        System.out.println("Original number: " + positiveNumber);
        System.out.println("After unary minus (-): " + negativeNumber);
        System.out.println("After unary plus (+): " + stillPositive);
        System.out.println("------------------------------------");


        // --- 2. Logical Complement Operator (!) ---
        // This operator inverts the value of a boolean.
        boolean isJavaFun = true;
        boolean isJavaNotFun = !isJavaFun; // isJavaNotFun is now false

        System.out.println("--- Logical Complement ---");
        System.out.println("Original boolean: " + isJavaFun);
        System.out.println("After logical complement (!): " + isJavaNotFun);
        System.out.println("------------------------------------");


        // --- 3. Increment (++) and Decrement (--) Operators ---
        // These change a variable's value by 1.
        // The behavior differs based on whether they are placed before (pre) or after (post) the variable.

        System.out.println("--- Increment and Decrement ---");
        int preCounter = 5;
        int postCounter = 5;

        // **Pre-increment (++variable)**: Increments the value first, then uses the new value in the expression.
        System.out.println("Pre-increment (++preCounter): " + (++preCounter)); // Prints 6 (preCounter is now 6)

        // **Post-increment (variable++)**: Uses the current value in the expression first, then increments the value.
        System.out.println("Post-increment (postCounter++): " + (postCounter++)); // Prints 5 (original value)
        System.out.println("Value of postCounter after expression: " + postCounter); // Prints 6 (now it's incremented)

        int preDecrement = 5;
        int postDecrement = 5;

        // **Pre-decrement (--variable)**: Decrements the value first, then uses the new value.
        System.out.println("Pre-decrement (--preDecrement): " + (--preDecrement)); // Prints 4 (preDecrement is now 4)

        // **Post-decrement (variable--)**: Uses the current value first, then decrements it.
        System.out.println("Post-decrement (postDecrement--): " + (postDecrement--)); // Prints 5 (original value)
        System.out.println("Value of postDecrement after expression: " + postDecrement); // Prints 4 (now it's decremented)
    }
}
