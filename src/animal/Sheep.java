package animal;

public class Sheep extends Animal implements AllAnimal {
    public Sheep(String name, int age, String color, String breed) {
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
