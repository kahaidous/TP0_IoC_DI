package org.example.dao;

public class NoSQL implements IDao {
    @Override
    public int getData() {
        System.out.println("This is NoSQL DB!");
        return 10;
    }
}
