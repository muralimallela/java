/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of iterations: ");
        int iterations = scanner.nextInt();

        for (int i = 1; i <= iterations; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
