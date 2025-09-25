package ex_11_TernaryOperator;

public class Lab55_TOMinOfTwoNum {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int x = 1000;
        int y = 10000;
//        System.out.println(Math.max(x,y));

        int min = x < y ? x : y;
        System.out.println(min);
    }
}
