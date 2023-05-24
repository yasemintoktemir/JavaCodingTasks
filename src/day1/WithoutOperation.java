package day1;

public class WithoutOperation {

    public static String division(int num, int divider){

        int count = 0;

        while( num >= divider ){

            num -= divider;

            count++;

        }

        return "result of division = " + count + " remainder = " +  num ;







    }






}


 /*
 Write a method that can divide two numbers without using division operator.
  */

