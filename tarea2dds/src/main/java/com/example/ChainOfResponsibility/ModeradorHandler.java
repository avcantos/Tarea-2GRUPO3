package com.example.ChainOfResponsibility;
import com.example.dominio.incidentes.*;
import com.example.dominio.usuarios.Moderador;

public class ModeradorHandler extends ManejadorIncidente {

    private Moderador asignado;

    public ModeradorHandler(Moderador asignado) {
        this.asignado = asignado;
    }

    @Override
    public void manejar(Incidente incidente) {

        System.out.println("Moderador revisando incidente...");

        boolean puedeResolver = false;

        if (puedeResolver) {
            incidente.resolver();
        } else {

            System.out.println("Moderador escala incidente.");

            incidente.cambiarEstado(
                    EstadoIncidente.CRITICO
            );

            if (siguiente != null) {
                siguiente.manejar(incidente);
            }
        }
    }
}