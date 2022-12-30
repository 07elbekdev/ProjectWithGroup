package animal;

import animal.Animal;

public class Pork extends Animal implements AllAnimal {


    public Pork(String name, int age, String color, PreedOfAnimals poroda) {
        super(name, age, color, poroda);
    }

    @Override
    public String toString() {
        return "Pork"+super.toString();
    }

    @Override
    public void eating() {
        System.out.println("I'm eating");
    }

    @Override
    public void sleeping() {
        System.out.println("I'm sleeping");
    }
}
