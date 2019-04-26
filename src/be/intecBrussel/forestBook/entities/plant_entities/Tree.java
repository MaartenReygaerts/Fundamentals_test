package be.intecBrussel.forestBook.entities.plant_entities;

public class Tree extends Plant {
    //properties en fields
    private LeafType leafType;

    //constructors


    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }
    //getters en setters

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }
    //toString

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                '}';
    }
}
