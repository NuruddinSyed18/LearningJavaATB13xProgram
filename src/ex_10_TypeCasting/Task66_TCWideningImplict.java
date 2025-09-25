package ex_10_TypeCasting;

public class Task66_TCWideningImplict {
    public static void main(String[] args) {

        // 1. Initialize an integer variable.
        int A = 100;

        System.out.println("The original int value of A is: " + A);

        // 2. Perform implicit type casting (widening).
        // The int value from A is automatically converted to a double
        // and assigned to the double variable B.
        double B = A;

        System.out.println("The converted double value of B is: " + B);
    }
}
