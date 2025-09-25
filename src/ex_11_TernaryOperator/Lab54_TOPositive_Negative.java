package ex_11_TernaryOperator;

public class Lab54_TOPositive_Negative {
    public static void main(String[] args) {
        int number = -10;
        // Is Number: positive or negative
        // result=condition?expression1:expression2;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
