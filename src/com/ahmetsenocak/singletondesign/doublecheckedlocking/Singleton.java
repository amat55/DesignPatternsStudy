package com.ahmetsenocak.singletondesign.doublecheckedlocking;

public class Singleton {
    private volatile static Singleton uniqueInstance = null;
    /*
     “volatile” tells the compiler that the value of a variable must never be cached as its value
      may change outside of the scope of the program itself.
     */
    private int data = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { //we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int myData) {
        this.data = myData;
    }
}
