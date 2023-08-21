package com.example.animalplanetpattern;

import static com.example.animalplanetpattern.EnumAnimal.*;
import static com.example.animalplanetpattern.EnumAnimal.FISH;

public class AnimalFabricSimple {
    public ObservableAnimal produce(String s)
    {
        EnumAnimal key = EnumAnimal.valueOf(s.toUpperCase());
        switch (key) {
            case CAT -> {
                return new Cat(s);
            }
            case TIGER -> {
                return new Tiger(s);
            }
            case FISH -> {
                return new Fish(s);
            }
        }
        return null;
    }
}
