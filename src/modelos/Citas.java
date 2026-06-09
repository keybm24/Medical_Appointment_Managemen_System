
package modelos;

/**
 * @author Keilyn Barrantes Mora
 */
public class Citas {
    private String paciente;
    private String fecha;
    private String hora;
    private String motivo;
    private String medico;
    
    public void setPaciente(String paciente) { this.paciente = paciente; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setHora(String hora) { this.hora = hora; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    
    public Citas(String paciente, String fecha, String hora, String motivo, String medico) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.medico = medico;
    }

    public String getPaciente(){
        return paciente;
    }
    public String getFecha(){
        return fecha;
    }
    public String getMedico() {
        return medico;
    }

    
    public String getHora(){
        return hora;
    }
    public String getMotivo(){
        return motivo;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }

}
