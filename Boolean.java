/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Do you like programming? (true/false): ");


        boolean likesProgramming = scanner.nextBoolean();


        if (likesProgramming) {
            System.out.println("That's great! Programming can be very rewarding.");
        } else {
            System.out.println("No worries! There are many other interests to explore.");
        }
		scanner.close();
    }
}
