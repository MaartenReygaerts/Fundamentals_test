package be.intecBrussel.forestBook.entities.animal_entities;

public class Animal {
    //properties en fields
    private String name;
    private double weight;
    private double height;
    private double lenght;

    //constructors

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double lenght) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }

    //getters en setters

    //getName
    public String getName() {
        return name;
    }

    //getweight
    public double getWeight() {
        return weight;
    }

    //setWeight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //getHeight
    public double getHeight() {
        return height;
    }

    //setHeight
    public void setHeight(double height) {
        this.height = height;
    }

    //getlength
    public double getLenght() {
        return lenght;
    }

    //setlenght
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
