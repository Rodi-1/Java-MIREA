package ru.mirea.PR24;

public class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сели на магический стул");
    }
}
