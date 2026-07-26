package com.example.ChainOfResponsibility;
import com.example.dominio.incidentes.*;
public abstract class ManejadorIncidente {

    protected ManejadorIncidente siguiente;

    public void setSiguiente(ManejadorIncidente siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejar(Incidente incidente);

}