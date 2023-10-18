package ru.mirea.PR3.TASK3;

import static ru.mirea.PR3.TASK3.Report.generateReport;

public class main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иван Иванов", 45000.00),
                new Employee("Петр Петров", 55000.50),
                new Employee("Анна Сидорова", 60000.75),
        };
        generateReport(employees);
    }
}
