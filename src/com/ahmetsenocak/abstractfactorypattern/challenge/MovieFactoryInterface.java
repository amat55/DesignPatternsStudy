package com.ahmetsenocak.abstractfactorypattern.challenge;

interface MovieFactoryInterface {

    HollywoodInterface getHollywoodInterface(String type);

    BollywoodInterface getBollywoodInterface(String type);

}

class HollywoodMovieFactory implements MovieFactoryInterface {
    public HollywoodInterface getHollywoodInterface(String type) {
        if (type.equalsIgnoreCase("Action")) {
            return new HollywoodActionMovie();
        } else if (type.equalsIgnoreCase("Comedy")) {
            return new HollywoodComedyMovie();
        }
    }

    public BollywoodInterface getBollywoodInterface() {
        return null;
    }
}

class BollywoodMovieFactory implements MovieFactoryInterface {
    public HollywoodInterface getHollywoodInterface(String type) {
        return null;
    }

    public BollywoodInterface getBollywoodInterface(String type) {
        if (type.equalsIgnoreCase("Action")) {
            return new BollywoodActionMovie();
        } else if (type.equalsIgnoreCase("Comedy")) {
            return new BollywoodComedyMovie();
        }
    }
}
