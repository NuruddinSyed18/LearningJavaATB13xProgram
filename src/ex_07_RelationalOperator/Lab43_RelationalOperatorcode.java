package ex_07_RelationalOperator;

public class Lab43_RelationalOperatorcode {
    public static void main(String[] args) {


        // Initialize three integer variables for comparison
        int num1 = 15;
        int num2 = 10;
        int num3 = 15;

        System.out.println("Initial values: num1 = 15, num2 = 10, num3 = 15");
        System.out.println("----------------------------------------------");

        // 1. Equal to (==)
        // Checks if the values of two operands are equal.
        System.out.println("Is num1 equal to num2? (num1 == num2): " + (num1 == num2));       // false
        System.out.println("Is num1 equal to num3? (num1 == num3): " + (num1 == num3));       // true
        System.out.println();

        // 2. Not equal to (!=)
        // Checks if the values of two operands are not equal.
        System.out.println("Is num1 not equal to num2? (num1 != num2): " + (num1 != num2));   // true
        System.out.println("Is num1 not equal to num3? (num1 != num3): " + (num1 != num3));   // false
        System.out.println();

        // 3. Greater than (>)
        // Checks if the left operand is greater than the right operand.
        System.out.println("Is num1 greater than num2? (num1 > num2): " + (num1 > num2));     // true
        System.out.println("Is num2 greater than num1? (num2 > num1): " + (num2 > num1));     // false
        System.out.println();

        // 4. Less than (<)
        // Checks if the left operand is less than the right operand.
        System.out.println("Is num2 less than num1? (num2 < num1): " + (num2 < num1));         // true
        System.out.println("Is num1 less than num2? (num1 < num2): " + (num1 < num2));         // false
        System.out.println();

        // 5. Greater than or equal to (>=)
        // Checks if the left operand is greater than or equal to the right operand.
        System.out.println("Is num1 greater than or equal to num3? (num1 >= num3): " + (num1 >= num3)); // true
        System.out.println("Is num2 greater than or equal to num1? (num2 >= num1): " + (num2 >= num1)); // false
        System.out.println();

        // 6. Less than or equal to (<=)
        // Checks if the left operand is less than or equal to the right operand.
        System.out.println("Is num1 less than or equal to num3? (num1 <= num3): " + (num1 <= num3));   // true
        System.out.println("Is num1 less than or equal to num2? (num1 <= num2): " + (num1 <= num2));   // false
    }
}

