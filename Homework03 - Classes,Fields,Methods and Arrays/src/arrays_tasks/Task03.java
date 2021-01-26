package arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("=== Creating array with 10 elements based on the following rules ===");
        System.out.println("Rule 1: First two elements of the array are the number entered from the console.");
        System.out.println("Rule 2: Each subsequent element of the array is the sum of previous two elements of the array");
        System.out.println();
        System.out.printf("You entered: %d%n", number);
        System.out.println();
        System.out.println("Based on your input, the following array has been created!");
        int[] createdArray = getCreatedArray(number);

        Arrays.stream(createdArray).forEach(e -> System.out.print(e + " "));
    }

    /**
     * Creates an array with 10 elements according the following rules: <br/>
     * - first two elements of the array are the number entered from the console <br/>
     * - each subsequent element of the array is the sum of previous two elements of the array
     *
     * @param number will be assign on first two elements of the array
     * @return array with 10 elements
     */
    static int[] getCreatedArray(int number) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = number;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }
}
