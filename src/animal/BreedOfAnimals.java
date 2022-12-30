package animal;

public enum BreedOfAnimals {
    Boxers("It's Boxer"), Mastiff("It's Mastiff"), German("It's German"), Shepherds("It's Shepherds"), Border("It's Border"), Collie("It's Collie");
  private String name;

    BreedOfAnimals(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}