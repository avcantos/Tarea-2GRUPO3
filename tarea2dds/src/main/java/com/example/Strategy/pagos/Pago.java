package com.example.Strategy.pagos;
import java.util.Date;

public class Pago {

    private double monto;
    private Date fecha;
    private MetodoPago metodo;

    public Pago(double monto, MetodoPago metodo) {
        this.monto = monto;
        this.metodo = metodo;
        this.fecha = new Date();
    }

    public boolean ejecutarPago() {

        System.out.println("Monto a pagar: " + monto);

        return metodo.pagar();
    }

    public double getMonto() {
        return monto;
    }
}
