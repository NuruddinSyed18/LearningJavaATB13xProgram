package Pavan_Java;

public class ex_34_Method_Student {


    int sid;
    String sname;
    char grade;

    void printStuData() {
        System.out.println(sid + "   " + sname + " " + grade);
    }


    void setStuData(int id, String name, char g) {
        sid = id;
        sname = name;
        grade = g;
    }

    ex_34_Method_Student(int id, String name, char g) {
        sid = id;
        sname = name;
        grade = g;
    }

}

