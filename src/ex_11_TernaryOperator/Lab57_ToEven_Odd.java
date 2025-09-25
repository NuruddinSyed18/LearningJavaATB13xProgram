package ex_11_TernaryOperator;

public class Lab57_ToEven_Odd {
    public static void main(String[] args) {
        long num = 120004929392302L;
        String result  = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
