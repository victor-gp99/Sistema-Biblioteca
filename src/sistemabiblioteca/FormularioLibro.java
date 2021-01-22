package sistemabiblioteca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PP
 */
public class FormularioLibro extends javax.swing.JFrame {
    Connection con;
    /**
     * Creates new form FormularioLibro
     * @param con
     */
    public FormularioLibro(Connection con) {
        initComponents();
        setLocationRelativeTo(null);
        this.con = con;
        fillInComboBox();
    }
    
    public FormularioLibro(){
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jLabelNuevoLibro = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldIsbn = new javax.swing.JTextField();
        jTextFieldAnioPub = new javax.swing.JTextField();
        jLabelIsbn = new javax.swing.JLabel();
        jRadioButtonEBook = new javax.swing.JRadioButton();
        jRadioButtonPapel = new javax.swing.JRadioButton();
        jLabelAnioPub = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelDescripcion1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboBoxEditorial = new javax.swing.JComboBox<>();
        jLabelDescripcion2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNuevoLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNuevoLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuevoLibro.setText("Nuevo Libro");

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTitulo.setText("Título:");

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jTextFieldIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIsbnActionPerformed(evt);
            }
        });

        jTextFieldAnioPub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnioPubActionPerformed(evt);
            }
        });

        jLabelIsbn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelIsbn.setText("Isbn:");

        buttonGroupTipo.add(jRadioButtonEBook);
        jRadioButtonEBook.setText("e-Book");
        jRadioButtonEBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroupTipo.add(jRadioButtonPapel);
        jRadioButtonPapel.setSelected(true);
        jRadioButtonPapel.setText("Papel");
        jRadioButtonPapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelAnioPub.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAnioPub.setText("Año de publicación:");

        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDescripcion.setText("Descripción:");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabelDescripcion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDescripcion1.setText("Tipo:");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelDescripcion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDescripcion2.setText("Editorial:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)
                                .addComponent(jRadioButtonPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonEBook, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAnioPub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabelDescripcion2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEditorial, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAnioPub, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNuevoLibro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIsbn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnioPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnioPub))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion)
                        .addContainerGap(383, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonPapel)
                            .addComponent(jRadioButtonEBook)
                            .addComponent(jLabelDescripcion1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescripcion2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAceptar)
                            .addComponent(jButtonCancelar))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jTextFieldIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIsbnActionPerformed

    private void jTextFieldAnioPubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnioPubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnioPubActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(insertBookToDB()){
            jTextFieldTitulo.setText("");
            jTextFieldIsbn.setText("");
            jTextFieldAnioPub.setText("");
            jTextAreaDescripcion.setText("");
            jRadioButtonPapel.setSelected(true);
            jComboBoxEditorial.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxEditorial;
    private javax.swing.JLabel jLabelAnioPub;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcion1;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelIsbn;
    private javax.swing.JLabel jLabelNuevoLibro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButton jRadioButtonEBook;
    private javax.swing.JRadioButton jRadioButtonPapel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldAnioPub;
    private javax.swing.JTextField jTextFieldIsbn;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
    public boolean insertBookToDB(){
        String libroNuevo [] = {jTextFieldTitulo.getText(),jTextFieldIsbn.getText(),jTextFieldAnioPub.getText(),jTextAreaDescripcion.getText(),getTipo()};
        int editorialIndex = jComboBoxEditorial.getSelectedIndex();
        if(libroNuevo[0].isEmpty()||libroNuevo[1].isEmpty()|| libroNuevo[2].isEmpty() || libroNuevo[3].isEmpty()|| editorialIndex == -1){
            JOptionPane.showMessageDialog(this, "Asegurate de llenar todos los campos", "Campo/s Vacío/s", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(libroNuevo[0].length() > 45){
            JOptionPane.showMessageDialog(this, "Ingresa un título con menos de 45 caracteres", "Título demasiado grande", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(libroNuevo[1].length() > 45){
            JOptionPane.showMessageDialog(this, "Ingresa un Isbn con menos de 45 caracteres", "Isbn demasiado grande", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(libroNuevo[2].length() != 4){
            JOptionPane.showMessageDialog(this, "Ingresa un año de publicación en numeros y a 4 digitos exactos", "Formato de año", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(libroNuevo[3].length() > 450){
            JOptionPane.showMessageDialog(this, "La descripción tiene como máximo 450 caracteres", "Formato de año", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            Integer.parseInt(libroNuevo[2]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un año de publicación en numeros y a 4 digitos exactos", "Formato de año", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        try {
            Statement st = con.createStatement();
            st.execute("INSERT INTO libro values (null,'"+libroNuevo[0]+"','"+libroNuevo[1]+"',"+libroNuevo[2]+",'"+libroNuevo[3]+"',"+libroNuevo[4]+")");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(editorialPublicaLibro(editorialIndex+1)){
           JOptionPane.showMessageDialog(this, "¡Libro registrado exitosamente!", "¡Hecho!", JOptionPane.PLAIN_MESSAGE);
           return true;
        }
        return false;
    }
    
    public boolean editorialPublicaLibro(int editorial){
        try {
            Statement st = con.createStatement();
            int libro = getLastId();
            
            st.execute("INSERT INTO editorial_publica_libro values("+editorial+","+libro+")");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public int getLastId(){
        int id = -1;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(id) FROM libro");
            while (rs.next()){
                id=rs.getInt("MAX(id)");
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al obtener el ultimo id", "MySQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return id;
    }
    
    public String getTipo(){
        if(jRadioButtonPapel.isSelected())
            return "1";
        return "2";
        //coment
    }  
    
    public void fillInComboBox(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM editorial");
            while (rs.next()){
                jComboBoxEditorial.addItem(rs.getString("nombre"));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jComboBoxEditorial.setSelectedIndex(-1);
    }
}
