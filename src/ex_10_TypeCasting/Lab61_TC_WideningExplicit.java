package ex_10_TypeCasting;

public class Lab61_TC_WideningExplicit {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //  Widening -> Implicit Casting
        int a1 = (int)b; // Widening -> Explicit Casting
        System.out.println(a1);
    }
}
