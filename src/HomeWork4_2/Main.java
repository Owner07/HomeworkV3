package HomeWork4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ATM Atm = new ATM(10,0,0);
    Atm.contributeMoney();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите сумму сколько хотите снять: ");
    int amount = scanner.nextInt();
    scanner.close();
    boolean status = Atm.withdrawal(amount);
    if (!status) {
        System.out.println("Операция не выполнена! 10");
    }
    }
}
