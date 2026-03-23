package HomeWork3;

import java.util.Arrays;

public class Homework3_7 {
    /*
    Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
     */
    public static void main(String[] args) {
        int[] mass = {9, 9, 9, 9};
        System.out.println(Arrays.toString(mass));
        for (int i = mass.length - 1; i >= 0; i--){
            if(mass[i] < 9){
                mass[i]++;
                System.out.println(Arrays.toString(mass));
                return;
            }else {
                mass[i] = 0;
            }
        }
        int[] newmass = new int[mass.length + 1];
        newmass[0] = 1;
        System.out.println(Arrays.toString(newmass));
    }
}
