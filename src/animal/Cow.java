package animal;

import animal.Animal;

public class Cow extends Animal implements AllAnimal {
    public Cow(String name, int age, String color, String breed) {
        super(name, age, color);
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
