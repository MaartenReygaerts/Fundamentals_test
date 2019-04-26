package be.intecBrussel.forestBook.entities.animal_entities;

public class Carnivore extends Animal {

    //properties en fields
    private double maxFoodSize;


    //constructors
    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double lenght) {
        super(name, weight, height, lenght);
    }

    //getters en setters

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    //toString
    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                '}';
    }
}
