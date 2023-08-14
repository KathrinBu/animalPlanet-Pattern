package com.example.animalplanetpattern;

public class Fish implements IAnimals{
    String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public String move() {
        return "no-sounds";

    }
}
