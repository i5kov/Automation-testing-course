import java.text.DecimalFormat;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter another number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter one more number: ");
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("=== Number values before Swapping:");
        printNumbers(firstNumber, secondNumber, thirdNumber);

        System.out.println();
        System.out.println("=== Number values after Swapping:");
        swapValuesOfNumbers(firstNumber, secondNumber, thirdNumber);
    }

    /**
     * Swaps the values of the numbers in the following order: <br/>
     * - first number gets the value of second number <br/>
     * - second number gets the value of third number <br/>
     * - third number gets the value (old one) of first number <br/>
     *
     * @param firstNum - value of first number
     * @param secondNum - value of second number
     * @param thirdNum - value of third number
     */
    static void swapValuesOfNumbers(double firstNum, double secondNum, double thirdNum) {
        double temp = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = temp;
        printNumbers(firstNum, secondNum, thirdNum);
    }

    static void printNumbers(double firstNum, double secondNum, double thirdNum) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("A --> " + df.format(firstNum));
        System.out.println("B --> " + df.format(secondNum));
        System.out.println("C --> " + df.format(thirdNum));
    }
}
