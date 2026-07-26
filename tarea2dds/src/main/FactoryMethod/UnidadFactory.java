package FactoryMethod;

import Composite.CompPropiedad;

public abstract class UnidadFactory {

    public abstract CompPropiedad crearUnidad(String idUnidad, double precio);
}