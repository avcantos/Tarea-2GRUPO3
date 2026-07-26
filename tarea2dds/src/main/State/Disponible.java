package State;
import propiedades.Unidad;
public class Disponible implements EstadoUnidad {

    @Override
    public void ocupar(Unidad unidad) {
        System.out.println("La unidad ahora está reservada.");

        unidad.cambiarEstado(new Reservada());
    }

    @Override
    public void liberar(Unidad unidad) {
        System.out.println("La unidad ya está disponible.");
    }
}
