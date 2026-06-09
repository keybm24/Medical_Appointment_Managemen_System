package modelos;

import interfaces.Persona;
import interfaces.Gestionable;
/**
 *
 * @author Keilyn Barrantes Mora
 */

public class Paciente implements Persona, Gestionable {

    private String nombre;
    private String identificacion;
    private int edad;

    public Paciente(String nombre, String identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void guardar() {
    }

    @Override
    public void actualizar() {
    }

    @Override
    public void eliminar() {
    }
}
