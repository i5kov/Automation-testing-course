package classes_tasks;

public class Computer {

    private int yearManufactured;
    private double price;
    private boolean isNotebook;
    private double hardDiskMemory;
    private double freeMemory;
    private String operationSystem;

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

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public void setHardDiskMemory(double hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void printInfoAboutComputer() {
        System.out.printf("%n=== Hello, User! You created %s with the following parameters ===%n", getTypeOfComputer());
        System.out.println("- Year of manufactured: " + yearManufactured);
        System.out.println("- Price: " + price + " lv.");
        System.out.println("- Hard Disk Memory: " + hardDiskMemory + " GB");
        System.out.println("- Memory: " + setMemory() + " GB");
        System.out.println("- Operation System: " + operationSystem);
    }

    private double setMemory() {
        if (price >= 500 && price <= 1200) {
            freeMemory = 8;
        } else if (price <= 1800) {
            freeMemory = 12;
        } else if (price < 2500) {
            freeMemory = 16;
        } else {
            freeMemory = 32;
        }
        return freeMemory;
    }

    private String getTypeOfComputer() {
        return this.isNotebook ? "LAPTOP" : "DESKTOP";
    }
}
