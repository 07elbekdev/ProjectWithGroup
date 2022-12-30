package animal;

import animal.Animal;

public class Cow extends Animal implements AllAnimal {

    public Cow(String name, int age, String color, PreedOfAnimals poroda) {
        super(name, age, color, poroda);
    }

    @Override
    public String toString() {
        return "Cow"+super.toString();
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
