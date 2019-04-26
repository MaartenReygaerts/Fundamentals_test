package be.intecBrussel.forestBook.forestbook_app;

import be.intecBrussel.forestBook.Service.ForestNoteBook;
import be.intecBrussel.forestBook.entities.animal_entities.Carnivore;
import be.intecBrussel.forestBook.entities.animal_entities.Herbivore;
import be.intecBrussel.forestBook.entities.animal_entities.Omnivore;
import be.intecBrussel.forestBook.entities.plant_entities.*;

public class ForestBookApp {
    public static void main(String[] args) {

        ForestNoteBook noteBook = new ForestNoteBook();

        //plant 1
        Tree plant1 = new Tree("AmberTree", 9000);
        plant1.setLeafType(LeafType.ROUND);
        noteBook.addPlant(plant1);

        //plant 2
        Flower plant2 = new Flower("pisBloem", 5);
        plant2.setSmell(Scent.SOUR);
        noteBook.addPlant(plant2);

        //plant 3
        Weed plant3 = new Weed("OgKush", 15);
        plant3.setArea(420);
        noteBook.addPlant(plant3);

        //plant 4
        Bush plant4 = new Bush("DoornStruik uit Doornroosje", 62);
        plant4.setLeafType(LeafType.NEEDLE);
        noteBook.addPlant(plant4);

        //plant 5
        Flower plant5 = new Flower("Roos", 7);
        plant5.setSmell(Scent.SWEET);
        noteBook.addPlant(plant5);

        //animal 1
        Herbivore animal1 = new Herbivore("Brachiosaurus", 500000, 12, 26);
        animal1.addPlantToDiet(plant1);
        noteBook.addAnimal(animal1);

        //animal 2
        Herbivore animal2 = new Herbivore("Triceratops", 10000, 4, 6);
        animal2.addPlantToDiet(plant2);
        noteBook.addAnimal(animal2);

        //animal 3
        Carnivore animal3 = new Carnivore("Tyrannosaurus Rex", 1800, 6, 10);
        animal3.setMaxFoodSize(50);
        noteBook.addAnimal(animal3);

        //animal 4
        Carnivore animal4 = new Carnivore("Velociraptor", 20, 1.50, 4.5);
        animal4.setMaxFoodSize(5);
        noteBook.addAnimal(animal4);

        //animal 5
        Herbivore animal5 = new Herbivore("StegoSaurus", 1000, 4, 15);
        animal5.addPlantToDiet(plant2);
        noteBook.addAnimal(animal5);

        //animal 6
        Omnivore animal6 = new Omnivore("Troodon", 200, 5, 3);
        animal6.addPlantToDiet(plant3);
        animal6.setMaxFoodSize(3);
        noteBook.addAnimal(animal6);

        //animal 7
        Herbivore animal7 = new Herbivore("Edmontosaurus", 350, 7, 8);
        animal7.addPlantToDiet(plant5);
        noteBook.addAnimal(animal7);

        //animal 8
        Herbivore animal8 = new Herbivore("Anklyosaurus", 500, 5, 6);
        animal8.addPlantToDiet(plant3);
        noteBook.addAnimal(animal8);

        //animal 9
        Carnivore animal9 = new Carnivore("Spinosaurus", 750, 8, 9);
        animal9.setMaxFoodSize(15);
        noteBook.addAnimal(animal9);

        //print van notebook
        noteBook.printNoteBook();

        //sorteer methode oproeping
        noteBook.sortAnimalsByName();
        noteBook.sortPlantsByName();

        //print gesorteerde lijst op naam
        System.out.println("------------------------------------------------");
        System.out.println("Print van de gesorteerde lijst planten en dieren op naam");
        noteBook.printNoteBook();

        //print gesorteerde lijst op lengte plant
        noteBook.sortAnimalsByHeight();
        noteBook.sortPlantsByHeight();
        System.out.println("------------------------------------------------");
        System.out.println("Print van de gesorteerde lijst planten en dieren op hoogte ( kleinste eerst) ");
        noteBook.printNoteBook();


    }
}
