package animal;

import animal.Animal;

public class Cat extends Animal implements AllAnimal {
    public Cat(String name, int age, String color) {
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
