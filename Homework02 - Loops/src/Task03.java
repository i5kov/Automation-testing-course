public class Task03 {

    public static void main(String[] args) {
        System.out.println("=== Printing all odd numbers from -10 to 10 ===");
        for (int i = -10; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
