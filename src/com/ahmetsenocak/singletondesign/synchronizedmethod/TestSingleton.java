package com.ahmetsenocak.singletondesign.synchronizedmethod;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        s.setData(50);
        System.out.println("First value is: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        System.out.println("========");

        s = null;
        s = Singleton.getInstance();
        System.out.println("\nSecond value is: " + s);
        System.out.println("Singleton data value is: " + s.getData());

    }
}
