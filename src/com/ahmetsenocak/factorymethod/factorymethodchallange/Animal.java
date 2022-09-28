package com.ahmetsenocak.factorymethodAll.factorymethodchallange;

interface animals {
    void eat();
}

class Duck implements animals {
    @Override
    public void eat() {
        System.out.println("The Duck is eating...");
    }
}

class Cow implements animals {
    @Override
    public void eat() {
        System.out.println("The Cow is eating...");
    }
}

class Chicken implements animals {
    @Override
    public void eat() {
        System.out.println("the Chicken is eating..");
    }
}
