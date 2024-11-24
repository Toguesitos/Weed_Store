package Backend;
import Objects.*; 
import Conexion.conexion_bd;
import Conexion.conexion_bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionProducto {
    
    conexion_bd Conn; 
    PreparedStatement PS; 
    ResultSet RS; 
        
    public GestionProducto() {
        Conn = new conexion_bd();
    }

    public String AgregarProd(clsProductos Producto){
        String Cadena = "";
        int res = 0;
        Connection iniciar = Conn.establecer();
        try {
            String SQLInsert = "INSERT INTO tblProductos(IDProducto,NombreProducto,DescripcionProducto,CantidadProducto,CategoriaProducto,PrecioCompra,PrecioVenta) VALUES(?,?,?,?,?,?,?)"; 
            PS = iniciar.prepareStatement(SQLInsert);
            PS.setLong(1, Producto.getIDProd());
            PS.setString(2, Producto.getNombreProd());
            PS.setString(3, Producto.getDescripProd());
            PS.setInt(4, Producto.getCantidadProd());
            PS.setString(5, Producto.getCategoriaProd());
            PS.setDouble(6,Producto.getPrecioCompra());
            PS.setDouble(7, Producto.getPrecioVenta());
            res = PS.executeUpdate();
            if(res>=1){
                Cadena = "Registro exitoso del producto";
            }else{
                Cadena = "¡El producto no fue registrado, intentelo de nuevo!";
            }
            iniciar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "¡Error! en la creación del producto" + e.getMessage());
        }         
        
        return Cadena;
    }
    
    public String EliminarProducto(long IDEliminarProducto){
        String Cadena = "";
        int res = 0;
        
        Connection iniciar = Conn.establecer();
        try {
            String SQLEliminar = "DELETE FROM tblProductos WHERE IDProducto=?";
            PS = iniciar.prepareStatement(SQLEliminar);
            PS.setLong(1, IDEliminarProducto);
            res = PS.executeUpdate(); 
            if(res>=1){
                Cadena = "Eliminación exitosa del producto";
            }else{
                Cadena = "¡El producto no fue Eliminado, intentelo de nuevo!";
            }
        } catch (Exception e) {
            Cadena = "¡Error! en la base de datos - " + e.getMessage();
        }
        return Cadena;
    }
    
    public DefaultTableModel ListarProductos(){
 
        DefaultTableModel modelo = new DefaultTableModel();
  
        modelo.addColumn("ID producto");
        modelo.addColumn("Nombre de producto");
        modelo.addColumn("Descripción de producto");
        modelo.addColumn("Cantidad del producto");
        modelo.addColumn("Categoria del producto");
        modelo.addColumn("Precio de compra");
        modelo.addColumn("Precio de venta");
        
        try {
            String Cadena = "";
            int res = 0;
        
            Connection iniciar = Conn.establecer();
            
            String SQLListar = "SELECT * FROM tblProductos";
            PS = iniciar.prepareStatement(SQLListar);
            RS = PS.executeQuery();
            
            clsProductos objProductos = new clsProductos();
            while(RS.next()){
                
                Object [] Lista = { RS.getLong(1),
                RS.getString(2),
                RS.getString(3),
                RS.getInt(4),
                RS.getString(5),
                RS.getDouble(6),
                RS.getDouble(7)};
                modelo.addRow(Lista);    
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No existen productos en la base de datos",
                        "Error en llenar tabla",JOptionPane.ERROR_MESSAGE);
        } 
        return modelo;
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
  
    public String ActualizarProducto(clsProductos Producto, long ID_producto){
        String Cadena = "";
        int res = 0;
        Connection iniciar = Conn.establecer();        
        try {
            String SQLInsert = "UPDATE tblProductos SET IDProducto=?,NombreProducto=?,DescripcionProducto=?,CantidadProducto=?,CategoriaProducto=?,PrecioCompra=?,PrecioVenta=? WHERE IDProducto=?"; 
            PS = iniciar.prepareStatement(SQLInsert);
            PS.setLong(1, Producto.getIDProd());
            PS.setString(2, Producto.getNombreProd());
            PS.setString(3, Producto.getDescripProd());
            PS.setInt(4, Producto.getCantidadProd());
            PS.setString(5, Producto.getCategoriaProd());
            PS.setDouble(6,Producto.getPrecioCompra());
            PS.setDouble(7, Producto.getPrecioVenta());
            PS.setLong(8,ID_producto );
            res = PS.executeUpdate();
            if(res>=1){
                Cadena = "Actualización exitosa del producto";
            }else{
                Cadena = "¡El producto no fue Actualizado, intentelo de nuevo!";
            }
            
        } catch (Exception e) {
            Cadena = "¡Error! En la base de datos - " + e.getMessage();
        }
        
        return Cadena;
    }
}
