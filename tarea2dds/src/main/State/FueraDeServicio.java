package State;
import propiedades.Unidad;
public class FueraDeServicio implements EstadoUnidad {

    @Override
    public void ocupar(Unidad unidad) {
        System.out.println("Unidad fuera de servicio. No disponible.");
    }

    @Override
    public void liberar(Unidad unidad) {
        System.out.println("La unidad sigue fuera de servicio.");
    }
}