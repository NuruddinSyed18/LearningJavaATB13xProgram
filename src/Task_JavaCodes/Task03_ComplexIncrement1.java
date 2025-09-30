package Task_JavaCodes;

public class Task03_ComplexIncrement1 {
    public static void main(String[] args) {

        int x = 5;

        // This expression is evaluated before being passed to println
        System.out.println(x++ + ++x);

        // To show the final state of x after the line above
        System.out.println("The final value of x is: " + x);
    }
}
