package ru.mirea.PR24;

public class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сели на многофункциональный стул");
    }
}
