package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelos.Medico;

/**
 * @author Keilyn Barrantes Mora
 */
public class MedicoDAO {
    public Medico login(String correo, String contrasena) {

        String sql = "SELECT * FROM medico " + "WHERE correo = ? AND contrasena = ?";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Medico m = new Medico(
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("especialidad")
                );
                m.setTelefono(rs.getString("telefono"));
                return m;
            }

        } catch (Exception e) {
            System.out.println("Error login médico: " + e.getMessage());
        }

        return null;
    }

    public boolean registrar (Medico medico, String contrasena, String telefono){
        String sql = "INSERT INTO medico (nombre, correo, contrasena, especialidad, telefono) VALUES (?,?,?,?,?)";
        
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, medico.getNombre());
            ps.setString(2, medico.getIdentificacion());
            ps.setString(3, contrasena);
            ps.setString(4, medico.getEspecialidad());
            ps.setString(5, telefono);
            
            ps.executeUpdate();
            return true;
        } catch (Exception e){
            System.out.println("Error al registrar medico: " + e.getMessage());
            return false;
        }
    }
    
    public List<Medico> listar() {

        List<Medico> lista = new ArrayList<>();

        String sql = "SELECT nombre, correo, especialidad, telefono FROM medico";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Medico m = new Medico(
                    rs.getString("nombre"),
                    rs.getString("correo"),
                    rs.getString("especialidad")
            );

            m.setTelefono(rs.getString("telefono"));
            lista.add(m);
        }

    } catch (Exception e) {
        System.out.println("Error listar médicos: " + e.getMessage());
    }

    return lista;
    }
    
    public boolean eliminar(String correo){
        String sql = "DELETE FROM medico WHERE correo = ?";
        
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar medico: "+e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Medico medico) {

    String sql = "UPDATE medico SET nombre=?, especialidad=?, telefono=? WHERE correo=?";

    try {
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, medico.getNombre());
        ps.setString(2, medico.getEspecialidad());
        ps.setString(3, medico.getTelefono());
        ps.setString(4, medico.getIdentificacion());

        ps.executeUpdate();
        return true;

    } catch (Exception e) {
        System.out.println("Error actualizando medico: " + e.getMessage());
        return false;
    }
}

    
}
