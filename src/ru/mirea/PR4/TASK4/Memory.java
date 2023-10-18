package ru.mirea.PR4.TASK4;

class Memory {
    private int capacityGB;
    private String type;

    public Memory(int capacityGB, String type) {
        this.capacityGB = capacityGB;
        this.type = type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public String getType() {
        return type;
    }

    public void upgrade(int additionalCapacityGB) {
        this.capacityGB += additionalCapacityGB;
    }
}