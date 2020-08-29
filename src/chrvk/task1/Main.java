package chrvk.task1;

/*Вывести ряд чисел от 1 до 100 через пробел,
  с изменениями:
  - если число кратно 3 то вместо него вывести Hello
  - если число кратно 5 то вместо него вывести World
  - если число кратно и 3 и 5
  то вместо него вывести HelloWorld*/

public class Main {
    public static final byte number = 100;

    public static StringBuilder CreateLine(StringBuilder line){
        for(int i = 0; i < number; i++) {
            if(i % 3 == 0) {
                if(i % 5 == 0){
                    line.append("HelloWorld").append(" ");
                }
                line.append("Hello").append(" ");
            }
            else if(i % 5 == 0) {
                line.append("World").append(" ");
            }
            else {
                line.append(i).append(" ");
            }
        }
        return line;
    }
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        CreateLine(line);
        System.out.println(line);
    }
}