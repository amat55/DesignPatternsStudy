package com.ahmetsenocak.factorymethod.factorymethodchallange;

public class AnimalFactory {
    public static animals getAnimals(String animType) {
        if (animType == null) {
            return null;
        } else if (animType.equalsIgnoreCase("DUCK"))
            return new Duck();
        else if (animType.equalsIgnoreCase("COW"))
            return new Cow();
        else if (animType.equalsIgnoreCase("CHICKEN"))
            return new Chicken();

        return null;
    }
}
