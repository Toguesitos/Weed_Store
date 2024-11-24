/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Backend.GestionProducto;
import Backend.Gestion_facturacion;
import Conexion.conexion_bd;
import Objects.clsProductos;
import Objects.cls_cliente;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PN_Facturacion extends javax.swing.JPanel {
    
    conexion_bd Conn;
    PreparedStatement PS;
    ResultSet RS;
    
    int CantidadSP;
    double PrecioU,Subtotal,Total,IVA;
    DefaultTableModel modelo;
    
    public PN_Facturacion() {
        initComponents();
        Conn = new conexion_bd();
        Conn.establecer();
        ErrorCli();
        ErrorPro();
        Subtotal = 0;
        Total = 0;
        IVA =0;
        PrecioU = 0;
        CantidadSP = 0;
        modelo = new DefaultTableModel();
        modeloTabla();
        
    }
    public void CalcularTotal(){
    int Desc = cbx_descuentos.getSelectedIndex();
    double descuento;   
    
    if (Desc==1) {
            descuento =Subtotal*0.10;
        }else if (Desc==2) {
            descuento=Subtotal*0.20;
        }else if (Desc==3) {
            descuento=Subtotal*0.30;
        }else{
        descuento=0;
        }
    
        Total = (Subtotal+IVA)-descuento;
        lblTotal_num.setText(String.valueOf(Total));
    }
    public void CalcularIVA(){
    IVA+=Subtotal*0.19;
    lbl_iva_num.setText(String.valueOf(IVA));
    }
    public void calcularSubTotal(){
    Subtotal= Subtotal + (Integer.parseInt(txt_cantidad.getText()) * PrecioU);
    lbl_subtotal_num.setText(String.valueOf(Subtotal));
    }
    public void modeloTabla(){
    modelo.addColumn("ID");
        modelo.addColumn("Nombre del Producto");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio unitario");
    }
    public void ListarProductoTabla() {
         Object[] datos = {txt_id_pro.getText(),txt_nombre_pro.getText(),CantidadSP,PrecioU};
        modelo.addRow(datos);
        jTable1.setModel(modelo);
        
    } 
    public void ErrorCli() {
        lbl_error_IDcliente.setVisible(false);
    }
    public void ErrorPro() {
        lbl_error_IDPro.setVisible(false);

    }
    public void LimpiarCampos_cli() {
        txt_nombres_idCli.setText("");
        txt_id.setText("");
        txt_Num_doc.setText("");
    }
    public void LimpiarCampos_pro(){
    txt_cantidad.setText("");
    txt_id_pro.setText("");
    txt_nombre_pro.setText("");
    
    }
    
    
    

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        PN_data5 = new javax.swing.JPanel();
        lbl_efectivo = new javax.swing.JLabel();
        lbl_cambio = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblTotal_num = new javax.swing.JLabel();
        txt_cambio = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        btn_comprar = new javax.swing.JButton();
        PN_data = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        lbl_error_IDcliente = new javax.swing.JLabel();
        lbl_numDoc = new javax.swing.JLabel();
        txt_Num_doc = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombres_idCli = new javax.swing.JTextField();
        btn_mostrarCli = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        PN_data2 = new javax.swing.JPanel();
        lbl_id_pro = new javax.swing.JLabel();
        txt_id_pro = new javax.swing.JTextField();
        lbl_error_IDPro = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        lbl_nombre_pro = new javax.swing.JLabel();
        txt_nombre_pro = new javax.swing.JTextField();
        btn_mostrarPro = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        PN_data1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PN_data3 = new javax.swing.JPanel();
        lbl_descuento = new javax.swing.JLabel();
        lbl_iva = new javax.swing.JLabel();
        lbl_iva_num = new javax.swing.JLabel();
        lbl_subtotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbx_descuentos = new javax.swing.JComboBox<>();
        lbl_subtotal_num = new javax.swing.JLabel();

        main.setBackground(new java.awt.Color(0, 0, 0));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PN_data5.setBackground(new java.awt.Color(0, 0, 0));
        PN_data5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_efectivo.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_efectivo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_efectivo.setText("Efectivo:");
        lbl_efectivo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data5.add(lbl_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        lbl_cambio.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lbl_cambio.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cambio.setText("Cambio:");
        lbl_cambio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data5.add(lbl_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        lbl_total.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total.setText("Total");
        lbl_total.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data5.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        PN_data5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 220, 10));

        lblTotal_num.setText("jLabel1");
        PN_data5.add(lblTotal_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));
        PN_data5.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, 30));
        PN_data5.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 30));

        btn_comprar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_comprar.setText("Comprar");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });
        PN_data5.add(btn_comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 90));

        main.add(PN_data5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 370, 100));

        PN_data.setBackground(new java.awt.Color(0, 0, 0));
        PN_data.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        PN_data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_id.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("ID:");
        lbl_id.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbl_error_IDcliente.setBackground(new java.awt.Color(153, 0, 0));
        lbl_error_IDcliente.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        lbl_error_IDcliente.setForeground(new java.awt.Color(187, 2, 2));
        lbl_error_IDcliente.setText("*Error,debe ingresar el ID del cliente");
        PN_data.add(lbl_error_IDcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 10));

        lbl_numDoc.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_numDoc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_numDoc.setText("Doc:");
        lbl_numDoc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data.add(lbl_numDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        txt_Num_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Num_docActionPerformed(evt);
            }
        });
        PN_data.add(txt_Num_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 30));

        lbl_nombres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setText("Nombres:");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));
        PN_data.add(txt_nombres_idCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 130, 30));

        btn_mostrarCli.setBackground(new java.awt.Color(0, 0, 0));
        btn_mostrarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clients/hide (1).png"))); // NOI18N
        btn_mostrarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mostrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarCliActionPerformed(evt);
            }
        });
        PN_data.add(btn_mostrarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, 30));
        PN_data.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 270, 30));

        main.add(PN_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 100));

        PN_data2.setBackground(new java.awt.Color(0, 0, 0));
        PN_data2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        PN_data2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_id_pro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_id_pro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id_pro.setText("ID:");
        lbl_id_pro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data2.add(lbl_id_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        PN_data2.add(txt_id_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 220, 30));

        lbl_error_IDPro.setBackground(new java.awt.Color(153, 0, 0));
        lbl_error_IDPro.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        lbl_error_IDPro.setForeground(new java.awt.Color(187, 2, 2));
        lbl_error_IDPro.setText("*Error,debe ingresar el ID del cliente");
        PN_data2.add(lbl_error_IDPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 10));

        lbl_cantidad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cantidad.setText("Cantidad:");
        lbl_cantidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data2.add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        PN_data2.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 50, 30));

        lbl_nombre_pro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_nombre_pro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre_pro.setText("Nombres:");
        lbl_nombre_pro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data2.add(lbl_nombre_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));
        PN_data2.add(txt_nombre_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 80, 30));

        btn_mostrarPro.setBackground(new java.awt.Color(0, 0, 0));
        btn_mostrarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clients/hide (1).png"))); // NOI18N
        btn_mostrarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mostrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarProActionPerformed(evt);
            }
        });
        PN_data2.add(btn_mostrarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 30, 30));

        btn_agregar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btn_agregar.setText("+");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        PN_data2.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 60, 70));

        main.add(PN_data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 380, 100));

        PN_data1.setBackground(new java.awt.Color(0, 0, 0));
        PN_data1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        PN_data1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PN_data1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 170));

        main.add(PN_data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 750, 200));

        PN_data3.setBackground(new java.awt.Color(0, 0, 0));
        PN_data3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_descuento.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_descuento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descuento.setText("Descuento:");
        lbl_descuento.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data3.add(lbl_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        lbl_iva.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lbl_iva.setForeground(new java.awt.Color(255, 255, 255));
        lbl_iva.setText("IVA:");
        lbl_iva.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data3.add(lbl_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbl_iva_num.setText("jLabel1");
        PN_data3.add(lbl_iva_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        lbl_subtotal.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_subtotal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subtotal.setText("Subtotal: $");
        lbl_subtotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PN_data3.add(lbl_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        PN_data3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, 10));

        cbx_descuentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "10%", "20%", "30%" }));
        PN_data3.add(cbx_descuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 220, -1));

        lbl_subtotal_num.setText("jLabel1");
        PN_data3.add(lbl_subtotal_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        main.add(PN_data3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 340, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mostrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarCliActionPerformed
        
        String IDCliente = txt_id.getText();

        Gestion_facturacion GCliente = new Gestion_facturacion();
        cls_cliente ObjCliente = new cls_cliente();
        ErrorCli();
        String Id = txt_id.getText();
        String Num_doc = txt_Num_doc.getText();
        String Nombre = txt_nombres_idCli.getText();

        if (!Id.equalsIgnoreCase("")) {

            long idcliente = Long.parseLong(IDCliente);
            ObjCliente = GCliente.BuscarIDCliente(idcliente);

            txt_id.setText(String.valueOf(ObjCliente.getID_cliente()));
            txt_Num_doc.setText(ObjCliente.getDocumento());
            txt_nombres_idCli.setText(ObjCliente.getNombres());

            JOptionPane.showMessageDialog(null, "Cliente encontrado exitosamente");
        } else {
            lbl_id.setVisible(true);
        }
        
        
        
        
    }//GEN-LAST:event_btn_mostrarCliActionPerformed

    private void txt_Num_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Num_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Num_docActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void btn_mostrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarProActionPerformed
         String IDpro = txt_id_pro.getText();
        GestionProducto GProducto = new GestionProducto();
        clsProductos objProducto = new clsProductos();

        if (!IDpro.equalsIgnoreCase("")) {
            int idPro = Integer.parseInt(IDpro);
            CantidadSP = 0;
            PrecioU = 0;
            
            objProducto = GProducto.BuscarPorID(idPro);
            CantidadSP = objProducto.getCantidadProd();
            PrecioU = objProducto.getPrecioVenta();
                    
            txt_id_pro.setText(String.valueOf(objProducto.getIDProd()));
            txt_nombre_pro.setText(objProducto.getNombreProd());
            
            JOptionPane.showMessageDialog(null, "Cliente encontrado exitosamente");

        } else {
            lbl_id_pro.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_btn_mostrarProActionPerformed

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        String efectivoT=txt_efectivo.getText();
        if (!efectivoT.equalsIgnoreCase("")) {
            double efectivo=Double.parseDouble(efectivoT);
            if (efectivo>=Total) {
                double Cambio = efectivo-Total;
                
                txt_cambio.setText(String.valueOf(Cambio));
                //ACCIONES
                
                
                JOptionPane.showMessageDialog(this, "compra hecha");
            }else{
            JOptionPane.showMessageDialog(null, "debe ingresar una suma mayor");
            }
        }else{
        JOptionPane.showMessageDialog(null, "Debe ingresar el valor en efectivo");
        }
        
        
        
    }//GEN-LAST:event_btn_comprarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
       
         String Cant = txt_cantidad.getText();
        if (!Cant.equalsIgnoreCase("")) {
            int cantidad = Integer.parseInt(Cant);
            if (cantidad >= 1) {
                if (cantidad > CantidadSP) {
                    JOptionPane.showConfirmDialog(null, "la cantidad supera el stock del inventario");
                } else {
                    ListarProductoTabla();
                    calcularSubTotal();
                    CalcularIVA();
                    CalcularTotal();
                    
                    
                    LimpiarCampos_pro();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad mayor o igual a 1");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa la cantidad a llevar");
        }
        
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PN_data;
    private javax.swing.JPanel PN_data1;
    private javax.swing.JPanel PN_data2;
    private javax.swing.JPanel PN_data3;
    private javax.swing.JPanel PN_data5;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_comprar;
    private javax.swing.JButton btn_mostrarCli;
    private javax.swing.JButton btn_mostrarPro;
    private javax.swing.JComboBox<String> cbx_descuentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTotal_num;
    private javax.swing.JLabel lbl_cambio;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_descuento;
    private javax.swing.JLabel lbl_efectivo;
    private javax.swing.JLabel lbl_error_IDPro;
    private javax.swing.JLabel lbl_error_IDcliente;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_id_pro;
    private javax.swing.JLabel lbl_iva;
    private javax.swing.JLabel lbl_iva_num;
    private javax.swing.JLabel lbl_nombre_pro;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_numDoc;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_subtotal_num;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel main;
    private javax.swing.JTextField txt_Num_doc;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_id_pro;
    private javax.swing.JTextField txt_nombre_pro;
    private javax.swing.JTextField txt_nombres_idCli;
    // End of variables declaration//GEN-END:variables
}
