package com.ahmetsenocak.delagationPrinciples;

class realPrinter {
    //The "Delegate"
    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    //The "Delegator"
    realPrinter p = new realPrinter();

    //create the delegate
    void print() {
        p.print(); //Delegation
    }
}

class Tester {
    //To the outside the world it looks like printer actually print
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

    }
}
