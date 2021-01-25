import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter another number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);
        double sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.printf("skip %d", i);
            } else {
                double number = Math.pow(i, 2);
                System.out.printf("%.0f", number);
                sum += number;
                if (sum > 200) {
                    break;
                }
            }
            if (i < end) {
                System.out.print(", ");
            }
        }
    }

}
