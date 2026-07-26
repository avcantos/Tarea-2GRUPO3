package com.example.dominio;
import java.util.List;

public class CriterioBusqueda {

    private String ubicacion;
    private double precioMin;
    private double precioMax;
    private String tipoAlojamiento;
    private List<String> servicios;

    public CriterioBusqueda(String ubicacion,
                            double precioMin,
                            double precioMax,
                            String tipoAlojamiento,
                            List<String> servicios) {

        this.ubicacion = ubicacion;
        this.precioMin = precioMin;
        this.precioMax = precioMax;
        this.tipoAlojamiento = tipoAlojamiento;
        this.servicios = servicios;
    }

    public void mostrarCriterios() {

        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Precio mínimo: " + precioMin);
        System.out.println("Precio máximo: " + precioMax);
        System.out.println("Tipo: " + tipoAlojamiento);
        System.out.println("Servicios: " + servicios);
    }
}
