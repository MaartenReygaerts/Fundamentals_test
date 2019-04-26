package be.intecBrussel.forestBook.entities.plant_entities;

public class Bush extends Plant {

    //properties en fields
    private String fruit;
    private LeafType leafType;

    //constructor


    public Bush(String name) {
        super(name);

    }

    public Bush(String name, double height) {
        super(name, height);
    }

    //getters en setters
    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    //toString
    @Override
    public String toString() {
        return null;
    }
}
