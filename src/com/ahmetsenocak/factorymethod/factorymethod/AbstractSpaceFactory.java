package com.ahmetsenocak.factorymethodAll.factorymethod;

public abstract class AbstractSpaceFactory {
    protected abstract Shape factoryMethod();

    public Shape getFactory(){
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractSpaceFactory{
    protected Shape factoryMethod(){
        return new Rectangle();
    }
}

class SquareFactory extends AbstractSpaceFactory{
    protected Shape factoryMethod(){
        return new Square();
    }
}

class CircleFactory extends AbstractSpaceFactory{
    protected Shape factoryMethod(){
        return new Circle();
    }
}