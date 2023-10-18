package ru.mirea.PR4.TASK4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.6);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell XL27D", 27);

        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);

        System.out.println("Original Computer Configuration:");
        System.out.println(computer);

        computer.upgradeMemory(32);
        computer.overclockProcessor(4.0);

        System.out.println("\nUpgraded Computer Configuration:");
        System.out.println(computer);
    }
}
