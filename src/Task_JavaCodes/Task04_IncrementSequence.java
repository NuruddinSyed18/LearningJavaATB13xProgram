package Task_JavaCodes;

public class Task04_IncrementSequence {
    public static void main(String[] args) {

        // Initial state
        int x = 5;

        // First line: Pre-increment
        // Increments x to 6, then prints the new value.
        System.out.println(++x);

        // Second line: Post-increment
        // Prints the current value of x (6), then increments x to 7.
        System.out.println(x++);

        // Third line: Print the final value
        // Prints the final value of x after all operations.
        System.out.println(x);
    }
}
