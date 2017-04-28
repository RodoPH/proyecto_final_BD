package metodosSQL;

import conexion.Conex;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Metodos {

    Conex conectar = new Conex();
    ResultSet resultado;

    public void ejecutaUpdate(String sentSQL) {

        try {
            Connection estaConex = conectar.getConectar();
            PreparedStatement sta = estaConex.prepareStatement(sentSQL);
            sta.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex);
        }
    }

    public void ejecutaConsulta(String sentSQL) {
        try {
            Connection con = conectar.getConectar();
            Statement st = con.createStatement();
             resultado = st.executeQuery(sentSQL);
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e);
        }

    }
   
    public ResultSet getResultado() {
        return resultado;
    }
}
