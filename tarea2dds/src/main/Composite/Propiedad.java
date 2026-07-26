package Composite;

import java.util.ArrayList;
import java.util.List;

public class Propiedad implements CompPropiedad {

    private String nombre;
    private String direccion;
    private String reglas;
    private List<CompPropiedad> children;

    public Propiedad(String nombre, String direccion, String reglas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.reglas = reglas;
        this.children = new ArrayList<>();
    }

    public void añadirUnidad(CompPropiedad unidad) {
        children.add(unidad);
        System.out.println("Unidad añadida a propiedad " + nombre);
    }

    public void removerUnidad(CompPropiedad unidad) {
        children.remove(unidad);
        System.out.println("Unidad eliminada.");
    }

    public List<CompPropiedad> getChildren() {
        return children;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    @Override
    public double costo() {

        double total = 0;

        for (CompPropiedad c : children) {
            total += c.costo();
        }

        return total;
    }
}