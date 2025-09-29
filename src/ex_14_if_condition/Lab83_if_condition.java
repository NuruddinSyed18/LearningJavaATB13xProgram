package ex_14_if_condition;

import java.util.Scanner;

public class Lab83_if_condition {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);

        // Read the input directly as an integer
        int age = scanner.nextInt();

        // Now the comparison is between two integers
        if (age >= 18) { // Use >= to include age 18
            System.out.println("Allowed to Vote!");
        } else {
            System.out.println("Not allowed to vote yet.");
        }
        scanner.close();
        }

}
