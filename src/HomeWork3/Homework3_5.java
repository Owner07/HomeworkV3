package HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Выберите модель заполнения 1 - В ручную, 2 - Автоматически");
        byte v = scanner.nextByte();
        if (v == 2) {
            System.out.println("Заполнение массива случайными числами:");
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
                System.out.print(array[i] + " ");
                System.out.println();
            }
        } else if (v == 1) {
            System.out.println("Пжлст заполните элементы масива в ручную, но не больше: " + size);
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент [" + i + "]: ");
                array[i] = scanner.nextInt();

            }
            {
                System.out.println("Получен массив веденный пользователем в ручную: ");
                int i;
                for (i = 0; i < size; i++) {
                    System.out.println("Элемент [" + i + "]: " + array[i]);
                }
            }

        } else {
            System.out.println("Введите 1 или 2");
        }
        scanner.close();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
