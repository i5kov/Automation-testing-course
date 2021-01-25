public class Task04 {

    public static void main(String[] args) {
        System.out.println("=== Printing all numbers from 10 to 1 ===");
        for (int i = 10; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
