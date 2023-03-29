package org.example.interfaces;

import org.example.Coche;
import org.example.CocheElectrico;
import org.example.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
