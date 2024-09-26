/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class Logop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer value for x: ");
        int x = scanner.nextInt();

        System.out.println("Enter an integer value for y: ");
        int y = scanner.nextInt();

        boolean lessThan = x < y;
        System.out.println("Less than: " + x + " < " + y + " = " + lessThan);

        boolean greaterThan = x > y;
        System.out.println("Greater than: " + x + " > " + y + " = " + greaterThan);

        boolean lessThanOrEqual = x <= y;
        System.out.println("Less than or equal to: " + x + " <= " + y + " = " + lessThanOrEqual);

        boolean greaterThanOrEqual = x >= y;
        System.out.println("Greater than or equal to: " + x + " >= " + y + " = " + greaterThanOrEqual);

        boolean equalTo = x == y;
        System.out.println("Equal to: " + x + " == " + y + " = " + equalTo);

        boolean notEqualTo = x != y;
        System.out.println("Not equal to: " + x + " != " + y + " = " + notEqualTo);

        scanner.close();
    }
}
