package Pavan_Java;

public class ex_05_Largestof3numIfElseIfCondition {
    public static void main(String[] args) {
        int a = 40, b = 10, c = 40;
        if (a > b && a > c) {
            System.out.println("A is the largest number");
        } else if (b > a && b > c) {
            System.out.println("B is the largest number");
        } else  {
            System.out.println("C is the largest number");
        }
    }
}
