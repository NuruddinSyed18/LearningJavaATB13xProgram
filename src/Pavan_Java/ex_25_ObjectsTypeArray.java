package Pavan_Java;

public class ex_25_ObjectsTypeArray {

        public static void main (String[]args){

            Object a[] = new Object[5];

            a[0] = 100;
            a[1] = "welcome";
            a[2] = 'A';
            a[3] = true;
            a[4] = 10.5;

            //System.out.println(Arrays.toString(a)); //[100, welcome, A, true, 10.5]

            for (Object syed : a) {
                System.out.println(syed);
            }


        }

    }

