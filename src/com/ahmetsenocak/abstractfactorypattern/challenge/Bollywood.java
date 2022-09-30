package com.ahmetsenocak.abstractfactorypattern.challenge;

interface BollywoodInterface {
    String getMovieName();
}

class BollywoodComedyMovie implements BollywoodInterface {
    @Override
    public String getMovieName() {
        return "Bolly wood Comedy Movie is Zero";
    }
}

class BollywoodActionMovie implements BollywoodInterface {

    @Override
    public String getMovieName() {
        return "Bollywood Action Movie is Externals";
    }
}
