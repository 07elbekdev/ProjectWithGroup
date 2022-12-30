package animal;

import animal.Animal;

public class Duck extends Animal implements AllAnimal {


    public Duck(String name, int age, String color, PreedOfAnimals poroda) {
        super(name, age, color, poroda);
    }

    @Override
    public String toString() {
        return "Duck"+super.toString();
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
