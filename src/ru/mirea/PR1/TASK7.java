package ru.mirea.PR1;

import java.util.Scanner;

public class TASK7
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = scn.nextInt();

        if(n > 27)
        {
            System.out.println("слишком большое число!");
        }
        else
        {
            int result = fact(n);
            System.out.println("Факториал числа " + n + " = " + result);
        }

    }
    public static int fact(int n)
    {
        int res = 1;
        for(int i = 1; i <= n; i++)
        {
            res *= i;
        }
        return res;
    }
}