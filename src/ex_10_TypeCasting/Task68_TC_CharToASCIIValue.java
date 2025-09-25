package ex_10_TypeCasting;

public class Task68_TC_CharToASCIIValue {

    public static void main(String[] args) {

        // --- Example 1: Convert 'A' to its ASCII value ---
        char charA = 'A';

        // Implicitly cast the char to an int to get its ASCII value.
        int asciiA = charA;

        System.out.println("The character is: " + charA);
        System.out.println("The ASCII integer value is: " + asciiA);
        System.out.println("------------------------------------");

        // --- Example 2: You can also cast explicitly (though it's not required) ---
        char charB = 'B';
        int asciiB = (int) charB;
        System.out.println("The ASCII value of '" + charB + "' is: " + asciiB);
        System.out.println("------------------------------------");

        // --- Example 3: Other characters ---
        char lowercase_a = 'a';
        char digit_0 = '0';
        char symbol = '$';

        System.out.println("The ASCII value of '" + lowercase_a + "' is: " + (int) lowercase_a);
        System.out.println("The ASCII value of '" + digit_0 + "' is: " + (int) digit_0);
        System.out.println("The ASCII value of '" + symbol + "' is: " + (int) symbol);
    }
}


