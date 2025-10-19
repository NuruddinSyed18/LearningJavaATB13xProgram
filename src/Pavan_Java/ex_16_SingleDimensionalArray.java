package Pavan_Java;

public class ex_16_SingleDimensionalArray {
    public static void main(String[] args) {

        //1) Declaring array

        //Appraoch1 : declaration
        //int a[]=new int[5];

        //adding values ino array
		/*a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		*/

        //Appraoch2 : declaration + adding values into array
        int a[]= {10,20,30,40,50};

        //System.out.println(a); // incorrect , should not use



        //3) Find size of an array
        //System.out.println(a.length); //returns lenght(size) of an array 5

        //4) read single value from an array
        //System.out.println(a[2]);  //30
        //System.out.println(a[0]); //10

        //5) read multiple values from an array
        //System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]

        //normal for loop
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]); //10
		}
		*/


        //enhanced for loop / for..each loop

        for(int value:a)
        {
            System.out.println(value);
        }


    }

}
