package ChainOfResponsability;
import usuarios.SoporteLegal;
public class SoporteLegalHandler extends ManejadorIncidente {

    private SoporteLegal asignado;

    public SoporteLegalHandler(SoporteLegal asignado) {
        this.asignado = asignado;
    }

    @Override
    public void manejar(Incidente incidente) {

        System.out.println("Soporte legal atendiendo incidente crítico.");

        incidente.resolver();
    }
}