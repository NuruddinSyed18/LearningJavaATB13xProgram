package Task_JavaCodes;

public class Task01_PostIncrement {
    public static void main(String[] args) {

        // Initialize 'a' with the value 5
        int a = 5;

        // Use the post-increment operator
        // 1. The original value of 'a' (5) is assigned to 'b'.
        // 2. Then, 'a' is incremented to 6.
        int b = a++;

        // Print the final values of 'a' and 'b'
        System.out.println("a: " + a + ", b: " + b);
    }
}
