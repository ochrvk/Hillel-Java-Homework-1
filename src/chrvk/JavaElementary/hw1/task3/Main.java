package chrvk.JavaElementary.hw1.task3;

/*Написать метод который вернет String
в которой будут в одну строку числа от 1 до 30.
Каждое число при этом взять в круглые скобки ()*/

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