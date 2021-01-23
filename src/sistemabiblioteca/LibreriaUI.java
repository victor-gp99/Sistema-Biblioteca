package sistemabiblioteca;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joefi
 */
public class LibreriaUI extends javax.swing.JFrame {
    Connection con;
    String nombreCLiente;
    /**
     * Creates new form LibreriaUI
     * @param con
     */
    public LibreriaUI(Connection con,String nombreCliente) {
        initComponents();
        int W = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int H = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int x = W-this.getWidth()/2;
        int y = H-this.getHeight()/2;
        setLocation(x,y);
        this.con = con;
        this.nombreCLiente = nombreCliente;
        jLabelCliente.setText(nombreCliente);
    }
    
    public LibreriaUI(){
        //Este constructor se usa para cuando se abre el sistema sin conectarse a la BD. 
        initComponents();
        int W = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int H = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int x = W-this.getWidth()/2;
        int y = H-this.getHeight()/2;
        setLocation(x,y);
        //Este constructor se usa para cuando se abre el sistema sin conectarse a la BD. 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jButtonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(botonX());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Interfaz Principal");

        jLabelCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCliente.setText("Nombre del cliente");
        jLabelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonAdmin.setText("ADMIN");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAdmin)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(jButtonAdmin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        new AdminTools().setVisible(true);
    }//GEN-LAST:event_jButtonAdminActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LibreriaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibreriaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibreriaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibreriaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibreriaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCliente;
    // End of variables declaration//GEN-END:variables
   
    public int botonX(){
        try {
            con.close();
        } catch (java.lang.NullPointerException | SQLException ex) {
            //System.out.println("No hay conexión con la base de datos");
        }
        return 3;
    }
}
