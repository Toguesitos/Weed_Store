package Backend;

import Objects.*;
import Objects.cls_cliente;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Conexion.conexion_bd;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Gestion_cliente {

    conexion_bd Conn;
    PreparedStatement PS;
    ResultSet RS;

    public Gestion_cliente() {
        Conn = new conexion_bd();
    }
     String Cadena = "";
     int respuesta = 0;
    public String Crear_Cliente(cls_cliente Cliente) {
       
        Connection iniciar = Conn.establecer();
        try {
            String SQLInsert = "INSERT INTO clientes(ID_cliente,Tipo_documento,Documento,Nombres,Apellidos,Edad,Telefono,Sexo,Direccion) VALUES(?,?,?,?,?,?,?,?,?)";
            PS = iniciar.prepareStatement(SQLInsert);
            PS.setLong(1, Cliente.getID_cliente());
            PS.setString(2, Cliente.getTipo_Documento());
            PS.setString(3, Cliente.getDocumento());
            PS.setString(4, Cliente.getNombres());
            PS.setString(5, Cliente.getApellidos());
            PS.setInt(6, Cliente.getEdad());
            PS.setLong(7, Cliente.getTelefono());
            PS.setString(8, Cliente.getSexo());
            PS.setString(9, Cliente.getDireccion());
            
            respuesta = PS.executeUpdate();
            if (respuesta >= 1) {
                Cadena = "Registro exitoso del cliente";
            } else {
                Cadena = "El cliente no fue registrado";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la creacion del cliente" + e.getMessage());
        }
        return Cadena;
    }

    public String Eliminar_cliente(long IDEliminar) {
        String Cadena = "";
        int res = 0;
        Connection iniciar = Conn.establecer();
        try {
            String SQLEliminar = "DELETE FROM clientes WHERE ID_cliente =?";
            PS = iniciar.prepareStatement(SQLEliminar);
            PS.setLong(1, IDEliminar);
            res = PS.executeUpdate();
            if (res >= 1) {
                Cadena = "Eliminacion exitosa del cliente";
            } else {
                Cadena = "Hubo un error al eliminar en la base de datos";
            }
        } catch (Exception e) {
            Cadena = "Error en la base de datos - " + e.getMessage();
        }
        return Cadena;
    }

    public DefaultTableModel ListarClientes() {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Tipo Documento");
        modelo.addColumn("Documento");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Genero");
        modelo.addColumn("Direccion");

        try {

            Connection iniciar = Conn.establecer();

            String SQLListar = "SELECT * FROM clientes";
            PS = iniciar.prepareStatement(SQLListar);
            RS = PS.executeQuery();

            while (RS.next()) {

                Object[] Lista = {
                    RS.getLong(1),
                    RS.getString(2),
                    RS.getString(3),
                    RS.getString(4),
                    RS.getString(5),
                    RS.getInt(6),
                    RS.getLong(7),
                    RS.getString(8),
                    RS.getString(9)};
                modelo.addRow(Lista);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existen clientes en la base de datos", "Error en llenar tabla", JOptionPane.ERROR_MESSAGE);
        }
        return modelo;
    }

    public cls_cliente BuscarPorID(long IDCli) {
        String Cadena = "";
        int res = 0;
        Connection iniciar = Conn.establecer();
        cls_cliente objCli = new cls_cliente();
        try {
            String SQLBuscarID = "SELECT * FROM clientes WHERE ID_cliente =" + IDCli;
            PS = iniciar.prepareStatement(SQLBuscarID);
            RS = PS.executeQuery();
            if (RS.next()) {
                objCli.setID_cliente(RS.getLong(1));
                objCli.setTipo_Documento(RS.getString(2));
                objCli.setDocumento(RS.getString(3));
                objCli.setNombres(RS.getString(4));
                objCli.setApellidos(RS.getString(5));
                objCli.setEdad(RS.getInt(6));
                objCli.setTelefono(RS.getLong(7));
                objCli.setSexo(RS.getString(8));
                objCli.setDireccion(RS.getString(9));
            } else {
                JOptionPane.showMessageDialog(null, "No existen clientes en la base de datos con ese ID", "Error al buscar la tabla", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + e.getMessage(), "Error al buscar el cliente", JOptionPane.ERROR_MESSAGE);
        }
        return objCli;
    }

    public String Actualizar_cliente(cls_cliente Cliente, long IDActualizar) {
        String Cadena = "";
        int respuesta = 0;
        Connection iniciar = Conn.establecer();
        try {
            String SQLActualizar = "UPDATE clientes SET ID_cliente=?,Tipo_documento=?,Documento=?,Nombres=?,Apellidos=?,Edad=?,Telefono=?,Sexo=?,Direccion=? WHERE ID_cliente =?";
            PS = iniciar.prepareStatement(SQLActualizar);
            PS.setLong(1, Cliente.getID_cliente());
            PS.setString(2, Cliente.getTipo_Documento());
            PS.setString(3, Cliente.getDocumento());
            PS.setString(4, Cliente.getNombres());
            PS.setString(5, Cliente.getApellidos());
            PS.setInt(6, Cliente.getEdad());
            PS.setLong(7, Cliente.getTelefono());
            PS.setString(8, Cliente.getSexo());
            PS.setString(9, Cliente.getDireccion());
            PS.setLong(10, IDActualizar);
            respuesta = PS.executeUpdate();
            if (respuesta >= 1) {
                Cadena = "Actualizacion exitoso del cliente";
            } else {
                Cadena = "El cliente no fue Actualizado";
            }

        } catch (Exception e) {
            Cadena = "Error en la base de datos-" + e.getMessage();
        }

        return Cadena;
    }

}
