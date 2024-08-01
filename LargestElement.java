package Ademo;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int largest = Integer.MIN_VALUE;

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element > largest) {
                largest = element;
            }
        }

        System.out.println("The largest element is: " + largest);

        scanner.close();
    }
}


