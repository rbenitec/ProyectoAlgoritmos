
package view;

import controller.Cola;
import controller.PilaLista;
import javax.swing.table.DefaultTableModel;
import modell.Nodo;
import modell.Producto;


public class frmColasPilas extends javax.swing.JFrame {

    Cola cola = new Cola(20);
    PilaLista pl = new PilaLista();
    int pos;

    public frmColasPilas() {
        initComponents();
        inicio();
        llenarCombo();
        llenarComboPila();
    }
    
    
    void muestraTablaPilal(){
        DefaultTableModel df1 = (DefaultTableModel) tblPila.getModel();
        df1.setRowCount(0);
//        int i=0;
        Nodo p = pl.getTope();
        
        while(p!=null){
//            cadena += p.getNombre()+"\t";
            Object v[] = {p.getProducto().getCodigo(), p.getProducto().getNombre(), p.getProducto().getMarca(), p.getProducto().getFechaVencimiento(), p.getProducto().getCantidad(), p.getProducto().getPrecio()};
            df1.addRow(v);
            p=p.getSgteNodo();
        }
        
        
    }
    
    
    void llenarCombo(){
        cbxCantidadCola.addItem("Seleccione");
        for(int j=1; j<=100; j++){
            cbxCantidadCola.addItem(j+"");
        }
    }
    
    void llenarComboPila(){
        cbxCantidadPila.addItem("Seleccione");
        for(int j=1; j<=100; j++){
            cbxCantidadPila.addItem(j+"");
        }
    }
    
    void muestraTablaCola(){
        DefaultTableModel df = (DefaultTableModel) tblCola.getModel();
        df.setRowCount(0);
        Producto x[] = cola.getCola();
        for(int i=cola.getPrimero(); i<=cola.getUltimo();i++){
            Object v[] = {x[i].getCodigo(), x[i].getNombre(), x[i].getMarca(), x[i].getFechaVencimiento(), x[i].getCantidad(), x[i].getPrecio()};
            df.addRow(v);
        }
    }
    
    
    void inicio(){
        txtNombreCola.setEnabled(false);txtNombrePila.setEnabled(false);
        txtFechaCola.setEnabled(false);txtFechaPila.setEnabled(false);
        txtMarcaCola.setEnabled(false);txtMarcaPila.setEnabled(false);
        txtPrecioCola.setEnabled(false);txtPrecioPila.setEnabled(false);
        cbxCantidadCola.setEnabled(false);cbxCantidadPila.setEnabled(false);
        btnInsertarCola.setEnabled(false);btnInsertarPila.setEnabled(false);
        btnEliminarCola.setEnabled(false);btnEliminarPila.setEnabled(false);
    }
    
    void eliminaCola(){
        
        cola.eliminarElemento();
        muestraTablaCola();
        inicio();
    }
    
    void nuevo(){
        btnInsertarCola.setEnabled(true);
        txtNombreCola.setEnabled(true);
        txtFechaCola.setEnabled(true);
        txtMarcaCola.setEnabled(true);
        txtPrecioCola.setEnabled(true);
        cbxCantidadCola.setEnabled(true);
        btnEliminarCola.setEnabled(false);
    }
    
    void nuevoPila(){
        btnInsertarPila.setEnabled(true);
        txtNombrePila.setEnabled(true);
        txtFechaPila.setEnabled(true);
        txtMarcaPila.setEnabled(true);
        txtPrecioPila.setEnabled(true);
        cbxCantidadPila.setEnabled(true);
        btnEliminarPila.setEnabled(false);
    }
    
