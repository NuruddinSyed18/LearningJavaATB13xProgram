package Pavan_Java;

public class ex_27_ObjectCreation_Employee {
    int eid;
    String ename;
    String job;
    int sal;

    void display() {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);

    }

    public static void main(String[] args) {

        ex_27_ObjectCreation_Employee emp1 = new ex_27_ObjectCreation_Employee();

        emp1.eid = 101;
        emp1.ename = "John";
        emp1.job = "Manager";
        emp1.sal = 50000;
        emp1.display();

        ex_27_ObjectCreation_Employee emp2 = new ex_27_ObjectCreation_Employee();
        emp2.eid = 102;
        emp2.ename = "David";
        emp2.job = "engineer";
        emp2.sal = 60000;
        emp2.display();

    }
}
