package HomeWork4;



public class CreditCard {
    private int id;
    private int balance;

    public CreditCard(int id, int balance) {
        this.id = id;
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
