package com.ahmetsenocak.singletondesign.billpugh;

public class Singleton {

    private int data = 0;

    private Singleton(){}

    private static class SingletonHelper{
        //Nested class is referenced after getInstance() is called
        private static final Singleton uniqueInstance = new Singleton();
    }
    public Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int myData) {
        this.data = myData;
    }
}
