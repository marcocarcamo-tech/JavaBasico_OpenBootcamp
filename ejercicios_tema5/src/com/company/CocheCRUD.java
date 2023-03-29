package com.company;

import java.util.List;

public interface CocheCRUD {

    public void save ();

    public List<Coche> findAll();

    public void delete();
}
