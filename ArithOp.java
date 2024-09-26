/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class ArithOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter a value for b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Division: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Division by zero is not allowed");
        }

        if (b != 0) {
            int remainder = a % b;
            System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
        } else {
            System.out.println("Modulus by zero is not allowed");
        }

        System.out.println("Increment: " + a + "++ = " + (++a));

        System.out.println("Decrement: " + b + "-- = " + (--b));

        scanner.close();
    }
}
