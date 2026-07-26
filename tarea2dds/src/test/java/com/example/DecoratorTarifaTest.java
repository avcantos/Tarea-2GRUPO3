package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Composite.CompPropiedad;
import com.example.Composite.Unidad;
import com.example.Decorator.TarifaExtra;
import com.example.Decorator.TarifaSeguridad;

public class DecoratorTarifaTest {

    @Test
    public void testAplicacionDecoradoresTarifa() {
        CompPropiedad unidadBase = new Unidad("DEP-1", "Departamento Completo", 100.0);

        // Añadimos TarifaExtra (+15.0)
        CompPropiedad conExtra = new TarifaExtra(unidadBase);
        assertEquals(115.0,conExtra.costo(), 0.0);

        // Añadimos Depósito de Seguridad (+25.0) sobre la tarifa anterior
        CompPropiedad conSeguridadYExtra = new TarifaSeguridad(conExtra);
        assertEquals(140.0, conSeguridadYExtra.costo(),0.0);
    }
}
