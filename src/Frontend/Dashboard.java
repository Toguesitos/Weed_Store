/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import views.PN_home;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.sun.source.util.Plugin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import views.PN_Facturacion;
import views.PN_clientes;
import views.PN_productos;

/**
 *
 * @author juanse
 */
public class Dashboard extends javax.swing.JFrame {

    int xMouse, yMouse;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(this);
        Date();
        InitContent();
    }

    public void Date() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        dateText.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
    }

    public void InitContent() {
        showPanel(new PN_home());

    }

    private void showPanel(JPanel p){
        
        p.setSize(790, 430);
        p.setLocation(0, 0);
        
        PN_Content.removeAll();
        PN_Content.add(p, BorderLayout.CENTER);
        PN_Content.revalidate();
        PN_Content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PN_main = new javax.swing.JPanel();
        Pn_navbar = new javax.swing.JPanel();
        Pn_exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        Pn_aside = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        PN_billing = new javax.swing.JPanel();
        icon_billing = new javax.swing.JLabel();
        lbl_billing = new javax.swing.JLabel();
        PN_home = new javax.swing.JPanel();
        icon_home = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        PN_products = new javax.swing.JPanel();
        icon_products = new javax.swing.JLabel();
        lbl_products = new javax.swing.JLabel();
        PN_user = new javax.swing.JPanel();
        icon_user = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        PN_mainInf = new javax.swing.JPanel();
        lbl_welcome = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        PN_Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PN_main.setBackground(new java.awt.Color(0, 0, 0));
        PN_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pn_navbar.setBackground(new java.awt.Color(0, 0, 0));
        Pn_navbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pn_navbarMouseDragged(evt);
            }
        });
        Pn_navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pn_navbarMousePressed(evt);
            }
        });
        Pn_navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pn_exit.setBackground(new java.awt.Color(0, 0, 0));
        Pn_exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_exit.setBackground(new java.awt.Color(0, 0, 0));
        lbl_exit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });
        Pn_exit.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Pn_navbar.add(Pn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 50));

        PN_main.add(Pn_navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 50));

        Pn_aside.setBackground(new java.awt.Color(28, 92, 20));
        Pn_aside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Pn_aside.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 20));

        PN_billing.setBackground(new java.awt.Color(28, 92, 20));
        PN_billing.setToolTipText("");
        PN_billing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_billing.setMinimumSize(new java.awt.Dimension(141, 50));
        PN_billing.setPreferredSize(new java.awt.Dimension(270, 50));
        PN_billing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PN_billingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PN_billingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PN_billingMousePressed(evt);
            }
        });
        PN_billing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Navbar/bill (1).png"))); // NOI18N
        PN_billing.add(icon_billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        lbl_billing.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        lbl_billing.setForeground(new java.awt.Color(255, 255, 255));
        lbl_billing.setText("FACTURACIÓN");
        PN_billing.add(lbl_billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Pn_aside.add(PN_billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 50));

        PN_home.setBackground(new java.awt.Color(28, 92, 20));
        PN_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_home.setMinimumSize(new java.awt.Dimension(142, 50));
        PN_home.setPreferredSize(new java.awt.Dimension(270, 50));
        PN_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PN_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PN_homeMouseExited(evt);
            }
        });
        PN_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Navbar/home (3).png"))); // NOI18N
        PN_home.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_home.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        lbl_home.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home.setText("INICIO");
        PN_home.add(lbl_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Pn_aside.add(PN_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, -1));

        PN_products.setBackground(new java.awt.Color(28, 92, 20));
        PN_products.setToolTipText("");
        PN_products.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_products.setMinimumSize(new java.awt.Dimension(141, 50));
        PN_products.setPreferredSize(new java.awt.Dimension(270, 50));
        PN_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PN_productsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PN_productsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PN_productsMousePressed(evt);
            }
        });
        PN_products.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Navbar/order (3).png"))); // NOI18N
        PN_products.add(icon_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        lbl_products.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        lbl_products.setForeground(new java.awt.Color(255, 255, 255));
        lbl_products.setText("PRODUCTOS");
        PN_products.add(lbl_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Pn_aside.add(PN_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 50));

        PN_user.setBackground(new java.awt.Color(28, 92, 20));
        PN_user.setToolTipText("");
        PN_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_user.setMinimumSize(new java.awt.Dimension(141, 50));
        PN_user.setPreferredSize(new java.awt.Dimension(270, 50));
        PN_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PN_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PN_userMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PN_userMousePressed(evt);
            }
        });
        PN_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Navbar/customer (1).png"))); // NOI18N
        PN_user.add(icon_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_user.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("CLIENTES");
        PN_user.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Pn_aside.add(PN_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 50));

        title2.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weed.png"))); // NOI18N
        title2.setText("Mota feliz");
        Pn_aside.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        PN_main.add(Pn_aside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 550));

        PN_mainInf.setBackground(new java.awt.Color(67, 178, 50));
        PN_mainInf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_welcome.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(0, 0, 0));
        lbl_welcome.setText("¡BIENVENIDO!");
        PN_mainInf.add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        dateText.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        dateText.setForeground(new java.awt.Color(0, 0, 0));
        dateText.setText("Hoy es {day} de {month} de {year}");
        PN_mainInf.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        PN_main.add(PN_mainInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 790, 120));

        PN_Content.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PN_ContentLayout = new javax.swing.GroupLayout(PN_Content);
        PN_Content.setLayout(PN_ContentLayout);
        PN_ContentLayout.setHorizontalGroup(
            PN_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        PN_ContentLayout.setVerticalGroup(
            PN_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        PN_main.add(PN_Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 790, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        Pn_exit.setBackground(Color.red);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        Pn_exit.setBackground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void Pn_navbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pn_navbarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pn_navbarMousePressed

    private void Pn_navbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pn_navbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pn_navbarMouseDragged

    private void PN_billingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_billingMouseEntered
        PN_billing.setBackground(new Color(52, 148, 36));
        lbl_billing.setForeground(Color.black);
    }//GEN-LAST:event_PN_billingMouseEntered

    private void PN_billingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_billingMouseExited
        PN_billing.setBackground(new Color(28, 92, 20));
        lbl_billing.setForeground(Color.white);
    }//GEN-LAST:event_PN_billingMouseExited

    private void PN_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_homeMouseEntered
        PN_home.setBackground(new Color(52, 148, 36));
        lbl_home.setForeground(Color.BLACK);

    }//GEN-LAST:event_PN_homeMouseEntered

    private void PN_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_homeMouseExited
        PN_home.setBackground(new Color(28, 92, 20));
        lbl_home.setForeground(Color.WHITE);

    }//GEN-LAST:event_PN_homeMouseExited

    private void PN_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_userMouseEntered
        PN_user.setBackground(new Color(52, 148, 36));
        lbl_user.setForeground(Color.black);

    }//GEN-LAST:event_PN_userMouseEntered

    private void PN_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_userMouseExited
        PN_user.setBackground(new Color(28, 92, 20));
        lbl_user.setForeground(Color.white);

    }//GEN-LAST:event_PN_userMouseExited

    private void PN_productsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_productsMouseEntered
        PN_products.setBackground(new Color(52, 148, 36));
        lbl_products.setForeground(Color.black);

     }//GEN-LAST:event_PN_productsMouseEntered

    private void PN_productsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_productsMouseExited
        PN_products.setBackground(new Color(28, 92, 20));
        lbl_products.setForeground(Color.white);

    }//GEN-LAST:event_PN_productsMouseExited

    private void PN_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_homeMouseClicked
       showPanel(new PN_home());
    }//GEN-LAST:event_PN_homeMouseClicked

    private void PN_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_userMousePressed
        showPanel(new PN_clientes());
    }//GEN-LAST:event_PN_userMousePressed

    private void PN_productsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_productsMousePressed
        showPanel(new PN_productos());
    }//GEN-LAST:event_PN_productsMousePressed

    private void PN_billingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_billingMousePressed
        showPanel(new PN_Facturacion());
    }//GEN-LAST:event_PN_billingMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
        FlatMaterialDarkerIJTheme.setup();
        UIManager.put( "Button.arc", 999 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PN_Content;
    private javax.swing.JPanel PN_billing;
    private javax.swing.JPanel PN_home;
    private javax.swing.JPanel PN_main;
    private javax.swing.JPanel PN_mainInf;
    private javax.swing.JPanel PN_products;
    private javax.swing.JPanel PN_user;
    private javax.swing.JPanel Pn_aside;
    private javax.swing.JPanel Pn_exit;
    private javax.swing.JPanel Pn_navbar;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel icon_billing;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_products;
    private javax.swing.JLabel icon_user;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_billing;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_products;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
