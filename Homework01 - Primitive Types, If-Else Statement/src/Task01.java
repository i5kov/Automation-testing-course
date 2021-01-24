import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter another number:");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a third number:");
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        String isBetweenRangeFormat = "The number %.2f is between %.2f and %.2f";
        String isNotBetweenRangeFormat = "The number %.2f is not between %.2f and %.2f";

        if (firstNumber < secondNumber) {
            if (thirdNumber > firstNumber && thirdNumber < secondNumber) {
                System.out.printf(isBetweenRangeFormat, thirdNumber, firstNumber, secondNumber);
            } else {
                System.out.printf(isNotBetweenRangeFormat, thirdNumber, firstNumber, secondNumber);
            }
        } else if (firstNumber > secondNumber) {
            if (thirdNumber < firstNumber && thirdNumber > secondNumber) {
                System.out.printf(isBetweenRangeFormat, thirdNumber, secondNumber, firstNumber);
            } else {
                System.out.printf(isNotBetweenRangeFormat, thirdNumber, secondNumber, firstNumber);
            }
        }
    }
}
