package Pavan_Java;

public class ex_33_GreetingMain {
    public static void main(String[] args)
    {

        ex_32_TypesofMethod_Greeting gr=new ex_32_TypesofMethod_Greeting();

        gr.m1();

        String s=gr.m2();
        System.out.println(s);

        System.out.println(gr.m2());
        gr.m3("John");


        String p=gr.m4("David");
        System.out.println(p);
        System.out.println(gr.m4("David"));


    }

}
