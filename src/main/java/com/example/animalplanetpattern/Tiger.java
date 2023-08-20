package com.example.animalplanetpattern;

public class Tiger extends ObservableAnimals implements IAnimals{
    String name;

    public Tiger(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String move() {
       return "rrr";

    }
}
