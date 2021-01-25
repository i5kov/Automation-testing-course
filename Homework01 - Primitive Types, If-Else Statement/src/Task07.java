import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hours = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter amount of money: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Am I healthy [true/false]: ");
        boolean isHealthy = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Hello, the hours is: " + hours + " o'clock!");
        if (isHealthy) {
            System.out.print("I will go out ");
            if (money <= 10) {
                System.out.printf("but I have only %.2f lv., so I will go to a coffee with friends.%n", money);
            } else {
                System.out.printf("with friends! I have %.2f lv. and will spent all of them today!%n", money);
            }
        } else {
            System.out.println("I am sick and won't go out. :(");
            if (money <= 10) {
                System.out.printf("And since I have only %.2f lv. I will stay at home and will drink a cup of tea...%n", money);
            } else {
                System.out.printf("I will stay at home but firstly I will go to buy pills, because I have %.2f lv.%n", money);
            }
        }
    }
}
