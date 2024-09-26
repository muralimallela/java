/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class Fun4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its square: ");
        int number = scanner.nextInt();

        int result = calculateSquare(number);
        System.out.println("The square of " + number + " is: " + result);

        scanner.close();
    }

    public static int calculateSquare(int number) {
        return number * number;
    }
}
