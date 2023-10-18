package ru.mirea.PR4.TASK2;

public class TestAtelier {
    public static void main(String[] args) {
        TShirt tShirtMan = new TShirt(ClothingSize.L, 25.0, "Синяя");
        TShirt tShirtWomen = new TShirt(ClothingSize.M, 20.0, "Розовая");
        Pants pantsMan = new Pants(ClothingSize.XXS, 40.0, "Черные");
        Pants pantsWomen = new Pants(ClothingSize.S, 35.0, "Серые");
        Skirt skirt = new Skirt(ClothingSize.S, 30.0, "Желтая");
        Tie tie = new Tie(ClothingSize.M, 15.0, "Красный");

        MenClothing[] menClothes = {tShirtMan, pantsMan, tie};
        WomenClothing[] womenClothes = {tShirtWomen, pantsWomen, skirt};

        Atelier atelier = new Atelier();
        atelier.dressMan(menClothes);
        atelier.dressWomen(womenClothes);
    }
}
