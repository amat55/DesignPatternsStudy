package com.ahmetsenocak.dependencyinversionprinciple;


/*
The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules;
both should depend on abstractions. Abstractions should not depend on details. Details should depend upon abstractions.
 */
interface DBConnectionInterface {
    public int connect();
}

class MySqlConnection implements DBConnectionInterface {
    @Override
    public int connect() {
        return 1;//Successful connection for 1
    }
}

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}

