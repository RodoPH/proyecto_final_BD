package ventas;

import javax.swing.JOptionPane;
import metodosSQL.Metodos;

public class ArticuloNuevo extends javax.swing.JFrame {

    public ArticuloNuevo() {
        initComponents();
    }

    Metodos ejecutaSQL = new Metodos();

    private void limpiarCampos() {
        txtDescripcion.setText("");
        txtExistencia.setText("");
        txtDescripcion.setText("");
        txtDescripcion.setText("");
        txtCodigo.setText("");
        txtPrecioMayoreo.setText("");
        txtPrecioDetalle.setText("");
        txtPrecioVenta.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        descripcionLabel = new javax.swing.JLabel();
        comboUnidad = new javax.swing.JComboBox<>();
        txtExistencia = new javax.swing.JTextField();
        precioVentaLabel = new javax.swing.JLabel();
        precioMayoreoLabel = new javax.swing.JLabel();
        txtPrecioDetalle = new javax.swing.JTextField();
        existenciaLabel = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        departamentoLabel = new javax.swing.JLabel();
        txtPrecioMayoreo = new javax.swing.JTextField();
        invMinimoLabel = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        precioCostoLabel = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artículo nuevo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Artículos.png"))); // NOI18N
        jLabel1.setText("Agregando artículos");

        descripcionLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descripcionLabel.setText("Unidad:");

        comboUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza (s)", "Kilo (s)", "Arpilla (s)", "Reja (s)", "Caja (s)", "Rollo (s)", "Bultos (s) " }));
        comboUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUnidadActionPerformed(evt);
            }
        });
        comboUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboUnidadKeyPressed(evt);
            }
        });

        txtExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExistenciaKeyPressed(evt);
            }
        });

        precioVentaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precioVentaLabel.setText("Cantidad:");

        precioMayoreoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precioMayoreoLabel.setText("Precio Detalle : $");

        txtPrecioDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioDetalleKeyPressed(evt);
            }
        });

        existenciaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        existenciaLabel.setText("Precio venta: $");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyPressed(evt);
            }
        });

        departamentoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        departamentoLabel.setText("Precio Mayoreo: $");

        txtPrecioMayoreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioMayoreoKeyPressed(evt);
            }
        });

        invMinimoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        invMinimoLabel.setText("Código:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        precioCostoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precioCostoLabel.setText("Descripción:");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precioCostoLabel)
                            .addComponent(invMinimoLabel))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(descripcionLabel)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(precioVentaLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioMayoreoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(existenciaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(departamentoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecioDetalle)
                            .addComponent(txtPrecioMayoreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invMinimoLabel)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioCostoLabel))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioMayoreoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(existenciaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioMayoreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departamentoLabel))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionLabel)
                            .addComponent(comboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaLabel))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add Property-48.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit Sign-48.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void comboUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUnidadActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        String codigo = txtCodigo.getText();
        String descripcion = txtDescripcion.getText();
        String unidad = comboUnidad.getSelectedItem().toString();
        String pc = txtPrecioDetalle.getText();
        String pv = txtPrecioVenta.getText();
        String pm = txtPrecioMayoreo.getText();
        String cant = txtExistencia.getText();

        if (!pc.equals("") && !pv.equals("") && !pm.equals("") && !cant.equals("")) {
            float preCosto = Float.parseFloat(pc);
            float preVenta = Float.parseFloat(pv);
            float preMayo = Float.parseFloat(pm);
            int existencia = Integer.parseInt(cant);
            
             String sql = "insert into articulos (codigo, descripcion, unidad, existencia, precio_u, precio_Mmay, precio_May) values('" + codigo + "','" + descripcion + "','" + unidad + "','" + existencia + "','" + preCosto + "','" + preVenta + "','" + preMayo + "') ";
            ejecutaSQL.ejecutaUpdate(sql);
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Agregado exitosamente", "AGREGADO", JOptionPane.PLAIN_MESSAGE);

        } else{
                JOptionPane.showMessageDialog(null, "Escriba los datos necesarios", "Error", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            comboUnidad.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void comboUnidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboUnidadKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
           txtExistencia.requestFocus();
       }
    }//GEN-LAST:event_comboUnidadKeyPressed

    private void txtPrecioDetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioDetalleKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtPrecioVenta.requestFocus();
        }
    }//GEN-LAST:event_txtPrecioDetalleKeyPressed

    private void txtPrecioMayoreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMayoreoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            btnNuevo.doClick();
        }
    }//GEN-LAST:event_txtPrecioMayoreoKeyPressed

    private void txtPrecioVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtPrecioMayoreo.requestFocus();
        }
    }//GEN-LAST:event_txtPrecioVentaKeyPressed

    private void txtExistenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistenciaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtPrecioDetalle.requestFocus();
        }
              
    }//GEN-LAST:event_txtExistenciaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> comboUnidad;
    private javax.swing.JLabel departamentoLabel;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel existenciaLabel;
    private javax.swing.JLabel invMinimoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel precioCostoLabel;
    private javax.swing.JLabel precioMayoreoLabel;
    private javax.swing.JLabel precioVentaLabel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecioDetalle;
    private javax.swing.JTextField txtPrecioMayoreo;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
