import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d is a prime number!", number);
        } else {
            System.out.printf("%d is not a prime number!", number);
        }
    }
}
