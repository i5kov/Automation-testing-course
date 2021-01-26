package arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (will be used for size of array): ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        System.out.println("=== Adding elements in the array ===");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = Integer.parseInt(scanner.nextLine());
            array[i] = element;
        }
        printInfoAboutCreatedArray(array);
        System.out.println("Is array mirrored: " + isArrayMirrored(array));
    }

    /**
     * Verifies whether array is mirrored or not. <br/>
     * Following arrays are mirrored: </br>
     * [3,7,7,3] or [4] or [1,55,1] or [6 27 -1 5 7 7 5 -1 27 6]
     *
     * @param array which will be checked
     * @return true if the array is mirrored, otherwise will return false
     */
    static boolean isArrayMirrored(int[] array) {
        boolean isMirrored = true;
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    isMirrored = false;
                    break;
                }
            }
        }
        return isMirrored;
    }

    static void printInfoAboutCreatedArray(int[] array) {
        System.out.println();
        System.out.printf("The following array was created --> %s%n", Arrays.toString(array));
    }
}
