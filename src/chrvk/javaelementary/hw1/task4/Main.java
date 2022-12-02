package chrvk.javaelementary.hw1.task4;

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
