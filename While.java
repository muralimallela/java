/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum count: ");
        int maxCount = scanner.nextInt();

        int count = 0;
        while (count < maxCount) {
            System.out.println("Count: " + count);
            count++;
        }
        scanner.close();

    }
}
