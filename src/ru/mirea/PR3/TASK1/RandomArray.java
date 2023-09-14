package ru.mirea.PR3.TASK1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int arraySize = 10; // Размер массива
        double[] randomArray1 = generateRandomArrayWithMath(arraySize); // Генерация с использованием Math.random()
        double[] randomArray2 = generateRandomArrayWithRandomClass(arraySize); // Генерация с использованием класса Random

        // Вывод исходных массивов
        System.out.println("Исходный массив с использованием Math.random():");
        printArray(randomArray1);

        System.out.println("\nИсходный массив с использованием класса Random:");
        printArray(randomArray2);

        // Сортировка массивов
        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);

        // Вывод отсортированных массивов
        System.out.println("\nОтсортированный массив с использованием Math.random():");
        printArray(randomArray1);

        System.out.println("\nОтсортированный массив с использованием класса Random:");
        printArray(randomArray2);
    }

    // Генерация массива с использованием Math.random()
    private static double[] generateRandomArrayWithMath(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    // Генерация массива с использованием класса Random
    private static double[] generateRandomArrayWithRandomClass(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    // Вывод массива на экран
    private static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
        }
    }
}

