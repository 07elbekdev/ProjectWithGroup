package animal;

public class Sheep extends Animal implements AllAnimal {


    public Sheep(String name, int age, String color, PreedOfAnimals poroda) {
        super(name, age, color, poroda);
    }

    @Override
    public String toString() {
        return "Sheep"+super.toString();
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
