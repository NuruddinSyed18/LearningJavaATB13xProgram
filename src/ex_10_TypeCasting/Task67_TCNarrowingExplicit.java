package ex_10_TypeCasting;

public class Task67_TCNarrowingExplicit {
    public static void main(String[] args) {

        // 1. Initialize a double variable with a decimal value.
        double myDouble = 99.99;

        System.out.println("The original double value is: " + myDouble);

        // 2. Perform explicit type casting (narrowing).
        // The cast operator (int) tells the compiler that we are
        // intentionally converting the double to an int and accept the data loss.
        int myInt = (int) myDouble;

        System.out.println("The converted int value is: " + myInt);
    }
}
