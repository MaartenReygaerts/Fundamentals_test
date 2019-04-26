package be.intecBrussel.forestBook.entities.plant_entities;

public class Weed extends Plant {

    //properties en fields
    private double area;

    //constructors
    public Weed(String name) {
        super(name);

    }

    public Weed(String name, double height) {
        super(name, height);
    }

    //setters en getters

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //toString

    @Override
    public String toString() {
        return null;
    }
}
