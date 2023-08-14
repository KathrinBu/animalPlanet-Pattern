package com.example.animalplanetpattern;

public class Tiger implements IAnimals{
    String name;

    public Tiger(String name) {
        this.name = name;
    }


    @Override
    public String move() {
       return "rrr";

    }
}
