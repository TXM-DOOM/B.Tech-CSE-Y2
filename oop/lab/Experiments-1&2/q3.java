// Print the second digit from the last for a given int
// ex: print 2 when x = 32123

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the number: ");
        x = input.nextInt();

        while (x > 100) {
            x /= 10;
        }

        System.out.printf("Required number: %d", x % 10);

        input.close();
    }
}
