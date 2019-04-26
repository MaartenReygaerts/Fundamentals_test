package be.intecBrussel.forestBook.entities.animal_entities;

import be.intecBrussel.forestBook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    //constructors
    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double lenght) {
        super(name, weight, height, lenght);
    }

    //getters en setters

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    //methods
    public void addPlantToDiet(Plant newPlant) {
        plantDiet.add(newPlant);
    }

    //toString
    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
