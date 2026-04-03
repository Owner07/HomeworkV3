package HomeWork5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой план лечения?");
        Patient patient = new Patient(scanner.nextInt());
        Therapist therapist = new Therapist();
        therapist.assignDoctor(patient);
    }
}