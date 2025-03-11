package org.example.metier;

import org.example.dao.IDao;

public class CalculV1 implements ICalcul {
    IDao dao;

    public CalculV1(IDao dao) {
        this.dao = dao;
    }

    @Override
    public int calculer() {
        return dao.getData()*2;
    }
}
