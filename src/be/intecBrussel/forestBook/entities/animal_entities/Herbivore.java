package be.intecBrussel.forestBook.entities.animal_entities;

import be.intecBrussel.forestBook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {

    //properties en fields
    private Set<Plant> plantDiet = new HashSet<>();

    //constructor
    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double lenght) {
        super(name, weight, height, lenght);
    }

    //getters en setters
    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    //methods
    public void addPlantToDiet(Plant newPlant) {
        plantDiet.add(newPlant);
    }

    public void printDiet() {

    }

    //toString
    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                '}';
    }
}
