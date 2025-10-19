package Pavan_Java;

public class ex_18_HowManyTimesNumberRepeatedInArray {
    public static void main (String[] args){
        int a[]= {30,10,20,10,30,10,40,10,50,30};

        int num=30;

        int count=0;

        for(int value:a)
        {
            if(value == num)
            {
                count++;
            }

        }

        System.out.println("number of times repeated:"+count);

    }

}

