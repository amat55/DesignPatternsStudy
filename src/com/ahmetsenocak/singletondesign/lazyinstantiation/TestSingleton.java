package com.ahmetsenocak.singletondesign.lazyinstantiation;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();//I didn't write "new" because it's a private contracture

        //set the data value
        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        //Get another reference to the singleton
        //is it the same object?
        s = null;
        s = Singleton.getInstance();
        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
