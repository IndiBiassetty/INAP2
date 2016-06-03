package p2;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Font; 
 

public class TecMarketInterfaz extends javax.swing.JFrame {
    public String variabImprimir = "";
    
    public TecMarketInterfaz() {
        initComponents();
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
     
//Panel Consultar/Modificar/Eliminar sucursal
        panelConsultarModificarSocursal.setVisible(false);
        panelConsultarModificarSocursal.setLayout(null);
        //Ubicacion y tamaño
        panelConsultarModificarSocursal.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo3.setBounds(new Rectangle(0,0, 800, 60));
        //Boton atras
        atrasConsultarModificar.setBounds(new Rectangle(20,60,52,48));
        labelConsultar.setBounds(new Rectangle(0,0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasConsultar.setBounds(new Rectangle(80,80,700,450));
        panelConCosasConsultar.setLayout(null);
        scrollConsultarSucursal.setBounds(new Rectangle(0,100,650,330));
        
//Panel caminos
        panelConsultarModificarCaminos.setVisible(false);
        panelConsultarModificarCaminos.setLayout(null);
        //Ubicacion y tamaño
        panelConsultarModificarCaminos.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo6.setBounds(new Rectangle(0,0, 800, 60));
        //Boton atras
        atrasConsultarModificarCaminos.setBounds(new Rectangle(20,60,52,48));
        labelConsultarCaminos.setBounds(new Rectangle(0,0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasConsultarCaminos.setBounds(new Rectangle(80,80,700,450));
        panelConCosasConsultarCaminos.setLayout(null);
        scrollConsultarCaminos.setBounds(new Rectangle(0,100,650,330));  
        
//Panel Agregar produtos
        panelAgregarProductos.setVisible(false);
        panelAgregarProductos.setLayout(null);
        //Ubicacion y tamaño
        panelAgregarProductos.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo7.setBounds(new Rectangle(0,0, 800, 60));
        //Boton atras
        atrasConsultarModificar.setBounds(new Rectangle(20,60,52,48));
        labelConsultarCaminos1.setBounds(new Rectangle(0,0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasAgregarProductos.setLayout(null);
        panelConCosasAgregarProductos.setBounds(new Rectangle(90,100,650,450));
        
            
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
        panelConsultarModificarSocursal = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        atrasConsultarModificar = new javax.swing.JButton();
        panelConCosasConsultar = new javax.swing.JPanel();
        labelNombreSucursal1 = new javax.swing.JLabel();
        botonVerConsultar = new javax.swing.JButton();
        cbConsultar = new javax.swing.JComboBox();
        labelConsultar = new javax.swing.JLabel();
        scrollConsultarSucursal = new javax.swing.JScrollPane();
        TPaneConsultarSucursales = new javax.swing.JTextPane();
        botonModificarConsultar = new javax.swing.JButton();
        botonEliminarSucursal = new javax.swing.JButton();
        panelConsultarModificarCaminos = new javax.swing.JPanel();
        titulo6 = new javax.swing.JLabel();
        atrasConsultarModificarCaminos = new javax.swing.JButton();
        panelConCosasConsultarCaminos = new javax.swing.JPanel();
        labelNombreSucursal3 = new javax.swing.JLabel();
        botonVerConsultarCaminos = new javax.swing.JButton();
        cbConsultarCaminos = new javax.swing.JComboBox();
        labelConsultarCaminos = new javax.swing.JLabel();
        scrollConsultarCaminos = new javax.swing.JScrollPane();
        TPaneConsultarCaminos = new javax.swing.JTextPane();
        botonModificarConsultarCaminos = new javax.swing.JButton();
        botonEliminarCaminos = new javax.swing.JButton();
        panelAgregarProductos = new javax.swing.JPanel();
        titulo7 = new javax.swing.JLabel();
        atrasInventario = new javax.swing.JButton();
        panelConCosasAgregarProductos = new javax.swing.JPanel();
        labelNombreSucursal4 = new javax.swing.JLabel();
        botonVerConsultarCaminos1 = new javax.swing.JButton();
        cbConsultarCaminos1 = new javax.swing.JComboBox();
        labelConsultarCaminos1 = new javax.swing.JLabel();
        scrollConsultarCaminos1 = new javax.swing.JScrollPane();
        TPaneConsultarCaminos1 = new javax.swing.JTextPane();
        botonModificarConsultarCaminos1 = new javax.swing.JButton();
        botonEliminarCaminos1 = new javax.swing.JButton();

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

        cbSucursal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar sucursal", "Consultar/Modificar" }));
        cbSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSucursalActionPerformed(evt);
            }
        });

        cbCamino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar camino", "Consultar/Modificar" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addContainerGap(507, Short.MAX_VALUE))
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
                        .addContainerGap())))
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

        panelConsultarModificarSocursal.setBackground(new java.awt.Color(255, 255, 255));

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

        botonVerConsultar.setText("Ver");
        botonVerConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerConsultarActionPerformed(evt);
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

        botonEliminarSucursal.setText("Eliminar");
        botonEliminarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarSucursalActionPerformed(evt);
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
                        .addGap(36, 36, 36)
                        .addComponent(botonVerConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarSucursal)
                        .addGap(0, 4, Short.MAX_VALUE)))
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
                    .addComponent(botonVerConsultar)
                    .addComponent(botonModificarConsultar)
                    .addComponent(botonEliminarSucursal))
                .addGap(18, 18, 18)
                .addComponent(scrollConsultarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConsultarModificarSocursalLayout = new javax.swing.GroupLayout(panelConsultarModificarSocursal);
        panelConsultarModificarSocursal.setLayout(panelConsultarModificarSocursalLayout);
        panelConsultarModificarSocursalLayout.setHorizontalGroup(
            panelConsultarModificarSocursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo3)
            .addGroup(panelConsultarModificarSocursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasConsultarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConCosasConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelConsultarModificarSocursalLayout.setVerticalGroup(
            panelConsultarModificarSocursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarModificarSocursalLayout.createSequentialGroup()
                .addComponent(titulo3)
                .addGroup(panelConsultarModificarSocursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultarModificarSocursalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasConsultarModificar))
                    .addGroup(panelConsultarModificarSocursalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelConCosasConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        panelConsultarModificarCaminos.setBackground(new java.awt.Color(255, 255, 255));

        titulo6.setBackground(new java.awt.Color(51, 51, 255));
        titulo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo2.jpg"))); // NOI18N
        titulo6.setInheritsPopupMenu(false);
        titulo6.setOpaque(true);

        atrasConsultarModificarCaminos.setBackground(new java.awt.Color(255, 255, 255));
        atrasConsultarModificarCaminos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaAtras.jpg"))); // NOI18N
        atrasConsultarModificarCaminos.setBorderPainted(false);
        atrasConsultarModificarCaminos.setFocusPainted(false);
        atrasConsultarModificarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasConsultarModificarCaminosActionPerformed(evt);
            }
        });

        panelConCosasConsultarCaminos.setBackground(new java.awt.Color(255, 255, 255));

        labelNombreSucursal3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreSucursal3.setText("Sucursal:");

        botonVerConsultarCaminos.setText("Ver");
        botonVerConsultarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerConsultarCaminosActionPerformed(evt);
            }
        });

        cbConsultarCaminos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelConsultarCaminos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConsultarCaminos.setText("Consultar caminos");

        TPaneConsultarCaminos.setEditable(false);
        scrollConsultarCaminos.setViewportView(TPaneConsultarCaminos);

        botonModificarConsultarCaminos.setText("Modificar");
        botonModificarConsultarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarConsultarCaminosActionPerformed(evt);
            }
        });

        botonEliminarCaminos.setText("Eliminar");
        botonEliminarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCaminosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasConsultarCaminosLayout = new javax.swing.GroupLayout(panelConCosasConsultarCaminos);
        panelConCosasConsultarCaminos.setLayout(panelConCosasConsultarCaminosLayout);
        panelConCosasConsultarCaminosLayout.setHorizontalGroup(
            panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addComponent(labelConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addGroup(panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasConsultarCaminosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollConsultarCaminos))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasConsultarCaminosLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal3)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonVerConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarCaminos)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        panelConCosasConsultarCaminosLayout.setVerticalGroup(
            panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addComponent(labelConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreSucursal3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerConsultarCaminos)
                    .addComponent(botonModificarConsultarCaminos)
                    .addComponent(botonEliminarCaminos))
                .addGap(18, 18, 18)
                .addComponent(scrollConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConsultarModificarCaminosLayout = new javax.swing.GroupLayout(panelConsultarModificarCaminos);
        panelConsultarModificarCaminos.setLayout(panelConsultarModificarCaminosLayout);
        panelConsultarModificarCaminosLayout.setHorizontalGroup(
            panelConsultarModificarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo6)
            .addGroup(panelConsultarModificarCaminosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasConsultarModificarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConCosasConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelConsultarModificarCaminosLayout.setVerticalGroup(
            panelConsultarModificarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarModificarCaminosLayout.createSequentialGroup()
                .addComponent(titulo6)
                .addGroup(panelConsultarModificarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultarModificarCaminosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasConsultarModificarCaminos))
                    .addGroup(panelConsultarModificarCaminosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelConCosasConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        panelAgregarProductos.setBackground(new java.awt.Color(255, 255, 255));

        titulo7.setBackground(new java.awt.Color(51, 51, 255));
        titulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo2.jpg"))); // NOI18N
        titulo7.setInheritsPopupMenu(false);
        titulo7.setOpaque(true);

        atrasInventario.setBackground(new java.awt.Color(255, 255, 255));
        atrasInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaAtras.jpg"))); // NOI18N
        atrasInventario.setBorderPainted(false);
        atrasInventario.setFocusPainted(false);
        atrasInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasInventarioActionPerformed(evt);
            }
        });

        panelConCosasAgregarProductos.setBackground(new java.awt.Color(255, 255, 255));

        labelNombreSucursal4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreSucursal4.setText("Sucursal:");

        botonVerConsultarCaminos1.setText("Ver");
        botonVerConsultarCaminos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerConsultarCaminos1ActionPerformed(evt);
            }
        });

        cbConsultarCaminos1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelConsultarCaminos1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConsultarCaminos1.setText("Agregar inventario");

        TPaneConsultarCaminos1.setEditable(false);
        scrollConsultarCaminos1.setViewportView(TPaneConsultarCaminos1);

        botonModificarConsultarCaminos1.setText("Modificar");
        botonModificarConsultarCaminos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarConsultarCaminos1ActionPerformed(evt);
            }
        });

        botonEliminarCaminos1.setText("Eliminar");
        botonEliminarCaminos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCaminos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasAgregarProductosLayout = new javax.swing.GroupLayout(panelConCosasAgregarProductos);
        panelConCosasAgregarProductos.setLayout(panelConCosasAgregarProductosLayout);
        panelConCosasAgregarProductosLayout.setHorizontalGroup(
            panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addComponent(labelConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollConsultarCaminos1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal4)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonVerConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarCaminos1)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        panelConCosasAgregarProductosLayout.setVerticalGroup(
            panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addComponent(labelConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreSucursal4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerConsultarCaminos1)
                    .addComponent(botonModificarConsultarCaminos1)
                    .addComponent(botonEliminarCaminos1))
                .addGap(18, 18, 18)
                .addComponent(scrollConsultarCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAgregarProductosLayout = new javax.swing.GroupLayout(panelAgregarProductos);
        panelAgregarProductos.setLayout(panelAgregarProductosLayout);
        panelAgregarProductosLayout.setHorizontalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo7)
            .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConCosasAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAgregarProductosLayout.setVerticalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                .addComponent(titulo7)
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasInventario))
                    .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelConCosasAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConsultarModificarSocursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(panelConsultarModificarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelConsultarModificarSocursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(panelConsultarModificarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(84, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        panelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSucursalActionPerformed
        
               
        JComboBox cbEliminarSucursal = new JComboBox();        
        JTextField campoNombre = new JTextField();
        JTextField campoCantEmple = new JTextField();
        String varAgregarNombre = null;

        
        if (cbSucursal.getSelectedItem()== "Agregar sucursal"){
            JCheckBox chBCrearInvent = new JCheckBox("Crear inventario");
             JPanel panelMsjAgregar = new JPanel(new GridLayout(0, 1));
             panelMsjAgregar.add(new JLabel("Nombre de la Sucursal:"));
             panelMsjAgregar.add(campoNombre);

             panelMsjAgregar.add(new JLabel("Cantidad de empleados:"));
             panelMsjAgregar.add(campoCantEmple);
             panelMsjAgregar.add(chBCrearInvent);
             int mensajeAgregarSucursal= JOptionPane.showConfirmDialog(panelPrincipal,panelMsjAgregar, "Agregar sucursal",JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);


             //Se agrega al cb de eliminar los nombres de las sucursales
             varAgregarNombre = campoNombre.getText();
             String varAgregarCantEmple = campoCantEmple.getText();
               
        }
        else{
            panelConsultarModificarSocursal.setVisible(true);
            panelPrincipal.setVisible(false);
        }
        
              
    }//GEN-LAST:event_botonBuscarSucursalActionPerformed

    private void botonCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCaminoActionPerformed
        
       // Object datoCB = cbCamino.getSelectedItem();
       // String datoCBString = String.valueOf(datoCB);
        
        JComboBox cbEliminarCamino = new JComboBox();
        JComboBox sucursalCamino = new JComboBox();
        JTextField campoCamino = new JTextField();
        
        if(cbCamino.getSelectedItem() == "Agregar camino"){
            
            JTextField campoDistKm = new JTextField();
            JTextField campoTiempo = new JTextField();
            JLabel ejemplo = new JLabel("Ejemplo: A-B-C");
            
            Font fuente=new Font("Tahoma", Font.ITALIC, 11);
            ejemplo.setFont(fuente);
            
            JPanel panelMsjAgregarCamino = new JPanel(new GridLayout(0, 1));
            panelMsjAgregarCamino.add(new JLabel("Sucursal:"));
            panelMsjAgregarCamino.add(sucursalCamino);            
            panelMsjAgregarCamino.add(new JLabel("Camino:"));
            panelMsjAgregarCamino.add(ejemplo);
            panelMsjAgregarCamino.add(campoCamino);
            panelMsjAgregarCamino.add(new JLabel("Distancia en km:"));
            panelMsjAgregarCamino.add(campoDistKm);
            panelMsjAgregarCamino.add(new JLabel("Tiempo de recorrido:"));
            panelMsjAgregarCamino.add(campoTiempo);
            
            int mensajeAgregarCamino= JOptionPane.showConfirmDialog(panelPrincipal,panelMsjAgregarCamino, "Agregar camino",JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

            String varAgregarCamino = campoCamino.getText();
            String varDistanciaKm = campoDistKm.getText();
            String varDuracion = campoTiempo.getText();
          //  cbEliminarCamino.addItem(datoCB);
            //chBCrearInvent isSelected()    
        }
        else if(cbCamino.getSelectedItem() == "Consultar/Modificar"){
                panelConsultarModificarCaminos.setVisible(true);
                panelPrincipal.setVisible(false);
            }
        else{
                JPanel panelMsjEliminar = new JPanel(new GridLayout(0, 1));
                
                panelMsjEliminar.add(new JLabel("Seleccione la sucursal:"));
                panelMsjEliminar.add(cbEliminarCamino);
                panelMsjEliminar.add(new JLabel("Camino a eliminar:"));
                panelMsjEliminar.add(campoCamino);
                
                int mensajeEliminarSucursal= JOptionPane.showConfirmDialog(panelPrincipal,panelMsjEliminar, "Eliminar sucursal",JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                
            
        }
        
        
    }//GEN-LAST:event_botonCaminoActionPerformed

    private void botonCrearInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearInventarioActionPerformed
      if (cbInventario.getSelectedItem()== "Insertar producto"){
          panelAgregarProductos.setVisible(true);
          panelPrincipal.setVisible(false);
      }
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

    private void cbSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSucursalActionPerformed

    private void cbInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInventarioActionPerformed

    private void atrasConsultarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasConsultarModificarActionPerformed
        panelConsultarModificarSocursal.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_atrasConsultarModificarActionPerformed

    private void botonVerConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarActionPerformed
  
    }//GEN-LAST:event_botonVerConsultarActionPerformed

    private void botonModificarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarActionPerformed
        //panelModificarSucursal.setVisible(true);
        //JOptionPane.showConfirmDialog(panelConCosasConsultar, evt);

    JTextField campoNombre = new JTextField();
    JTextField campoCantEmple = new JTextField();
    JPanel panelMsjModificar = new JPanel(new GridLayout(0, 1));
    panelMsjModificar.add(new JLabel("Nombre de la Sucursal:"));
    panelMsjModificar.add(campoNombre);
    panelMsjModificar.add(new JLabel("Cantidad de empleados:"));
    panelMsjModificar.add(campoCantEmple);
        
    int mensajeModificar = JOptionPane.showConfirmDialog(panelConsultarModificarSocursal,panelMsjModificar, "Modificar información",JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    
    String varCampoNombre = campoNombre.getText();
    String varCampoCantEmple = campoCantEmple.getText();
    
    if (mensajeModificar != JOptionPane.CANCEL_OPTION) {
        TPaneConsultarSucursales.setText(null);
        System.out.println("fgdfsgdsgds");
        //Si se agrega una variable para meter los datos hay que resetearla    
    }
    
    }//GEN-LAST:event_botonModificarConsultarActionPerformed

    private void botonEliminarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarSucursalActionPerformed
        Object selecionado = cbConsultar.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
        
        JOptionPane.showConfirmDialog(panelConsultarModificarSocursal,"¿Desea eliminar la sucursal?", "Eliminar",JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_botonEliminarSucursalActionPerformed

    private void atrasConsultarModificarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasConsultarModificarCaminosActionPerformed
        panelConsultarModificarCaminos.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_atrasConsultarModificarCaminosActionPerformed

    private void botonVerConsultarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarCaminosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerConsultarCaminosActionPerformed

    private void botonModificarConsultarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarCaminosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarConsultarCaminosActionPerformed

    private void botonEliminarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCaminosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarCaminosActionPerformed

    private void atrasInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasInventarioActionPerformed

    private void botonVerConsultarCaminos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarCaminos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerConsultarCaminos1ActionPerformed

    private void botonModificarConsultarCaminos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarCaminos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarConsultarCaminos1ActionPerformed

    private void botonEliminarCaminos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCaminos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarCaminos1ActionPerformed
  public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecMarketInterfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane TPaneConsultarCaminos;
    private javax.swing.JTextPane TPaneConsultarCaminos1;
    private javax.swing.JTextPane TPaneConsultarSucursales;
    private javax.swing.JButton atrasConsultarModificar;
    private javax.swing.JButton atrasConsultarModificarCaminos;
    private javax.swing.JButton atrasInventario;
    private javax.swing.JButton botonAtenderCliente;
    private javax.swing.JButton botonBuscarSucursal;
    private javax.swing.JButton botonCamino;
    private javax.swing.JButton botonCrearInventario;
    private javax.swing.JButton botonEliminarCaminos;
    private javax.swing.JButton botonEliminarCaminos1;
    private javax.swing.JButton botonEliminarSucursal;
    private javax.swing.JButton botonGenerarReporte;
    private javax.swing.JButton botonLupa;
    private javax.swing.JButton botonModificarConsultar;
    private javax.swing.JButton botonModificarConsultarCaminos;
    private javax.swing.JButton botonModificarConsultarCaminos1;
    private javax.swing.JButton botonVerConsultar;
    private javax.swing.JButton botonVerConsultarCaminos;
    private javax.swing.JButton botonVerConsultarCaminos1;
    private javax.swing.JComboBox cbCamino;
    private javax.swing.JComboBox cbConsultar;
    private javax.swing.JComboBox cbConsultarCaminos;
    private javax.swing.JComboBox cbConsultarCaminos1;
    private javax.swing.JComboBox cbInventario;
    private javax.swing.JComboBox cbMenorDistanciaTiempo;
    private javax.swing.JComboBox cbReporte;
    private javax.swing.JComboBox cbSucursal;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JLabel labelConsultarCaminos;
    private javax.swing.JLabel labelConsultarCaminos1;
    private javax.swing.JLabel labelNombreSucursal1;
    private javax.swing.JLabel labelNombreSucursal3;
    private javax.swing.JLabel labelNombreSucursal4;
    private javax.swing.JLabel lbCaminos;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbInventarios;
    private javax.swing.JLabel lbReportes;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JPanel panelAgregarProductos;
    private javax.swing.JPanel panelConCosasAgregarProductos;
    private javax.swing.JPanel panelConCosasConsultar;
    private javax.swing.JPanel panelConCosasConsultarCaminos;
    private javax.swing.JPanel panelConsultarModificarCaminos;
    private javax.swing.JPanel panelConsultarModificarSocursal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollConsultarCaminos;
    private javax.swing.JScrollPane scrollConsultarCaminos1;
    private javax.swing.JScrollPane scrollConsultarSucursal;
    private javax.swing.JTextField textFieldBuscarProducto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    // End of variables declaration//GEN-END:variables
}
