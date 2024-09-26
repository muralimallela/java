/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;
public class SumOfOddNum {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
		for (int i = 1; i <=num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to " + num + " is: " + sum);
        scanner.close();
    }
}