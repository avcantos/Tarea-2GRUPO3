package com.example.Composite;
import java.util.Date;

import com.example.State.*;

public class Unidad implements CompPropiedad {

    private String idUnidad;
    private String tipo;
    private double precio;
    private EstadoUnidad estado;

    public Unidad(String idUnidad, String tipo, double precio) {
        this.idUnidad = idUnidad;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = new Disponible(); // estado inicial
    }

    public void cambiarEstado(EstadoUnidad nuevoEstado) {
        this.estado = nuevoEstado;

        System.out.println("Estado cambiado en unidad " + idUnidad);
    }

    public boolean esDisponible(Date inicio, Date fin) {
        System.out.println("Verificando disponibilidad...");

        return estado instanceof Disponible;
    }

    @Override
    public double costo() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void ocupar() {
        estado.ocupar(this);
    }

    public void liberar() {
        estado.liberar(this);
    }
}
