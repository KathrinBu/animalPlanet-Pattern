package com.example.animalplanetpattern;

public class Cat implements IAnimals{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String move() {
        return "mjy";

    }
}
