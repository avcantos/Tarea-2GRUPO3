package FactoryMethod;

import Composite.CompPropiedad;
import Composite.Unidad;

public class HabitacionPrivadaFactory extends UnidadFactory {
    @Override
    public CompPropiedad crearUnidad(String idUnidad, double precio) {
        return new Unidad(idUnidad, "Habitación Privada", precio);
    }
}