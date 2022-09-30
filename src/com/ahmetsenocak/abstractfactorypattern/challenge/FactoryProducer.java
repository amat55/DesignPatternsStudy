package com.ahmetsenocak.abstractfactorypattern.challenge;

public class FactoryProducer {
    MovieFactoryInterface getMovieFactory(String choice) {
        if (choice.equalsIgnoreCase("Action"))
            return new HollywoodMovieFactory();
        else if (choice.equalsIgnoreCase("Comedy")) {
            return new BollywoodMovieFactory();
        }

        return null;
    }

}
