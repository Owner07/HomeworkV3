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
        System.out.println("Внесите количество купюр номиналом 20 рублей : ");
        int count20 = scanner.nextInt();
        System.out.println("Внесите количество купюр номиналом 50 рублей : ");
        int count50 = scanner.nextInt();
        System.out.println("Внесите количество купюр номиналом 100 рублей : ");
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
    public boolean withdrawal(int amount){
        if (amount <= 0) return false;
        if (amount > getTotalAmount()) return false;
        double a100 = Math.floor ((double) amount / 100);
        double a50 = Math.floor ((amount - a100 * 100) / 50);
        double a20 = Math.floor((amount - a100 * 100 - a50 * 50) / 20);
        if(a100 <= count100){
            count100 -= a100;
        }else {
            a50 += (a100 - count100) * 2;
            count100 = 0;
        }
        if(a50 <= count50){
            count50 -= a50;
        }else {
            double x = (a50 - count50);
            if(x % 2 == 0){
                x = x * 2.5;
            }else {
                x = x * 2;
            }
            a20 += (x);
            count50 = 0;
        }
        count20 -= a20;
        System.out.println("Купюр по  20: " + count20 + "\nСняли количество купюр: " + a20);
        System.out.println("Купюр по  50: " + count50 + "\nСняли количество купюр: " + a50);
        System.out.println("Купюр по  100: " + count100 + "\nСняли количество купюр: " + a100);
        getTotalAmount();
        return true;
    }

}
