package com.example.dominio.reservas;

import com.example.Composite.Unidad;
import com.example.dominio.usuarios.Huesped;

import java.util.Date;

public class Reserva {

    private Date fechaInicio;
    private Date fechaFin;
    private EstadoReserva estado;
    private double total;
    private Huesped huesped;
    private Unidad unidad;

    public Reserva(Date fechaInicio,
                   Date fechaFin,
                   Huesped huesped,
                   Unidad unidad) {

        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.huesped = huesped;
        this.unidad = unidad;
        this.estado = EstadoReserva.PENDIENTE;
    }

    public double calcularTotal() {

        total = unidad.getPrecio();

        System.out.println("Calculando total: " + total);

        return total;
    }

    public void confirmar() {
        estado = EstadoReserva.CONFIRMADA;

        System.out.println("Reserva confirmada.");
    }

    public void cancelar() {
        estado = EstadoReserva.CANCELADA;

        System.out.println("Reserva cancelada.");
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public double getTotal() {
        return total;
    }
}
