package Pavan_Java;

public class ex_30_OCStudentMain {
    public static void main(String[] args) {

        //creating object with reference variable
        ex_29_OC_Student stu=new ex_29_OC_Student();

		stu.sid=1010;
		stu.sname="Krishna";
		stu.grad='A';

		stu.printStudentData();



        //creating object without reference reference varaible
        //new Student();

		/*new Student().sid=102;
		new Student().sname="John";
		new Student().grad='B';
		new Student().printStudentData();
		*/

    }

}
