package com.example.dominio.usuarios;

import com.example.Composite.Unidad;
import com.example.dominio.CriterioBusqueda;
import com.example.dominio.incidentes.Incidente;
import com.example.dominio.reservas.Reserva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Huesped extends Usuario {

    private List<Reserva> reservas;

    public Huesped(String id, String nombre, String correo, String password) {
        super(id, nombre, correo, password);
        this.reservas = new ArrayList<>();
    }

    public List<Unidad> buscarPropiedad(CriterioBusqueda criterio) {
        System.out.println(nombre + " está buscando propiedades...");
        return new ArrayList<>();
    }

    public Reserva realizarReserva(Unidad unidad, Date inicio, Date fin) {
        System.out.println(nombre + " está realizando una reserva.");

        Reserva reserva = new Reserva(inicio, fin, this, unidad);
        reservas.add(reserva);

        return reserva;
    }

    public Incidente reportarIncidente(String descripcion, Reserva reserva) {
        System.out.println(nombre + " reportó incidente: " + descripcion);

        return new Incidente("INC001", descripcion, reserva);
    }

    public List<Reserva> historialReservas() {
        System.out.println("Mostrando historial de reservas...");
        return reservas;
    }

    public void calificar(Reserva reserva, int puntuacion, String comentario) {
        System.out.println(nombre + " calificó la reserva con " + puntuacion);
        System.out.println("Comentario: " + comentario);
    }
}
