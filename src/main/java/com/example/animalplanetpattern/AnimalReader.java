package com.example.animalplanetpattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalReader {

    public ObservableList<ObservableAnimal> readAnimals(String fname) throws FileNotFoundException {
        ObservableList<ObservableAnimal> animals = FXCollections.observableArrayList();
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner=new Scanner(new File(fname));
        while (scanner.hasNextLine()){
            strings.add(scanner.next());
        }
        AnimalFabricSimple afs = new AnimalFabricSimple();
        for (String s: strings  ) {
            ObservableAnimal beast = afs.produce(s);
            animals.add(beast);
        }
        return animals;
    }
}
