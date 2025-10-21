package Pavan_Java;


public class ex_31_Constructor {
    int x,y;


    ex_31_Constructor()    // default constructor
    {
        x=10;
        y=20;
    }

    ex_31_Constructor(int a, int b)    // parameterized constructor
    {
        x=a;
        y=b;

    }

    void sum()
    {
        System.out.println(x+y);
    }


    public static void main(String[] args) {

        //Constructor cd=new Constructor();
        //cd.sum();
        ex_31_Constructor cd=new ex_31_Constructor(100,200);
        cd.sum();
    }
}
