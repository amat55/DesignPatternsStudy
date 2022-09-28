package com.ahmetsenocak.interfacesegregationprinciple;

/*
In the field of software engineering, the interface segregation principle (ISP) states that no code should be forced to depend on methods
it does not use. ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have to know about
the methods that are of interest to them.
 */
public interface ShapeInterface {
    public double area();
}

interface SolidShapeInterface {
    public double volume();
}

interface ManageShapeInterface {
    public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {
    @Override
    public double area() {
        //calculate the surface area of the cuboid
        return 1.0;
    }

    @Override
    public double volume() {
        //calculate the volume of the cuboid
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class square implements ShapeInterface, ManageShapeInterface {
    @Override
    public double calculate() {
        return 2.0;
    }

    @Override
    public double area() {
        return this.area();
    }
}