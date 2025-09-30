package Task_JavaCodes;

public class Task02_ComplexIncrement {

    public static void main(String[] args) {

        int i = 1;

        // This line is evaluated from left to right.
        i = i++ + ++i;

        System.out.println(i);
    }
}


