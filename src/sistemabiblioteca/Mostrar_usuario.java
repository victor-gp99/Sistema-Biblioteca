/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;


import static sistemabiblioteca.AppSistemaBiblioteca.con;
import static sistemabiblioteca.LogIn.id;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author Luna
 */
public class Mostrar_usuario extends javax.swing.JFrame {
    
    
    public Mostrar_usuario() {
        initComponents();
        Show_info_usuario();
        setLocationRelativeTo(new LibreriaUI());
    }
    
    
    void Show_info_usuario(){
        
        
        /*DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido 1");
        modelo.addColumn("Apellido 2");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Usuario");
        modelo.addColumn("Tipo de Usuario");
        modelo.addColumn("Dirección");
        modelo.addColumn("E-mail");
        modelo.addColumn("Id Localidad");
        tbl_Usuario.setModel(modelo);*/
        
        //String sql = "SELECT * FROM cliente WHERE id = 2";
        
        String datos[] = new String [10];
        Statement st;
        
        
        try {
            st = con.createStatement();
            System.out.println(id);
            ResultSet rs = st.executeQuery("SELECT * FROM cliente WHERE id = "+id);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                
                jl_ID.setText("ID Usuario: " + datos[0]);
                jl_Nombre.setText("Nombre: " + datos[1]);
                jl_Ap.setText("Apellido 1: " + datos[2]);
                jl_Am.setText("Apellido 2: " + datos[3]);
                jl_tel.setText("Teléfono: " + datos[8]);
                jl_usuario.setText("Usuario: " + datos[5]);
                jl_Tusuario.setText("Tipo Usuario: " + datos[4]);
                jl_dire.setText("Dirección: " + datos[6]);
                jl_mail.setText("E-Mail: " + datos[7]);
               // jl_local.setText("ID Localidad: " + datos[9]);
                   
            }
            st.close();
            rs.close();
            
        } catch  (SQLException ex)  {
            Logger.getLogger(Mostrar_usuario.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        exit3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        minimize3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jl_ID = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Ap = new javax.swing.JLabel();
        jl_Am = new javax.swing.JLabel();
        jl_Tusuario = new javax.swing.JLabel();
        jl_tel = new javax.swing.JLabel();
        jl_mail = new javax.swing.JLabel();
        jl_dire = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(92, 151, 191));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        exit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit3.setForeground(new java.awt.Color(255, 255, 255));
        exit3.setText("X");
        exit3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit3MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mis datos");

        minimize3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize3.setForeground(new java.awt.Color(255, 255, 255));
        minimize3.setText("--");
        minimize3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize3MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(32, 54, 66));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jl_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_ID.setForeground(new java.awt.Color(236, 240, 241));
        jl_ID.setText("ID Usuario");

        jl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Nombre.setForeground(new java.awt.Color(236, 240, 241));
        jl_Nombre.setText("Nombre");

        jl_Ap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Ap.setForeground(new java.awt.Color(236, 240, 241));
        jl_Ap.setText("Apellido P");

        jl_Am.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Am.setForeground(new java.awt.Color(236, 240, 241));
        jl_Am.setText("Apellido M");

        jl_Tusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Tusuario.setForeground(new java.awt.Color(236, 240, 241));
        jl_Tusuario.setText("Tipo de Usuario");

        jl_tel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_tel.setForeground(new java.awt.Color(236, 240, 241));
        jl_tel.setText("Teléfono");

        jl_mail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_mail.setForeground(new java.awt.Color(236, 240, 241));
        jl_mail.setText("E-mail");

        jl_dire.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_dire.setForeground(new java.awt.Color(236, 240, 241));
        jl_dire.setText("Direccion");

        jl_usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_usuario.setForeground(new java.awt.Color(236, 240, 241));
        jl_usuario.setText("Usuario");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_ID)
                    .addComponent(jl_Nombre)
                    .addComponent(jl_Ap)
                    .addComponent(jl_Am))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_dire)
                    .addComponent(jl_usuario)
                    .addComponent(jl_mail)
                    .addComponent(jl_tel))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_Tusuario)
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_ID)
                    .addComponent(jl_usuario))
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jl_dire))
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Ap)
                    .addComponent(jl_mail))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Am)
                    .addComponent(jl_tel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jl_Tusuario)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(195, 195, 195)
                .addComponent(minimize3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit3)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(minimize3)
                    .addComponent(exit3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit3MouseClicked

        this.dispose();
    }//GEN-LAST:event_exit3MouseClicked

    private void minimize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize3MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize3MouseClicked

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
            java.util.logging.Logger.getLogger(Mostrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel exit3;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAgregar1;
    private javax.swing.JComboBox<String> jComboBoxAlmacen;
    private javax.swing.JComboBox<String> jComboBoxAlmacen1;
    private javax.swing.JComboBox<String> jComboBoxLibro;
    private javax.swing.JComboBox<String> jComboBoxLibro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner jSpinnerAgregar;
    private javax.swing.JSpinner jSpinnerAgregar1;
    private javax.swing.JLabel jl_Am;
    private javax.swing.JLabel jl_Ap;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Tusuario;
    private javax.swing.JLabel jl_dire;
    private javax.swing.JLabel jl_mail;
    private javax.swing.JLabel jl_tel;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JLabel minimize1;
    private javax.swing.JLabel minimize2;
    private javax.swing.JLabel minimize3;
    // End of variables declaration//GEN-END:variables

    private static class ConexionBD {

        public ConexionBD() {
        }

        private Connection conexion() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
