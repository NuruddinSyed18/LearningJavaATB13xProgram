package ex_03_Literal;

public class Lab25_floatliteral {

    public static void main(String[] args) {

        // --- 2. Floating-Point Literals ---
        // A float literal must end with 'f' or 'F'
        float floatLiteral = 3.14f;

        // A double literal is the default for floating-point numbers
        double doubleLiteral = 2.71828;
        double scientificNotation = 6.022e23; // Using 'e' for scientific notation

        System.out.println("--- Floating-Point Literals ---");
        System.out.println("Float: " + floatLiteral);
        System.out.println("Double: " + doubleLiteral);
        System.out.println("Scientific Notation: " + scientificNotation);
        System.out.println();

    }
}
