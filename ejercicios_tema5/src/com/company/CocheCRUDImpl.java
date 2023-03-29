package com.company;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Metodo save desde implementación");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Metodo findALL desde implementación");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Metodo delete desde implementación");
    }
}
