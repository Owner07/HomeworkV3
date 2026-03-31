package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID Карты №1: ");
        int id = scanner.nextInt();
        System.out.println("Введите баланс карты №1: ");
        int balance = scanner.nextInt();
        System.out.println("Введите ID Карты №2: ");
        int id1 = scanner.nextInt();
        System.out.println("Введите баланс карты №2: ");
        int balance1 = scanner.nextInt();
        System.out.println("Введите ID Карты №3:  ");
        int id2 = scanner.nextInt();
        System.out.println("Введите баланс карты №3: ");
        int balance2 = scanner.nextInt();
        CreditCard creditCard = new CreditCard(id, balance);
        CreditCard creditCard2 = new CreditCard(id1, balance1);
        CreditCard creditCard3 = new CreditCard(id2, balance2);
        creditCard.transferTo(balance1,creditCard2);
        creditCard.print();
        creditCard2.print();
        creditCard3.print();
    }
}
