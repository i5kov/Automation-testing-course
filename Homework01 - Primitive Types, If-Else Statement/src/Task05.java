import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter another number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter one more number: ");
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        Double[] numbers = { firstNumber, secondNumber, thirdNumber };

        System.out.println("=== Original order of entered numbers ===");
        printElementsOfArray(numbers);
        System.out.println();

        Double[] sortedArray = sortArrayDescendingOrder(numbers);
        System.out.println("=== Sorted numbers (Descending Order) ===");
        printElementsOfArray(sortedArray);
    }

    static Double[] sortArrayDescendingOrder(Double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    static void printElementsOfArray(Double[] array) {
        DecimalFormat df = new DecimalFormat("#.###");
        Arrays.stream(array).forEach(e -> System.out.println(df.format(e)));
    }

}
