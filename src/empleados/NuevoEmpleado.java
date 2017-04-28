
package empleados;

import javax.swing.JOptionPane;
import metodosSQL.Metodos;


public class NuevoEmpleado extends javax.swing.JFrame {

   
    public NuevoEmpleado() {
        initComponents();
    }

    private void limpiarCampos(){
        NombreEmpleado.setText("");
        apellidosEmpleado.setText("");
        sueldoEmpleado.setText("");
        telefonoEmpleado.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        invMinimoLabel = new javax.swing.JLabel();
        precioCostoLabel = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JTextField();
        apellidosEmpleado = new javax.swing.JTextField();
        precioCostoLabel1 = new javax.swing.JLabel();
        precioCostoLabel2 = new javax.swing.JLabel();
        telefonoEmpleado = new javax.swing.JTextField();
        sueldoEmpleado = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Registro de Empleados");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/variosUSr.png"))); // NOI18N

        invMinimoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        invMinimoLabel.setText("Nombre:");

        precioCostoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        precioCostoLabel.setText("Apellidos:");

        NombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreEmpleadoKeyPressed(evt);
            }
        });

        apellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosEmpleadoActionPerformed(evt);
            }
        });
        apellidosEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                apellidosEmpleadoKeyPressed(evt);
            }
        });

        precioCostoLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        precioCostoLabel1.setText("Telefono:");

        precioCostoLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        precioCostoLabel2.setText("Sueldo:");

        telefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoEmpleadoActionPerformed(evt);
            }
        });
        telefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoEmpleadoKeyPressed(evt);
            }
        });

        sueldoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sueldoEmpleadoKeyPressed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add User Group Woman Man-48.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return-48.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precioCostoLabel)
                            .addComponent(invMinimoLabel)
                            .addComponent(precioCostoLabel1)
                            .addComponent(precioCostoLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65)
                .addComponent(btnGuardar)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invMinimoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioCostoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioCostoLabel1)
                    .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioCostoLabel2)
                    .addComponent(sueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnGuardar))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void apellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosEmpleadoActionPerformed

    private void telefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoEmpleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Empleados vtnEmp = new Empleados();
        vtnEmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       String nombre = NombreEmpleado.getText().toUpperCase();
       String apellidos = apellidosEmpleado.getText().toUpperCase();
       String telefono = telefonoEmpleado.getText();
       String sueldo = sueldoEmpleado.getText();
       
       Metodos ejecutaSql = new Metodos();
       
        try {
        if(!nombre.equals("") && !apellidos.equals("") && !telefono.equals("") && !sueldo.equals("")){
            float suel = Float.parseFloat(sueldo);
                 String sql = "insert into empleados (nombre, apellidos,telefono_emp, sueldo) values ('" +nombre+ "', '" +apellidos+ "', '" +telefono+"','"+suel+"')";       
                 ejecutaSql.ejecutaUpdate(sql);
                 JOptionPane.showMessageDialog(null,"Ha sido agregado exitosamente","Agregado",JOptionPane.INFORMATION_MESSAGE);
                 limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos.", "INFORMACIÓN", JOptionPane.WARNING_MESSAGE);
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error--->  \n " +e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void NombreEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreEmpleadoKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
            apellidosEmpleado.requestFocus();
        }
    }//GEN-LAST:event_NombreEmpleadoKeyPressed

    private void apellidosEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosEmpleadoKeyPressed
         if(evt.getKeyCode()== evt.VK_ENTER){
            telefonoEmpleado.requestFocus();
        }    }//GEN-LAST:event_apellidosEmpleadoKeyPressed

    private void telefonoEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoEmpleadoKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
            sueldoEmpleado.requestFocus();
        }
    }//GEN-LAST:event_telefonoEmpleadoKeyPressed

    private void sueldoEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoEmpleadoKeyPressed
         if(evt.getKeyCode()== evt.VK_ENTER){
           btnGuardar.doClick();
        }
    }//GEN-LAST:event_sueldoEmpleadoKeyPressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreEmpleado;
    private javax.swing.JTextField apellidosEmpleado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel invMinimoLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel precioCostoLabel;
    private javax.swing.JLabel precioCostoLabel1;
    private javax.swing.JLabel precioCostoLabel2;
    private javax.swing.JTextField sueldoEmpleado;
    private javax.swing.JTextField telefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
