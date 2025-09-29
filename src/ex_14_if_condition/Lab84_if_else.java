package ex_14_if_condition;

public class Lab84_if_else {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        System.out.println(age);
        if (age > 18) {
            System.out.println("Yes you can go to GOA!");
        } else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}

