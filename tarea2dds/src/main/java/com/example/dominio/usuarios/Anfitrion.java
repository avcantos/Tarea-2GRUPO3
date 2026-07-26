package com.example.dominio.usuarios;

import com.example.Composite.Propiedad;
import com.example.Composite.Unidad;
import com.example.State.EstadoUnidad;
import com.example.dominio.incidentes.Incidente;
import com.example.dominio.reservas.Reserva;

import java.util.ArrayList;
import java.util.List;
public class Anfitrion extends Usuario {

    private List<Propiedad> propiedades;

    public Anfitrion(String id, String nombre, String correo, String password) {
        super(id, nombre, correo, password);
        propiedades = new ArrayList<>();
    }

    public void registrarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);

        System.out.println(" registró una nueva propiedad.");
    }

    public void gestionarReglas(Propiedad propiedad, String reglas) {
        propiedad.setReglas(reglas);

        System.out.println("Reglas actualizadas.");
    }

    public void actualizarEstadoUnidad(Unidad unidad, EstadoUnidad estado) {
        unidad.cambiarEstado(estado);

        System.out.println("Estado de unidad actualizado.");
    }

    public void resolverIncidente(Incidente incidente) {
        System.out.println(nombre + " intenta resolver incidente.");
        incidente.resolver();
    }

    public void calificar(Reserva reserva, int puntuacion, String comentario) {
        System.out.println(nombre + " calificó al huésped.");
        System.out.println("Comentario: " + comentario);
    }
}