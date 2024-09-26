/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.Scanner;
public class Float {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the first float value: ");
        float firstFloat = scanner.nextFloat();
		System.out.print("Enter the second float value: ");
        float secondFloat = scanner.nextFloat();
		float average = (firstFloat + secondFloat) / 2;
        System.out.println("Average: " + average);
         scanner.close();
    }
}