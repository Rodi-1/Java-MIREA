package ru.mirea.PR4.TASK2;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getPrice() + " евро");
    }
}