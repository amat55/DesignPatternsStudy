package com.ahmetsenocak.abstractfactorypattern;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}

class shapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class colorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String typeColor) {
        if (typeColor == null) {
            return null;
        } else if (typeColor.equalsIgnoreCase("BLACK"))
            return new Black();
        else if (typeColor.equalsIgnoreCase("RED"))
            return new Red();
        else if (typeColor.equalsIgnoreCase("BLUE"))
            return new Blue();

        return null;

    }

}