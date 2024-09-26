/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number to count to: ");
        int max = scanner.nextInt();

        System.out.print("Enter the number to break at: ");
        int breakPoint = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            if (i == breakPoint) {
                break;
            }
            System.out.println("Current number: " + i);
        }
        System.out.println("Loop terminated.");

        scanner.close();
    }
}
