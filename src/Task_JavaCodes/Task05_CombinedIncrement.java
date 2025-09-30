package Task_JavaCodes;

public class Task05_CombinedIncrement {
    public static void main(String[] args) {

        int a = 5;

        // This single line performs multiple operations
        int b = a++ + ++a;

        // Print the final values after the operation is complete
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
