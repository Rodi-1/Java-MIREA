package ru.mirea.PR1;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        double mediana = sum / array.length;
        System.out.println("sum =" + sum + " mediana = " + mediana);

//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[];
//        int length = scanner.nextInt();
//        do {
//            arr[i] = scanner.nextInt();
//        }while(scanner.nextInt() != 0);
//
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Массив: " + Arrays.toString(arr));


        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
        System.out.println(args.length);
    }
}