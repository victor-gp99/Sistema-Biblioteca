
package sistemabiblioteca;

import java.sql.Connection;
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
        localText = new javax.swing.JTextField();
        localLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registryButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido1Text)
                            .addComponent(apellido2Text)
                            .addComponent(nombreText)
                            .addComponent(addressText)
                            .addComponent(webText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(localText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registryButton)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registryButtonActionPerformed
      insertarAutorDB();
    }//GEN-LAST:event_registryButtonActionPerformed

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
             }
             localidad = localText.getText();  
             
             if (nombre.isEmpty() || apellido1.isEmpty() || apellido2.isEmpty() || direccion.isEmpty()|| url.isEmpty()|| telefono.isEmpty() || localidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios...", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
        try {
            Statement st;
            st = con.createStatement();
            st.execute("INSERT INTO autor (nombre, apellido1, apellido2, url , direccion, telefono, id_localidad) "
                    + "VALUES ('"+nombre+"','"+apellido1+"','"+apellido2+"','"+url+"','"+direccion+"','"+telefono+"','"+localidad+"')");
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
    private javax.swing.JLabel localLabel;
    private javax.swing.JTextField localText;
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
