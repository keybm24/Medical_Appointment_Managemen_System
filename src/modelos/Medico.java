package modelos;

import interfaces.Persona;
import interfaces.Gestionable;

/**
 *
 * @author Keilyn Barrantes Mora
 */
public class Medico implements Persona, Gestionable{
      
    private String nombre;
    private String identificacion;
    private String especialidad;
    private String telefono;

    public Medico(String nombre, String identificacion, String especialidad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.especialidad = especialidad;
    }
    
    // SETTERS
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //  GETTERS
    @Override
    public String getIdentificacion() {
        return identificacion; 
    }

    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    public String getEspecialidad (){
        return especialidad;
    }
    public String getTelefono(){
        return telefono;
    }
    
    
    
    @Override
    public void guardar(){
    }
    
    @Override
    public void actualizar(){
    }
    
    @Override
    public void eliminar(){
    }

    
 



}
