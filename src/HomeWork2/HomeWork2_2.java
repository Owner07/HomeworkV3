package HomeWork2;

import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if(t > -5){
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Normal"); // прописывать условие t <= -5 излишне т.к первое условие задает верхнюю границу а второе приравниевт к -5
        } else if (t < -20) {
            System.out.println("C0ld");
        }
    }
}
