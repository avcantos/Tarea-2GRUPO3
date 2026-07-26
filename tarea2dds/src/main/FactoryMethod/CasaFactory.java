package FactoryMethod;

import Composite.CompPropiedad;
import Composite.Unidad;

public class CasaFactory extends UnidadFactory {
    @Override
    public CompPropiedad crearUnidad(String idUnidad, double precio) {
        return new Unidad(idUnidad, "Casa", precio);
    }
}