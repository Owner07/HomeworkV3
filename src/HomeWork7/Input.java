package HomeWork7;

import java.util.Scanner;

public class Input {
    public String[] lines() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательно 3 строки:");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        scanner.close();

        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String blue = "\u001B[34m";
        String reset = "\u001B[0m";

        String coloredA = red + a + reset;
        String coloredB = green + b + reset;
        String coloredC = blue + c + reset;
        System.out.println(String.join("\n", coloredA, coloredB, coloredC));

        return new String[]{a, b, c};
    }
}