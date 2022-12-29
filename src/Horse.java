public class Horse extends Animal implements AllAnimal {
    public Horse(String name, int age, String color, String breed) {
        super(name, age, color, breed);
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