package ru.mirea.PR10;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "Информатика", 2, "ИКБО-12-22",4.8);

        // Получение значений с помощью геттеров
        System.out.println("Имя: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Специальность: " + student.getSpecialty());
        System.out.println("Курс: " + student.getCourse());
        System.out.println("Группа: " + student.getGroup());

        // Изменение значений с помощью сеттеров
        student.setCourse(3);
        student.setGroup("ИКБО-11-22");

        // Печать измененных значений
        System.out.println("Новый курс: " + student.getCourse());
        System.out.println("Новая группа: " + student.getGroup());
    }
}
