/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of a");
        byte a = scanner.nextByte();
        System.out.println("enter value of b");
        byte b = scanner.nextByte();
        int c = a + b;
        System.out.println(c);
        scanner.close();
    }
}
