package com.ahmetsenocak.builderdesign.implemantion;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface carBuilder = new car();
        BuilderInterface motorCycleBuilder = new MotorCycle();

        //car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        //MotorCycle
        director.construct(motorCycleBuilder);
        Product p2 = motorCycleBuilder.getVehicle();
        p2.show();
    }
}
