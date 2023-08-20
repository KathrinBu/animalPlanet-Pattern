package com.example.animalplanetpattern;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileNotFoundException;
import java.util.List;

public class ObservableAnimals {
    ObservableList<ObservableAnimals> animals = FXCollections.observableArrayList();
    SimpleStringProperty name = new SimpleStringProperty();

    public ObservableAnimals(String name) {
        this.name.set(name);
    }
    public IAnimals getMove() throws FileNotFoundException {
        Zoo.getMove(animals);
        return null;
    }
}
