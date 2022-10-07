package com.ahmetsenocak.singletondesign.doublecheckedlocking;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(55);
        System.out.println("First value is: " + s);
        System.out.println("Singleton value is: " + s.getData());

        s = null;
        s = Singleton.getInstance();
        System.out.println("\nSecond value is: " + s);
        System.out.println("Singleton value is: " +s.getData());
    }
}
