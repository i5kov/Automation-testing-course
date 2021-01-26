package arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (it will be used for size of array): ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        System.out.println("=== Adding elements in the array ===");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = Integer.parseInt(scanner.nextLine());
            array[i] = element;
        }
        int smallestNumber = Arrays.stream(array).filter(e -> e % 3 == 0).min().orElse(-1);

        if (smallestNumber < 0) {
            System.out.printf("In %s there is no number that is multiple of 3.%n", Arrays.toString(array));
        } else {
            System.out.printf("The smallest number in %s that is multiple of 3 ===>  %d.%n", Arrays.toString(array), smallestNumber);
        }
    }
}
