package chrvk.javaelementary.hw1.task2;

import java.util.Random;

/*Заполнить массив из 10 элементов случайными целыми числами
 от 10(включительно) до 20(включительно).
 Вывести среднее арифметическое.*/

public class Main {
    public static final int sizeArray = 10;

    public static int[] fillArray(int[] array) {
        int min = 10;
        int max = 20;
        int diff = (max - min) + 1;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(diff + min);
        }
        return array;
    }

    public static float average(int[] array, float result) {
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[sizeArray];
        float result = 0;
        fillArray(array);
        System.out.println(average(array, result));
    }
}