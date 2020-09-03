package chrvk.hw1.task5;

/*Задан 2-мерный массив char и слово.
Написать метод который определит есть ли по вертикали или горизонтали это слово.
Например, в данном случае для слова test метод должен вернуть true:
a z r g z
a t e s t
q v u t r
Массив загрузить из текстового файла*/


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void fileWrite(File file) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, false);
            writer.write("a z r g z\n" +
                    "a t e s t\n" +
                    "q v u t r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char[][] fileRead(File file) {
        String[] tmp;
        FileReader fr;
        StringBuilder fileData = new StringBuilder();

        try {
            fr = new FileReader(file);
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                fileData.append(scan.nextLine()).append("\n");
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tmp = fileData.toString().split("\n");

        for (int i = 0; i < Objects.requireNonNull(tmp).length; i++) {
            tmp[i] = tmp[i].replaceAll(" ", "");
        }

        int rows = tmp.length;
        int columns = tmp[0].length();

        char[][] array = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            String temp = tmp[i];
            for (int j = 0; j < columns; j++) {
                array[i][j] = temp.charAt(j);
            }
        }
        return array;
    }

    public static boolean findWord(char[][] array, String word) {
        boolean result = false;
        boolean vertical = false;
        boolean horizontal = false;
        int tmp;

        for (int i = 0; i < array[0].length; i++) {
            tmp = 0;
            for (char[] chars : array) {
                for (int k = 0; k < word.length() - 1; k++) {
                    if (chars[i] == word.charAt(k)) {
                        tmp++;
                        if (tmp == word.length()) {
                            vertical = true;
                        }
                    }
                }
            }
        }

        for (char[] chars : array) {
            tmp = 0;
            for (char aChar : chars) {
                for (int k = 0; k < word.length() - 1; k++) {
                    if (aChar == word.charAt(k)) {
                        tmp++;
                        if (tmp == word.length()) {
                            horizontal = true;
                        }
                    }
                }
            }
        }

        if (vertical || horizontal) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        File file = new File("src/chrvk/hw1/task5/file.txt");

        fileWrite(file);
        char[][] array = fileRead(file);

        String word = "test";

        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        System.out.println(findWord(array, word));
    }
}
