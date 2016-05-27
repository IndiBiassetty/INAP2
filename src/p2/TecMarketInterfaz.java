package p2;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.*;

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
        //Sucursal
        lbSucursal.setBounds(20, 120, 100,30);
        cbSucursal.setBounds(20, 150,140, 24);
        botonBuscarSucursal.setBounds(170,150,60,24);
        //Insertar camino
        lbCaminos.setBounds(20,200, 100,30);
        cbCamino.setBounds(20, 230,140, 24);
        botonCamino.setBounds(170,230,60,24);
        //Crear inventario
        lbInventarios.setBounds(20, 280, 110,30);
        cbInventario.setBounds(20, 310,140,24);
        botonCrearInventario.setBounds(170,310,60,24);
        //Generar reporte
        lbReportes.setBounds(20, 360, 100,30);
        cbReporte.setBounds(20, 390,140, 24);
        botonGenerarReporte.setBounds(170,390,60,24);
        //Atender cliente
        lbCliente.setBounds(20, 440, 100,30);
        botonAtenderCliente.setBounds(20,470,80,24);
        
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
   
        //Panel Consultar/Modificar sucursal
        panelConsultarModificar.setVisible(false);
        panelConsultarModificar.setLayout(null);
        //Ubicacion y tamaño
        panelConsultarModificar.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo3.setBounds(new Rectangle(0,0, 800, 60));
        //Boton atras
        atrasConsultarModificar.setBounds(new Rectangle(20,60,52,48));
        labelConsultar.setBounds(new Rectangle(0,0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasConsultar.setBounds(new Rectangle(90,100,650,450));
        panelConCosasConsultar.setLayout(null);
        scrollConsultarSucursal.setBounds(new Rectangle(0,100,600,330));
        //Modificar
        //panelModificarSucursal.setVisible(false);
       // panelModificarSucursal.setBounds(new Rectangle(0,100,500,330));
        
        
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        botonBuscarSucursal = new javax.swing.JButton();
        botonCamino = new javax.swing.JButton();
        botonCrearInventario = new javax.swing.JButton();
        textFieldBuscarProducto = new javax.swing.JTextField();
        cbMenorDistanciaTiempo = new javax.swing.JComboBox();
        botonLupa = new javax.swing.JButton();
        botonAtenderCliente = new javax.swing.JButton();
        botonGenerarReporte = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        lbCaminos = new javax.swing.JLabel();
        lbInventarios = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        lbReportes = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox();
        cbCamino = new javax.swing.JComboBox();
        cbInventario = new javax.swing.JComboBox();
        cbReporte = new javax.swing.JComboBox();
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
        guardarAgregarSucursal = new javax.swing.JButton();
        panelConsultarModificar = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        atrasConsultarModificar = new javax.swing.JButton();
        panelConCosasConsultar = new javax.swing.JPanel();
        labelNombreSucursal1 = new javax.swing.JLabel();
        botonBuscarConsultar = new javax.swing.JButton();
        cbConsultar = new javax.swing.JComboBox();
        labelConsultar = new javax.swing.JLabel();
        scrollConsultarSucursal = new javax.swing.JScrollPane();
        TPaneConsultarSucursales = new javax.swing.JTextPane();
        botonModificarConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setDoubleBuffered(false);
        panelPrincipal.setMaximumSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));

        botonBuscarSucursal.setBackground(new java.awt.Color(204, 204, 204));
        botonBuscarSucursal.setText("Ver");
        //botonBuscarSucursal.setText("<html><p>Agregar nueva sucursal</p><p></p></html>");
        botonBuscarSucursal.setActionCommand("");
        botonBuscarSucursal.setFocusPainted(false);
        botonBuscarSucursal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonBuscarSucursal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBuscarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarSucursalActionPerformed(evt);
            }
        });

        botonCamino.setBackground(new java.awt.Color(204, 204, 204));
        botonCamino.setText("Ver");
        botonCamino.setActionCommand("");
        botonCamino.setFocusPainted(false);
        botonCamino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCamino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCaminoActionPerformed(evt);
            }
        });

        botonCrearInventario.setBackground(new java.awt.Color(204, 204, 204));
        botonCrearInventario.setText("Ver");
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
        botonAtenderCliente.setText("Atender");
        botonAtenderCliente.setActionCommand("");
        botonAtenderCliente.setFocusPainted(false);
        botonAtenderCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonAtenderCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonAtenderCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtenderClienteActionPerformed(evt);
            }
        });

        botonGenerarReporte.setBackground(new java.awt.Color(204, 204, 204));
        botonGenerarReporte.setText("Ver");
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

        lbSucursal.setBackground(new java.awt.Color(255, 255, 255));
        lbSucursal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSucursal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSucursal.setText("SUCURSALES");

        lbCaminos.setBackground(new java.awt.Color(255, 255, 255));
        lbCaminos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCaminos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCaminos.setText("CAMINOS");

        lbInventarios.setBackground(new java.awt.Color(255, 255, 255));
        lbInventarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbInventarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbInventarios.setText("INVENTARIOS");

        lbCliente.setBackground(new java.awt.Color(255, 255, 255));
        lbCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCliente.setText("CLIENTE");

        lbReportes.setBackground(new java.awt.Color(255, 255, 255));
        lbReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbReportes.setText("REPORTES");

        cbSucursal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar sucursal", "Consultar/Modificar", "Eliminar" }));
        cbSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSucursalActionPerformed(evt);
            }
        });

        cbCamino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar camino", "Consultar/Modificar", "Eliminar" }));

        cbInventario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar producto", "Consultar/Modificar", "Eliminar" }));
        cbInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInventarioActionPerformed(evt);
            }
        });

        cbReporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sucursal específica", "Todas sucursales" }));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonCrearInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBuscarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbInventarios)
                            .addComponent(cbInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAtenderCliente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cbMenorDistanciaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
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
                .addGap(35, 35, 35)
                .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarSucursal))
                .addGap(37, 37, 37)
                .addComponent(lbCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCamino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCamino))
                .addGap(40, 40, 40)
                .addComponent(lbInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCrearInventario))
                .addGap(26, 26, 26)
                .addComponent(lbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGenerarReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAtenderCliente)
                .addGap(48, 48, 48))
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

        TPaneProductosAgregadosInicial.setEditable(false);
        jScrollPane1.setViewportView(TPaneProductosAgregadosInicial);

        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        guardarAgregarSucursal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        guardarAgregarSucursal.setText("Guardar");
        guardarAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAgregarSucursalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasAgregarSucursalesLayout = new javax.swing.GroupLayout(panelConCosasAgregarSucursales);
        panelConCosasAgregarSucursales.setLayout(panelConCosasAgregarSucursalesLayout);
        panelConCosasAgregarSucursalesLayout.setHorizontalGroup(
            panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(guardarAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(botonAñadir))
                    .addComponent(labelAgregarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelConCosasAgregarSucursalesLayout.setVerticalGroup(
            panelConCosasAgregarSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarSucursalesLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelAgregarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(guardarAgregarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        panelConsultarModificar.setBackground(new java.awt.Color(255, 255, 255));

        titulo3.setBackground(new java.awt.Color(51, 51, 255));
        titulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo2.jpg"))); // NOI18N
        titulo3.setInheritsPopupMenu(false);
        titulo3.setOpaque(true);

        atrasConsultarModificar.setBackground(new java.awt.Color(255, 255, 255));
        atrasConsultarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaAtras.jpg"))); // NOI18N
        atrasConsultarModificar.setBorderPainted(false);
        atrasConsultarModificar.setFocusPainted(false);
        atrasConsultarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasConsultarModificarActionPerformed(evt);
            }
        });

        panelConCosasConsultar.setBackground(new java.awt.Color(255, 255, 255));

        labelNombreSucursal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreSucursal1.setText("Sucursal:");

        botonBuscarConsultar.setText("Buscar");
        botonBuscarConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarConsultarActionPerformed(evt);
            }
        });

        cbConsultar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelConsultar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConsultar.setText("Consultar sucursal");

        TPaneConsultarSucursales.setEditable(false);
        scrollConsultarSucursal.setViewportView(TPaneConsultarSucursales);

        botonModificarConsultar.setText("Modificar");
        botonModificarConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasConsultarLayout = new javax.swing.GroupLayout(panelConCosasConsultar);
        panelConCosasConsultar.setLayout(panelConCosasConsultarLayout);
        panelConCosasConsultarLayout.setHorizontalGroup(
            panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarLayout.createSequentialGroup()
                .addComponent(labelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasConsultarLayout.createSequentialGroup()
                .addGroup(panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollConsultarSucursal))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasConsultarLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal1)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(botonBuscarConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(botonModificarConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        panelConCosasConsultarLayout.setVerticalGroup(
            panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarLayout.createSequentialGroup()
                .addComponent(labelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarConsultar)
                    .addComponent(botonModificarConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollConsultarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConsultarModificarLayout = new javax.swing.GroupLayout(panelConsultarModificar);
        panelConsultarModificar.setLayout(panelConsultarModificarLayout);
        panelConsultarModificarLayout.setHorizontalGroup(
            panelConsultarModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo3)
            .addGroup(panelConsultarModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasConsultarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConCosasConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelConsultarModificarLayout.setVerticalGroup(
            panelConsultarModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarModificarLayout.createSequentialGroup()
                .addComponent(titulo3)
                .addGroup(panelConsultarModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultarModificarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasConsultarModificar))
                    .addGroup(panelConsultarModificarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelConCosasConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelAgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConsultarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelAgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 182, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelConsultarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );

        panelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSucursalActionPerformed
        if(cbSucursal.getSelectedItem() == "Agregar sucursal"){
            panelAgregarSucursales.setVisible(true);
            panelPrincipal.setVisible(false);
        }
        else{
            if(cbSucursal.getSelectedItem() == "Consultar/Modificar"){
                panelConsultarModificar.setVisible(true);
                panelPrincipal.setVisible(false);
            }
        }
    }//GEN-LAST:event_botonBuscarSucursalActionPerformed

    private void botonCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCaminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCaminoActionPerformed

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

    private void guardarAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAgregarSucursalActionPerformed
        TFNombreSucursal.setText(null);
        TFNumEmpleados.setText(null);
        TFInventarioDis.setText(null);
        variabImprimir= "";
        TPaneProductosAgregadosInicial.setText(null);

        JOptionPane.showMessageDialog(panelConCosasAgregarSucursales, "Se ha agregado la información de la sucursal correctamente");

    }//GEN-LAST:event_guardarAgregarSucursalActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        String producto=null;
        producto =TFInventarioDis.getText();
        //variabImprimir = "";
        variabImprimir = variabImprimir+"\n"+ producto;
        TPaneProductosAgregadosInicial.setText(variabImprimir);
        TFInventarioDis.setText(null);

    }//GEN-LAST:event_botonAñadirActionPerformed

    private void cbSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSucursalActionPerformed

    private void cbInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInventarioActionPerformed

    private void atrasConsultarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasConsultarModificarActionPerformed
        panelConsultarModificar.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_atrasConsultarModificarActionPerformed

    private void botonBuscarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarConsultarActionPerformed

    private void botonModificarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarActionPerformed
        //panelModificarSucursal.setVisible(true);
        //JOptionPane.showConfirmDialog(panelConCosasConsultar, evt);

    JTextField campoNombre = new JTextField();
    campoNombre.setText("");
    JTextField campoCantEmple = new JTextField();
    campoCantEmple.setText("");
    JPanel panelMsjModificar = new JPanel(new GridLayout(0, 1));
    panelMsjModificar.add(new JLabel("Nombre de la Sucursal:"));
    panelMsjModificar.add(campoNombre);
    panelMsjModificar.add(new JLabel("Cantidad de empleados:"));
    panelMsjModificar.add(campoCantEmple);
        
    int mensajeModificar = JOptionPane.showConfirmDialog(panelConsultarModificar,panelMsjModificar, "Modificar información",JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    
    String varCampoNombre = campoNombre.getText();
    String varCampoCantEmple = campoCantEmple.getText();
    
    }//GEN-LAST:event_botonModificarConsultarActionPerformed
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
    private javax.swing.JTextPane TPaneConsultarSucursales;
    private javax.swing.JTextPane TPaneProductosAgregadosInicial;
    private javax.swing.JButton atrasAgregarSucursal;
    private javax.swing.JButton atrasConsultarModificar;
    private javax.swing.JButton botonAtenderCliente;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonBuscarConsultar;
    private javax.swing.JButton botonBuscarSucursal;
    private javax.swing.JButton botonCamino;
    private javax.swing.JButton botonCrearInventario;
    private javax.swing.JButton botonGenerarReporte;
    private javax.swing.JButton botonLupa;
    private javax.swing.JButton botonModificarConsultar;
    private javax.swing.JComboBox cbCamino;
    private javax.swing.JComboBox cbConsultar;
    private javax.swing.JComboBox cbInventario;
    private javax.swing.JComboBox cbMenorDistanciaTiempo;
    private javax.swing.JComboBox cbReporte;
    private javax.swing.JComboBox cbSucursal;
    private javax.swing.JButton guardarAgregarSucursal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregarSuc;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JLabel labelInventarioProductos;
    private javax.swing.JLabel labelNombreSucursal;
    private javax.swing.JLabel labelNombreSucursal1;
    private javax.swing.JLabel labelNumEmpleados;
    private javax.swing.JLabel lbCaminos;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbInventarios;
    private javax.swing.JLabel lbReportes;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JPanel panelAgregarSucursales;
    private javax.swing.JPanel panelConCosasAgregarSucursales;
    private javax.swing.JPanel panelConCosasConsultar;
    private javax.swing.JPanel panelConsultarModificar;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollConsultarSucursal;
    private javax.swing.JTextField textFieldBuscarProducto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
