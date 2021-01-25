import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter another number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);


        System.out.printf("=== Printing all numbers between %d and %d ===%n", start, end);
        for (int i = start; i <= end; i++) {
            if (i == end) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
