package be.intecBrussel.forestBook.Service;

import be.intecBrussel.forestBook.entities.animal_entities.Animal;
import be.intecBrussel.forestBook.entities.animal_entities.Carnivore;
import be.intecBrussel.forestBook.entities.animal_entities.Herbivore;
import be.intecBrussel.forestBook.entities.animal_entities.Omnivore;
import be.intecBrussel.forestBook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNoteBook {

    //properties en fields
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    //constructors
    public ForestNoteBook() {
    }

    //getters en setters
    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    //methods
    public void addAnimal(Animal newAnimal) {
        if (!notebookChecker(newAnimal.getName())) {
            animals.add(newAnimal);
            if (newAnimal instanceof Herbivore) {
                herbivores.add((Herbivore) newAnimal);
            } else if (newAnimal instanceof Carnivore) {
                carnivores.add((Carnivore) newAnimal);
            } else omnivores.add((Omnivore) newAnimal);
        } else System.out.println("You already have this animal in the list");

        this.animalCount += 1;
    }

    public void addPlant(Plant newPlant) {
        if (!notebookChecker(newPlant.getName())) {
            plants.add(newPlant);
        } else {
            System.out.println("You already have this plant in the list");
        }
        this.plantCount += 1;
    }

    //checker of het dier al bestaat in de lijst
    public boolean notebookChecker(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    //printMethode
    public void printNoteBook() {
        if (getAnimalCount() > 0) {
            //geeft aantal animals weer
            System.out.println("Aantal gespotte animals: " + getAnimalCount());
            //geeft alle namen van de animals weer
            animals.forEach(animal -> System.out.println("- " + animal.getName()));
        }
        if (getPlantCount() > 0) {
            //geeft aantal planten weer
            System.out.println("Aantal gespotte planten: " + getPlantCount());
            //geeft alle namen van de planten weer
            plants.forEach(plant -> System.out.println("- " + plant.getName()));
        }
    }

    //sort animals by name
    public void sortAnimalsByName() {
        this.animals = this.animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
    }

    //sort plants by name
    public void sortPlantsByName() {
        this.plants = this.plants.stream()
                .sorted(Comparator.comparing(Plant::getName))
                .collect(Collectors.toList());
    }

    //sort animals by height
    public void sortAnimalsByHeight() {
        this.animals = this.animals.stream()
                .sorted(Comparator.comparing(Animal::getHeight))
                .collect(Collectors.toList());
    }

    //sort plants by height
    public void sortPlantsByHeight() {
        this.plants = this.plants.stream()
                .sorted(Comparator.comparing(Plant::getHeight))
                .collect(Collectors.toList());
    }

}
