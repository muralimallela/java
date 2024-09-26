/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class RelOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter a value for b: ");
        int b = scanner.nextInt();

        boolean lessThan = a < b;
        System.out.println("Less than: " + a + " is less than " + b + " = " + lessThan);

        boolean greaterThan = a > b;
        System.out.println("Greater than: " + a + " is greater than " + b + " = " + greaterThan);

        boolean lessThanOrEqual = a <= b;
        System.out.println("Less than or equal to: " + a + " is less than or equal to " + b + " = " + lessThanOrEqual);

        boolean greaterThanOrEqual = a >= b;
        System.out.println("Greater than or equal to: " + a + " is greater than or equal to " + b + " = " + greaterThanOrEqual);

        boolean equalTo = a == b;
        System.out.println("Equal to: " + a + " is equal to " + b + " = " + equalTo);

        boolean notEqualTo = a != b;
        System.out.println("Not equal to: " + a + " is not equal to " + b + " = " + notEqualTo);

        scanner.close();
    }
}

