package classes_tasks;

public class ComputerDemo {

    public static void main(String[] args) {
        Computer desktop = new Computer();
        desktop.setYearManufactured(2020);
        desktop.setPrice(3000);
        desktop.setHardDiskMemory(1000);
        desktop.setOperationSystem("Linux");
        desktop.setNotebook(false);
        desktop.printInfoAboutComputer();

        desktop.useMemory(15);
        desktop.changeOperatingSystem(" ");
        desktop.useMemory(18);

        Computer laptop = new Computer();
        laptop.setYearManufactured(2019);
        laptop.setPrice(1600);
        laptop.setHardDiskMemory(500);
        laptop.setOperationSystem("Linux");
        laptop.setNotebook(true);
        laptop.printInfoAboutComputer();

        laptop.changeOperatingSystem("Windows");

    }
}
