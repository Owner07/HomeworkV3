package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        String[] lines = input.lines();

        HW1 calculator = new HW1();

    String maxString = calculator.MaxString(lines);
    String minString = calculator.MinString(lines);
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String reset = "\u001B[0m";

        String coloredA = red + maxString + reset;
        String coloredB = green + minString + reset;
        System.out.println("Самая длинная строка: ".concat(coloredA).concat(" Количество символов: ").concat(String.valueOf(maxString.length())));
        System.out.println("Самая короткая строка: ".concat(coloredB).concat(" Количество символов: ").concat(String.valueOf(minString.length())));
    }
}