package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Keilyn Barrantes Mora
 */

public class Conexion {

    private static final String URL =
        "jdbc:mysql://localhost:3306/gestion_citas_medicas?useSSL=false&serverTimezone=UT";
    private static final String USER = "root";
    private static final String PASSWORD = "luisyseidy";

    public static Connection getConexion() {
        try {
            System.out.println("✅ Conexión exitosa a MySQL");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
