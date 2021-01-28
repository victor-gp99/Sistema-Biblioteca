package sistemabiblioteca;

import javax.swing.JFrame;
import javax.swing.JTable;
import static sistemabiblioteca.LibreriaUI.cui;
import static sistemabiblioteca.LibreriaUI.labelcart;

/**
 *
 * @author Victor
 */
public class CarritoUI extends javax.swing.JFrame {
    float sub = 0, envio = 100, total=0;
    boolean papel = false, eBook = false, onlyEbooks = false, both = false;
    public CarritoUI() {
        initComponents();
        setTitle("Tu carrito de compras");
        setLocationRelativeTo(null);
    }

    public JTable getCarshopTable() {
        return carshopTable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonPagar = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();
        labelEnvio = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carshopTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(92, 151, 191));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
        jLabel5.setText("Carrito de compras");

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
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        buttonPagar.setBackground(new java.awt.Color(235, 151, 78));
        buttonPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonPagar.setForeground(new java.awt.Color(236, 240, 241));
        buttonPagar.setText("Completar orden");
        buttonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagarActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(236, 240, 241));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotal.setText("Total: $ 0.0");

        labelEnvio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEnvio.setForeground(new java.awt.Color(236, 240, 241));
        labelEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnvio.setText("Envío: $ 0.0");

        labelSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(236, 240, 241));
        labelSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubtotal.setText("Subtotal: $ 0.0");

        carshopTable.setBackground(new java.awt.Color(46, 49, 49));
        carshopTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carshopTable.setForeground(new java.awt.Color(236, 240, 241));
        carshopTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Descripcion", "Tipo", "Precio Unitario", "Cantidad", "Pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carshopTable);
        if (carshopTable.getColumnModel().getColumnCount() > 0) {
            carshopTable.getColumnModel().getColumn(0).setMinWidth(0);
            carshopTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            carshopTable.getColumnModel().getColumn(0).setMaxWidth(0);
            carshopTable.getColumnModel().getColumn(2).setMinWidth(0);
            carshopTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            carshopTable.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addComponent(buttonPagar))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(labelSubtotal)
                .addGap(42, 42, 42)
                .addComponent(labelEnvio)
                .addGap(43, 43, 43)
                .addComponent(labelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(buttonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(151, 151, 151)
                .addComponent(minimize1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(minimize1)
                    .addComponent(exit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagarActionPerformed
        new CreditCardPayUI(onlyEbooks, papel, both, total, sub);
    }//GEN-LAST:event_buttonPagarActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked

        this.dispose();
    }//GEN-LAST:event_exit1MouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CarritoUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPagar;
    private javax.swing.JTable carshopTable;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEnvio;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel minimize1;
    // End of variables declaration//GEN-END:variables

    public void calcularTotal() {
        int rows= carshopTable.getRowCount();
        if(rows == 0)
            return;
        sub = 0;
        envio = 100;
        total = 0;
        for (byte i = 0; i < rows; i++) {
            System.out.println(carshopTable.getValueAt(i, 3).toString());
            if(!papel){
                if(carshopTable.getValueAt(i, 3).equals("Papel"))
                    papel = true;
            }   
            if(!carshopTable.getValueAt(i, 3).equals("Papel"))
                eBook = true;
            sub += Float.parseFloat(carshopTable.getValueAt(i, 6).toString());
        }
        
        if(!papel)
            onlyEbooks = true;
        else if(eBook)
            both = true;
        
        if (sub >= 499 || onlyEbooks){
            labelEnvio.setText("Envío gratis");
            envio = 0;
            total = sub;
        }else{
            labelEnvio.setText("Envío: $ "+envio);
            total = sub + envio;
        }    
        labelSubtotal.setText("Subtotal: $ "+sub);
        labelTotal.setText("Total: $ "+total);  
    }
    
}
