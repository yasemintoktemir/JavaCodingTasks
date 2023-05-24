package day0524;

import java.util.Scanner;
// joelkap
public class DivideWithoutOp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers dividend and divisor");
        int dividend = input.nextInt();
        int divisor = input.nextInt();


        int result = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }


        int fract = ((dividend%divisor)*10);

        int resultFract = 0;
        while (fract >= divisor) {
            fract -= divisor;
            resultFract++;
        }
        
        System.out.println (result+"."+resultFract);

    }
}