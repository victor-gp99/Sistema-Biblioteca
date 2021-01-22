
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
 * @author Victor Eduardo Garcia Patiño
 */
public class RegistryAutorUI extends javax.swing.JFrame {

    public RegistryAutorUI() {     
        initComponents();
        setTitle("Registra el autor");
        setLocationRelativeTo(new LibreriaUI());
        setVisible(true);
        fillInComboBox();
    }
    
     public RegistryAutorUI(Connection con) {// Contructor con conexion a base de datos por si las moscas
        setTitle("Registra el autor");
        initComponents();
        setLocationRelativeTo(new LibreriaUI());
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        paternoLabel = new javax.swing.JLabel();
        maternoLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        webLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        Apellido1Text = new javax.swing.JTextField();
        apellido2Text = new javax.swing.JTextField();
        webText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        registryButton = new javax.swing.JButton();
        localLabel = new javax.swing.JLabel();
        jComboBoxLocalidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nombreLabel.setText("Nombre:");

        paternoLabel.setText("Apellido paterno:");

        maternoLabel.setText("Apellido materno:");

        phoneLabel.setText("Teléfono:");

        webLabel.setText("Página web:");

        addressLabel.setText("Dirección:");

        registryButton.setText("Registrar");
        registryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registryButtonActionPerformed(evt);
            }
        });

        localLabel.setText("No. Localidad:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(registryButton)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addGap(1, 1, 1))
                    .addComponent(paternoLabel)
                    .addComponent(maternoLabel)
                    .addComponent(webLabel)
                    .addComponent(phoneLabel)
                    .addComponent(localLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(phoneText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(webText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido2Text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Apellido1Text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxLocalidad, 0, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paternoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maternoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(webLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(registryButton)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registryButtonActionPerformed
      insertarAutorDB();
    }//GEN-LAST:event_registryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistryAutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistryAutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistryAutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistryAutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistryAutorUI().setVisible(true);
            }
        });
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
    
    public void insertarAutorDB(){//error llave foranea 
        String nombre, apellido1, apellido2, url , direccion, telefono, localidad;
            
             nombre= nombreText.getText();
             apellido1= Apellido1Text.getText();
             apellido2= apellido2Text.getText();
             direccion=addressText.getText();
             url = webText.getText();
             telefono =phoneText.getText();
             
             if (phoneText.getText().length()>10){ 
                 phoneText.setText("");
                 JOptionPane.showMessageDialog(this, "Teclea solo 10 digitos!", "ERROR", JOptionPane.ERROR_MESSAGE);
                 return;
             }
             localidad = String.valueOf(jComboBoxLocalidad.getSelectedItem());
             
             if (nombre.isEmpty() || apellido1.isEmpty() || apellido2.isEmpty() || direccion.isEmpty()|| url.isEmpty()|| telefono.isEmpty() || localidad.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hay campos vacios...", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
                }
        try {
            Statement st;
            st = con.createStatement();
            st.execute("INSERT INTO autor (nombre, apellido1, apellido2, url , direccion, telefono, id_localidad) "
                    + "VALUES ('"+nombre+"','"+apellido1+"','"+apellido2+"','"+url+"','"+direccion+"','"+telefono+"','"+(jComboBoxLocalidad.getSelectedIndex()+1)+"')");
            JOptionPane.showMessageDialog(rootPane, "Se registro un autor exitosamente!");
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(RegistryAutorUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido1Text;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField apellido2Text;
    private javax.swing.JComboBox<String> jComboBoxLocalidad;
    private javax.swing.JLabel localLabel;
    private javax.swing.JLabel maternoLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel paternoLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton registryButton;
    private javax.swing.JLabel webLabel;
    private javax.swing.JTextField webText;
    // End of variables declaration//GEN-END:variables
}
