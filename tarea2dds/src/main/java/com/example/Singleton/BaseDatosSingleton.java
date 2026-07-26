package com.example.Singleton;
import java.util.ArrayList;
import java.util.List;

import com.example.Composite.Propiedad;
import com.example.dominio.reservas.Reserva;

public class BaseDatosSingleton {

    private static BaseDatosSingleton instance;

    private List<Propiedad> catalogo;
    private List<Reserva> reservas;

    // constructor privado
    private BaseDatosSingleton() {
        catalogo = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public static BaseDatosSingleton getInstance() {

        if (instance == null) {
            instance = new BaseDatosSingleton();
        }

        return instance;
    }

    public void guardarPropiedad(Propiedad propiedad) {

        catalogo.add(propiedad);

        System.out.println("Propiedad guardada en BD.");
    }

    public void guardarReserva(Reserva reserva) {

        reservas.add(reserva);

        System.out.println("Reserva guardada en BD.");
    }

    public List<Propiedad> getCatalogo() {
        return catalogo;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
