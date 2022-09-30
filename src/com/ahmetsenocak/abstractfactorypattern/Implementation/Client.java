package com.ahmetsenocak.abstractfactorypattern.Implementation;

public class Client {
    public static void main(String[] args) {
        AbstractFactory getShapeFactory = FactoryProducer.getFactory("Shape");

        Shape shape1 = getShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = getShapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = getShapeFactory.getShape("RECTANGLE");
        shape3.draw();

        System.out.println("--------------------------");
        AbstractFactory getColorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = getColorFactory.getColor("RED");
        color1.fill();

        Color color2 = getColorFactory.getColor("BLUE");
        color2.fill();

        Color color3 = getColorFactory.getColor("BLACK");
        color3.fill();

    }
}
