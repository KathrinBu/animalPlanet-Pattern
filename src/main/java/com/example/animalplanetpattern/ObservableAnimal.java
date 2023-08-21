package com.example.animalplanetpattern;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileNotFoundException;

public class ObservableAnimal implements IAnimals {
    //ObservableList<ObservableAnimal> animals = FXCollections.observableArrayList();
    SimpleStringProperty name = new SimpleStringProperty();

    public ObservableAnimal(String name) {
        this.name.set(name);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    @Override
    public String move() {
        return null;
    }

    /* public IAnimals getMove() throws FileNotFoundException {
        Zoo.getMove(animals);
        return null;
    }*/
}
