package ex_04_AssignmentOperators;

public class Lab35_chainingoperator {
    public static void main (String [] args){
        // --- 3. Chaining Assignments ---
        // Assignment operators are right-associative, so you can chain them.
        int x, y, z;
        x = y = z = 50; // 50 is first assigned to z, then z's value to y, then y's value to x.

        System.out.println("Chaining assignments:");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
