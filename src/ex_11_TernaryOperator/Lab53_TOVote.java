package ex_11_TernaryOperator;

public class Lab53_TOVote {
    public static void main(String[] args) {
        // Age to vote?
        // result=condition?expression1:expression2;
        //variable = (condition) ? value_if_true : value_if_false;
        int age =10000;
        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
