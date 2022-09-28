package com.ahmetsenocak.dependencyinjection;

/*
In object-oriented programming (OOP) software design, dependency injection (DI)
is the process of supplying a resource that a given piece of code requires.
 The required resource, which is often a component of the application itself, is called a dependency.
 */
/*
public interface Service {
    void write(String message);
}

public class ServiceA implements Service {

    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    private Service MyService;

    //inject via the contracture
    public Client(Service service) {
        this.MyService = service;
    }

    public void doSomething() {
        MyService.write("This is a message");
    }
}
*/