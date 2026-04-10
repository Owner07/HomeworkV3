package HomeWork8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals animalist = new Animals();
        System.out.println("Введите 1 для добавления животного, 2 для удаления: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        animalist.addAnimal("Кошка");
        animalist.addAnimal("Собака");
        animalist.addAnimal("Попугай");
        if(a == 1){
            System.out.println("Введите название животного");
            String animal = scanner.nextLine();
            animalist.addAnimal(animal);
            animalist.showAnimals();
        }else if (a == 2){
            animalist.showAnimals();
            animalist.delAnimal();
            animalist.showAnimals();
        }else {
            System.out.println("Не верный код");
        }
    }
}
