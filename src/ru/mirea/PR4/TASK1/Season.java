package ru.mirea.PR4.TASK1;

public enum Season {
    SPRING("Весна", 15),
    SUMMER("Лето", 25),
    AUTUMN("Осень", 10),
    WINTER("Зима", -10);

    private final String name;
    private final int averageTemperature;

    Season(String name, int averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Тёплый сезон";
        }
        return "Холодный сезон";
    }

    public static void main(String[] args) {
        Season favoriteSeason = SUMMER;
        System.out.println("Я люблю " + favoriteSeason.getName());
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        System.out.println("\nСезоны и их описания:");
        for (Season season : Season.values()) {
            System.out.println(season.getName());
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
