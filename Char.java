/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a single character: ");
        char userChar = scanner.next().charAt(0); // Read the first character


        if (Character.isUpperCase(userChar)) {
            System.out.println(userChar + " is an uppercase letter.");
        } else if (Character.isLowerCase(userChar)) {
            System.out.println(userChar + " is a lowercase letter.");
        } else if (Character.isDigit(userChar)) {
            System.out.println(userChar + " is a digit.");
        } else {
		 System.out.println(userChar + " is not an uppercase letter, lowercase letter, or digit.");
        }


        scanner.close();
    }
}
