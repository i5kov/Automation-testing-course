package arrays_tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number that is multiple of 2: ");
        int size = Integer.parseInt(scanner.nextLine());

        while (size % 2 != 0) {
            System.out.printf("Entered number --> %d <-- is not multiple of 2.%n", size);
            System.out.print("Please enter a number that is multiple of 2: ");
            size = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("=== Array with size = %d has been created successfully! ===%n%n", size);
        int[] array = new int[size];

        System.out.printf("=== Let's add first %d elements into the created array ===%n", size / 2);
        for (int i = 0; i < size / 2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = Integer.parseInt(scanner.nextLine());
            array[i] = element;
            array[size / 2 + i] = element;
        }
        System.out.println();

        printElementsOfArray(array);
    }

    static void printElementsOfArray(int[] array) {
        System.out.println("=== Elements of array are: ===");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
