/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;
public class DisEvenNum{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of elements you want to input: ");
        int n = scanner.nextInt(); 
		int[] numbers = new int[n];
       System.out.println("Enter " + n + " numbers:");
        for (int i=0;i<n;i++) {
            numbers[i] = scanner.nextInt();
        }
       System.out.println("Even numbers in the input are:");
        for (int number : numbers) {
            if (number%2==0) {
                System.out.print(number + " ");
            }
        }
       scanner.close();
    }
}