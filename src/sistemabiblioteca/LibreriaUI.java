package sistemabiblioteca;

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
    DefaultTableModel model, model2;
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
        labelCarrito = new javax.swing.JLabel();

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
                "Titulo", "Descripcion", "Tipo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        libreriaTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(libreriaTable);

        labelCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCarrito.setForeground(new java.awt.Color(255, 0, 51));
        labelCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PicsArt_01-24-07.11.52.png"))); // NOI18N
        labelCarrito.setText("8");
        labelCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelPrincipal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(jButtonAdmin)
                    .addComponent(labelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            ResultSet rs = st. executeQuery("SELECT titulo, descripcion, tipo, e.precio, p.precio  FROM libro AS l LEFT JOIN libro_ebook AS e ON l.id = e.id "
                    + "LEFT JOIN libro_papel AS p ON l.id = p.id ");
            while(rs.next()){
                info[0] = rs.getString(1);
                info[1] = rs.getString(2);
                info[2] = rs.getString(3);
                if(info[2].equals("Papel"))
                    info[3] = rs.getString(5);
                else
                    info[3] = rs.getString(4);
                model.addRow(info);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "MySQL", JOptionPane.ERROR_MESSAGE);
        }
        
        
        /*try {  
             Statement st = con.createStatement();
             ResultSet rs = st. executeQuery("SELECT id,titulo,descripcion,tipo FROM libro");
             
             while (rs.next()) {          
                info[0]= rs.getString(2);//titulo
                info[1]= rs.getString(3);//descripcion
                info[2]= rs.getString(4);//tipo    
             }  
                 
             rs.close();
       
             ResultSet rs3= st. executeQuery("SELECT le.precio FROM libro_ebook AS le INNER JOIN libro AS l ON l.id = le.id");
             while (rs3.next())              
                if (info[2].equalsIgnoreCase("Ebook")) //precio ebook
                    info[3]= rs3.getString(1);  
              
             rs3.close(); 
             
             ResultSet rs4= st. executeQuery("SELECT lp.precio FROM libro_papel AS lp INNER JOIN libro AS l ON l.id = lp.id");
               while (rs4.next())                
                if (info[2].equalsIgnoreCase("Papel")) //precio papel
                    info[3]= rs4.getString(1);   
               rs4.close();

            model.addRow(info);   
            st.close();
    
         } catch (SQLException ex) {
             Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
         }*/
    }
}

 
     
     
     
     
