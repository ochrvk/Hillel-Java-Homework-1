package chrvk.task2;

/*Заполнить массив из 10 элементов случайными целыми числами
 от 10(включительно) до 20(включительно).
 Вывести среднее арифметическое.*/

import java.util.Random;

public class Main {
    public static final byte sizeArray = 10;

    public  static byte[] FillArray(byte[] array){
        byte min = 10;
        byte max = 20;
        byte diff = (byte) (max - min);
        Random random = new Random();
        for(int i = 0; i < sizeArray; i++){
            array[i] = (byte) random.nextInt((diff + 1) + min);
        }
        return array;
    }

    public static float Average(byte[] array, float result){
        for(int i = 0; i < sizeArray; i++){
            result += array[i];
        }
        result /= sizeArray;
        return result;
    }

    public static void main(String[] args) {
        byte[] array = new byte[sizeArray];
        float result = 0;
        FillArray(array);
        System.out.println(Average(array, result));
    }
}