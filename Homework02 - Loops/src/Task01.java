public class Task01 {

    public static void main(String[] args) {
        System.out.println("=== Printing all numbers from 1 to 100 ===");
        for (int i = 1; i <= 100; i++) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
