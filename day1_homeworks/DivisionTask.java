package day1_homeworks;

public class DivisionTask {
    public static void main(String[] args) {
        int x = -12;
        int y = 2;

        System.out.println("quotient is "+ divide(x,y));

    }

    public static int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Invalid operation");
            System.exit(-1);
        }
        int sign = 1;
        if (x * y < 0) {
            sign = -1;
        }

        x = Math.abs(x);
        y = Math.abs(y);

        int quotient = 0;
        while (x >= y) {
            x = x - y;
            quotient++;
        }
        System.out.println("Remainder is " + x);
        return sign * quotient;

    }
}
