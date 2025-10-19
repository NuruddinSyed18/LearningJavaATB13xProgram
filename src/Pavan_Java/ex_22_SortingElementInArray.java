package Pavan_Java;

import java.util.Arrays;

public class ex_22_SortingElementInArray {
    public static void main(String[] args) {

        //Sorting numbers
		/*int a[]= {100,300,200,700,500};

		System.out.println("Before sorting:"+ Arrays.toString(a));  //[100, 300, 200, 700, 500]
		Arrays.sort(a);  // this will sort elements
		System.out.println("After sorting:"+ Arrays.toString(a));  //[100, 200, 300, 500, 700]*/



        //Sorting strings
        String a[]= {"A","C","B","E","D"};

        System.out.println("Before sorting:"+ Arrays.toString(a));  //[A, C, B, E, D]
        Arrays.sort(a);  // this will sort elements
        System.out.println("After sorting:"+ Arrays.toString(a));  //[A, B, C, D, E]

    }

}
