package com.ahmetsenocak.singletondesign.lazyinstantiation;

/*
Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.
There are two forms of singleton design pattern
-Early Instantiation: creation of instance at load time.
-Lazy Instantiation: creation of instance when required.
 */
//This is a Lazy Instantiation example
//Not thread safe!
public class Singleton {
    //the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    /*
       -The singleton Constructor
       -Note that it is private!
       -No client can instantiate a singleton object!
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    //add a set data here
    public void setData(int myData) {
        data = myData;
    }
    public int getData(){
        return data;
    }
}
