package com.ahmetsenocak.abstractfactorypattern.Implementation;

/*
Abstract Factory Pattern says that just define an interface or abstract
class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.
That means Abstract Factory lets a class returns a factory of classes.
 So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
 */

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::Draw() method.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::Draw() method.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::Draw() method.");
    }
}
