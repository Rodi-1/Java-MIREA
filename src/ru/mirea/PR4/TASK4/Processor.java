package ru.mirea.PR4.TASK4;

class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void overclock(double newClockSpeed) {
        this.clockSpeed = newClockSpeed;
    }
}
