package ru.mirea.PR1;

import java.util.Scanner;

public class TASK4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну массива:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int DWcounter = 0;
        int DWsum = 0;
        do {
            DWsum += arr[DWcounter];
            DWcounter++;
        }while (DWcounter < size);

        int Wcounter = 0;
        int Wsum = 0;
        while(Wcounter < size)
        {
            Wsum+=arr[Wcounter];
            Wcounter++;
        }

        System.out.println("Сумма элементов массива (do-while): " + DWsum);
        System.out.println("Сумма элементов массива (while): " + Wsum);

        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < size; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
