import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers between 1 and %d (inclusive for both numbers) is --> %d", number, sum);
    }
}
