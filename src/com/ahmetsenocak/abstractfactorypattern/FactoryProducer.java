package com.ahmetsenocak.abstractfactorypattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("COLOR"))
            return new colorFactory();
        else if (choice.equalsIgnoreCase("SHAPE"))
            return new shapeFactory();

        return null;

    }
}
