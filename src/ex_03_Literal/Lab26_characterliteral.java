package ex_03_Literal;

public class Lab26_characterliteral {
    public static void main(String[] args) {


        // --- 3. Character Literals ---
        // Enclosed in single quotes
        char charLiteral = 'A';
        char escapeSequence = '\n'; // Represents a newline character
        char unicodeLiteral = '\u0041'; // Unicode for 'A'

        System.out.println("--- Character Literals ---");
        System.out.println("Simple Character: " + charLiteral);
        System.out.print("This is before the newline escape sequence." + escapeSequence);
        System.out.println("This is after.");
        System.out.println("Unicode for 'A': " + unicodeLiteral);
        System.out.println();


    }
}