/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Conexion.conexion_bd;
import Frontend.Dashboard;
import Frontend.frmLogin;
import Objects.clsProductos;
import Objects.cls_administrativos;
import Objects.cls_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author juanse
 */
public class Gestion_Administrativos {

    conexion_bd Conn;
    PreparedStatement PS;
    ResultSet RS;

    public Gestion_Administrativos() {
        
        Conn = new conexion_bd();
    }
    String Cadena = "";
    int respuesta = 0;

    public String Crear_Cliente(cls_administrativos Administrativo) {

        Connection iniciar = Conn.establecer();
        try {
            String SQLInsert = "INSERT INTO tblAdministrativos(nombres,apellidos,usuario,Tipo_usuario,contrasena) VALUES(?,?,?,?,?)";
            PS = iniciar.prepareStatement(SQLInsert);
            PS.setString(1, (Administrativo.getNombres()));
            PS.setString(2, Administrativo.getApellidos());
            PS.setString(3, Administrativo.getUsuario());
            PS.setString(4, Administrativo.getTipo_usuario());
            PS.setString(5, Administrativo.getContraseña());
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

    public cls_administrativos GuardarDatos(String usuario, String contrasena) {
        cls_administrativos objAdmin = new cls_administrativos();
        Connection iniciar = Conn.establecer();
        try {
            String SQLCon = "SELECT Tipo_usuario, usuario, contrasena FROM tblAdministrativos WHERE usuario=? AND contrasena=?";
            PreparedStatement PS = iniciar.prepareStatement(SQLCon);
            PS.setString(1, usuario);
            PS.setString(2, contrasena);
            ResultSet RS = PS.executeQuery();
            if (RS.next()) {
                objAdmin.setTipo_usuario(RS.getString("Tipo_usuario"));
                objAdmin.setUsuario(RS.getString("usuario")); // Fetch the 'usuario' column
                objAdmin.setContraseña(RS.getString("contrasena")); // Fetch the 'contrasena' column
            } else {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage(), "Error al buscar el cliente", JOptionPane.ERROR_MESSAGE);
        }
        return objAdmin;
    }
    public clsProductos BuscarPorID(long IDProd){
        String Cadena = "";
        int res = 0;
        
        Connection iniciar = Conn.establecer();
        clsProductos objProductos = new clsProductos();
        try {
            String SQLBuscarID = "SELECT * FROM tblProductos WHERE IDProducto= "+IDProd;
            PS = iniciar.prepareStatement(SQLBuscarID);
            RS = PS.executeQuery();
            
            if(RS.next()){
                objProductos.setIDProd(RS.getLong(1));
                objProductos.setNombreProd(RS.getString(2));
                objProductos.setDescripProd(RS.getString(3));
                objProductos.setCantidadProd(RS.getInt(4));
                objProductos.setCategoriaProd(RS.getString(5));
                objProductos.setPrecioCompra(RS.getDouble(6));
                objProductos.setPrecioVenta(RS.getDouble(7));
            }else{
                JOptionPane.showMessageDialog(null, "No existen productos en la base con ese ID",
                        "Error al buscar el producto",JOptionPane.ERROR_MESSAGE);
                return null;
            } 
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la base de datos"+e.getMessage(),
                        "Error ",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return objProductos;
    }
  
  
}
