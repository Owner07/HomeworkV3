package HomeWork8;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal){
        animals.addFirst(animal);
    }

    public void delAnimal(){
        if(!animals.isEmpty()) {
            animals.removeLast();
        } else {
            System.out.println("Список пуст, нечего удалять! ");
        }
    }

    public void showAnimals() {
        System.out.println("Список животных: " + animals);
    }
}
