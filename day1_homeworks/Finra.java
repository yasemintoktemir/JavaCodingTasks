package day1_homeworks;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
        } else if (number % 3 == 0) {
            result = "FIN";
        } else if (number % 5 == 0) {
            result = "RA";
        }else{
            System.out.println("number is not multiple of 3 or 5");
        }
        System.out.println(result);


        for (int i = 0; i < 2; i++) {
            System.out.println("Do you want to continue?");
            Scanner input2 = new Scanner(System.in);
            String answer = input2.nextLine();
            if (answer.equalsIgnoreCase("yes")) {

                System.out.println("Please enter another number");
                number = input.nextInt();
                if (number % 3 == 0 && number % 5 == 0) {
                    result="FINRA";

                } else if (number % 3 == 0) {
                    result = "FIN";
                } else if (number % 5 == 0) {
                    result = "RA";
                }
                System.out.println(result);
            } else {
                System.out.println("Program terminated");
                System.exit(0);
            }

        }
    }
}


