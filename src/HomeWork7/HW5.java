package HomeWork7;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            res.append(w).append(w);
        }
        System.out.println(res.toString());
    }
}
