package com.example.Strategy.pagos;
public class MetodoPago {

    private String tipo;

    public MetodoPago(String tipo) {
        this.tipo = tipo;
    }

    public boolean pagar() {
        System.out.println("Pagando con método: " + tipo);
        return true;
    }

    public String getTipo() {
        return tipo;
    }
}