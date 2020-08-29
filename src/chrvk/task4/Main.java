package chrvk.task4;

/*
Написать метод который убирает лишние пробелы
в строке и возвращает строку.
Убрать начальные, конечные и между словами
должно быть не больше 1 пробела.
*/
public class Main {
    public static String DeleteSpace(String line){
        line = line.replaceAll(" +", " ");
        line = line.trim();
        return line;
    }
    public static void main(String[] args) {
        String line = " В  этой    строке лишние     пробелы ";
        System.out.println(DeleteSpace(line));
    }
}
