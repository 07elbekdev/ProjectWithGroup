package animal;

public class Duck extends Animal implements AllAnimal {
    public Duck(String name, int age, String color) {
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
