package Pavan_Java;

public class ex_20_ReverseAnArray {
    public static void main(String[] args) {

        int a[]= {10,20,30,50,40};

        //using for loop
		/*for(int i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		*/

        //using while loop
        int i=4;
        while(i>=0)
        {
            System.out.println(a[i]);
            i--;
        }


    }

}
