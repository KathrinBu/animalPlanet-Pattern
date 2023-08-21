package com.example.animalplanetpattern;

public class Fish extends ObservableAnimal implements IAnimals{
    String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String move() {
        return "no-sounds";

    }
}
