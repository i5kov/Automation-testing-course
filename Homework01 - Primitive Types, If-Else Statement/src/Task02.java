import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter INTEGER number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another INTEGER number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Now enter FLOATING POINT number:");
        double numberOne = Double.parseDouble(scanner.nextLine());
        System.out.println("Now enter another FLOATING POINT number:");
        double numberTwo = Double.parseDouble(scanner.nextLine());

        printResultFromMathOperationsWithNumbers(firstNumber, secondNumber);
        printResultFromMathOperationsWithNumbers(numberOne, numberTwo);
    }

    static void printResultFromMathOperationsWithNumbers(int firstNumber, int secondNumber) {
        System.out.println("=== Math Operations with INTEGER numbers ===");
        System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, firstNumber + secondNumber);
        System.out.printf("%d - %d = %d%n", firstNumber, secondNumber, firstNumber - secondNumber);
        System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, firstNumber * secondNumber);
        System.out.printf("%d %% %d = %d%n", firstNumber, secondNumber, firstNumber % secondNumber);
        System.out.printf("%d / %d = %d%n", firstNumber, secondNumber, firstNumber / secondNumber);
    }

    static void printResultFromMathOperationsWithNumbers(double firstNumber, double secondNumber) {
        System.out.println("=== Math Operations with FLOATING POINT numbers ===");
        System.out.printf("%.2f + %.2f = %.2f%n", firstNumber, secondNumber, firstNumber + secondNumber);
        System.out.printf("%.2f - %.2f = %.2f%n", firstNumber, secondNumber, firstNumber - secondNumber);
        System.out.printf("%.2f * %.2f = %.2f%n", firstNumber, secondNumber, firstNumber * secondNumber);
        System.out.printf("%.2f %% %.2f = %.2f%n", firstNumber, secondNumber, firstNumber % secondNumber);
        System.out.printf("%.2f / %.2f = %.2f%n", firstNumber, secondNumber, firstNumber / secondNumber);
    }
}
