package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.ChainOfResponsibility.AnfitrionHandler;
import com.example.ChainOfResponsibility.ManejadorIncidente;
import com.example.ChainOfResponsibility.ModeradorHandler;
import com.example.ChainOfResponsibility.SoporteLegalHandler;
import com.example.dominio.incidentes.EstadoIncidente;
import com.example.dominio.incidentes.Incidente;
import com.example.dominio.usuarios.Anfitrion;
import com.example.dominio.usuarios.Moderador;
import com.example.dominio.usuarios.SoporteLegal;

public class ChainOfResponsibilityTest {

    @Test
    public void testEscaladoCadenaIncidentes() {
        Anfitrion anfitrion = new Anfitrion("A1", "Carlos", "carlos@mail.com", "123");
        Moderador moderador = new Moderador("Ana");
        SoporteLegal legal = new SoporteLegal("Abg. Pedro");

        ManejadorIncidente h1 = new AnfitrionHandler(anfitrion);
        ManejadorIncidente h2 = new ModeradorHandler(moderador);
        ManejadorIncidente h3 = new SoporteLegalHandler(legal);

        // Configuramos la cadena
        h1.setSiguiente(h2);
        h2.setSiguiente(h3);

        Incidente incidente = new Incidente("INC-01", "Fuga de agua grave", null);

        // Al procesar por la cadena (simulado donde anfitrión y moderador no resuelven):
        h1.manejar(incidente);

        // Soporte legal debe terminar resolviendo el incidente
        assertEquals(EstadoIncidente.RESUELTO, incidente.getEstado());
    }
}
