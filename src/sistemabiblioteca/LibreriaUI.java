package sistemabiblioteca;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    int id;
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

        jPanel8 = new javax.swing.JPanel();
        exit4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        minimize4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabelEstado3 = new javax.swing.JLabel();
        jLabelPrincipal1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libreriaTable = new javax.swing.JTable();
        jButtonAdmin = new javax.swing.JButton();
        labelCarrito = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        labelLogOut = new javax.swing.JLabel();
        jLabelPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(botonX());
        setUndecorated(true);
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(92, 151, 191));

        exit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit4.setForeground(new java.awt.Color(255, 255, 255));
        exit4.setText("X");
        exit4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit4MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Libreria online");

        minimize4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize4.setForeground(new java.awt.Color(255, 255, 255));
        minimize4.setText("--");
        minimize4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimize4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize4MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(34, 49, 63));

        jLabelPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/AHPV Books.jpg"))); // NOI18N

        libreriaTable.setBackground(new java.awt.Color(34, 49, 63));
        libreriaTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        libreriaTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        libreriaTable.setForeground(new java.awt.Color(236, 240, 241));
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
        libreriaTable.setGridColor(new java.awt.Color(34, 49, 63));
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

        jButtonAdmin.setBackground(new java.awt.Color(235, 151, 78));
        jButtonAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdmin.setForeground(new java.awt.Color(236, 240, 241));
        jButtonAdmin.setText("ADMIN");
        jButtonAdmin.setFocusPainted(false);
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
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

        labelCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(236, 240, 241));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Nombre del cliente");
        labelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelClienteMouseClicked(evt);
            }
        });

        labelLogOut.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelLogOut.setForeground(new java.awt.Color(236, 240, 241));
        labelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogOut.setText("Cerrar sesión.");
        labelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogOutMouseClicked(evt);
            }
        });

        jLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Oferta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addComponent(jLabelEstado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabelPrincipal)
                            .addGap(20, 20, 20))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jButtonAdmin)
                                    .addGap(371, 371, 371)
                                    .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(67, 67, 67)
                                            .addComponent(labelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelPrincipal1))
                .addGap(115, 115, 115))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabelNombre3)
                .addGap(91, 91, 91)
                .addComponent(jLabelEstado3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonAdmin)
                        .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelLogOut)))
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(395, 395, 395)
                .addComponent(minimize4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit4)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(minimize4)
                    .addComponent(exit4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void exit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit4MouseClicked
        this.dispose();
    }//GEN-LAST:event_exit4MouseClicked

    private void minimize4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize4MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibreriaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel exit3;
    private javax.swing.JLabel exit4;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAceptar1;
    private javax.swing.JButton jButtonAceptar2;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonCancelar2;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstado1;
    private javax.swing.JComboBox<String> jComboBoxEstado2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstado1;
    private javax.swing.JLabel jLabelEstado2;
    private javax.swing.JLabel jLabelEstado3;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JLabel jLabelPrincipal1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JLabel labelCarrito;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelLogOut;
    private javax.swing.JTable libreriaTable;
    private javax.swing.JLabel minimize1;
    private javax.swing.JLabel minimize2;
    private javax.swing.JLabel minimize3;
    private javax.swing.JLabel minimize4;
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

 
     
     
     
     
