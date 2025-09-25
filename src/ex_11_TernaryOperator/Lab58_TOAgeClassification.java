package ex_11_TernaryOperator;

public class Lab58_TOAgeClassification {
    public static void main(String[] args) {
        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        int age = 60;
        String result =  (age < 18 ) ? "Minor" : (age < 65) ? "Adult": "Senior";
        System.out.println(result);
    }
}
