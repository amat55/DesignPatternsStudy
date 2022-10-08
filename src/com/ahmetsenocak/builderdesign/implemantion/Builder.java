package com.ahmetsenocak.builderdesign.implemantion;

/*
Builder is a creational design pattern, which allows constructing complex objects step by step.
 Unlike other creational patterns, Builder doesn't require products to have a common interface.
 That makes it possible to produce different products using the same construction process.
 */

interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 head lights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of Motor Cycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 head light is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}


