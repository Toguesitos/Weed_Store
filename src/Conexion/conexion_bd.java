package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion_bd {
     Connection Conn;
    public conexion_bd(){
        
    }
    public Connection establecer() {
        String url = "jdbc:mysql://localhost:3306/Mota_feliz";
        String user = "root";
        String password = "12345";
        
        try  {
            Conn = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Conn;
    }
        public void close (){
            try {
                Conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }