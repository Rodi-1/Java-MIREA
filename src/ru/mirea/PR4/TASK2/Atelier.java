package ru.mirea.PR4.TASK2;

class Atelier {
    public void dressMan(MenClothing[] clothes) {
        System.out.println("Мужская одежда:");
        for (MenClothing item : clothes) {
            item.dressMan();
        }
    }

    public void dressWomen(WomenClothing[] clothes) {
        System.out.println("Женская одежда:");
        for (WomenClothing item : clothes) {
            item.dressWomen();
        }
    }
}
