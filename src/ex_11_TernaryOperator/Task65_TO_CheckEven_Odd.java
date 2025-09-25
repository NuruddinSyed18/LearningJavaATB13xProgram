package ex_11_TernaryOperator;

public class Task65_TO_CheckEven_Odd {
    public static void main(String[] args) {

        // Initialize the variable 'a' with the first value
        int a = 30020;

        System.out.println("--- First Check ---");
        System.out.println("The number is: " + a);

        // Use the ternary operator to check if 'a' is even or odd
        String result = (a % 2 == 0) ? "Even" : "Odd";

        // Print the result
        System.out.println("Result: The number is " + result);

        System.out.println("\n--- Second Check ---");

        // Update the value of 'a'
        a = 27294023;

        System.out.println("The number is now: " + a);

        // Use the same ternary operator again on the updated value
        result = (a % 2 == 0) ? "Even" : "Odd";

        // Print the new result
        System.out.println("Result: The number is " + result);

       /* First Check (a = 19):

        The condition (19 % 2 == 0) is evaluated.

        19 % 2 gives a remainder of 1.

        1 == 0 is false.

                The ternary operator returns the "false" value, which is "Odd".

                The program prints: Result: The number is Odd

        Second Check (a = 20):

        The condition (20 % 2 == 0) is evaluated.

        20 % 2 gives a remainder of 0.

        0 == 0 is true.

                The ternary operator returns the "true" value, which is "Even".

                The program prints: Result: The number is Even*/
    }
}
