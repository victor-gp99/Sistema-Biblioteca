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
        fillInComboEditorial();
        fillInComboAutor();
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
        jLabelPrecio = new javax.swing.JLabel();
        jSpinnerPrecio = new javax.swing.JSpinner();
        jLabelTamaño = new javax.swing.JLabel();
        jTextFieldTamaño = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabelLugar = new javax.swing.JLabel();
        jTextFieldLugar = new javax.swing.JTextField();
        jLabelDescripcion3 = new javax.swing.JLabel();
        puzzle1 = new javax.swing.JLabel();
        jComboBoxAutor = new javax.swing.JComboBox<>();
        jLabelDescripcion4 = new javax.swing.JLabel();

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
        jRadioButtonEBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonEBookMouseClicked(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonPapel);
        jRadioButtonPapel.setSelected(true);
        jRadioButtonPapel.setText("Papel");
        jRadioButtonPapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPapelMouseClicked(evt);
            }
        });

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

        jLabelDescripcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescripcion1.setText("Tipo de libro:");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelDescripcion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDescripcion2.setText("Editorial:");

        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPrecio.setText("Precio:");

        jSpinnerPrecio.setModel(new javax.swing.SpinnerNumberModel(-1.0f, null, null, 1.0f));

        jLabelTamaño.setText("Tamaño del archivo:");
        jLabelTamaño.setEnabled(false);

        jTextFieldTamaño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTamaño.setEnabled(false);

        jLabelFecha.setText("Fecha de impresión:");
        jLabelFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFechaMouseClicked(evt);
            }
        });

        jTextFieldFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFecha.setText("AAAA-MM-DD");

        jLabelLugar.setText("Lugar de impresión:");

        jTextFieldLugar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelDescripcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescripcion3.setText("Información del libro:");

        puzzle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Libros.jpg"))); // NOI18N

        jLabelDescripcion4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDescripcion4.setText("Autor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jRadioButtonPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86))
                                    .addComponent(jRadioButtonEBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAnioPub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldAnioPub)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTamaño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescripcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puzzle1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)
                                .addGap(101, 101, 101)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNuevoLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcion1)
                    .addComponent(jLabelDescripcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonPapel)
                            .addComponent(jRadioButtonEBook))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTamaño)
                            .addComponent(jTextFieldTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLugar)
                            .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(puzzle1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelIsbn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAnioPub)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAnioPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescripcion2)
                            .addComponent(jComboBoxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescripcion4)
                            .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecio)
                            .addComponent(jSpinnerPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(this, "¡Libro registrado exitosamente!", "¡Hecho!", JOptionPane.PLAIN_MESSAGE);
            jTextFieldTitulo.setText("");
            jTextFieldIsbn.setText("");
            jTextFieldAnioPub.setText("");
            jTextAreaDescripcion.setText("");
            jRadioButtonPapel.setSelected(true);
            jComboBoxEditorial.setSelectedIndex(-1);
            jRadioButtonPapel.setSelected(true);
            jTextFieldTamaño.setText("");
            jTextFieldFecha.setText("AAAA-MM-DD");
            jTextFieldLugar.setText("");
            jLabelTamaño.setEnabled(false);
            jTextFieldTamaño.setEnabled(false);
            jLabelFecha.setEnabled(true);
            jTextFieldFecha.setEnabled(true);
            jLabelLugar.setEnabled(true);
            jTextFieldLugar.setEnabled(true);  
            jSpinnerPrecio.setValue(-1f);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioButtonEBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonEBookMouseClicked
        jLabelTamaño.setEnabled(true);
        jTextFieldTamaño.setEnabled(true);
        jLabelFecha.setEnabled(false);
        jTextFieldFecha.setEnabled(false);
        jLabelLugar.setEnabled(false);
        jTextFieldLugar.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonEBookMouseClicked

    private void jRadioButtonPapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPapelMouseClicked
        jLabelTamaño.setEnabled(false);
        jTextFieldTamaño.setEnabled(false);
        jLabelFecha.setEnabled(true);
        jTextFieldFecha.setEnabled(true);
        jLabelLugar.setEnabled(true);
        jTextFieldLugar.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonPapelMouseClicked

    private void jLabelFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFechaMouseClicked
        System.out.println(jTextFieldFecha.getText().charAt(4)+"\n"+jTextFieldFecha.getText().charAt(7)+"\n"+jTextFieldFecha.getText().substring(0,4)+"\n"+jTextFieldFecha.getText().substring(5,7)+"\n"+jTextFieldFecha.getText().substring(8,10));
    }//GEN-LAST:event_jLabelFechaMouseClicked

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
    private javax.swing.JComboBox<String> jComboBoxAutor;
    private javax.swing.JComboBox<String> jComboBoxEditorial;
    private javax.swing.JLabel jLabelAnioPub;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcion1;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelDescripcion3;
    private javax.swing.JLabel jLabelDescripcion4;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelIsbn;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNuevoLibro;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTamaño;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButton jRadioButtonEBook;
    private javax.swing.JRadioButton jRadioButtonPapel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerPrecio;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldAnioPub;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldIsbn;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldTamaño;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JLabel puzzle1;
    // End of variables declaration//GEN-END:variables
    public boolean insertBookToDB(){
        String libroNuevo [] = {jTextFieldTitulo.getText(),jTextFieldIsbn.getText(),jTextFieldAnioPub.getText(),jTextAreaDescripcion.getText(),getTipo()};
        int editorialIndex = jComboBoxEditorial.getSelectedIndex() + 1, autorIndex = jComboBoxAutor.getSelectedIndex() + 1;
        float precio = (float)jSpinnerPrecio.getValue();
        String fecha = jTextFieldFecha.getText().trim(), lugar = jTextFieldFecha.getText(), tamaño = jTextFieldTamaño.getText();
        boolean papel = true;
        
        if(libroNuevo[0].isEmpty()||libroNuevo[1].isEmpty()|| libroNuevo[2].isEmpty() || libroNuevo[3].isEmpty()|| editorialIndex == 0 ||  precio== -1 || autorIndex == 0){
            JOptionPane.showMessageDialog(this, "Asegurate de llenar todos los campos", "Campo/s Vacío/s", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if (jRadioButtonPapel.isSelected()){
            if (fecha.isEmpty()|| lugar.isEmpty()){
                JOptionPane.showMessageDialog(this, "Asegurate de llenar todos los campos", "Campo/s Vacío/s", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if(fecha.length() !=10 || fecha.charAt(4) != '-' || fecha.charAt(7) != '-'){
                JOptionPane.showMessageDialog(this, "Escribe la fecha en el siguiente formato \"AAAA-MM-DD\"", "Formato de fecha invalido", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            try {
                Integer.parseInt(jTextFieldFecha.getText().substring(0,4));
                Integer.parseInt(jTextFieldFecha.getText().substring(5,7));
                Integer.parseInt(jTextFieldFecha.getText().substring(8,10));   
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Escribe la fecha en el siguiente formato \"AAAA-MM-DD\"", "Formato de fecha invalido", JOptionPane.WARNING_MESSAGE);
                return false;
            }  
        }else{
            papel = false;
            if(tamaño.isEmpty()){
                JOptionPane.showMessageDialog(this, "Asegurate de llenar todos los campos", "Campo/s Vacío/s", JOptionPane.WARNING_MESSAGE);
                return false;
            }
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
        
        int id = getLastId();
        editorialPublicaLibro(editorialIndex,id);
        autorEscribeLibro(autorIndex, id);
        if(papel)
            insertPapel(id, fecha, lugar, precio);
        else
            insertEBook(id, precio, tamaño);            
        return true;
    }
    
    public void editorialPublicaLibro(int editorial,int libro){
        try {
            Statement st = con.createStatement();            
            st.execute("INSERT INTO editorial_publica_libro values("+editorial+","+libro+")");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void autorEscribeLibro(int autor,int libro){
        try {
            Statement st = con.createStatement();            
            st.execute("INSERT INTO autor_escribe_libro values("+autor+","+libro+")");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertPapel(int libro,String fecha,String lugar,Float precio){
        try {
            Statement st = con.createStatement();
            st.execute("INSERT INTO libro_papel values("+libro+",'"+fecha+"','"+lugar+"',"+precio+")");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertEBook(int libro,Float precio,String tamaño){
        try {
            Statement st = con.createStatement();
            st.execute("INSERT INTO libro_ebook values("+libro+",'"+tamaño+"',"+precio+")");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioLibro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }   
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
    
    public void fillInComboEditorial(){
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
    
        public void fillInComboAutor(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT concat(nombre,' ',apellido1,' ',apellido2) FROM autor");
            while (rs.next()){
                jComboBoxAutor.addItem(rs.getString(1));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jComboBoxAutor.setSelectedIndex(-1);
    }
}
