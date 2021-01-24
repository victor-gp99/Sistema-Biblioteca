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
                jl_local.setText("ID Localidad: " + datos[9]);
                   
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

        jl_ID = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Ap = new javax.swing.JLabel();
        jl_Am = new javax.swing.JLabel();
        jl_tel = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();
        jl_Tusuario = new javax.swing.JLabel();
        jl_dire = new javax.swing.JLabel();
        jl_mail = new javax.swing.JLabel();
        jl_local = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jl_ID.setText("ID Usuario");

        jl_Nombre.setText("Nombre");

        jl_Ap.setText("Apellido P");

        jl_Am.setText("Apellido M");

        jl_tel.setText("Teléfono");

        jl_usuario.setText("Usuario");

        jl_Tusuario.setText("Tipo de Usuario");

        jl_dire.setText("Direccion");

        jl_mail.setText("E-mail");

        jl_local.setText("ID Localidad");

        jLabel11.setText("MIS DATOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_ID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jl_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_Ap)
                            .addGap(119, 119, 119))
                        .addComponent(jl_Am, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jl_Tusuario))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_local)
                    .addComponent(jl_usuario)
                    .addComponent(jl_dire)
                    .addComponent(jl_mail)
                    .addComponent(jl_tel))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_ID)
                    .addComponent(jl_usuario))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jl_dire))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jl_Ap)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_mail)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Am)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jl_tel)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_local)
                    .addComponent(jl_Tusuario))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jl_Am;
    private javax.swing.JLabel jl_Ap;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Tusuario;
    private javax.swing.JLabel jl_dire;
    private javax.swing.JLabel jl_local;
    private javax.swing.JLabel jl_mail;
    private javax.swing.JLabel jl_tel;
    private javax.swing.JLabel jl_usuario;
    // End of variables declaration//GEN-END:variables

    private static class ConexionBD {

        public ConexionBD() {
        }

        private Connection conexion() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
