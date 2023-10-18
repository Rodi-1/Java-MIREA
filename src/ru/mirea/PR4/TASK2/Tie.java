package ru.mirea.PR4.TASK2;

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getPrice() + " евро");
    }
}
