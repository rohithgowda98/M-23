import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initializing the array
        Integer[] array = new Integer[n];

        // Taking array input from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sorting in ascending order
        Arrays.sort(array);
        System.out.println("Array in ascending order: " + Arrays.toString(array));

        // Sorting in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(array));

        scanner.close();
    }
}
