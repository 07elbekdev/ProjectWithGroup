package animal;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private PreedOfAnimals poroda;

    public Animal(String name, int age, String color, PreedOfAnimals poroda) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.poroda = poroda;
    }

    public java.lang.Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PreedOfAnimals getPoroda() {
        return poroda;
    }

    public void setPoroda(PreedOfAnimals poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "->" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", poroda=" + poroda +
                '}';
    }

    public abstract void eating();

    public abstract void sleeping();

}
