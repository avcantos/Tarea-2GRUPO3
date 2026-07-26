package Singleton;

import java.util.List;
import propiedades.Propiedad;
import reservas.Reserva;

public class ControladorBaseDatos {

    private BaseDatosSingleton db;

    public ControladorBaseDatos() {
        db = BaseDatosSingleton.getInstance();
    }

    public void registrarPropiedad(Propiedad propiedad) {

        System.out.println("Registrando propiedad...");

        db.guardarPropiedad(propiedad);
    }

    public void registrarReserva(Reserva reserva) {

        System.out.println("Registrando reserva...");

        db.guardarReserva(reserva);
    }

    public List<Propiedad> consultarPropiedades() {

        System.out.println("Consultando catálogo...");

        return db.getCatalogo();
    }

    public List<Reserva> consultarReservas() {

        System.out.println("Consultando reservas...");

        return db.getReservas();
    }
}
