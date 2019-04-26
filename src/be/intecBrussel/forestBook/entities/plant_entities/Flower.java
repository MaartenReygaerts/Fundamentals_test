package be.intecBrussel.forestBook.entities.plant_entities;

public class Flower extends Plant{

    //properties en fields
    private Scent smell;

    //constructors
    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    //getters en setters
    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    //toString
    @Override
    public String toString() {
        return "Flower{" +
                "smell=" + smell +
                '}';
    }
}
