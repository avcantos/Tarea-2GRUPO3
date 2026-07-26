package com.example.dominio.incidentes;
import com.example.dominio.reservas.Reserva;
public class Incidente {

    private String idIncidente;
    private String descripcion;
    private EstadoIncidente estado;
    private Reserva reserva;

    public Incidente(String idIncidente,
                     String descripcion,
                     Reserva reserva) {

        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.reserva = reserva;
        this.estado = EstadoIncidente.ABIERTO;
    }

    public void escalar() {
        estado = EstadoIncidente.ESCALADO;

        System.out.println("Incidente escalado.");
    }

    public void resolver() {
        estado = EstadoIncidente.RESUELTO;

        System.out.println("Incidente resuelto.");
    }

    public void cambiarEstado(EstadoIncidente estado) {
        this.estado = estado;

        System.out.println("Nuevo estado: " + estado);
    }

    public EstadoIncidente getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
}