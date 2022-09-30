package com.ahmetsenocak.factorymethod.factorystaticcreator;

public class Client {
    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