    void limpiarCampos(){
        txtNombreCola.setText("");
        txtFechaCola.setText("");
        txtMarcaCola.setText("");
        txtPrecioCola.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPila = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnInsertarPila = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnNuevoPila = new javax.swing.JButton();
        btnCancelarPila = new javax.swing.JButton();
        btnEliminarPila = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCodigoPila = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNombrePila = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPrecioPila = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFechaPila = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMarcaPila = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cbxCantidadPila = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoCola = new javax.swing.JTextField();
        txtNombreCola = new javax.swing.JTextField();
        txtPrecioCola = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarcaCola = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaCola = new javax.swing.JTextField();
        cbxCantidadCola = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnInsertarCola = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNuevoCola = new javax.swing.JButton();
        btnCancelarCola = new javax.swing.JButton();
        btnEliminarCola = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCola = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "INDICE"));

        jButton2.setText("Cola con Prioridad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cola Circular");

        jButton4.setText("Lista por nombre");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true), "INTEGRANTES"));

        jLabel11.setText("* Roberto Junior Benitez Cruzado");

        jLabel12.setText("* Cerquin Ccanto, Carlos Alberto");

        jLabel13.setText("* Fernández Mena, Mayra");

        jLabel14.setText("* Torres Castillo, Jhon Paul");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jButton1.setText("Lista Enlazada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        tblPila.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPilaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPila);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Panel Register"));

        btnInsertarPila.setText("Insertar");
        btnInsertarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPilaActionPerformed(evt);
            }
        });

        jLabel15.setText("Insertar a una lista enlaza:");

        jLabel16.setText("Nuevo:");

        btnNuevoPila.setText("Nuevo");
        btnNuevoPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPilaActionPerformed(evt);
            }
        });

        btnCancelarPila.setText("Cancelar");
        btnCancelarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPilaActionPerformed(evt);
            }
        });

        btnEliminarPila.setText("Eliminar");
        btnEliminarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnNuevoPila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(btnCancelarPila)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarPila, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(btnInsertarPila, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btnNuevoPila)
                    .addComponent(btnCancelarPila))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(btnInsertarPila)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarPila)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel17.setText("Codigo:");

        txtCodigoPila.setEditable(false);

        jLabel18.setText("Nombre:");

        jLabel19.setText("Precio:");

        jLabel20.setText("Fecha de Vencimiento:");

        txtFechaPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaPilaActionPerformed(evt);
            }
        });

        jLabel21.setText("Marca:");

        jLabel22.setText("Cantidad:");

        cbxCantidadPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCantidadPilaActionPerformed(evt);
            }
        });

        jLabel10.setText("Resultados:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFechaPila, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMarcaPila, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbxCantidadPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCodigoPila, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombrePila, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioPila, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCodigoPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtNombrePila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtPrecioPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(txtFechaPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(txtMarcaPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel22))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxCantidadPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Pilas", jPanel2);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Fecha de Vencimiento:");

        txtCodigoCola.setEditable(false);

        jLabel5.setText("Marca:");

        jLabel6.setText("Cantidad:");

        txtFechaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaColaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Panel Register"));

        btnInsertarCola.setText("Insertar");
        btnInsertarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarColaActionPerformed(evt);
            }
        });

        jLabel8.setText("Insertar en un arreglo:");

        jLabel7.setText("Nuevo:");

        btnNuevoCola.setText("Nuevo");
        btnNuevoCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoColaActionPerformed(evt);
            }
        });

        btnCancelarCola.setText("Cancelar");
        btnCancelarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarColaActionPerformed(evt);
            }
        });

        btnEliminarCola.setText("Eliminar");
        btnEliminarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarCola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertarCola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNuevoCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(btnCancelarCola)))
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnNuevoCola)
                    .addComponent(btnCancelarCola))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addComponent(btnInsertarCola)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCola)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel9.setText("Resultados:");

        tblCola.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCola);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaCola, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(txtMarcaCola))
                                .addComponent(cbxCantidadCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigoCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigoCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecioCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtMarcaCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxCantidadCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cola", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaColaActionPerformed

    private void txtFechaPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaPilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaPilaActionPerformed

    private void btnNuevoPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPilaActionPerformed
        nuevoPila();
    }//GEN-LAST:event_btnNuevoPilaActionPerformed

    private void btnInsertarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPilaActionPerformed
        String nombre = txtNombrePila.getText();
        String marca = txtMarcaPila.getText();
        String fecha = txtFechaPila.getText();
        int cant = Integer.parseInt(cbxCantidadPila.getSelectedItem().toString()) ;
        double precio = Double.parseDouble(txtPrecioPila.getText());
        
        Producto p = new Producto(nombre, marca, precio, cant, fecha);
        pl.insertaElemento(p);
        muestraTablaPilal();
        inicio();
    }//GEN-LAST:event_btnInsertarPilaActionPerformed

    private void btnEliminarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPilaActionPerformed
        pl.eliminaElemento();
        muestraTablaPilal();
        inicio();
    }//GEN-LAST:event_btnEliminarPilaActionPerformed

    private void btnNuevoColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoColaActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoColaActionPerformed

    private void btnCancelarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPilaActionPerformed
        inicio();
    }//GEN-LAST:event_btnCancelarPilaActionPerformed

    private void btnCancelarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarColaActionPerformed
        inicio();
    }//GEN-LAST:event_btnCancelarColaActionPerformed

    private void btnInsertarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarColaActionPerformed
        String nombre = txtNombreCola.getText();
        String marca = txtMarcaCola.getText();
        String fecha = txtFechaCola.getText();
        int cant = Integer.parseInt(cbxCantidadCola.getSelectedItem().toString()) ;
        double precio = Double.parseDouble(txtPrecioCola.getText());
        
        Producto p = new Producto(nombre, marca, precio, cant, fecha);
        cola.insertarProducto(p);
        System.out.println(cola.imprimirCola());
        muestraTablaCola();
        inicio();
    }//GEN-LAST:event_btnInsertarColaActionPerformed

    private void tblColaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColaMouseClicked
        pos = tblCola.getSelectedRow();
        txtCodigoCola.setText(tblCola.getValueAt(pos, 0).toString());
        txtNombreCola.setText(tblCola.getValueAt(pos, 1).toString());
        txtMarcaCola.setText(tblCola.getValueAt(pos, 2).toString());
        txtPrecioCola.setText(tblCola.getValueAt(pos, 5).toString());
        cbxCantidadCola.setSelectedItem(tblCola.getValueAt(pos, 4).toString());
        txtFechaCola.setText(tblCola.getValueAt(pos, 3).toString());

        inicio();btnEliminarCola.setEnabled(true);
    }//GEN-LAST:event_tblColaMouseClicked

    private void btnEliminarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarColaActionPerformed

        eliminaCola();
    }//GEN-LAST:event_btnEliminarColaActionPerformed

    private void cbxCantidadPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCantidadPilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCantidadPilaActionPerformed

    private void tblPilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPilaMouseClicked
        pos = tblPila.getSelectedRow();
        txtCodigoPila.setText(tblPila.getValueAt(pos, 0).toString());
        txtNombrePila.setText(tblPila.getValueAt(pos, 1).toString());
        txtMarcaPila.setText(tblPila.getValueAt(pos, 2).toString());
        txtPrecioPila.setText(tblPila.getValueAt(pos, 5).toString());
        cbxCantidadPila.setSelectedItem(tblPila.getValueAt(pos, 4).toString());
        txtFechaPila.setText(tblPila.getValueAt(pos, 3).toString());

        inicio();btnEliminarPila.setEnabled(true);
    }//GEN-LAST:event_tblPilaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //creamos variable abrir
        frmColaPrioridad ver=new frmColaPrioridad();
        //metodo para ver la ventana Conf.Destino
        ver.setVisible(true);
        //ocultar ventana actual
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmListasEnlazas ver=new frmListasEnlazas();
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
            java.util.logging.Logger.getLogger(frmColasPilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmColasPilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmColasPilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmColasPilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmColasPilas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCola;
    private javax.swing.JButton btnCancelarPila;
    private javax.swing.JButton btnEliminarCola;
    private javax.swing.JButton btnEliminarPila;
    private javax.swing.JButton btnInsertarCola;
    private javax.swing.JButton btnInsertarPila;
    private javax.swing.JButton btnNuevoCola;
    private javax.swing.JButton btnNuevoPila;
    private javax.swing.JComboBox<String> cbxCantidadCola;
    private javax.swing.JComboBox<String> cbxCantidadPila;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCola;
    private javax.swing.JTable tblPila;
    private javax.swing.JTextField txtCodigoCola;
    private javax.swing.JTextField txtCodigoPila;
    private javax.swing.JTextField txtFechaCola;
    private javax.swing.JTextField txtFechaPila;
    private javax.swing.JTextField txtMarcaCola;
    private javax.swing.JTextField txtMarcaPila;
    private javax.swing.JTextField txtNombreCola;
    private javax.swing.JTextField txtNombrePila;
    private javax.swing.JTextField txtPrecioCola;
    private javax.swing.JTextField txtPrecioPila;
    // End of variables declaration//GEN-END:variables
}
