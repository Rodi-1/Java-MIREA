package ru.mirea.PR10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeAndSortStudents {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        // Добавляем студентов в первый список
        list1.add(new Student("Иван", "Иванов", "Информатика", 2, "ИКБО-12-22", 4.5));
        list1.add(new Student("Петр", "Петров", "Математика", 3, "ИМБО-01-22", 4.8));
        list1.add(new Student("Мария", "Сидорова", "Физика", 1, "ЭОСО-01-21", 4.2));

        // Добавляем студентов во второй список
        list2.add(new Student("Алексей", "Смирнов", "Информатика", 2, "ИКБО-03-22", 4.7));
        list2.add(new Student("Екатерина", "Козлова", "Математика", 3, "ИМБО-02-22", 4.9));
        list2.add(new Student("Анна", "Павлова", "Физика", 1, "ЭОСО-02-22", 4.3));

        // Объединяем списки
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Сортируем объединенный список по среднему баллу
        Collections.sort(mergedList, Comparator.comparing(Student::getGPA).reversed());

        // Выводим отсортированный список
        for (Student student : mergedList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + student.getGPA());
        }
    }
}
