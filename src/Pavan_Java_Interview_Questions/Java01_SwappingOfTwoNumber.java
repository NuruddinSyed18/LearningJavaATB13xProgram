package Pavan_Java_Interview_Questions;

public class Java01_SwappingOfTwoNumber {
    public static void main(String[] args) {
        //Logic1 Using third variable.
       /* int a = 10, b = 20;
        System.out.println("Before swapping of two values..." + a + "   " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After swapping of two values..." + a + "   " + b);*/

        //Logic2 Using + and - Without using third variable
       /* int a=10, b=20;
        System.out.println("Before swapping of two values..."+a+"   "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping of two values..."+a+"   "+b);*/

        //Logic3 Using * and / Without using third variable
     /*   int a = 10, b = 20;
        System.out.println("Before swapping of two values..." + a + "   " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swapping of two values..." + a + "   " + b);*/


        //Logic4 Using bitwise oprator
        /*int a = 10, b = 20;
        System.out.println("Before swapping of two values..." + a + "   " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping of two values..." + a + "   " + b);*/


        //Logic5 Using single statement
        int a = 10, b = 20;
        System.out.println("Swapping of two values..." + a + "   " + b);
        a = a + b - (b = a);
        System.out.println("After swapping of two values..." + a + "   " + b);


    }
}
