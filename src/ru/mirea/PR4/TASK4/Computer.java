package ru.mirea.PR4.TASK4;

class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void upgradeMemory(int additionalCapacityGB) {
        memory.upgrade(additionalCapacityGB);
    }

    public void overclockProcessor(double newClockSpeed) {
        processor.overclock(newClockSpeed);
    }

    @Override
    public String toString() {
        return "Computer [Brand: " + brand + ", Processor: " + processor.getModel() + ", Memory: " + memory.getCapacityGB() + "GB, Monitor: " + monitor.getModel() + "]";
    }
}
