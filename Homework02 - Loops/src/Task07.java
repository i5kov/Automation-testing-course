import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("=== Printing first %d numbers which are divided into 3. ===%n", number);
        for (int i = 3; i <= number * 3; i += 3) {
            if (i == number * 3) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
