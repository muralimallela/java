/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum count: ");
        int maxCount = scanner.nextInt();

        Integer[] counts = new Integer[maxCount];
        for (int i = 0; i < maxCount; i++) {
            counts[i] = i;
        }

        for (int count : counts) {
            System.out.println("Count: " + count);
        }

        scanner.close();
    }
}
