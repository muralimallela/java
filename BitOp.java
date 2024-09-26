/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class BitOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter a value for b: ");
        int b = scanner.nextInt();

        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND: " + a + " & " + b + " = " + bitwiseAnd);

        int bitwiseOr = a | b;
        System.out.println("Bitwise OR: " + a + " | " + b + " = " + bitwiseOr);

        int bitwiseXor = a ^ b;
        System.out.println("Bitwise XOR: " + a + " ^ " + b + " = " + bitwiseXor);

        int bitwiseComplement = ~a;
        System.out.println("Bitwise Complement: ~" + a + " = " + bitwiseComplement);

        scanner.close();
    }
}
