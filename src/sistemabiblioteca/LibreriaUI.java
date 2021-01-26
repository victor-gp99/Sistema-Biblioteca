package sistemabiblioteca;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joefi && victor
 */
public class LibreriaUI extends javax.swing.JFrame {
    Connection con;
    String nombreCLiente;
    static int id;
    DefaultTableModel model,model2;
    static CarritoUI cui;
    static JLabel labelcart;
    MostrarLibro ml;
     
    public LibreriaUI(Connection con,String nombreCliente,int id) {
        initComponents();
        int W = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int H = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int x = W-this.getWidth()/2;
        int y = H-this.getHeight()/2;
        setLocation(x,y);
        this.con = con;
        this.nombreCLiente = nombreCliente;
        labelCliente.setText("Hola "+nombreCliente);
        this.id = id;
        leerLibrosDB();
        System.out.println(labelCarrito.getIcon().getClass().getName());
        labelCarrito.setIconTextGap(0);
        this.cui= new CarritoUI();
        this.ml=new MostrarLibro();
        labelcart = labelCarrito;
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

        jButtonAdmin = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libreriaTable = new javax.swing.JTable();
        labelCarrito = new javax.swing.JLabel();
        labelLogOut = new javax.swing.JLabel();
        jLabelPrincipal = new javax.swing.JLabel();
        jLabelPrincipal1 = new javax.swing.JLabel();

        setDefaultCloseOperation(botonX());

        jButtonAdmin.setText("ADMIN");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Nombre del cliente");
        labelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        libreriaTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        labelCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCarrito.setForeground(new java.awt.Color(255, 0, 51));
        labelCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PicsArt_01-24-07.11.52.png"))); // NOI18N
        labelCarrito.setText("0");
        labelCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCarritoMouseClicked(evt);
            }
        });

        labelLogOut.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogOut.setText("Cerrar sesión.");
        labelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogOutMouseClicked(evt);
            }
        });

        jLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Oferta.png"))); // NOI18N

        jLabelPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/AHPV Books.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelLogOut))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8))
                    .addComponent(jButtonAdmin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        new AdminTools().setVisible(true);
    }//GEN-LAST:event_jButtonAdminActionPerformed

    private void labelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseClicked
        new Mostrar_usuario().setVisible(true);
    }//GEN-LAST:event_labelClienteMouseClicked

    private void labelCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCarritoMouseClicked
        cui.calcularTotal();
        cui.setVisible(true);
    }//GEN-LAST:event_labelCarritoMouseClicked

    private void libreriaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libreriaTableMouseClicked
        new MostrarLibro((String.valueOf(libreriaTable.getValueAt(libreriaTable.getSelectedRow(), 0)))).setVisible(true);
    }//GEN-LAST:event_libreriaTableMouseClicked

    private void labelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogOutMouseClicked
        new LogIn(con).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelLogOutMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibreriaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JLabel jLabelPrincipal1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCarrito;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelLogOut;
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
     
    public void leerLibrosDB(){ 
        model =(DefaultTableModel) libreriaTable.getModel();
        String[] info = new String[libreriaTable.getColumnCount()];   
        try {
            Statement st = con.createStatement();
            ResultSet rs = st. executeQuery("SELECT l.id, titulo, descripcion, tipo, e.precio, p.precio, stock "
                    + " FROM libro AS l LEFT JOIN libro_ebook AS e ON l.id = e.id "
                    + "LEFT JOIN libro_papel AS p ON l.id = p.id LEFT JOIN almacen_almacena_libro AS alm ON l.id = alm.id_libro");
            while(rs.next()){
                info[0] = rs.getString(1);
                info[1] = rs.getString(2);
                info[2] = rs.getString(3);
                info[3] = rs.getString(4);
                
                if(info[3].equals("Papel"))
                    info[4] = rs.getString(6);
                else
                    info[4] = rs.getString(5);
                int stock = rs.getInt(7);
                if(stock > 0)
                    info[5]= String.valueOf(stock);
                else
                    info[5] = ""+0;
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
            info[5] = ml.getCantidadCarSpinner().getValue().toString();//cantidad           
    return  info;
    }
    
    public void operarUnitStocks(){      
        int seleccionf = libreriaTable.getSelectedRow();
        if (seleccionf >= 0) {
        int ofert = Integer.valueOf(libreriaTable.getValueAt(seleccionf, 5).toString());
        int demand = (int) ml.getCantidadCarSpinner().getValue();
        
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
    
    public void refill(){
        DefaultTableModel modelo = (DefaultTableModel) libreriaTable.getModel();
        modelo.setRowCount(0);
        leerLibrosDB();
    }       
}

 
     
     
     
     
