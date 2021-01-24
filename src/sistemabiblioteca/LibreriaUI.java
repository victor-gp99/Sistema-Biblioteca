package sistemabiblioteca;

import java.awt.Toolkit;
import static java.awt.image.ImageObserver.HEIGHT;
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
    }   
    public LibreriaUI(){
        //Este constructor se usa para cuando se abre el sistema sin conectarse a la BD. 
        initComponents();
        int W = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int H = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int x = W-this.getWidth()/2;
        int y = H-this.getHeight()/2;
        setLocation(x,y);
        //Este constructor se usa para cuando se abre el sistema sin conectarse a la BD. 
    }
   public JButton getjButtonAdmin() {
         return jButtonAdmin;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAdmin = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libreriaTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(botonX());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Libreria ");

        jButtonAdmin.setText("ADMIN");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
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
        jScrollPane1.setViewportView(libreriaTable);

        jButton1.setText("Añadir a Cesta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(jButton1)))
                        .addGap(0, 52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(jButtonAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
            ResultSet rs = st. executeQuery("SELECT titulo, descripcion, tipo, e.precio, p.precio  FROM libro AS l\n" +
                                            "LEFT JOIN libro_ebook AS e ON l.id = e.id\n" +
                                            "LEFT JOIN libro_papel AS p ON l.id = p.id; ");
        } catch (SQLException ex) {
            Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Usuario y/o contraseña incorrectos", "Error", HEIGHT);
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

 
     
     
     
     
