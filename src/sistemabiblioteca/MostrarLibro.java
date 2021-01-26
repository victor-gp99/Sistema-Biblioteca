package sistemabiblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import static sistemabiblioteca.LibreriaUI.cui;
import static sistemabiblioteca.LibreriaUI.labelcart;
import static sistemabiblioteca.AppSistemaBiblioteca.con;

/**
 *
 * @author joefi & Victor
 */
public class MostrarLibro extends javax.swing.JFrame {

    String libro[];
    LibreriaUI lui;

    public MostrarLibro() {
        initComponents();
        setLocationRelativeTo(null);
        this.lui = new LibreriaUI();
        cantidadCarSpinner.setEnabled(false);
        buttonCarrito.setEnabled(false);
    }

    public MostrarLibro(String id) {
        initComponents();
        setLocationRelativeTo(null);
        
        libro = showBook(id);
        labelImagen.setIcon(new ImageIcon("src/imgs/" + libro[0] + ".jpg"));
        labelTitulo.setText(libro[1]);
        labelAutor.setText(libro[2]);
        labelDescripcion.setText("<html>" + libro[3] + "</html>");
        labelTipo.setText(libro[4]);
        labelsbn.setText("ISBN: " + libro[5]);
        labeAño.setText("Año de publicación: " + libro[6].substring(0, 4));
        if (isAvailable()) {
            labelPrecio.setText("$ " + libro[7]);
        } else {
            labelPrecio.setText("<html> Lo sentimos, este producto se encuentra agotado actualmente. Vuelve más tarde ");
            cantidadCarSpinner.setEnabled(false);
            buttonCarrito.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImagen = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelsbn = new javax.swing.JLabel();
        labeAño = new javax.swing.JLabel();
        buttonCarrito = new javax.swing.JButton();
        labelPrecio = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        cantidadCarSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelImagen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen.setText("Imagen");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Titulo del libro.");

        labelDescripcion.setText("<html>Descripcion ");

        labelAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAutor.setText("Autor");

        labelsbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsbn.setText("ISBN: ");

        labeAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeAño.setText("Año de Publicación:");

        buttonCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCarrito.setText("Añadir al Carrito");
        buttonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarritoActionPerformed(evt);
            }
        });

        labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrecio.setText("Precio:");

        labelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipo.setText("Tipo:");

        cantidadCarSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labeAño, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantidadCarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(labelDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(labelAutor)
                        .addGap(30, 30, 30)
                        .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipo)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrecio))
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelsbn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(labeAño)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadCarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarritoActionPerformed
        //lui.operarUnitStocks(); 
        addToCart();
        int suma = (int)cantidadCarSpinner.getValue() + Integer.parseInt(labelcart.getText());
        labelcart.setText(String.valueOf(suma));
        cantidadCarSpinner.setValue(1);
        dispose();
    }//GEN-LAST:event_buttonCarritoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MostrarLibro().setVisible(true);
        });
    }

    public JSpinner getCantidadCarSpinner() {
        return cantidadCarSpinner;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCarrito;
    private javax.swing.JSpinner cantidadCarSpinner;
    private javax.swing.JLabel labeAño;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelsbn;
    // End of variables declaration//GEN-END:variables

    public void addToCart() {
        int cantidad = (int) (cantidadCarSpinner.getValue());
        float precio = Float.parseFloat(libro[7]), pagar = precio * cantidad;

        if (Integer.parseInt(libro[8]) < cantidad) {
            JOptionPane.showMessageDialog(this, "No hay suficientes existencias del producto", "Existencia insuficiente", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) cui.getCarshopTable().getModel();

        String row[] = {libro[0], libro[1], libro[3], libro[4], libro[7], String.valueOf(cantidad), String.valueOf(pagar)};
        model.addRow(row);
        cui.getCarshopTable().setModel(model);

        JOptionPane.showMessageDialog(this, "¡Libro agregado al carrito!", "¡Hecho!", JOptionPane.PLAIN_MESSAGE);
    }

    public boolean isAvailable() {
        if(libro[8] != null)
            return Integer.parseInt(libro[8]) > 0;
        else return false;
    }
    
    public String [] showBook(String libroID){
        String book [] = new String[9];
        book[0] = libroID;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT l.titulo, concat(a.nombre,' ',a.apellido1,' ',a.apellido2),l.descripcion, l.tipo, l.isbn, l.anio_publicacion, "
                    + "p.precio, e.precio,stock FROM libro AS l LEFT JOIN libro_papel AS p ON  l.id = p.id LEFT JOIN libro_ebook AS e ON l.id = e.id inner JOIN autor_escribe_libro as al"
                    + " ON l.id = al.id_libro join autor as a ON al.id_autor = a.id LEFT JOIN almacen_almacena_libro AS alm ON alm.id_libro = l.id WHERE l.id ="+libroID);
            while(rs.next()){
                book[1] = rs.getString(1);
                book[2] = rs.getString(2);
                book[3] = rs.getString(3);
                book[4] = rs.getString(4);
                book[5] = rs.getString(5);
                book[6] = rs.getString(6);
                if(book[4].equals("Papel"))
                    book[7] = rs.getString(7);
                else
                    book[7] = rs.getString(8);
                book[8] = rs.getString(9);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }
}
