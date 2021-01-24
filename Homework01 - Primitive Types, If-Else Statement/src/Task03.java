import java.text.DecimalFormat;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter another number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("=== Before Swap ===");
        System.out.println("number A --> " + df.format(firstNumber));
        System.out.println("number B --> " + df.format(secondNumber));
        System.out.println();
        System.out.println("=== After Swap ===");
        swapNumbers(firstNumber, secondNumber);
    }

    static void swapNumbers(double firstNum, double secondNum) {
        double temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("number A --> " + df.format(firstNum));
        System.out.println("number B --> " + df.format(secondNum));
    }
}
