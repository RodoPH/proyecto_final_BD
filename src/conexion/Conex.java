package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conex {

    public static java.sql.Connection conectar;

    //Método para hacer conexión a la base de datos
    public void conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/tiendamar", "root", "6CjYSQepLKIELZcH");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al hacer conexión a la Base de datos", "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }
 
    //Método para cerrar conexión
    public void cerrarConexion() {
        try {
            conectar.close();
            System.err.println("Conexión finalizada");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cerrar la conexión a la Base de datos", "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }

    public Connection getConectar() {
        return conectar;
    }

   
}
