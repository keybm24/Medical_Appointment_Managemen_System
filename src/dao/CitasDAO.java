package dao;

import modelos.Citas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keilyn Barrantes Mora
 */
public class CitasDAO {
    
public void guardar(Citas c) {

        String sql = "INSERT INTO cita (paciente, fecha, hora, motivo, medico) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getPaciente());
            ps.setString(2, c.getFecha());
            ps.setString(3, c.getHora());
            ps.setString(4, c.getMotivo());
            ps.setString(5, c.getMedico());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error guardando cita: " + e.getMessage());
        }
    }

    public List<Citas> obtenerPorMedico(String medico) {

        List<Citas> lista = new ArrayList<>();

        String sql = "SELECT * FROM cita WHERE medico = ?";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, medico);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Citas c = new Citas(
                    rs.getString("paciente"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("motivo"),
                    rs.getString("medico")
                );

                lista.add(c);
            }

        } catch (Exception e) {
            System.out.println("Error obteniendo citas: " + e.getMessage());
        }

        return lista;
    }

}
