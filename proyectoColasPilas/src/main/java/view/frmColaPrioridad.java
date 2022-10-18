
package view;

import controller.ColaPrioridad;
import javax.swing.table.DefaultTableModel;
import modell.Producto;

public class frmColaPrioridad extends javax.swing.JFrame {
    ColaPrioridad cp = new ColaPrioridad(20);
    int pos;
    
    public frmColaPrioridad() {
        initComponents();
        llenarCombo();
        inicio();
        rbtNormal.setSelected(true);
    }
    
    void muestraTablaNormal(){
        DefaultTableModel df1 = (DefaultTableModel) tblNormal.getModel();
        df1.setRowCount(0);
        Producto x[] = cp.getNormal();
        if(cp.getPrimeroNormal()>=0){
            for(int i=cp.getPrimeroNormal(); i<=cp.getUltimoNormal();i++){
                Object v[] = {x[i].getCodigo(), x[i].getNombre(), x[i].getMarca(), x[i].getFechaVencimiento(), x[i].getCantidad(), x[i].getPrecio()};
                df1.addRow(v);
            }
        }
        
    }
    
    void muestraTablaPrioridad(){
        DefaultTableModel df2 = (DefaultTableModel) tblPrioridad.getModel();
        df2.setRowCount(0);
        Producto x[] = cp.getPrioridad();
        if(cp.getPrimeroPrioridad()>=0){
            for(int i=cp.getPrimeroPrioridad(); i<=cp.getUltimoPrioridad();i++){
                Object v[] = {x[i].getCodigo(), x[i].getNombre(), x[i].getMarca(), x[i].getFechaVencimiento(), x[i].getCantidad(), x[i].getPrecio()};
                df2.addRow(v);
            }
        }
        
    }
    
    void llenarCombo(){
        cbxCantidad.addItem("Seleccione");
        for(int j=1; j<=100; j++){
            cbxCantidad.addItem(j+"");
        }
    }
    
    void inicio(){
        txtNombre.setEnabled(false);
        txtFecha.setEnabled(false);
        txtMarca.setEnabled(false);
        txtPrecio.setEnabled(false);
        cbxCantidad.setEnabled(false);
        btnInsertar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    void nuevo(){
        btnInsertar.setEnabled(true);
        txtNombre.setEnabled(true);
        txtFecha.setEnabled(true);
        txtMarca.setEnabled(true);
        txtPrecio.setEnabled(true);
        cbxCantidad.setEnabled(true);
        btnEliminar.setEnabled(false);
        rbtNormal.setEnabled(true);rbtPrioridad.setEnabled(true);
        
    }
    
    void limpiarCampos(){
        txtNombre.setText("");
        txtFecha.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxCantidad = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbtNormal = new javax.swing.JRadioButton();
        rbtPrioridad = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrioridad = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNormal = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Fecha de Vencimiento:");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel5.setText("Marca:");

        jLabel6.setText("Cantidad:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Panel Register"));

        jLabel16.setText("Nuevo:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), "Condición"));

        buttonGroup1.add(rbtNormal);
        rbtNormal.setText("Normal");

        buttonGroup1.add(rbtPrioridad);
        rbtPrioridad.setText("Prioridad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtPrioridad)
                    .addComponent(rbtNormal))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rbtNormal)
                .addGap(18, 18, 18)
                .addComponent(rbtPrioridad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addGap(57, 57, 57)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertar)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminar)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cbxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel7.setText("Colas establecidas por prioridad");

        tblPrioridad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Fecha", "Cantidad", "Precio"
            }
        ));
        tblPrioridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrioridadMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPrioridad);

        tblNormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Fecha", "Cantidad", "Precio"
            }
        ));
        tblNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNormalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNormal);

        jLabel8.setText("Cola Normal:");

        jLabel9.setText("Cola con Prioridad:");

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton1))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String nombre = txtNombre.getText();
        String marca = txtMarca.getText();
        String fecha = txtFecha.getText();
        int cant = Integer.parseInt(cbxCantidad.getSelectedItem().toString()) ;
        double precio = Double.parseDouble(txtPrecio.getText());
        Producto p = new Producto(nombre, marca, precio, cant, fecha);
        if(rbtNormal.isSelected()){
            cp.insertarElementoNormal(p);
            muestraTablaNormal();
        }else if(rbtPrioridad.isSelected()){
            cp.insertarElementoPrioridad(p);
            muestraTablaPrioridad();
        }
        inicio();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tblNormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNormalMouseClicked
        pos = tblNormal.getSelectedRow();
        txtCodigo.setText(tblNormal.getValueAt(pos, 0).toString());
        txtNombre.setText(tblNormal.getValueAt(pos, 1).toString());
        txtMarca.setText(tblNormal.getValueAt(pos, 2).toString());
        txtPrecio.setText(tblNormal.getValueAt(pos, 5).toString());
        cbxCantidad.setSelectedItem(tblNormal.getValueAt(pos, 4).toString());
        txtFecha.setText(tblNormal.getValueAt(pos, 3).toString());

        inicio();btnEliminar.setEnabled(true);rbtNormal.setEnabled(false);rbtPrioridad.setEnabled(false);
    }//GEN-LAST:event_tblNormalMouseClicked

    private void tblPrioridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrioridadMouseClicked
        pos = tblPrioridad.getSelectedRow();
        txtCodigo.setText(tblPrioridad.getValueAt(pos, 0).toString());
        txtNombre.setText(tblPrioridad.getValueAt(pos, 1).toString());
        txtMarca.setText(tblPrioridad.getValueAt(pos, 2).toString());
        txtPrecio.setText(tblPrioridad.getValueAt(pos, 5).toString());
        cbxCantidad.setSelectedItem(tblPrioridad.getValueAt(pos, 4).toString());
        txtFecha.setText(tblPrioridad.getValueAt(pos, 3).toString());

        inicio();btnEliminar.setEnabled(true);rbtNormal.setEnabled(false);rbtPrioridad.setEnabled(false);
    }//GEN-LAST:event_tblPrioridadMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   
        if(cp.getPrimeroPrioridad()>=1){   //la cola prioridad esta LLena ?
            cp.eliminarElementoPrioridad();muestraTablaNormal();muestraTablaPrioridad();
        }else{
            cp.eliminarElementoPrioridad();muestraTablaNormal();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //creamos variable abrir
                frmColasPilas ver=new frmColasPilas();
        //metodo para ver la ventana Conf.Destino
        ver.setVisible(true);
        //ocultar ventana actual
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmColaPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmColaPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmColaPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmColaPrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmColaPrioridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbtNormal;
    private javax.swing.JRadioButton rbtPrioridad;
    private javax.swing.JTable tblNormal;
    private javax.swing.JTable tblPrioridad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
