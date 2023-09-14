package ru.mirea.PR3.TASK3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.printf("%-20s %10s %n", "Имя сотрудника", "Зарплата");

        for (Employee employee : employees) {
            System.out.printf("%-20s %10.2f %n", employee.getFullname(), employee.getSalary());
        }
    }
}
