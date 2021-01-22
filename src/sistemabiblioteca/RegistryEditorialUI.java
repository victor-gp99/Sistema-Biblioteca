
package sistemabiblioteca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sistemabiblioteca.AppSistemaBiblioteca.con;
/**
 *
 * @author Victor
 */
public class RegistryEditorialUI extends javax.swing.JFrame {

    public RegistryEditorialUI() {
        
        initComponents();
        setTitle("Registra el autor");
        setLocationRelativeTo(null);
        setVisible(true);
        fillInComboBox();
    }
    
    public RegistryEditorialUI(Connection con) {
        
        initComponents();
        setTitle("Registra el autor");
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
     public void insertarEditorialDB(){//error llave foranea 
        String nombre, url , direccion, telefono, localidad;
             
             nombre= nameTextField.getText();
             direccion=direTextField.getText();
             telefono= phoneTextField.getText();
             
             if (phoneTextField.getText().length()>10){ 
                 phoneTextField.setText("");
                 JOptionPane.showMessageDialog(this, "Teclea solo 10 digitos en telefono!", "ERROR", JOptionPane.ERROR_MESSAGE);
                 return;
             }
              url =webTextField.getText();
              localidad = String.valueOf(jComboBoxLocalidad.getSelectedItem());
             
              if (nombre.isEmpty()|| url.isEmpty()||direccion.isEmpty()||telefono.isEmpty()|| localidad.isEmpty()) {
              JOptionPane.showMessageDialog(this, "Hay campos vacios...", "ERROR", JOptionPane.ERROR_MESSAGE);
              return;
               }
             
             
        try {
            Statement st;
            st = con.createStatement();
            st.execute("INSERT INTO editorial (nombre, direccion , url, telefono, id_localidad) "
                    + "VALUES ('"+nombre+"','"+direccion+"','"+url+"','"+telefono+"','"+localidad+"')");
            JOptionPane.showMessageDialog(rootPane, "Se registro una editorial exitosamente!");
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(RegistryAutorUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void fillInComboBox(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT l.nombre, e.nombre FROM localidad AS l INNER JOIN estado AS e ON l.id_estado = e.id");
            while (rs.next()){
                jComboBoxLocalidad.addItem(rs.getString("l.nombre")+"("+rs.getString("e.nombre")+")");
            }
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        direTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        webTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxLocalidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dirección:");

        jLabel3.setText("Teléfono:");

        jLabel4.setText("Web:");

        jLabel5.setText("Localidad:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxLocalidad.setToolTipText("Selecciona una localidad");
        jComboBoxLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLocalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(webTextField)
                            .addComponent(phoneTextField)
                            .addComponent(direTextField)
                            .addComponent(jComboBoxLocalidad, 0, 200, Short.MAX_VALUE)
                            .addComponent(nameTextField))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       insertarEditorialDB();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLocalidadActionPerformed

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
            java.util.logging.Logger.getLogger(RegistryEditorialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistryEditorialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistryEditorialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistryEditorialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistryEditorialUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxLocalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField webTextField;
    // End of variables declaration//GEN-END:variables
}
