package ex_12_UserInput;

import java.util.Scanner;

public class Lab72_UserInput_Scanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age:");

        int age = scanner.nextInt();
        String canIVote = age >= 18 ? "Yes able to vote" : "Not able to vote";
        System.out.println(canIVote);
    }
}
