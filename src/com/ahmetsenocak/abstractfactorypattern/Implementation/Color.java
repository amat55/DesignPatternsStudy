package com.ahmetsenocak.abstractfactorypattern.Implementation;

interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

class Black implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Black::fill() method.");
    }
}
