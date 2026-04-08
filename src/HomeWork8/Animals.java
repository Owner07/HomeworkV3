package HomeWork8;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> animals = new LinkedList<>();
    public void addAnimal(){
        animals.addFirst();
    }
    public void delAnimal(){
        animals.removeLast();
    }
}
