package ru.mirea.PR4.TASK2;

abstract class Clothes {
    private ClothingSize size;
    private double price;
    private String color;

    public Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
