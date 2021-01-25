package sistemabiblioteca;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joefi && victor
 */
public class LibreriaUI extends javax.swing.JFrame {
    Connection con;
    String nombreCLiente;
    int id;
    DefaultTableModel model,model2;
    CarritoUI cui;
     
    public LibreriaUI(Connection con,String nombreCliente,int id) {
        initComponents();
        int W = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int H = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int x = W-this.getWidth()/2;
        int y = H-this.getHeight()/2;
        setLocation(x,y);
        this.con = con;
        this.nombreCLiente = nombreCliente;
        labelCliente.setText(nombreCliente);
        this.id = id;
        leerLibrosDB();
        System.out.println(labelCarrito.getIcon().getClass().getName());
        labelCarrito.setIconTextGap(0);
        cui= new CarritoUI();
        
    }   
    public LibreriaUI(){
        //Este constructor se usa para cuando se abre el sistema sin conectarse a la BD. 
        initComponents();
        int W = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int H = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int x = W-this.getWidth()/2;
        int y = H-this.getHeight()/2;
        setLocation(x,y);
        System.out.println(labelCarrito.getIcon().toString());
        //labelCarrito.setIconTextGap(0);
        //Este constructor se usa para cuando se abre el sistema sin conectarse a la BD. 
    }
   public JButton getjButtonAdmin() {
         return jButtonAdmin;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPrincipal = new javax.swing.JLabel();
        jButtonAdmin = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libreriaTable = new javax.swing.JTable();
        addCarButton = new javax.swing.JButton();
        labelCarrito = new javax.swing.JLabel();
        cantidadCarSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(botonX());

        jLabelPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrincipal.setText("Libreria ");

        jButtonAdmin.setText("ADMIN");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Nombre del cliente");
        labelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelClienteMouseClicked(evt);
            }
        });

        libreriaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Descripcion", "Tipo", "Precio", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        libreriaTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        libreriaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libreriaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(libreriaTable);
        if (libreriaTable.getColumnModel().getColumnCount() > 0) {
            libreriaTable.getColumnModel().getColumn(0).setMinWidth(0);
            libreriaTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            libreriaTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        addCarButton.setText("Añadir a Cesta");
        addCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarButtonActionPerformed(evt);
            }
        });

        labelCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCarrito.setForeground(new java.awt.Color(255, 0, 51));
        labelCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PicsArt_01-24-07.11.52.png"))); // NOI18N
        labelCarrito.setText("0");
        labelCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCarritoMouseClicked(evt);
            }
        });

        cantidadCarSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantidadCarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCarButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(jButtonAdmin)
                    .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCarButton)
                    .addComponent(cantidadCarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        new AdminTools().setVisible(true);
    }//GEN-LAST:event_jButtonAdminActionPerformed

    private void labelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseClicked
        new Mostrar_usuario().setVisible(true);
    }//GEN-LAST:event_labelClienteMouseClicked

    private void addCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarButtonActionPerformed
        operarUnitStocks();
    }//GEN-LAST:event_addCarButtonActionPerformed

    private void labelCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCarritoMouseClicked
      
        cui.setVisible(true);
    }//GEN-LAST:event_labelCarritoMouseClicked

    private void libreriaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libreriaTableMouseClicked
        new MostrarLibro(showBook(String.valueOf(libreriaTable.getValueAt(libreriaTable.getSelectedRow(), 0)))).setVisible(true);
    }//GEN-LAST:event_libreriaTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibreriaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarButton;
    private javax.swing.JSpinner cantidadCarSpinner;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCarrito;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JTable libreriaTable;
    // End of variables declaration//GEN-END:variables
   
    public int botonX(){
        try {
            con.close();
        } catch (java.lang.NullPointerException | SQLException ex) {
            //System.out.println("No hay conexión con la base de datos");
        }       
        return 3;
    }
     
    private void leerLibrosDB(){ 
        model =(DefaultTableModel) libreriaTable.getModel();
        String[] info = new String[libreriaTable.getColumnCount()];   
        try {
            Statement st = con.createStatement();
            ResultSet rs = st. executeQuery("SELECT l.id, titulo, descripcion, tipo, e.precio, p.precio, stock "
                    + " FROM libro AS l LEFT JOIN libro_ebook AS e ON l.id = e.id "
                    + "LEFT JOIN libro_papel AS p ON l.id = p.id INNER JOIN almacen_almacena_libro");
            while(rs.next()){
                info[0] = rs.getString(1);
                info[1] = rs.getString(2);
                info[2] = rs.getString(3);
                info[3] = rs.getString(4);
                
                if(info[3].equals("Papel"))
                    info[4] = rs.getString(6);
                else
                    info[4] = rs.getString(5);
               
                info[5]=rs.getString(7);
                
                model.addRow(info);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    
    private String[] addLibreriaInfo(){
        int seleccionf = libreriaTable.getSelectedRow();
        String[] info = new String[libreriaTable.getColumnCount()];
            info[0] = libreriaTable.getValueAt(seleccionf, 0).toString();
            info[1] = libreriaTable.getValueAt(seleccionf, 1).toString();
            info[2] = libreriaTable.getValueAt(seleccionf, 2).toString();
            info[3] = libreriaTable.getValueAt(seleccionf, 3).toString();
            info[4] = libreriaTable.getValueAt(seleccionf, 4).toString();
            info[5] = cantidadCarSpinner.getValue().toString();//cantidad           
    
    return  info;
    }
    
    private void operarUnitStocks(){      
        int seleccionf = libreriaTable.getSelectedRow();
        if (seleccionf >= 0) {
        int ofert = Integer.valueOf(libreriaTable.getValueAt(seleccionf, 5).toString());
        int demand = (int) cantidadCarSpinner.getValue();
        
        if (demand<=ofert || demand>0) {
           int sales=ofert-demand;
           if (sales>=0) {
                String ventas= Integer.toString(sales);
                libreriaTable.setValueAt(ventas,seleccionf , 5);
                
                model2 =(DefaultTableModel) cui.getCarshopTable().getModel();
                model2.addRow(addLibreriaInfo());//añadimos la info a la tabla carshop
            }else
                JOptionPane.showMessageDialog(this, "No hay existencias suficientes!");
           
        }else{
            
            if (demand>ofert) 
                JOptionPane.showMessageDialog(this, "No hay existencias suficientes!");
            
            if (demand<=0) 
                JOptionPane.showMessageDialog(this, "La cantidad a pedir es invalida!");
             }
      
    }else
       JOptionPane.showMessageDialog(this, "Selecciona un libro para agregar al carrito...");     
    }   
    public String [] showBook(String libroID){
        String book [] = new String[8];
        book[0] = libroID;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT l.titulo, concat(a.nombre,' ',a.apellido1,' ',a.apellido2),l.descripcion, l.tipo, l.isbn, l.anio_publicacion, "
                    + "p.precio, e.precio FROM libro AS l LEFT JOIN libro_papel AS p ON  l.id = p.id LEFT JOIN libro_ebook AS e ON l.id = e.id inner JOIN autor_escribe_libro as al"
                    + " ON l.id = al.id_libro join autor as a ON al.id_autor = a.id WHERE l.id ="+libroID);
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

 
     
     
     
     
