/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int n = scanner.nextInt();

        int greatest = Integer.MIN_VALUE;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number > greatest) {
                greatest = number;
            }
        }

        System.out.println("The greatest number is: " + greatest);
        scanner.close();
    }
}
