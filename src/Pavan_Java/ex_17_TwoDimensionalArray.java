package Pavan_Java;

public class ex_17_TwoDimensionalArray {
    public static void main(String[] args) {

        //declaration

        //Appraoch1
        //int a[][]=new int[3][2];  // declaration

        //adding values
		/*a[0][0]=100;
		a[0][1]=200;

		a[1][0]=300;
		a[1][1]=400;

		a[2][0]=500;
		a[2][1]=600;
		*/

        //Appraoch2 : declration + adding values
        int a[][]= { {100,200},
                {300,400},
                {500,600}
        };

        //3) Find size of an array
        //System.out.println(a.length); // returns number of rows  3
        //System.out.println(a[0].length); // returns number of columns in specific row

        //4) read single value from an array
        //System.out.println(a[1][1]);  //400

        //5) reading data from 2D array

	/*for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++ )
		{
			System.out.print(a[i][j]+"    ");
		}
		System.out.println();
	}
	*/

        //Enhanced for loop

        for(int arr[]:a)
        {
            for(int x:arr)
            {
                System.out.print(x+"   ");
            }
            System.out.println();
        }





    }

}
