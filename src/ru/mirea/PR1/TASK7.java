package ru.mirea.PR1;

import java.math.BigInteger;
import java.util.Scanner;

public class TASK7
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = scn.nextInt();

        BigInteger result = fact(n);
        System.out.println("Факториал числа " + n + " = " + result);

    }
    public static BigInteger fact(int n)
    {
        BigInteger res = new BigInteger("1");

        for(int i = 1; i <= n; i++)
        {
            BigInteger multiplyer = new BigInteger(Integer.toString(i));
            res = res.multiply(multiplyer);
        }
        return res;
    }

}