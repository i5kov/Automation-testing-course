import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int end = number;

        if (number == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < end; i++) {
                System.out.print("" + (number - 1));
                for (int j = 1; j < end; j++) {
                    System.out.print("" + (number - 1));
                }
                number += 2;
                System.out.println();
            }
        }
    }
}
