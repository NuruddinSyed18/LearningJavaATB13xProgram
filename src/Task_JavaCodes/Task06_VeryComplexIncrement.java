package Task_JavaCodes;

public class Task06_VeryComplexIncrement {
    public static void main(String[] args) {

        int x = 5;

        // This complex expression is evaluated from left to right.
        int y = x++ + ++x + x++ + ++x;

        // Print the final values of x and y.
        System.out.println("x = " + x + ", y = " + y);
    }
}
