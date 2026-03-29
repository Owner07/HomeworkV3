package HomeWork4;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard( 50);
        CreditCard creditCard2 = new CreditCard( 50);
        CreditCard creditCard3 = new CreditCard( 65465);
        creditCard.transferTo(12,creditCard2);
        creditCard.print();
        creditCard2.print();
        creditCard3.print();
    }
}
