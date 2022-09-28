package com.ahmetsenocak.factorymethodAll.factorymethodchallange;

public class Client {
    public static void main(String[] args) {
        animals anim1 = AnimalFactory.getAnimals("COW");
        anim1.eat();

        animals anim2 = AnimalFactory.getAnimals("DUCK");
        anim2.eat();

        animals anim3 = AnimalFactory.getAnimals("CHICKEN");
        anim3.eat();
    }
}
