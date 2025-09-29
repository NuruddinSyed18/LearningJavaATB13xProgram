package ex_13_increment_decrement_operator;

public class Lab78_AdvanceID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A + B
        // A -> a++ -> ExpA -> 10 , a =11
        // +
        // B -> a -> ExpB , ExpB -> 11 , a = 11

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 11 | 10+11 -> 21
    }
}
