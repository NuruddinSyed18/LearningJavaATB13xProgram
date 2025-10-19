package Pavan_Java;

import java.util.Arrays;

public class ex_26_StringMethods {
    public static void main(String[]args) {
        //String s="welcome";
        //String s=new String("welcome");
        //System.out.println(s);


        //lenght() - returns length of the string
        String s = "welcome";

        //int l=s.length();
        //System.out.println(l);  //7
        System.out.println(s.length()); //7


        //concat() - join string
        String s1 = "welcome";
        String s2 = "to java";
        String s3 = "programming";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));


        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));

        System.out.println("welcome" + "to java");
        System.out.println("welcome".concat("to java"));

        //trim() - remove spaces right right and left side
        s = "   welcome   ";

        System.out.println("Before trimming:" + s.length()); //13
        s1 = s.trim();
        System.out.println("After trimming:" + s1.length()); //7

        //charAt() - returns a character based on index
        // index starts from 0

        s = "welcome";

        System.out.println(s.charAt(3));   //c
        System.out.println(s.charAt(5));  //m


        //contains() - returns true/false
        //check a string is part of the main string

        System.out.println(s.contains("wel"));  //true
        System.out.println(s.contains("Come")); //false
        System.out.println(s.contains("come")); //true

        System.out.println(s.contains("welome")); //false


        //equals() , equalsIgnoreCase()  - compare 2 strings
        // returns true/false

        s1 = "welcome";
        s2 = "welcome";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals("Welcome"));  //false

        System.out.println(s1.equalsIgnoreCase("Welcome"));  //true


        //replace() - replace single character/sequence of characters(string) in a string

        s = "welcome to selenium java python python";

        System.out.println(s.replace('e', 'X')); //wXlcomX to sXlXnium java python python
        System.out.println(s.replace("python", "C#")); //welcome to selenium java C# C#

        //substring() - extract substring from the main string

        s = "welcome";

        System.out.println(s.substring(2, 5)); //lco
        System.out.println(s.substring(1, 3)); //el

        //toUpperCase()   toLowerCase() - coverting case
        s = "Welcome";

        System.out.println(s.toUpperCase()); //WELCOME  // convert to upper case
        System.out.println(s.toLowerCase()); //welcome // convert to lower case

        //split() - split/divide the string in to multiple parts based on delimeter.
        //Ex1
		/*s="abc@xyz";

		String a[]=s.split("@");
		System.out.println(a[0]);  //abc
		System.out.println(a[1]); //xyz
		*/

        //Ex2
		/*s="abc@gmail.com";

		String a[]=s.split("@");
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //gmail.com
		*/

        //Ex3  - replace()
        String amount = "$15,20,55";       // output :   152055
        System.out.println(amount.replace("$", "").replace(",", "")); //152055


        //Ex4
        //s="abc,123@xyz";       // output abc , 123, xyz

		/*String a1[]=s.split(",");   //abc,  123@xyz
		System.out.println(a1[0]);   //abc
		System.out.println(a1[1]); //123@xyz

		String a2[]=a1[1].split("@");
		System.out.println(a2[0]); //xyz
		System.out.println(a2[1]); //123
		*/

		/*s="abc,123@xyz";

		String firststring=s.split(",")[0];
		String secondstring=s.split(",")[1].split("@")[0];
		String thirdstring=s.split(",")[1].split("@")[1];

		System.out.println(firststring);
		System.out.println(secondstring);
		System.out.println(thirdstring);
		*/


        //Ex5
        s = "abc 123 xyz";
        String arr[] = s.split(" ");
        System.out.println(Arrays.toString(arr));  //[abc, 123, xyz]

        // *  %  ^   &  (   ) - you cannot use as delimeters


        //Problem

        String name = "John Kenedy";

        //System.out.println(name.contains("john")); //false

        //System.out.println(name.toLowerCase().contains("john"));  //true

        System.out.println(name.replace('J', 'j').contains("john"));


        System.out.println(name);

    }


}
