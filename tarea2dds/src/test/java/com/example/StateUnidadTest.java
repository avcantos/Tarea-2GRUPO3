package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Composite.Unidad;

public class StateUnidadTest {

    @Test
    public void testFlujoEstadosUnidad() {
        Unidad unidad = new Unidad("U-101", "Habitación Privada", 50.0);

        // Estado inicial
        assertTrue(unidad.esDisponible(null, null));

        // Transición: Ocupar cuando está disponible pasa a Reservada
        unidad.ocupar();
        assertFalse(unidad.esDisponible(null, null));

        // Transición: Ocupar cuando está reservada pasa a Ocupada
        unidad.ocupar();
        assertFalse(unidad.esDisponible(null, null));

        // Transición: Liberar cuando está ocupada vuelve a Disponible
        unidad.liberar();
        assertTrue(unidad.esDisponible(null, null));
    }
}
