package HomeWork2;

import java.util.Scanner;
/*
Напишите программу, где пользователь вводит любое целое положительное
число.

А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
*/

public class HomeWork2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumnumber = 0;
        System.out.println("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не верное число, пжлст введите целое число!");
            scanner.next();
        } int number = scanner.nextInt();

        while (number <= 0){
            System.out.println("Введено отрицательное число или нуль, пжлст введите целое положительное: ");
            while (!scanner.hasNextInt()){
                scanner.next();
            } number = scanner.nextInt();
        } for(int i =1; i <= number; i++){
            sumnumber = sumnumber + i;
        } System.out.println("Резз: " + sumnumber);
    }
}
