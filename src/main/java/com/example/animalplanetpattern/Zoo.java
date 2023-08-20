package com.example.animalplanetpattern;

import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.example.animalplanetpattern.EnumAnimal.*;

public class Zoo {

    public static IAnimals getMove(ObservableList<ObservableAnimals> strings) throws FileNotFoundException {
        ArrayList<String> animals = new ArrayList<>();
        Scanner scanner=new Scanner(new File("1.txt"));
        while (scanner.hasNextLine()){
            animals.add(scanner.next());
        }
        if (scanner.equals(CAT)) {
            return new Cat(CAT.name());
        } else if (scanner.equals(TIGER)) {
            return new Tiger(TIGER.name());
        } else if (scanner.equals(FISH)) {
            return new Fish(FISH.name());
        }
        return null;
    }

}
