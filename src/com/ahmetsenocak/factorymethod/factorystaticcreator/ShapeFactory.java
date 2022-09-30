package com.ahmetsenocak.factorymethod.factorystaticcreator;

public class ShapeFactory {

    //Only differences is static
    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
