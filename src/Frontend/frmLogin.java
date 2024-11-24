package Frontend;

import Backend.Gestion_Administrativos;
import Backend.Gestion_cliente;
import Conexion.conexion_bd;
import Objects.cls_administrativos;
import Objects.cls_cliente;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;

public class frmLogin extends javax.swing.JFrame {

    int xMouse, yMouse;
    conexion_bd Conn;
    PreparedStatement PS;
    ResultSet RS;

    String usuario;
    String passw;
    public frmLogin() {
        initComponents();
        Conn = new conexion_bd();
        Conn.establecer();
        this.setLocationRelativeTo(this);
        LimpiarCampos();
        usuario = "";
        passw = "";
        
    }

    private void SacarTexto (){
    cls_administrativos Admin = new cls_administrativos();
    String usuario =Admin.getUsuario1();
    String con=Admin.getContrasena();
    }    
    
    
    public void LimpiarCampos() {
        txtPassword.setText("+++++++++");
        txtUser.setText("Ingresa tu usuario");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        branchPanel = new javax.swing.JPanel();
        main_panel = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        UserSp = new javax.swing.JSeparator();
        passwordSp = new javax.swing.JSeparator();
        lblUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        title2 = new javax.swing.JLabel();
        PnLog = new javax.swing.JPanel();
        lblLog = new javax.swing.JLabel();
        PnNavbar = new javax.swing.JPanel();
        PsSubstrac = new javax.swing.JPanel();
        lblSubstract = new javax.swing.JLabel();
        PN_register = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();

        branchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 600));

        main_panel.setBackground(new java.awt.Color(0, 0, 0));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassword.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña");
        lblPassword.setToolTipText("");
        main_panel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        lblLogin.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("INICIAR SESIÓN");
        lblLogin.setToolTipText("");
        main_panel.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("Ingresa tu usuario");
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUserCaretUpdate(evt);
            }
        });
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        main_panel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 410, 50));

        UserSp.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.add(UserSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 400, 10));

        passwordSp.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.add(passwordSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 400, 10));

        lblUser.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario");
        lblUser.setToolTipText("");
        main_panel.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("+++++++++");
        txtPassword.setBorder(null);
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        main_panel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 410, 40));

        title2.setFont(new java.awt.Font("Roboto", 0, 38)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weed.png"))); // NOI18N
        title2.setText("Mota feliz");
        main_panel.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        PnLog.setBackground(new java.awt.Color(28, 82, 20));
        PnLog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLog.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLog.setText("ENTRAR");
        lblLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogMousePressed(evt);
            }
        });
        PnLog.add(lblLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        main_panel.add(PnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 120, 40));

        PnNavbar.setBackground(new java.awt.Color(0, 0, 0));
        PnNavbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PnNavbarMouseDragged(evt);
            }
        });
        PnNavbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PnNavbarMousePressed(evt);
            }
        });
        PnNavbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PsSubstrac.setBackground(new java.awt.Color(0, 0, 0));
        PsSubstrac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PsSubstrac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PsSubstracMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PsSubstracMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PsSubstracMouseExited(evt);
            }
        });
        PsSubstrac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubstract.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblSubstract.setForeground(new java.awt.Color(255, 255, 255));
        lblSubstract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubstract.setText("X");
        PsSubstrac.add(lblSubstract, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        PnNavbar.add(PsSubstrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        main_panel.add(PnNavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        PN_register.setBackground(new java.awt.Color(28, 82, 20));
        PN_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PN_registerMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PN_registerMousePressed(evt);
            }
        });
        PN_register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("REGISTRAR");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegisterMousePressed(evt);
            }
        });
        PN_register.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        main_panel.add(PN_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PnNavbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnNavbarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PnNavbarMousePressed

    private void PnNavbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnNavbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_PnNavbarMouseDragged

    private void PsSubstracMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PsSubstracMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PsSubstracMouseClicked

    private void PsSubstracMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PsSubstracMouseEntered
        PsSubstrac.setBackground(Color.red);
    }//GEN-LAST:event_PsSubstracMouseEntered

    private void PsSubstracMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PsSubstracMouseExited
        PsSubstrac.setBackground(Color.black);
    }//GEN-LAST:event_PsSubstracMouseExited

    private void lblLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseEntered
        PnLog.setBackground(new Color(67, 178, 50));
    }//GEN-LAST:event_lblLogMouseEntered

    private void lblLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseExited
        PnLog.setBackground(new Color(28, 82, 20));
    }//GEN-LAST:event_lblLogMouseExited

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals("Ingresa tu usuario")) {
            txtUser.setText("");
        }
        if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
            txtPassword.setText("+++++++++");
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if (String.valueOf(txtPassword.getPassword()).equals("+++++++++")) {
            txtPassword.setText("");
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingresa tu usuario");
        }

    }//GEN-LAST:event_txtPasswordMousePressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void lblLogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMousePressed

    }//GEN-LAST:event_lblLogMousePressed

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        PN_register.setBackground(new Color(67, 178, 50));
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        PN_register.setBackground(new Color(28, 82, 20));
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMousePressed
        frm_register frm = new frm_register();
        frm.setVisible(true);
    }//GEN-LAST:event_lblRegisterMousePressed

    private void PN_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_registerMouseEntered

    }//GEN-LAST:event_PN_registerMouseEntered

    private void PN_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_registerMouseClicked

    }//GEN-LAST:event_PN_registerMouseClicked

    private void PN_registerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_registerMousePressed

    }//GEN-LAST:event_PN_registerMousePressed

     
    private void lblLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseClicked

         usuario = txtUser.getText();
         passw = txtPassword.getText();
         
        Gestion_Administrativos GAdmin = new Gestion_Administrativos();
        cls_administrativos objAdmin = new cls_administrativos();
        SacarTexto();
        
        if (!usuario.equalsIgnoreCase("Ingresa tu usuario") && !passw.equalsIgnoreCase("+++++++++")) {
            cls_administrativos tipo_nivel = GAdmin.GuardarDatos(usuario, passw);
            
            if (tipo_nivel.getTipo_usuario().equals("Administrador")) {
                
                Dashboard dhs = new Dashboard();
                dhs.setVisible(true);
                System.out.println("Entro como admin");
            } else if (tipo_nivel.getTipo_usuario().equals("Trabajador")) {
               Dashboard dhs = new Dashboard();
                dhs.setVisible(true);
            }else{
            JOptionPane.showMessageDialog(branchPanel, "Datos ingresados incorrectos");
            }
        }else{
        
        JOptionPane.showMessageDialog(null, "Por favor ingrese el usuario y contraseña");
        }

    }//GEN-LAST:event_lblLogMouseClicked

    private void txtUserCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUserCaretUpdate
       cls_administrativos admin = new cls_administrativos();
       admin.setUsuario1(txtUser.getText());
    }//GEN-LAST:event_txtUserCaretUpdate

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        cls_administrativos admin = new cls_administrativos();
       admin.setContrasena(txtPassword.getText());
    }//GEN-LAST:event_txtPasswordCaretUpdate

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PN_register;
    private javax.swing.JPanel PnLog;
    private javax.swing.JPanel PnNavbar;
    private javax.swing.JPanel PsSubstrac;
    private javax.swing.JSeparator UserSp;
    private javax.swing.JPanel branchPanel;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblSubstract;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel main_panel;
    private javax.swing.JSeparator passwordSp;
    private javax.swing.JLabel title2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}