
package ventas;

import clientes.Cliente;
import empleados.Empleados;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

   
    public Inicio() {
        initComponents();
    }

   private void vtnEmpleado(){
        Empleados ventana = new Empleados();
        escritorio.add(ventana);
        Dimension desk = this.escritorio.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desk.width - FrameSize.width)/2,(desk.height - FrameSize.height)/2);
        ventana.show();
   }
   public void vtnArticulos(){
        ArticulosE ventana = new ArticulosE();
        escritorio.add(ventana);
        Dimension desk = this.escritorio.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desk.width - FrameSize.width)/2,(desk.height - FrameSize.height)/2);
        ventana.show();
   }
 
   private void vtnClientes(){
        Cliente ventanaCli = new Cliente();
        escritorio.add(ventanaCli);
        Dimension desk = this.escritorio.getSize();
        Dimension FrameSize = ventanaCli.getSize();
        ventanaCli.setLocation((desk.width - FrameSize.width)/2,(desk.height - FrameSize.height)/2);
        ventanaCli.show();
   }
     
    private void vtnVenta(){
        Venta vtn = new Venta();
        escritorio.add(vtn);
        Dimension desk = this.escritorio.getSize();
        Dimension FrameSize = vtn.getSize();
        vtn.setLocation((desk.width - FrameSize.width)/2,(desk.height - FrameSize.height)/2);
        vtn.show();
   }
         
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnVentas1 = new javax.swing.JButton();
        btnArticulos1 = new javax.swing.JButton();
        btnClientes1 = new javax.swing.JButton();
        btnConcentrado1 = new javax.swing.JButton();
        btnEmpleados1 = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mVentas = new javax.swing.JMenu();
        menuArticulos = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        menuConcentrado = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIENDA DE ABARROTES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        escritorio.setBackground(new java.awt.Color(0, 153, 153));
        escritorio.setForeground(new java.awt.Color(72, 144, 98));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnVentas1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Venta.png"))); // NOI18N
        btnVentas1.setText("Ventas");
        btnVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas1ActionPerformed(evt);
            }
        });
        btnVentas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVentas1KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 46, 0, 0);
        jPanel1.add(btnVentas1, gridBagConstraints);

        btnArticulos1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnArticulos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Artículos.png"))); // NOI18N
        btnArticulos1.setText("Artículos");
        btnArticulos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulos1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 70, 0, 0);
        jPanel1.add(btnArticulos1, gridBagConstraints);

        btnClientes1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes_2.png"))); // NOI18N
        btnClientes1.setText("Clientes");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 55, 0, 36);
        jPanel1.add(btnClientes1, gridBagConstraints);

        btnConcentrado1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnConcentrado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        btnConcentrado1.setText("Concentrado");
        btnConcentrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrado1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 46, 54, 0);
        jPanel1.add(btnConcentrado1, gridBagConstraints);

        btnEmpleados1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEmpleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado.png"))); // NOI18N
        btnEmpleados1.setText("Empleados");
        btnEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleados1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 70, 54, 0);
        jPanel1.add(btnEmpleados1, gridBagConstraints);

        btnEmpleados.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit-96.png"))); // NOI18N
        btnEmpleados.setText("Salir");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 55, 54, 36);
        jPanel1.add(btnEmpleados, gridBagConstraints);

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        mVentas.setText("Ventas");

        menuArticulos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuArticulos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuArticulos.setText("Articulos");
        menuArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArticulosActionPerformed(evt);
            }
        });
        mVentas.add(menuArticulos);

        menuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuClientes.setText("Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        mVentas.add(menuClientes);

        menuConcentrado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuConcentrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuConcentrado.setText("Concentrado");
        mVentas.add(menuConcentrado);

        menuVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuVenta.setText("Venta");
        menuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaActionPerformed(evt);
            }
        });
        mVentas.add(menuVenta);

        menuEmpleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuEmpleados.setText("Empleados");
        menuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadosActionPerformed(evt);
            }
        });
        mVentas.add(menuEmpleados);
        mVentas.add(jSeparator1);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        mVentas.add(menuSalir);

        jMenuBar1.add(mVentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
   
    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        vtnClientes();
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArticulosActionPerformed
        vtnArticulos();
    }//GEN-LAST:event_menuArticulosActionPerformed

    private void menuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaActionPerformed
       vtnVenta();
    }//GEN-LAST:event_menuVentaActionPerformed

    private void menuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadosActionPerformed
       vtnEmpleado();
    }//GEN-LAST:event_menuEmpleadosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
      dispose();
      JOptionPane.showMessageDialog(null,"Hasta pronto","Saliendo del sistema..,",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnArticulos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulos1ActionPerformed
      vtnArticulos();
       
    }//GEN-LAST:event_btnArticulos1ActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        vtnClientes();
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed
        vtnVenta();
    }//GEN-LAST:event_btnVentas1ActionPerformed

    private void btnConcentrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConcentrado1ActionPerformed

    private void btnEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleados1ActionPerformed
            vtnEmpleado();
    }//GEN-LAST:event_btnEmpleados1ActionPerformed

    private void btnVentas1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVentas1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentas1KeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos1;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnConcentrado1;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEmpleados1;
    private javax.swing.JButton btnVentas1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mVentas;
    private javax.swing.JMenuItem menuArticulos;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuConcentrado;
    private javax.swing.JMenuItem menuEmpleados;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuVenta;
    // End of variables declaration//GEN-END:variables
}
