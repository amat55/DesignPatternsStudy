package com.ahmetsenocak.factorymethod.factorymethod;

public class Client {
    public static void main(String[] args) {
        /*
        A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class
         for creating an object but let the subclasses decide which class to instantiate. In other words,
         subclasses are responsible to create the instance of the class.
         */
        Shape shape1 = new CircleFactory().getFactory();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getFactory();
        shape2.draw();

        Shape shape3 = new SquareFactory().getFactory();
        shape3.draw();
    }
}
