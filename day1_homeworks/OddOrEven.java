package day1_homeworks;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Please Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Do you want to continue?");
            Scanner input2 = new Scanner(System.in);
            String answer = input2.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Please enter another number");
                number = input.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " is even number");
                } else {
                    System.out.println(number + " is odd number");
                }
            } else {
                System.out.println("Program is terminated");
                System.exit(0);
            }


        }
    }
}
