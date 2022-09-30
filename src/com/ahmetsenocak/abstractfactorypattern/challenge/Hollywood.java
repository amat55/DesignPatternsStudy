package com.ahmetsenocak.abstractfactorypattern.challenge;

interface HollywoodInterface {
    String getMovieName();
}

class HollywoodComedyMovie implements HollywoodInterface {
    @Override
    public String getMovieName() {
        return "Hollywood Comedy Movie is Bad Teacher  ";
    }
}

class HollywoodActionMovie implements HollywoodInterface {
    @Override
    public String getMovieName() {
        return "Hollywood Action Movie is Avatar";
    }
}
