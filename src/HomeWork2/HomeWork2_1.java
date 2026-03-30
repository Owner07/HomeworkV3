package HomeWork2;

import java.util.Scanner;

public class HomeWork2_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        if (a % 2 == 0){
            System.out.println("Good");
        }else {
            System.out.print("No good");
        }
    }

}
