package ex_11_TernaryOperator;

public class Task59_NO_GradeCalculation {
    public static void main(String[] args) {

        // --- Test Cases ---
        // You can uncomment any of these lines to test different grades.
        int marks = 35;  // Expected: A+
        // int marks = 80;  // Expected: A
        // int marks = 65;  // Expected: B
        // int marks = 50;  // Expected: C
        // int marks = 30;  // Expected: Fail

        System.out.println("Calculating grade for marks: " + marks);

        // Nested ternary operator to determine the grade.
        // For readability, it's often formatted across multiple lines.
        String grade = (marks >= 90) ? "A+" :
                (marks >= 75) ? "A" :
                        (marks >= 60) ? "B" :
                                (marks >= 40) ? "C" : "Fail";

        // Print the final result
        System.out.println("The calculated grade is: " + grade);

        /*(80 >= 90) ? ... -> This is false. The code moves to the expression after the first colon.

        (80 >= 75) ? "A" : ... -> This is true. The expression returns "A".

                The rest of the chain is ignored, and the value "A" is assigned to the grade variable.

        The program prints: "The calculated grade is: A".*/
    }
}
