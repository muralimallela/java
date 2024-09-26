/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */

import java.util.Scanner;

public class AssignOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter a value for y: ");
        int y = scanner.nextInt();

        int z = x;
        System.out.println("Simple assignment: z = " + z);

        x += y;
        System.out.println("Addition assignment: x += y, x = " + x);

        x -= y;
        System.out.println("Subtraction assignment: x -= y, x = " + x);

        x *= y;
        System.out.println("Multiplication assignment: x *= y, x = " + x);

        x /= y;
        System.out.println("Division assignment: x /= y, x = " + x);

        x %= y;
        System.out.println("Modulus assignment: x %= y, x = " + x);
        scanner.close();
    }
}
