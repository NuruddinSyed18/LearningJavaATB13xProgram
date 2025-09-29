package ex_13_increment_decrement_operator;

public class Lab79_Exp {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
    }
}
