
package sistemabiblioteca;

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
public class RegistryAlmacenUI extends javax.swing.JFrame {

    public RegistryAlmacenUI() {
        initComponents();
        setTitle("Registra un almacén");
         setLocationRelativeTo(new LibreriaUI());
        setVisible(true);
        fillInComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxLocalidad = new javax.swing.JComboBox<>();
        direTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxLocalidad.setToolTipText("Selecciona una localidad");

        jLabel1.setText("Dirección:");

        jLabel2.setText("Teléfono:");

        jLabel3.setText("Localidad:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(phoneTextField)
                            .addComponent(direTextField)
                            .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      insertarAlmacenDB();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistryAlmacenUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistryAlmacenUI().setVisible(true);
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
     
      public void insertarAlmacenDB(){//error llave foranea 
        String direccion, telefono, localidad;
             
             
             direccion=direTextField.getText();
             telefono= phoneTextField.getText();
             
             if (phoneTextField.getText().length()>10){ 
                 phoneTextField.setText("");
                 JOptionPane.showMessageDialog(this, "Teclea solo 10 digitos en telefono!", "ERROR", JOptionPane.ERROR_MESSAGE);
                 return;
             }
             
              localidad = String.valueOf(jComboBoxLocalidad.getSelectedItem());
             
              if (direccion.isEmpty()||telefono.isEmpty()|| localidad.isEmpty()) {
              JOptionPane.showMessageDialog(this, "Hay campos vacios...", "ERROR", JOptionPane.ERROR_MESSAGE);
              return;
               }
             
             
        try {
            Statement st;
            st = con.createStatement();
            st.execute("INSERT INTO almacen ( direccion, telefono, id_localidad) "
                    + "VALUES ('"+direccion+"','"+telefono+"','"+(jComboBoxLocalidad.getSelectedIndex()+1)+"')");
            JOptionPane.showMessageDialog(rootPane, "Se registro una editorial exitosamente!");
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(RegistryAutorUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxLocalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField phoneTextField;
    // End of variables declaration//GEN-END:variables
}
