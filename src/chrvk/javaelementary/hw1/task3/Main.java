package chrvk.javaelementary.hw1.task3;

public class Main {
    public static final byte size = 30;

    public static String createLine() {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < size; i++) {
            line.append('(').append(i + 1).append(')').append(" ");
        }
        return line.toString();
    }

    public static void main(String[] args) {
        System.out.println(createLine());
    }
}