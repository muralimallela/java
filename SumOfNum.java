/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;
public class SumOfNum {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
		System.out.print("How many numbers do you want to sum? ");
        int count = scanner.nextInt();
		for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        scanner.close();
        System.out.println("The total sum of the numbers is: " + sum);
    }
}

