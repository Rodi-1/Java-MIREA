package ru.mirea.PR1;

public class TASK3 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        double avg = (double) sum / array.length;
        System.out.println("sum =" + sum + " avg = " + avg);




        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
        System.out.println(args.length);
    }
}