
package Backend;

import Conexion.conexion_bd;
import Objects.clsProductos;
import Objects.cls_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Gestion_facturacion {
    
    conexion_bd Conn;
    PreparedStatement PS;
    ResultSet RS;

    public Gestion_facturacion() {
        Conn = new conexion_bd();
    }
    
    
    public cls_cliente BuscarIDCliente (long IDCliente){
        
        Connection iniciar = Conn.establecer();
        cls_cliente objClie = new cls_cliente();
        
        try {
            String SQLBuscarID = "SELECT ID_cliente,Documento,Nombres FROM clientes WHERE ID_cliente="+IDCliente;
            PS = iniciar.prepareStatement(SQLBuscarID);
            RS = PS.executeQuery();
            if (RS.next()) {
                objClie.setID_cliente(RS.getLong(1));
                objClie.setDocumento(RS.getString(2));
                objClie.setNombres(RS.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No existen clientes en la base de datos con ese ID", "Error al buscar la tabla", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + e.getMessage(), "Error al buscar el cliente", JOptionPane.ERROR_MESSAGE);
        }
        return objClie;
    }
        
    public clsProductos BuscarIdProducto(int IDProd){
        String Cadena = "";
        int res = 0;
        
        Connection iniciar = Conn.establecer();
        clsProductos objProductos = new clsProductos();
        try {
            String SQLBuscarID = "SELECT IDProducto,NombreProducto,CantidadProducto FROM tblProductos WHERE IDProducto="+IDProd;
            PS = iniciar.prepareStatement(SQLBuscarID);
            RS = PS.executeQuery();
            
            if(RS.next()){
                objProductos.setIDProd(RS.getInt(1));
                objProductos.setNombreProd(RS.getString(2));
                objProductos.setCantidadProd(Integer.parseInt(RS.getString(3)));
            }else{
                JOptionPane.showMessageDialog(null, "No existen productos en la base con ese ID",
                        "Error al buscar el producto",JOptionPane.ERROR_MESSAGE);
                return null;
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la base de datos"+e.getMessage(),
                        "Error en BD",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return objProductos;
    }
    
    
}

