package ex_02_Java_Variables;



public class Lab21_LocalVariable {
    public static void main (String[] args){
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(a);
        System.out.println(b);


    }
}
