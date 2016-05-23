package p2;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TecMarketInterfaz extends javax.swing.JFrame {
    public String variabImprimir = "";
    
    public TecMarketInterfaz() {
        initComponents();
        //Variables globales
        
        
        
        
        
        //JFrame
        
        //Bloquea el tamaño del jframe.
        setLayout(null);
        //No permite maximizar pantalla
        setResizable(false);
        //Tamaño del jframe principal
        setSize(800,600);
        //Ubicacion en la pantalla jframe
        setLocation(300,100);
        
        //Paneles
        
        //Panel principal
        panelPrincipal.setLayout(null);
        //Ubicacion y tamaño
        panelPrincipal.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo.setBounds(new Rectangle(15, 0, 766, 80));
        //Cuadro de buscar y combobox
        cbMenorDistanciaTiempo.setBounds(623, 87, 117, 24);
        textFieldBuscarProducto.setBounds(500, 87, 120, 25);
         //Botones.
        botonLupa.setBounds(745, 87,30,26);        
        //Agregar sucursal
        botonAgregarSucursal.setBounds(20, 160, 125,38);
        //Insertar camino
        botonInsertarCamino.setBounds(20, 220, 125,38);
        //Crear inventario
        botonCrearInventario.setBounds(20,280, 125,38);
        //Atender cliente
        botonAtenderCliente.setBounds(20,340, 125,38);
        //Generar reporte
        botonGenerarReporte.setBounds(20, 400, 125, 38); 
      
        //Panel agregar sucursales
        panelAgregarSucursales.setVisible(false);
        panelAgregarSucursales.setLayout(null);
        //Ubicacion y tamaño
        panelAgregarSucursales.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo2.setBounds(new Rectangle(0,0, 800, 60));
        //Boton atras
        atrasAgregarSucursal.setBounds(new Rectangle(20,60,52,48));
        //Panel que acomoda cosas
        // panelConCosasAgregarSucursales.setVisible(false);
        panelConCosasAgregarSucursales.setBounds(new Rectangle(90,100,650,450));
            
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        botonAgregarSucursal = new javax.swing.JButton();
        botonInsertarCamino = new javax.swing.JButton();
        botonCrearInventario = new javax.swing.JButton();
        textFieldBuscarProducto = new javax.swing.JTextField();
        cbMenorDistanciaTiempo = new javax.swing.JComboBox();
        botonLupa = new javax.swing.JButton();
        botonAtenderCliente = new javax.swing.JButton();
        botonGenerarReporte = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panelAgregarSucursales = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        atrasAgregarSucursal = new javax.swing.JButton();
        panelConCosasAgregarSucursales = new javax.swing.JPanel();
        labelAgregarSuc = new javax.swing.JLabel();
        labelNombreSucursal = new javax.swing.JLabel();
        labelNumEmpleados = new javax.swing.JLabel();
        labelInventarioProductos = new javax.swing.JLabel();
        TFNombreSucursal = new javax.swing.JTextField();
        TFNumEmpleados = new javax.swing.JTextField();
        TFInventarioDis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPaneProductosAgregadosInicial = new javax.swing.JTextPane();
        botonAñadir = new javax.swing.JButton();
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

        cbMenorDistanciaTiempo.setBackground(new java.awt.Color(204, 204, 204));
        cbMenorDistanciaTiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor distancia", "Menor tiempo" }));
        cbMenorDistanciaTiempo.setLightWeightPopupEnabled(false);

        botonLupa.setBackground(new java.awt.Color(255, 255, 255));
        botonLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.jpg"))); // NOI18N
        botonLupa.setBorderPainted(false);
        botonLupa.setFocusPainted(false);
        botonLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLupaActionPerformed(evt);
            }
        });

        botonAtenderCliente.setBackground(new java.awt.Color(204, 204, 204));
        botonAtenderCliente.setText("Atender cliente");
        botonAtenderCliente.setActionCommand("");
        botonAtenderCliente.setFocusPainted(false);
        botonAtenderCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonAtenderCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtenderCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtenderClienteActionPerformed(evt);
            }
        });

        botonGenerarReporte.setBackground(new java.awt.Color(204, 204, 204));
        botonGenerarReporte.setText("Generar reporte");
        botonGenerarReporte.setActionCommand("");
        botonGenerarReporte.setFocusPainted(false);
        botonGenerarReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonGenerarReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarReporteActionPerformed(evt);
            }
        });

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo.jpg"))); // NOI18N
        titulo.setInheritsPopupMenu(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbMenorDistanciaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCrearInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(botonAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(botonInsertarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botonAtenderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMenorDistanciaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(botonAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonInsertarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrearInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAtenderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        panelAgregarSucursales.setBackground(new java.awt.Color(255, 255, 255));

        titulo2.setBackground(new java.awt.Color(51, 51, 255));
        titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo2.jpg"))); // NOI18N
        titulo2.setInheritsPopupMenu(false);
        titulo2.setOpaque(true);

        atrasAgregarSucursal.setBackground(new java.awt.Color(255, 255, 255));
        atrasAgregarSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaAtras.jpg"))); // NOI18N
        atrasAgregarSucursal.setBorderPainted(false);
        atrasAgregarSucursal.setFocusPainted(false);
        atrasAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasAgregarSucursalActionPerformed(evt);
            }
        });

        panelConCosasAgregarSucursales.setBackground(new java.awt.Color(255, 255, 255));

        labelAgregarSuc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAgregarSuc.setText("Agregar nueva sucursal");

        labelNombreSucursal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreSucursal.setText("Nombre:");

        labelNumEmpleados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumEmpleados.setText("Número de empleados:");

        labelInventarioProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelInventarioProductos.setText("Inventario de productos disponibles:");

        TFNumEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNumEmpleadosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TPaneProductosAgregadosInicial);

        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasAgregarSucursalesLayout = new javax.swing.GroupLayout(panelConCosasAgregarSucursales);
        panelConCosasAgregarSucursales.setLayout(panelConCosasAgregarSucursalesLayout);
        panelConCosasAgregarSucursalesLayout.setHorizontalGroup(
            panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumEmpleados)
                    .addComponent(labelInventarioProductos))
                .addGap(44, 44, 44)
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(TFNombreSucursal)
                    .addComponent(TFNumEmpleados)
                    .addComponent(TFInventarioDis))
                .addGap(18, 18, 18)
                .addComponent(botonAñadir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAgregarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        panelConCosasAgregarSucursalesLayout.setVerticalGroup(
            panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                .addComponent(labelAgregarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNumEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInventarioProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFInventarioDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAñadir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelAgregarSucursalesLayout = new javax.swing.GroupLayout(panelAgregarSucursales);
        panelAgregarSucursales.setLayout(panelAgregarSucursalesLayout);
        panelAgregarSucursalesLayout.setHorizontalGroup(
            panelAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo2)
            .addGroup(panelAgregarSucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConCosasAgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAgregarSucursalesLayout.setVerticalGroup(
            panelAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarSucursalesLayout.createSequentialGroup()
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atrasAgregarSucursal)
                    .addComponent(panelConCosasAgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelAgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelAgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 112, Short.MAX_VALUE)))
        );

        panelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSucursalActionPerformed
    panelAgregarSucursales.setVisible(true);
    panelPrincipal.setVisible(false);
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

    private void botonLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLupaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLupaActionPerformed

    private void botonAtenderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtenderClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAtenderClienteActionPerformed

    private void botonGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGenerarReporteActionPerformed

    private void atrasAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasAgregarSucursalActionPerformed
        panelAgregarSucursales.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_atrasAgregarSucursalActionPerformed

    private void TFNumEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNumEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNumEmpleadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TFNombreSucursal.setText(null);
        TFNumEmpleados.setText(null);
        TFInventarioDis.setText(null);
        variabImprimir= "";
        TPaneProductosAgregadosInicial.setText(null);

        JOptionPane.showMessageDialog(panelConCosasAgregarSucursales, "Se ha agregado la información de la sucursal correctamente");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        String producto=null;
        producto =TFInventarioDis.getText();
        //variabImprimir = "";
        variabImprimir = variabImprimir+"\n"+ producto;
        TPaneProductosAgregadosInicial.setText(variabImprimir);
        TFInventarioDis.setText(null);

    }//GEN-LAST:event_botonAñadirActionPerformed
  public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecMarketInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFInventarioDis;
    private javax.swing.JTextField TFNombreSucursal;
    private javax.swing.JTextField TFNumEmpleados;
    private javax.swing.JTextPane TPaneProductosAgregadosInicial;
    private javax.swing.JButton atrasAgregarSucursal;
    private javax.swing.JButton botonAgregarSucursal;
    private javax.swing.JButton botonAtenderCliente;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCrearInventario;
    private javax.swing.JButton botonGenerarReporte;
    private javax.swing.JButton botonInsertarCamino;
    private javax.swing.JButton botonLupa;
    private javax.swing.JComboBox cbMenorDistanciaTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregarSuc;
    private javax.swing.JLabel labelInventarioProductos;
    private javax.swing.JLabel labelNombreSucursal;
    private javax.swing.JLabel labelNumEmpleados;
    private javax.swing.JPanel panelAgregarSucursales;
    private javax.swing.JPanel panelConCosasAgregarSucursales;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textFieldBuscarProducto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
