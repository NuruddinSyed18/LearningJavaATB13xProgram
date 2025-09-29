package ex_12_UserInput;

import java.util.Scanner;

public class Lab73_UserInput_Scanner1 {
    public static void main(String[] args){
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.next();
        System.out.println(s);

        System.out.println("Enter the Int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        System.out.println("Enter the Double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
    }
}
