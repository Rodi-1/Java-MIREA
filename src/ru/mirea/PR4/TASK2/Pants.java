package ru.mirea.PR4.TASK2;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getPrice() + " евро");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getPrice() + " евро");
    }
}
