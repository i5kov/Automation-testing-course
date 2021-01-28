package task01computertask;

public class Computer {

    private int year;
    private double price;
    private boolean isNotebook;
    private double hardDiskMemory;
    private double freeMemory;
    private String operationSystem;

    public Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this(year, price, hardDiskMemory, freeMemory);
        this.isNotebook = isNotebook;
        this.operationSystem = operationSystem;
    }

    public int comparePrice(Computer computer) {
        if (this.price > computer.price) {
            return -1;
        } else if (computer.price > this.price) {
            return 1;
        }
        return 0;
    }

    public void changeOperatingSystem(String operationSystem) {
        System.out.printf("%n=== Operating system info about your %s ===%n", getTypeOfComputer());
        if (operationSystem == null || operationSystem.isEmpty() || operationSystem.equals(" ")) {
            System.out.println("ERROR: Unknown operating system!!!");
        } else {
            this.operationSystem = operationSystem;
            System.out.printf("%s: Your operation system was changed to %s%n", getTypeOfComputer(), this.operationSystem);
        }
    }

    public void useMemory(double memory) {
        System.out.printf("%n=== Memory info about your %s ===%n", getTypeOfComputer());
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");
            System.out.printf("Your free memory is: %.2f GB, but you want to use: %.2f GB of memory.%n", freeMemory, memory);
        } else {
            freeMemory -= memory;
            System.out.printf("You are currently using %.2f GB of memory!%n", memory);
            System.out.printf("Your free memory is: %.2f.%n", freeMemory);
        }
    }

    public void printInfoAboutComputer() {
        System.out.printf("%n=== Hello, User! You created %s with the following parameters ===%n", getTypeOfComputer());
        System.out.println("- Year of manufactured: " + year);
        System.out.println("- Price: " + price + " lv.");
        System.out.println("- Hard Disk Memory: " + hardDiskMemory + " GB");
        System.out.println("- Memory: " + freeMemory + " GB");
        System.out.println("- Operation System: " + operationSystem);
    }

    private String getTypeOfComputer() {
        return this.isNotebook ? "LAPTOP" : "DESKTOP";
    }
}
