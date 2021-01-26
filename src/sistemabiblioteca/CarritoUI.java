package sistemabiblioteca;

import javax.swing.JTable;

/**
 *
 * @author Victor
 */
public class CarritoUI extends javax.swing.JFrame {
    static JTable tabla;
    float sub = 0, envio = 100, total;

    public CarritoUI() {
        initComponents();
        setTitle("Tu carrito de compras");
        setLocationRelativeTo(new LibreriaUI());
        tabla = carshopTable;
        calcularTotal();
    }

    public JTable getCarshopTable() {
        return carshopTable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        carshopTable = new javax.swing.JTable();
        labelCarrito = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelEnvio = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        buttonPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        }

        labelCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCarrito.setText("Carrito de compras.");

        labelSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubtotal.setText("Subtotal: $ 0.0");

        labelEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnvio.setText("Envío: $ 0.0");

        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotal.setText("Total: $ 0.0");

        buttonPagar.setText("Completar orden.");
        buttonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(labelSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(buttonPagar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelEnvio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCarrito)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubtotal)
                .addGap(30, 30, 30)
                .addComponent(labelEnvio)
                .addGap(34, 34, 34)
                .addComponent(labelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(buttonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagarActionPerformed
         CheckOut co = new CheckOut();
         
         dispose();
    }//GEN-LAST:event_buttonPagarActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new CreditCardPayUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CarritoUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPagar;
    private javax.swing.JTable carshopTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCarrito;
    private javax.swing.JLabel labelEnvio;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    // End of variables declaration//GEN-END:variables

    public void calcularTotal() {
        int rows= carshopTable.getRowCount();
        boolean onlyEbooks = true;
    
        for (byte i = 0; i < rows; i++) {
            if(carshopTable.getValueAt(i, 3).equals("Papel"))
                onlyEbooks = false;
            sub += (float) carshopTable.getValueAt(i, 6);
        }
        
        if (sub > 499 || onlyEbooks){
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
