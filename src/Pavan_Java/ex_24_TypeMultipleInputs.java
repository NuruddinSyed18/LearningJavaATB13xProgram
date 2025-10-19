package Pavan_Java;

import java.util.Scanner;

public class ex_24_TypeMultipleInputs {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1=sc.nextInt();

        System.out.println("Enter second number:");
        int num2=sc.nextInt();

        System.out.println("Sum of 2 numbers:"+(num1+num2));
    }

}
