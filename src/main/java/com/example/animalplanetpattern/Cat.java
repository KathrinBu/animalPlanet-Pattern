package com.example.animalplanetpattern;

public class Cat extends ObservableAnimals implements IAnimals{
    String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String move() {
        return "mjy";

    }
}
