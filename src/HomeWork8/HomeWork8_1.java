package HomeWork8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */

public class HomeWork8_1 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коллекцию чисел: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число (" + (5 - num.size()) + " осталось): ");
            int input = scanner.nextInt();
            num.add(input);
            System.out.println(num);
        }scanner.close();
    }
}
