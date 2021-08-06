// Write a program to print the kth digit from the last of an integers

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of number and k: ");
        n = input.nextInt();
        k = input.nextInt();

        for (int i = 0; i < k - 1; i++) {
            n /= 10;
        }
        System.out.printf("Last digit of a given number is: %d", n % 10);
    }    
}
