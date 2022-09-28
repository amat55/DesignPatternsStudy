package com.ahmetsenocak.tointerface;


interface displayModule {
    public void display();
}

class monitor implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through to monitor");
    }
}

class Project implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through to projector");
    }
}

public class computer {
    displayModule dm;

    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        computer cm = new computer();
        displayModule dm = new monitor();
        displayModule dm1 = new Project();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm1);
        cm.display();
    }
}

