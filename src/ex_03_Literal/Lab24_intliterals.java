package ex_03_Literal;

public class Lab24_intliterals {

        public static void main(String[] args) {
            // --- 1. Integer Literals ---
            // These all represent the number 100 in different number systems.
            int decimalLiteral = 100;
            int octalLiteral = 0144;      // 0 prefix for octal (base 8)
            int hexLiteral = 0x64;        // 0x prefix for hexadecimal (base 16)
            int binaryLiteral = 0b1100100; // 0b prefix for binary (base 2)

            // A long literal must end with 'L' or 'l'
            long longLiteral = 9876543210L;

            System.out.println("--- Integer Literals ---");
            System.out.println("Decimal (100): " + decimalLiteral);
            System.out.println("Octal (0144): " + octalLiteral);
            System.out.println("Hexadecimal (0x64): " + hexLiteral);
            System.out.println("Binary (0b1100100): " + binaryLiteral);
            System.out.println("Long: " + longLiteral);
            System.out.println(); // Blank line for spacing


        }

    }

