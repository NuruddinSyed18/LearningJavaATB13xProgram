package ex_13_increment_decrement_operator;

public class Lab75_ID_ERT {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // 10+1 assigned // pre - increment
        System.out.println(a);
        System.out.println(b);
        //  Exp and Result Table
        // Line No | a | Result b
        //  6 |  10 |  NA
        // 7 |  11 |  11
        // 8 | 11(NA) | 11
        // 9 | 11 | 11(NA)
    }
}
