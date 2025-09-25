package ex_11_TernaryOperator;

public class Lab56_TOMaxOfTwoNum {
    public static void main(String[] args) {
        // The maximum number between two numbers by using ternary operator.
        int x = 1020102;
        int y = 2082023;
//        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);


    }
}
