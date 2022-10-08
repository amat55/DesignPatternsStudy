package com.ahmetsenocak.builderdesign.implemantion;

public class Director {
    BuilderInterface myBuilder;

    //those are the steps
    public void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadLights();


    }
}
