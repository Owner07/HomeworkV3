package HomeWork4_2;

import java.util.Scanner;

public class ATM {
    private int count20;
    private int count50;
    private int count100;

    public ATM(int count20, int count100, int count50) {
        this.count20 = count20;
        this.count100 = count100;
        this.count50 = count50;
    }

    public void contributeMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите количество купюр номиналом 20 рублей. : ");
        int count20 = scanner.nextInt();
        System.out.println("Внесите количество купюр номиналом 50 рублей. : ");
        int count50 = scanner.nextInt();
        System.out.println("Внесите количество купюр номиналом 100 рублей. : ");
        int count100 = scanner.nextInt();
        System.out.println("Вы внесли купюрами по 20: " + count20 * 20);
        System.out.println("Вы внесли купюрами по 50: " + count50 * 50);
        System.out.println("Вы внесли купюрами по 10: " + count100 * 100);
        System.out.println("Общая внесенная сумма: " + (count20 * 20 + count50 * 50 + count100 *100));
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
        getTotalAmount();
    }
    private int getTotalAmount(){
        int x = count20 * 20 + count50 * 50 + count100 *100;
        System.out.println("Общее количество средств на счету: " + x);
        return x;
    }
    public boolean withdrawal(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной");
            return false;
        }

        if (amount > getTotalAmount()) {
            System.out.println("Недостаточно средств на счету");
            return false;
        }

        int w20 = count20;
        int w50 = count50;
        int w100 = count100;
        int q = amount;
        int a100 = Math.min(q / 100, count100);
        q -= a100 * 100;
        int a50 = Math.min(q / 50, count50);
        q -= a50 * 50;
        int a20 = q / 20;
        q -= a20 * 20;

        if (q != 0 || a20 > count20) {
            count20 = w20;
            count50 = w50;
            count100 = w100;
            System.out.println("Невозможно выдать запрошенную сумму доступными купюрами");
            return false;
        }

        count100 -= a100;
        count50 -= a50;
        count20 -= a20;

        System.out.println("Выдано купюр по 100: " + a100);
        System.out.println("Выдано купюр по 50: " + a50);
        System.out.println("Выдано купюр по 20: " + a20);
        System.out.println("Общая сумма выдачи: " + amount);
        getTotalAmount();
        return true;
    }
}
