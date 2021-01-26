
package sistemabiblioteca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
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

        jPanel2 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Cancelar = new javax.swing.JButton();
        registryButton = new javax.swing.JButton();
        apellido2Text = new javax.swing.JTextField();
        webText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        paternoLabel = new javax.swing.JLabel();
        maternoLabel = new javax.swing.JLabel();
        localLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        jComboBoxLocalidad = new javax.swing.JComboBox<>();
        webLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        Apellido1Text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(92, 151, 191));

        exit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("X");
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrar autor");

        minimize1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize1.setForeground(new java.awt.Color(255, 255, 255));
        minimize1.setText("--");
        minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(34, 49, 63));

        Cancelar.setBackground(new java.awt.Color(235, 151, 78));
        Cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(236, 240, 241));
        Cancelar.setText("Cancelar");
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        registryButton.setBackground(new java.awt.Color(137, 196, 244));
        registryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registryButton.setForeground(new java.awt.Color(236, 240, 241));
        registryButton.setText("Registrar");
        registryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registryButtonActionPerformed(evt);
            }
        });

        apellido2Text.setBackground(new java.awt.Color(108, 122, 137));
        apellido2Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido2Text.setForeground(new java.awt.Color(236, 240, 241));

        webText.setBackground(new java.awt.Color(108, 122, 137));
        webText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        webText.setForeground(new java.awt.Color(236, 240, 241));

        addressText.setBackground(new java.awt.Color(108, 122, 137));
        addressText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressText.setForeground(new java.awt.Color(236, 240, 241));

        nombreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(236, 240, 241));
        nombreLabel.setText("Nombre");

        phoneText.setBackground(new java.awt.Color(108, 122, 137));
        phoneText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneText.setForeground(new java.awt.Color(236, 240, 241));

        paternoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paternoLabel.setForeground(new java.awt.Color(236, 240, 241));
        paternoLabel.setText("<html>Apellido paterno");

        maternoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maternoLabel.setForeground(new java.awt.Color(236, 240, 241));
        maternoLabel.setText("<html>Apellido materno");

        localLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        localLabel.setForeground(new java.awt.Color(236, 240, 241));
        localLabel.setText("No. Localidad");

        phoneLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(236, 240, 241));
        phoneLabel.setText("Teléfono");

        jComboBoxLocalidad.setBackground(new java.awt.Color(108, 122, 137));
        jComboBoxLocalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxLocalidad.setForeground(new java.awt.Color(236, 240, 241));
        jComboBoxLocalidad.setToolTipText("Selecciona una localidad");
        jComboBoxLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLocalidadActionPerformed(evt);
            }
        });

        webLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        webLabel.setForeground(new java.awt.Color(236, 240, 241));
        webLabel.setText("<html>Página web");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(236, 240, 241));
        addressLabel.setText("Dirección");

        nombreText.setBackground(new java.awt.Color(108, 122, 137));
        nombreText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreText.setForeground(new java.awt.Color(236, 240, 241));

        Apellido1Text.setBackground(new java.awt.Color(108, 122, 137));
        Apellido1Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Apellido1Text.setForeground(new java.awt.Color(236, 240, 241));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(webLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(phoneLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(localLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(Cancelar)
                                                .addGap(75, 75, 75)
                                                .addComponent(registryButton))
                                            .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(paternoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maternoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Apellido1Text, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(nombreText)
                            .addComponent(apellido2Text)
                            .addComponent(webText))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel)
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paternoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maternoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(webLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(webText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(phoneLabel)))
                        .addGap(41, 41, 41)
                        .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(localLabel)))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(156, 156, 156)
                .addComponent(minimize1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit1)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(minimize1)
                    .addComponent(exit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registryButtonActionPerformed
      insertarAutorDB();
    }//GEN-LAST:event_registryButtonActionPerformed

    private void jComboBoxLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLocalidadActionPerformed

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked

        this.dispose();
    }//GEN-LAST:event_exit1MouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize1MouseClicked

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

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
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField apellido2Text;
    private javax.swing.JLabel exit1;
    private javax.swing.JComboBox<String> jComboBoxLocalidad;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel localLabel;
    private javax.swing.JLabel maternoLabel;
    private javax.swing.JLabel minimize1;
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
