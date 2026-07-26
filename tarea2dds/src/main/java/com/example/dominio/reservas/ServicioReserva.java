package com.example.dominio.reservas;

import com.example.Composite.Unidad;
import com.example.Strategy.notificacion.SistemaNotificacion;
import com.example.Strategy.pagos.Pago;
import com.example.dominio.pagos.PasarelaPago;
import com.example.dominio.usuarios.Huesped;
import com.example.dominio.usuarios.Usuario;

import java.util.Date;

public class ServicioReserva {

    private PasarelaPago pasarela;
    private SistemaNotificacion notificacion;

    public ServicioReserva(PasarelaPago pasarela,
                           SistemaNotificacion notificacion) {

        this.pasarela = pasarela;
        this.notificacion = notificacion;
    }

    public Reserva reservar(Date inicio,
                            Date fin,
                            Huesped huesped,
                            Unidad unidad) {

        System.out.println("Iniciando proceso de reserva...");

        Reserva reserva = new Reserva(inicio, fin, huesped, unidad);

        reserva.calcularTotal();

        return reserva;
    }

    public boolean procesarPago(Pago pago) {

        System.out.println("Procesando pago...");

        return pasarela.procesarTransaccion(pago);
    }

    public void enviarConfirmacion(Reserva reserva, Usuario usuario) {

        System.out.println("Enviando confirmación...");

        notificacion.enviarMensaje(usuario,
                "Tu reserva fue confirmada");
    }
}