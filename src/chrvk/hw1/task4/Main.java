package chrvk.hw1.task4;

/*
Написать метод который убирает лишние пробелы
в строке и возвращает строку.
Убрать начальные, конечные и между словами
должно быть не больше 1 пробела.
*/

public class Main {
    public static String removeSpace(String line) {
        line = line.replaceAll("\\s+", " ").trim();
        return line;
    }

    public static void main(String[] args) {
        String line = " В  этой    строке лишние     пробелы ";
        System.out.println("До: [" + line + "]");
        System.out.println("После: [" + removeSpace(line) + "]");
    }
}
