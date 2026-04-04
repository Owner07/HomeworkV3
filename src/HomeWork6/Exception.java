package HomeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public void verOne (int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат деления " + a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно! - " + e.getMessage());
        }
        System.out.println("Программа продолжает работу");
    }
    public void verTwo (int[] array, int index) {
        try {
            System.out.println("Элемент с индексом " + index + ": " + array[index]);
            array.toString().length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс " + index + " выходит за границы массива! " +
                    "(размер массива: " + array.length + ")");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Массив не инициализирован (null)!");
        }
    }

    public void verThree(int[] array, int i) {
        try {
            System.out.println("Элемент с индексом " + i + ": " + array[i]);
            array.toString().length();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Поймали ошибочку" + e.getMessage());
        } System.out.println("Программа продолжает работу");
    }
    public void verFour () {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число а: ");
            int a = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Поймали ошибочку: " + "Введено не число");
        }finally {
            scanner.close();
            System.out.println("Программа продолжает работу");
        }
    }
}


