package ex_04_AssignmentOperators;

public class Lab34_modulusandassignoperator {
    public static void main (String[]args){
        // Modulus and Assign (%=)
        // This gives the remainder of a division.
        // Equivalent to: number = number % 7;
        int number=265;
        number %= 7;
        System.out.println("After using '%=' (265 % 7): " + number); // Output: 4 (since 60 / 7 is 8 with a remainder of 4)
        System.out.println("------------------------------------");
    }

}
