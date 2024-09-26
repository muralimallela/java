
/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
