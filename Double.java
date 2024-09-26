/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;
public class Double {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the first decimal number: ");
         double first = scanner.nextDouble();
         System.out.print("Enter the second decimal number: ");
        double second = scanner.nextDouble();
        double sum = first + second;
        double difference = first - second;
        double product = first* second;
        double quotient = first / second;
		System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        if (second != 0) {
            System.out.printf("Quotient: %.2f\n", quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }


        scanner.close();
    }
}