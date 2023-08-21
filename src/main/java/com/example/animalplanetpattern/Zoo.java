package com.example.animalplanetpattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    String adress;

    private static Zoo singleZoo;

    public static Zoo makeZoo(String adr)
    {
        if(singleZoo == null)
            singleZoo = new Zoo(adr);
        return singleZoo;
    }
    private Zoo(String adress) {
        this.adress = adress;
    }

    ObservableList<ObservableAnimal> animals = FXCollections.observableArrayList();

    public void setAnimals(ObservableList<ObservableAnimal> animals) {
        this.animals = animals;
    }




}
