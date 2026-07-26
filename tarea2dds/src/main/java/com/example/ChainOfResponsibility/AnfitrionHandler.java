package com.example.ChainOfResponsibility;
import com.example.dominio.incidentes.*;
import com.example.dominio.usuarios.Anfitrion;

public class AnfitrionHandler extends ManejadorIncidente {

    private Anfitrion asignado;

    public AnfitrionHandler(Anfitrion asignado) {
        this.asignado = asignado;
    }

    @Override
    public void manejar(Incidente incidente) {

        System.out.println("Anfitrión revisando incidente...");

        // simulación simple
        boolean puedeResolver = false;

        if (puedeResolver) {
            incidente.resolver();
        } else {

            System.out.println("Anfitrión no puede resolver.");

            incidente.escalar();

            if (siguiente != null) {
                siguiente.manejar(incidente);
            }
        }
    }
}