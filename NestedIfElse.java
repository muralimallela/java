/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        if (age >= 18) {
            System.out.println("You are an adult.");
            if (salary >= 50000) {
                System.out.println("You are eligible for a premium credit card.");
            } else if (salary >= 30000) {
                System.out.println("You are eligible for a standard credit card.");
            } else {
                System.out.println("You are eligible for a secured credit card.");
            }
        } else {
            System.out.println("You are a minor.");
            if (age >= 16) {
                System.out.println("You can apply for a part-time job.");
            } else {
                System.out.println("Focus on your studies for now.");
            }
        }

        scanner.close();
    }
}
