public class Duck extends Animal implements AllAnimal{
    public Duck(String name, int age, String color, String breed) {
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
