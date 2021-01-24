import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter another number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("=== Printing numbers in ASCENDING order ===");
        if (firstNumber > secondNumber) {
            System.out.println(secondNumber);
            System.out.println(firstNumber);
        } else {
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        }
    }
}
