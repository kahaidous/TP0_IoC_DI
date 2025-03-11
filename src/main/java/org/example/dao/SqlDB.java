package org.example.dao;

public class SqlDB implements IDao {
    @Override
    public int getData() {
        System.out.println("This is SQL DB!");
        return 7;
    }
}
