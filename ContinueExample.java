/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number to count to: ");
        int max = scanner.nextInt();

        System.out.print("Enter the number to skip (use modulo): ");
        int skipMod = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            if (i % skipMod == 0) {
                continue;
            }
            System.out.println("Current number: " + i);
        }

        scanner.close();
    }
}
