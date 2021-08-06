// Write a program to print the first digit of an int
// Print 2 if int x = 23769

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the number: ");
        x = input.nextInt();

        while (x > 10) {
            x /= 10;
        }

        System.out.printf("Required number: %d", x % 10);

        input.close();
    }
}
