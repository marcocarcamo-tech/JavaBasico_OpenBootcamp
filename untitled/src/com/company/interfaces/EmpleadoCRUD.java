package com.company.interfaces;

import com.company.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    public void save(Empleado empleado);

    public List<Empleado> findAll();

    public void delete(Empleado empleado);
}
