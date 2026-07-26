package Decorator;
import propiedades.CompPropiedad;
public class TarifaExtra extends TarifaDecorator {

    public TarifaExtra(CompPropiedad propiedad) {
        super(propiedad);
    }

    @Override
    public double costo() {

        double total = propiedad.costo() + 15.0;

        System.out.println("Aplicando tarifa extra (+15)");

        return total;
    }
}
