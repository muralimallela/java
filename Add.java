/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.*;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = scanner.nextInt();
        System.out.println("enter the value of b");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("the sum of" + a + "and" + b + "is" + sum);
        scanner.close();
    }
}