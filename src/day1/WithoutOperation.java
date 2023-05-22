package day1;

public class WithoutOperation {

    public static void division(int num, int divider){

        int count = 0;

        while( num >= divider ){

            num -= divider;

            count++;

        }

        System.out.println( "result of division = " + count + " remainder = " +  num);







    }






}


 /*
 Write a method that can divide two numbers without using division operator.
  */

