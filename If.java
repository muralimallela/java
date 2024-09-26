/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the minimum age requirement: ");
        int minAge = scanner.nextInt();

        if (age >= minAge) {
            System.out.println("You meet the age requirement.");
        } else {
            System.out.println("Sorry, you do not meet the age requirement.");
        }

        scanner.close();
    }
}
