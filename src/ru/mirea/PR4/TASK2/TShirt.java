package ru.mirea.PR4.TASK2;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getPrice() + " евро");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getPrice() + " евро");
    }
}
