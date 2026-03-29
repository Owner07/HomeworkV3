package HomeWork4;

import java.util.Random;

public class CreditCard {
    private int id;
    private int balance;

    public CreditCard(int balance) {
        this.id = new Random().nextInt((200-100) + 1) + 100; // прочитать про генерацию уида
        this.balance = balance;
    }

    public void payment (int amount) {
        balance += amount;
    }

    public void withdrawal (int amount) {
        balance -= amount;
    }

    public void print () {
        System.out.println("ID карты " + id);
        System.out.println("Баланс " + balance);
    }

    public void transferTo (int amount, CreditCard creditCard) {
        withdrawal(amount);
        creditCard.payment(amount);
    }
}
