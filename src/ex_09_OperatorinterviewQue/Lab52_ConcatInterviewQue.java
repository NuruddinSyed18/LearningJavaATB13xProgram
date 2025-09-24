package ex_09_OperatorinterviewQue;

public class Lab52_ConcatInterviewQue {
    public static void main(String[] args) {
        // concatination
        System.out.println("Pramod" + "Dutta");
//        System.out.println("Pramod" / "Dutta");
//        System.out.println("Pramod" * "Dutta");
//        System.out.println("Pramod" - "Dutta");

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // + -> behave differently with the data type.
        // + -> operator overloading


        String first_name = "Pramod";
        String last_name = "Dutta";

        int c = 10;
        int d = 10;

        System.out.println(first_name + last_name + c + d);
        System.out.println(c + d + first_name + last_name);

        // BODMAS - Bracket of Div, mul, add, sub

    }
}
