package week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 13;
        int y = 6;

        // Swap the values without using a third variable
        x = x + y;//15
        y = x - y;//5
        x = x - y;//10

        System.out.println("Swapped x and y :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
/*
1️⃣  Numbers – Swap Numbers
Swap two variables' values without using a third variable.
 */