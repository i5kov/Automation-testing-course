package arrays_tasks;

import java.util.Arrays;

public class Task05 {

    public static void main(String[] args) {
        System.out.println("=== Creating array with 10 elements based on following rule: ===");
        System.out.println("Each element of the array is equal to element's index multiplied by 3");
        System.out.println();
        double[] createdArray = getArray();
        System.out.printf("Created array: %s", Arrays.toString(createdArray));
    }

    /**
     * Creates array with 10 elements based on the following rule: </br>
     * Each element of the array is equal to element's index multiplied by 3
     *
     * @return array with 10 elements
     */
    static double[] getArray() {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        return array;
    }
}
