package p2;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class TecMarketInterfaz extends javax.swing.JFrame {

    public TecMarketInterfaz() {
        initComponents();
        //Esto hace que se le pueda dar tamaño propio a los paneles de la interfaz.
        setLayout(null);
        //No permite maximizar pantalla
        setResizable(false);
        //Tamaño del jframe principal
        setSize(800,600);
        //Ubicacion en la pantalla jframe
        setLocation(300,100);
        //Ubicacion y tamaño del panelPrincipal
        panelPrincipal.setLayout(null);
        panelPrincipal.setBounds(0,0, 800, 600);
        titulo.setBounds(new Rectangle(15, 0, 766, 69));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        botonAgregarSucursal = new javax.swing.JButton();
        botonInsertarCamino = new javax.swing.JButton();
        botonCrearInventario = new javax.swing.JButton();
        textFieldBuscarProducto = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setDoubleBuffered(false);
        panelPrincipal.setMaximumSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo.jpg"))); // NOI18N
        titulo.setInheritsPopupMenu(false);

        botonAgregarSucursal.setBackground(new java.awt.Color(204, 204, 204));
        botonAgregarSucursal.setText("Agregar nueva sucursal");
        botonAgregarSucursal.setText("<html><p>Agregar nueva sucursal</p><p></p></html>");
        botonAgregarSucursal.setActionCommand("");
        botonAgregarSucursal.setFocusPainted(false);
        botonAgregarSucursal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonAgregarSucursal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarSucursalActionPerformed(evt);
            }
        });

        botonInsertarCamino.setBackground(new java.awt.Color(204, 204, 204));
        botonInsertarCamino.setText("Insertar camino");
        botonInsertarCamino.setActionCommand("");
        botonInsertarCamino.setFocusPainted(false);
        botonInsertarCamino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonInsertarCamino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonInsertarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarCaminoActionPerformed(evt);
            }
        });

        botonCrearInventario.setBackground(new java.awt.Color(204, 204, 204));
        botonCrearInventario.setText("Crear inventario");
        botonCrearInventario.setActionCommand("");
        botonCrearInventario.setFocusPainted(false);
        botonCrearInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCrearInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCrearInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearInventarioActionPerformed(evt);
            }
        });

        textFieldBuscarProducto.setText("Buscar producto");
        textFieldBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarProductoActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor distancia", "Menor tiempo" }));
        jComboBox1.setLightWeightPopupEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCrearInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsertarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(botonAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInsertarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrearInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarSucursalActionPerformed

    private void botonInsertarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarCaminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarCaminoActionPerformed

    private void botonCrearInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearInventarioActionPerformed

    private void textFieldBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
  public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecMarketInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarSucursal;
    private javax.swing.JButton botonCrearInventario;
    private javax.swing.JButton botonInsertarCamino;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textFieldBuscarProducto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
