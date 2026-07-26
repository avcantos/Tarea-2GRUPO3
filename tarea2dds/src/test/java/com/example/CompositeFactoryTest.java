package com.example;

import com.example.Composite.CompPropiedad;
import com.example.Composite.Propiedad;
import com.example.Composite.Unidad;
import com.example.FactoryMethod.*;

import org.junit.Test;
import static org.junit.Assert.*;


public class CompositeFactoryTest {

    @Test
    public void testCreacionUnidadesConFactory() {
        UnidadFactory habFactory = new HabitacionPrivadaFactory();
        UnidadFactory depFactory = new DepartamentoFactory();

        CompPropiedad hab = habFactory.crearUnidad("HAB-01", 30.0);
        CompPropiedad dep = depFactory.crearUnidad("DEP-01", 80.0);

        assertTrue(hab instanceof Unidad);
        assertEquals("Habitación Privada", ((Unidad) hab).getTipo());
        assertEquals(30.0, hab.costo(),0);

        assertTrue(dep instanceof Unidad);
        assertEquals("Departamento Completo", ((Unidad) dep).getTipo());
        assertEquals(80.0, dep.costo(),0);
    }

    @Test
    public void testCostoTotalComposite() {
        Propiedad edificio = new Propiedad("Edificio Central", "Av. Principal", "Sin mascotas");
        UnidadFactory casaFactory = new CasaFactory();

        CompPropiedad casa1 = casaFactory.crearUnidad("CAS-01", 100.0);
        CompPropiedad casa2 = casaFactory.crearUnidad("CAS-02", 150.0);

        edificio.añadirUnidad(casa1);
        edificio.añadirUnidad(casa2);

        // El costo del edificio debe ser la suma de sus unidades (100 + 150)
        assertEquals(250.0, edificio.costo(),0);
    }
}
