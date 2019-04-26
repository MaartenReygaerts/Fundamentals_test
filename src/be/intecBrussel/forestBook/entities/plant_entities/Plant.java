package be.intecBrussel.forestBook.entities.plant_entities;

public class Plant {

    //properties & fields
    private String name;
    private double height;

    //constructors
    public Plant(String name) {
        setName(name);
    }

    public Plant(String name, double height) {
        setName(name);
        setHeight(height);
    }

    //getters en setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
