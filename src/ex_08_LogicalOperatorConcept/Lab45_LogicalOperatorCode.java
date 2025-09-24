package ex_08_LogicalOperatorConcept;

public class Lab45_LogicalOperatorCode {
    public static void main(String[] args) {

        // --- Demonstrating with Boolean Literals ---
        boolean a = true;
        boolean b = false;

        System.out.println("--- Using Boolean Literals (a=true, b=false) ---");

        // 1. Logical AND (&&)
        // Returns true only if both operands are true.
        System.out.println("a && b: " + (a && b)); // false (because b is false)
        System.out.println("a && true: " + (a && true)); // true (because both are true)

        // 2. Logical OR (||)
        // Returns true if at least one of the operands is true.
        System.out.println("a || b: " + (a || b)); // true (because a is true)
        System.out.println("b || false: " + (b || false)); // false (because both are false)

        // 3. Logical NOT (!)
        // Inverts the boolean value.
        System.out.println("!a: " + !a); // false (opposite of true)
        System.out.println("!b: " + !b); // true (opposite of false)

        System.out.println("\n-------------------------------------------------");

        // --- Demonstrating with Relational Expressions ---
        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println("--- Using Relational Expressions (x=10, y=5, z=20) ---");

        // Example 1: Check if x is between y and z
        // This requires both (x > y) AND (x < z) to be true.
        boolean isBetween = (x > y) && (x < z);
        System.out.println("Is x between y and z? " + isBetween); // true (because 10 > 5 AND 10 < 20 are both true)

        // Example 2: Check if x is outside the range of y and z
        // This requires either (x < y) OR (x > z) to be true.
        boolean isOutside = (x < y) || (x > z);
        System.out.println("Is x outside the range of y and z? " + isOutside); // false (because 10 < 5 is false AND 10 > 20 is false)

        // Example 3: Using NOT to check for an invalid condition
        // Checks if x is NOT greater than y.
        boolean isNotGreater = !(x > y);
        System.out.println("Is x NOT greater than y? " + isNotGreater); // false (because x > y is true, and !true is false)
    }
}

