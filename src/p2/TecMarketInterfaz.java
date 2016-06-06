package p2;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Font;
//Se importa el grafo
import p2.*;

public class TecMarketInterfaz extends javax.swing.JFrame {

//Estructuras
    Grafo cadenaSupermercados = new Grafo();

//Variables globales
    public String variabImprimir = "";
    public String variabImprimir2 = "";
    public String variabImprimir3 = "";
    public String tab = "\t";
    public String enter = "\n";

    public TecMarketInterfaz() {
        initComponents();

//JFrame
        //Bloquea el tamaño del jframe.
        setLayout(null);
        //No permite maximizar pantalla
        setResizable(false);
        //Tamaño del jframe principal
        setSize(800, 600);
        //Ubicacion en la pantalla jframe
        setLocation(300, 100);

//Paneles
//Panel principal
        panelPrincipal.setLayout(null);
        //Ubicacion y tamaño
        panelPrincipal.setBounds(0, 0, 800, 600);
        //Ubicacion del titulo
        titulo.setBounds(new Rectangle(15, 0, 766, 80));
        //Cuadro de buscar y combobox
        cbMenorDistanciaTiempo.setBounds(623, 87, 117, 24);
        textFieldBuscarProducto.setBounds(500, 87, 120, 25);
        //Botones.
        botonLupa.setBounds(745, 87, 30, 26);
        //Sucursal
        lbSucursal.setBounds(20, 120, 100, 30);
        cbSucursal.setBounds(20, 150, 140, 24);
        botonBuscarSucursal.setBounds(170, 150, 60, 24);
        //Insertar camino
        lbCaminos.setBounds(20, 200, 100, 30);
        cbCamino.setBounds(20, 230, 140, 24);
        botonCamino.setBounds(170, 230, 60, 24);
        //Crear inventario
        lbInventarios.setBounds(20, 280, 110, 30);
        cbInventario.setBounds(20, 310, 140, 24);
        botonCrearInventario.setBounds(170, 310, 60, 24);
        //Generar reporte
        lbReportes.setBounds(20, 360, 100, 30);
        cbReporte.setBounds(20, 390, 140, 24);
        botonGenerarReporte.setBounds(170, 390, 60, 24);
        //Atender cliente
        lbCliente.setBounds(20, 440, 100, 30);
        botonAtenderCliente.setBounds(20, 470, 80, 24);

//Panel Consultar/Modificar/Eliminar sucursal
        panelConsultarModificarSocursal.setVisible(false);
        panelConsultarModificarSocursal.setLayout(null);
        //Ubicacion y tamaño
        panelConsultarModificarSocursal.setBounds(0, 0, 800, 600);
        //Ubicacion del titulo
        titulo3.setBounds(new Rectangle(0, 0, 800, 60));
        //Boton atras
        atrasConsultarModificar.setBounds(new Rectangle(20, 60, 52, 48));
        labelConsultar.setBounds(new Rectangle(0, 0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasConsultar.setBounds(new Rectangle(80, 50, 700, 500));
        panelConCosasConsultar.setLayout(null);
        scrollConsultarSucursalInfo.setBounds(new Rectangle(0, 100, 650, 100));
        scrollConsultarSucursalInventario.setBounds(new Rectangle(0, 200, 650, 300));

//Panel caminos
        panelConsultarModificarCaminos.setVisible(false);
        panelConsultarModificarCaminos.setLayout(null);
        //Ubicacion y tamaño
        panelConsultarModificarCaminos.setBounds(0, 0, 800, 600);
        //Ubicacion del titulo
        titulo6.setBounds(new Rectangle(0, 0, 800, 60));
        //Boton atras
        atrasConsultarModificarCaminos.setBounds(new Rectangle(20, 60, 52, 48));
        labelConsultarCaminos.setBounds(new Rectangle(0, 0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasConsultarCaminos.setLayout(null);
        panelConCosasConsultarCaminos.setBounds(new Rectangle(80, 50, 700, 500));

        scrollConsultarCaminos.setBounds(new Rectangle(0, 100, 650, 400));

//Panel Agregar Inventario
        panelAgregarProductos.setVisible(false);
        panelAgregarProductos.setLayout(null);
        //Ubicacion y tamaño
        panelAgregarProductos.setBounds(0, 0, 800, 600);
        //Ubicacion del titulo
        titulo8.setBounds(new Rectangle(0, 0, 800, 60));
        //Boton atras
        atrasAgregarInventario.setBounds(new Rectangle(20, 60, 52, 48));
        labelAgregarInventario.setBounds(new Rectangle(0, 0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasAgregarProductos.setLayout(null);
        panelConCosasAgregarProductos.setBounds(new Rectangle(80, 50, 700, 500));

        botonAñadirProd.setBounds(new Rectangle(600, 100, 75, 20));

        labelNombreProducto.setBounds(new Rectangle(0, 70, 100, 20));
        TFProducto.setBounds(new Rectangle(0, 100, 190, 20));
        scrollProducto.setBounds(new Rectangle(0, 130, 190, 350));

        labelCantidad.setBounds(new Rectangle(200, 70, 100, 20));
        TFCantidad.setBounds(new Rectangle(200, 100, 190, 20));
        scrollCantidad.setBounds(new Rectangle(200, 130, 190, 350));

        labelPrecio.setBounds(new Rectangle(400, 70, 100, 20));
        TFPrecio.setBounds(new Rectangle(400, 100, 190, 20));
        scrollPrecioUnit.setBounds(new Rectangle(400, 130, 190, 350));

//Panel Consultar Inventario
        panelConsultarInventario.setVisible(false);
        panelConsultarInventario.setLayout(null);
        //Ubicacion y tamaño
        panelConsultarInventario.setBounds(0, 0, 800, 600);
        //Ubicacion del titulo
        titulo7.setBounds(new Rectangle(0, 0, 800, 60));
        //Boton atras
        atrasConsultarInventario.setBounds(new Rectangle(20, 60, 52, 48));
        labelConsultarInventario.setBounds(new Rectangle(0, 0, 800, 60));
        //Panel que acomoda cosas
        panelConCosasConsultarProductos.setLayout(null);
        panelConCosasConsultarProductos.setBounds(new Rectangle(80, 50, 650, 500));
        scrollConsultarInventario.setBounds(new Rectangle(0, 100, 650, 400));

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
        cbConsultarSucursal = new javax.swing.JComboBox();
        labelConsultar = new javax.swing.JLabel();
        scrollConsultarSucursalInfo = new javax.swing.JScrollPane();
        TPaneConsultarSucursalesInfo = new javax.swing.JTextPane();
        botonModificarConsultar = new javax.swing.JButton();
        botonEliminarSucursal = new javax.swing.JButton();
        scrollConsultarSucursalInventario = new javax.swing.JScrollPane();
        TPaneConsultarSucursalesInvent = new javax.swing.JTextPane();
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
        panelAgregarProductos = new javax.swing.JPanel();
        titulo8 = new javax.swing.JLabel();
        atrasAgregarInventario = new javax.swing.JButton();
        panelConCosasAgregarProductos = new javax.swing.JPanel();
        labelNombreProducto = new javax.swing.JLabel();
        botonAñadirProd = new javax.swing.JButton();
        labelAgregarInventario = new javax.swing.JLabel();
        scrollProducto = new javax.swing.JScrollPane();
        TPaneProducto = new javax.swing.JTextPane();
        scrollCantidad = new javax.swing.JScrollPane();
        TPaneCantidad = new javax.swing.JTextPane();
        scrollPrecioUnit = new javax.swing.JScrollPane();
        TPanePrecio = new javax.swing.JTextPane();
        TFProducto = new javax.swing.JTextField();
        TFCantidad = new javax.swing.JTextField();
        TFPrecio = new javax.swing.JTextField();
        labelPrecio = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        panelConsultarInventario = new javax.swing.JPanel();
        titulo7 = new javax.swing.JLabel();
        atrasConsultarInventario = new javax.swing.JButton();
        panelConCosasConsultarProductos = new javax.swing.JPanel();
        labelNombreSucursal4 = new javax.swing.JLabel();
        botonVerConsultarInventario = new javax.swing.JButton();
        cbConsultarInventario = new javax.swing.JComboBox();
        labelConsultarInventario = new javax.swing.JLabel();
        scrollConsultarInventario = new javax.swing.JScrollPane();
        TPaneConsultarInventario = new javax.swing.JTextPane();
        botonModificarConsultarInventario = new javax.swing.JButton();
        botonEliminarInventario = new javax.swing.JButton();

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

        cbCamino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar camino", "Consultar/Modificar", "Eliminar" }));

        cbInventario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar producto", "Consultar/Modificar" }));
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
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addComponent(botonAtenderCliente)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cbMenorDistanciaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(botonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cbMenorDistanciaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarSucursal))
                .addGap(38, 38, 38)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
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

        cbConsultarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultarSucursalActionPerformed(evt);
            }
        });

        labelConsultar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConsultar.setText("Consultar sucursal");

        TPaneConsultarSucursalesInfo.setEditable(false);
        scrollConsultarSucursalInfo.setViewportView(TPaneConsultarSucursalesInfo);

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

        TPaneConsultarSucursalesInvent.setEditable(false);
        scrollConsultarSucursalInventario.setViewportView(TPaneConsultarSucursalesInvent);

        javax.swing.GroupLayout panelConCosasConsultarLayout = new javax.swing.GroupLayout(panelConCosasConsultar);
        panelConCosasConsultar.setLayout(panelConCosasConsultarLayout);
        panelConCosasConsultarLayout.setHorizontalGroup(
            panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarLayout.createSequentialGroup()
                .addComponent(labelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelConCosasConsultarLayout.createSequentialGroup()
                .addGroup(panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConCosasConsultarLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal1)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonVerConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarSucursal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollConsultarSucursalInfo)
                    .addComponent(scrollConsultarSucursalInventario))
                .addContainerGap())
        );
        panelConCosasConsultarLayout.setVerticalGroup(
            panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarLayout.createSequentialGroup()
                .addComponent(labelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelConCosasConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConsultarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerConsultar)
                    .addComponent(botonModificarConsultar)
                    .addComponent(botonEliminarSucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollConsultarSucursalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollConsultarSucursalInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelConCosasConsultarCaminosLayout = new javax.swing.GroupLayout(panelConCosasConsultarCaminos);
        panelConCosasConsultarCaminos.setLayout(panelConCosasConsultarCaminosLayout);
        panelConCosasConsultarCaminosLayout.setHorizontalGroup(
            panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addComponent(labelConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addGroup(panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollConsultarCaminos))
                    .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal3)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(botonVerConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonModificarConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(botonModificarConsultarCaminos))
                .addGap(18, 18, 18)
                .addComponent(scrollConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
                        .addComponent(panelConCosasConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelAgregarProductos.setBackground(new java.awt.Color(255, 255, 255));

        titulo8.setBackground(new java.awt.Color(51, 51, 255));
        titulo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo2.jpg"))); // NOI18N
        titulo8.setInheritsPopupMenu(false);
        titulo8.setOpaque(true);

        atrasAgregarInventario.setBackground(new java.awt.Color(255, 255, 255));
        atrasAgregarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaAtras.jpg"))); // NOI18N
        atrasAgregarInventario.setBorderPainted(false);
        atrasAgregarInventario.setFocusPainted(false);
        atrasAgregarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasAgregarInventarioActionPerformed(evt);
            }
        });

        panelConCosasAgregarProductos.setBackground(new java.awt.Color(255, 255, 255));

        labelNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreProducto.setText("Producto:");

        botonAñadirProd.setText("Añadir");
        botonAñadirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirProdActionPerformed(evt);
            }
        });

        labelAgregarInventario.setBackground(new java.awt.Color(255, 255, 255));
        labelAgregarInventario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAgregarInventario.setText("Agregar inventario");

        TPaneProducto.setEditable(false);
        scrollProducto.setViewportView(TPaneProducto);

        TPaneCantidad.setEditable(false);
        scrollCantidad.setViewportView(TPaneCantidad);

        TPanePrecio.setEditable(false);
        scrollPrecioUnit.setViewportView(TPanePrecio);

        TFProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFProductoActionPerformed(evt);
            }
        });

        labelPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPrecio.setText("Precio Unit ₡: ");

        labelCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCantidad.setText("Cantidad:");

        javax.swing.GroupLayout panelConCosasAgregarProductosLayout = new javax.swing.GroupLayout(panelConCosasAgregarProductos);
        panelConCosasAgregarProductos.setLayout(panelConCosasAgregarProductosLayout);
        panelConCosasAgregarProductosLayout.setHorizontalGroup(
            panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TFProducto)
                                .addComponent(scrollProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                            .addComponent(labelNombreProducto))
                        .addGap(44, 44, 44)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPrecioUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(TFCantidad))
                        .addGap(46, 46, 46)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(TFPrecio))
                            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                                .addComponent(labelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(botonAñadirProd)))))
                .addGap(39, 39, 39))
            .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(labelCantidad)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );
        panelConCosasAgregarProductosLayout.setVerticalGroup(
            panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addComponent(labelAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAñadirProd)
                            .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelAgregarProductosLayout = new javax.swing.GroupLayout(panelAgregarProductos);
        panelAgregarProductos.setLayout(panelAgregarProductosLayout);
        panelAgregarProductosLayout.setHorizontalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo8)
                    .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelConCosasAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        panelAgregarProductosLayout.setVerticalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                .addComponent(titulo8)
                .addGap(18, 18, 18)
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atrasAgregarInventario)
                    .addComponent(panelConCosasAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelConsultarInventario.setBackground(new java.awt.Color(255, 255, 255));

        titulo7.setBackground(new java.awt.Color(51, 51, 255));
        titulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo2.jpg"))); // NOI18N
        titulo7.setInheritsPopupMenu(false);
        titulo7.setOpaque(true);

        atrasConsultarInventario.setBackground(new java.awt.Color(255, 255, 255));
        atrasConsultarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaAtras.jpg"))); // NOI18N
        atrasConsultarInventario.setBorderPainted(false);
        atrasConsultarInventario.setFocusPainted(false);
        atrasConsultarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasConsultarInventarioActionPerformed(evt);
            }
        });

        panelConCosasConsultarProductos.setBackground(new java.awt.Color(255, 255, 255));

        labelNombreSucursal4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreSucursal4.setText("Sucursal:");

        botonVerConsultarInventario.setText("Ver");
        botonVerConsultarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerConsultarInventarioActionPerformed(evt);
            }
        });

        cbConsultarInventario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelConsultarInventario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConsultarInventario.setText("Consultar inventario");

        TPaneConsultarInventario.setEditable(false);
        scrollConsultarInventario.setViewportView(TPaneConsultarInventario);

        botonModificarConsultarInventario.setText("Modificar");
        botonModificarConsultarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarConsultarInventarioActionPerformed(evt);
            }
        });

        botonEliminarInventario.setText("Eliminar");
        botonEliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasConsultarProductosLayout = new javax.swing.GroupLayout(panelConCosasConsultarProductos);
        panelConCosasConsultarProductos.setLayout(panelConCosasConsultarProductosLayout);
        panelConCosasConsultarProductosLayout.setHorizontalGroup(
            panelConCosasConsultarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarProductosLayout.createSequentialGroup()
                .addComponent(labelConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasConsultarProductosLayout.createSequentialGroup()
                .addGroup(panelConCosasConsultarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasConsultarProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollConsultarInventario))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConCosasConsultarProductosLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal4)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonVerConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarInventario)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        panelConCosasConsultarProductosLayout.setVerticalGroup(
            panelConCosasConsultarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasConsultarProductosLayout.createSequentialGroup()
                .addComponent(labelConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelConCosasConsultarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreSucursal4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerConsultarInventario)
                    .addComponent(botonModificarConsultarInventario)
                    .addComponent(botonEliminarInventario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConsultarInventarioLayout = new javax.swing.GroupLayout(panelConsultarInventario);
        panelConsultarInventario.setLayout(panelConsultarInventarioLayout);
        panelConsultarInventarioLayout.setHorizontalGroup(
            panelConsultarInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo7)
            .addGroup(panelConsultarInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConCosasConsultarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelConsultarInventarioLayout.setVerticalGroup(
            panelConsultarInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarInventarioLayout.createSequentialGroup()
                .addComponent(titulo7)
                .addGroup(panelConsultarInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultarInventarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasConsultarInventario))
                    .addGroup(panelConsultarInventarioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelConCosasConsultarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(panelConsultarModificarSocursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(panelConsultarModificarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(panelConsultarModificarSocursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(panelConsultarModificarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        panelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSucursalActionPerformed

        JComboBox cbEliminarSucursal = new JComboBox();
        JTextField campoNombre = new JTextField();
        JTextField campoCantEmple = new JTextField();

//Crea la nueva sucursal
        if (cbSucursal.getSelectedItem() == "Agregar sucursal") {
            JCheckBox chBCrearInvent = new JCheckBox("Crear inventario");
            JPanel panelMsjAgregar = new JPanel(new GridLayout(0, 1));
            panelMsjAgregar.add(new JLabel("Nombre de la Sucursal:"));
            panelMsjAgregar.add(campoNombre);

            panelMsjAgregar.add(new JLabel("Cantidad de empleados:"));
            panelMsjAgregar.add(campoCantEmple);
            panelMsjAgregar.add(chBCrearInvent);
            chBCrearInvent.setSelected(true);
            int mensajeAgregarSucursal = JOptionPane.showConfirmDialog(panelPrincipal, panelMsjAgregar, "Agregar sucursal", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

            //Variables que obtiene el nombre
            String varAgregarNombre = campoNombre.getText();
            //Variable que obtiene la cantidad de empleados
            String varCantidadEmpleados = campoCantEmple.getText();

            //Si el usuario le da aceptar a la ventana emergente se crea la sucursal
            if (JOptionPane.CANCEL_OPTION != mensajeAgregarSucursal) {

                //Valida si los espacios estan llenos
                varAgregarNombre = varAgregarNombre.replaceAll(" ", "");
                varCantidadEmpleados = varCantidadEmpleados.replaceAll(" ", "");

                if (varAgregarNombre.length() == 0 | varCantidadEmpleados.length() == 0) {
                    JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, ingrese todos los datos que se le solicitan");

                } else {
                     //Si los espacios estan llenos crea el vertice
                    //Se llama al metodo de agregar en grafo
                    cadenaSupermercados.agregarSuperMercado(campoNombre.getText(), campoCantEmple.getText());
                    cadenaSupermercados.imprimeGrafo();
                    JOptionPane.showMessageDialog(panelPrincipal, "Se ha registrado la sucursal correctamente");

                }
            }

        } // Aqui se consulta y modifica las sucursales
        else{
            panelConsultarModificarSocursal.setVisible(true);
            panelPrincipal.setVisible(false);
            
            //Este metodo carga el combobox de  consultar las sucursales 
            nodoEsp actual;
            for (int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++) {
                actual = cadenaSupermercados.SuperMercados.get(imprimir);
                
                String nomSucurs = null;
                nomSucurs = actual.nombreSuperMercado;

                cbConsultarSucursal.addItem(nomSucurs); //revisar

            }

        }


    }//GEN-LAST:event_botonBuscarSucursalActionPerformed

    private void botonCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCaminoActionPerformed

       // Object datoCB = cbCamino.getSelectedItem();
        // String datoCBString = String.valueOf(datoCB);
        JComboBox cbEliminarCaminoLlegada = new JComboBox();
        JComboBox cbEliminarCaminoSalida = new JComboBox();
        JComboBox sucursalSalida = new JComboBox();
        JComboBox sucursalLlegada = new JComboBox();
        //JTextField campoCamino = new JTextField();

        if (cbCamino.getSelectedItem() == "Agregar camino") {

            JTextField campoDistKm = new JTextField();
            JTextField campoTiempo = new JTextField();
            JLabel ejemplo = new JLabel("Ejemplo: A-B-C");

            Font fuente = new Font("Tahoma", Font.ITALIC, 11);
            ejemplo.setFont(fuente);

            JPanel panelMsjAgregarCamino = new JPanel(new GridLayout(0, 1));
            panelMsjAgregarCamino.add(new JLabel("Sucursal Salida:"));
            panelMsjAgregarCamino.add(sucursalSalida);
            panelMsjAgregarCamino.add(new JLabel("Sucursal Llegada:"));
            panelMsjAgregarCamino.add(ejemplo);
            panelMsjAgregarCamino.add(sucursalLlegada);
            panelMsjAgregarCamino.add(new JLabel("Distancia en km:"));
            panelMsjAgregarCamino.add(campoDistKm);
            panelMsjAgregarCamino.add(new JLabel("Tiempo de recorrido:"));
            panelMsjAgregarCamino.add(campoTiempo);

            int mensajeAgregarCamino = JOptionPane.showConfirmDialog(panelPrincipal, panelMsjAgregarCamino, "Agregar camino", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

            //String varAgregarCamino = campoCamino.getText();
            String varDistanciaKm = campoDistKm.getText();
            String varDuracion = campoTiempo.getText();
            //  cbEliminarCamino.addItem(datoCB);
            //chBCrearInvent isSelected()    
        } else if (cbCamino.getSelectedItem() == "Consultar/Modificar") {
            panelConsultarModificarCaminos.setVisible(true);
            panelPrincipal.setVisible(false);
        } else {
            JPanel panelMsjEliminar = new JPanel(new GridLayout(0, 1));

            panelMsjEliminar.add(new JLabel("Seleccione la sucursal:"));
            panelMsjEliminar.add(cbEliminarCaminoLlegada);
            panelMsjEliminar.add(new JLabel("Camino a eliminar:"));
            panelMsjEliminar.add(cbEliminarCaminoSalida);

            int mensajeEliminarSucursal = JOptionPane.showConfirmDialog(panelPrincipal, panelMsjEliminar, "Eliminar sucursal", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_botonCaminoActionPerformed

    private void botonCrearInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearInventarioActionPerformed
        JComboBox cbElegirSucursal = new JComboBox();
        JComboBox cbElegirSucursalConsultar = new JComboBox();

        if (cbInventario.getSelectedItem() == "Insertar producto") {
            JPanel panelMsjAgregar = new JPanel(new GridLayout(0, 1));
            panelMsjAgregar.add(new JLabel("Elija una Sucursal:"));
            panelMsjAgregar.add(cbElegirSucursal);

            int mensajeAgregarInventario = JOptionPane.showConfirmDialog(panelPrincipal, panelMsjAgregar, "Agregar inventario de sucursal", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.CANCEL_OPTION != mensajeAgregarInventario) {
                panelAgregarProductos.setVisible(true);
                panelPrincipal.setVisible(false);
            }
        } else if (cbInventario.getSelectedItem() == "Consultar/Modificar") {
            panelConsultarInventario.setVisible(true);
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
        cbConsultarSucursal.removeAllItems();
        TPaneConsultarSucursalesInfo.setText(null);
        TPaneConsultarSucursalesInvent.setText(null);
    }//GEN-LAST:event_atrasConsultarModificarActionPerformed

    private void botonVerConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarActionPerformed
        TPaneConsultarSucursalesInfo.setText(null);
        TPaneConsultarSucursalesInvent.setText(null);
        Object selecionado = cbConsultarSucursal.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);

        cadenaSupermercados.buscarSuperMercado(StringSeleccionado);
        TPaneConsultarSucursalesInfo.setText("INFORMACION DE LA SUCURSAL" + enter+ enter + ">> Nombre: " + tab + tab + tab + tab + cadenaSupermercados.buscarSuperMercado(StringSeleccionado).nombreSuperMercado + enter + enter + ">> Cantidad de empleados:" + tab + tab + cadenaSupermercados.buscarSuperMercado(StringSeleccionado).numEmpleados);//Falta agregarle lo de inventario
        //Aqui va el inventario esto es una prueba donde se imprimen
        //la lista de supermercados para ver si sirve
        TPaneConsultarSucursalesInvent.setText("INVENTARIO DISPONIBLE"+enter+ cadenaSupermercados.imprimeGrafoprieba());
        cadenaSupermercados.imprimeGrafo();

    }//GEN-LAST:event_botonVerConsultarActionPerformed

    private void botonModificarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarActionPerformed
        //panelModificarSucursal.setVisible(true);
        //JOptionPane.showConfirmDialog(panelConCosasConsultar, evt);
        //cbConsultarSucursal
        Object selecionado = cbConsultarSucursal.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
        
        JTextField campoNombre = new JTextField();
        JTextField campoCantEmple = new JTextField();
        JPanel panelMsjModificar = new JPanel(new GridLayout(0, 1));
        panelMsjModificar.add(new JLabel("Nombre de la Sucursal:"));
        panelMsjModificar.add(campoNombre);
        panelMsjModificar.add(new JLabel("Cantidad de empleados:"));
        panelMsjModificar.add(campoCantEmple);

        int mensajeModificar = JOptionPane.showConfirmDialog(panelConsultarModificarSocursal, panelMsjModificar, "Modificar información", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        String varCampoNombre = campoNombre.getText();
        String varCampoCantEmple = campoCantEmple.getText();

        if (mensajeModificar != JOptionPane.CANCEL_OPTION) {
            TPaneConsultarSucursalesInfo.setText(null);
            //Si se agrega una variable para meter los datos hay que resetearla    

            //Valida si los espacios estan llenos
            varCampoNombre = varCampoNombre.replaceAll(" ", "");
            varCampoCantEmple = varCampoCantEmple.replaceAll(" ", "");

                if (varCampoNombre.length() == 0 & varCampoCantEmple.length() == 0) {
                    JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, ingrese todos los datos que se le solicitan");

                } //Los espacios que estan en blanco no se modifican
                else{
                    if (varCampoCantEmple.length() != 0){
                        //Si los espacios estan llenos se modifica la informacion de la sucursal

                        //Cambia el num de empleados
                       cadenaSupermercados.buscarSuperMercado(StringSeleccionado).setNumEmpleados(campoCantEmple.getText());
                    }
                    if (varCampoNombre.length() != 0){
                        //Cambia el nombre del supermercado
                        cadenaSupermercados.buscarSuperMercado(StringSeleccionado).setNombreSuperMercado(campoNombre.getText());
                    }
                    //Actualiza el combobox
                    cbConsultarSucursal.removeAllItems();
                    
                    //Este metodo carga el combobox de  consultar las sucursales 
                    nodoEsp aux;
                    for (int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++) {
                        aux = cadenaSupermercados.SuperMercados.get(imprimir);

                        String nomSucurs = null;
                        nomSucurs = aux.nombreSuperMercado;

                        cbConsultarSucursal.addItem(nomSucurs); //revisar
                    }
                    
                    cadenaSupermercados.imprimeGrafo();
                    JOptionPane.showMessageDialog(panelPrincipal, "Se ha modificado la información de la sucursal correctamente");
                }
        }
    }//GEN-LAST:event_botonModificarConsultarActionPerformed

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

    private void atrasConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasConsultarInventarioActionPerformed
        panelConsultarInventario.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_atrasConsultarInventarioActionPerformed

    private void botonVerConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerConsultarInventarioActionPerformed

    private void botonModificarConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarConsultarInventarioActionPerformed

    private void botonEliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarInventarioActionPerformed

    private void atrasAgregarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasAgregarInventarioActionPerformed
        panelAgregarProductos.setVisible(false);
        panelPrincipal.setVisible(true);
        variabImprimir = "";
        TPaneProducto.setText(null);
        variabImprimir2 = "";
        TPaneCantidad.setText(null);
        variabImprimir3 = "";
        TPanePrecio.setText(null);
    }//GEN-LAST:event_atrasAgregarInventarioActionPerformed

    private void botonAñadirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirProdActionPerformed
        //Aqui se escriben los productos en la pantalla
        String producto = null;
        producto = TFProducto.getText();
        variabImprimir = variabImprimir + "\n" + producto;
        TPaneProducto.setText(variabImprimir);
        TFProducto.setText(null);

        String cantidad = null;
        cantidad = TFCantidad.getText();
        variabImprimir2 = variabImprimir2 + "\n" + cantidad;
        TPaneCantidad.setText(variabImprimir2);
        TFCantidad.setText(null);

        String precioUnit = null;
        precioUnit = TFPrecio.getText();
        variabImprimir3 = variabImprimir3 + "\n" + precioUnit;
        TPanePrecio.setText(variabImprimir3);
        TFPrecio.setText(null);

    }//GEN-LAST:event_botonAñadirProdActionPerformed

    private void TFProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFProductoActionPerformed

    private void botonEliminarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarSucursalActionPerformed
        Object selecionado = cbConsultarSucursal.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);

        int msj = JOptionPane.showConfirmDialog(panelConsultarModificarSocursal, "¿Desea eliminar la sucursal?", "Eliminar", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (JOptionPane.CANCEL_OPTION != msj) {
            if (cbConsultarSucursal.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(panelPrincipal, "Operación inválida, No hay sucursales registradas en el sistema");

            } else {
                cadenaSupermercados.eliminarSuperMercado(StringSeleccionado);
                cadenaSupermercados.imprimeGrafo();
                cbConsultarSucursal.removeItem(selecionado);
                JOptionPane.showMessageDialog(panelPrincipal, "Se ha eliminado la sucursal correctamente");

            }
        }
    }//GEN-LAST:event_botonEliminarSucursalActionPerformed

    private void cbConsultarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultarSucursalActionPerformed

    }//GEN-LAST:event_cbConsultarSucursalActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecMarketInterfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTextField TFProducto;
    private javax.swing.JTextPane TPaneCantidad;
    private javax.swing.JTextPane TPaneConsultarCaminos;
    private javax.swing.JTextPane TPaneConsultarInventario;
    private javax.swing.JTextPane TPaneConsultarSucursalesInfo;
    private javax.swing.JTextPane TPaneConsultarSucursalesInvent;
    private javax.swing.JTextPane TPanePrecio;
    private javax.swing.JTextPane TPaneProducto;
    private javax.swing.JButton atrasAgregarInventario;
    private javax.swing.JButton atrasConsultarInventario;
    private javax.swing.JButton atrasConsultarModificar;
    private javax.swing.JButton atrasConsultarModificarCaminos;
    private javax.swing.JButton botonAtenderCliente;
    private javax.swing.JButton botonAñadirProd;
    private javax.swing.JButton botonBuscarSucursal;
    private javax.swing.JButton botonCamino;
    private javax.swing.JButton botonCrearInventario;
    private javax.swing.JButton botonEliminarInventario;
    private javax.swing.JButton botonEliminarSucursal;
    private javax.swing.JButton botonGenerarReporte;
    private javax.swing.JButton botonLupa;
    private javax.swing.JButton botonModificarConsultar;
    private javax.swing.JButton botonModificarConsultarCaminos;
    private javax.swing.JButton botonModificarConsultarInventario;
    private javax.swing.JButton botonVerConsultar;
    private javax.swing.JButton botonVerConsultarCaminos;
    private javax.swing.JButton botonVerConsultarInventario;
    private javax.swing.JComboBox cbCamino;
    private javax.swing.JComboBox cbConsultarCaminos;
    private javax.swing.JComboBox cbConsultarInventario;
    private javax.swing.JComboBox cbConsultarSucursal;
    private javax.swing.JComboBox cbInventario;
    private javax.swing.JComboBox cbMenorDistanciaTiempo;
    private javax.swing.JComboBox cbReporte;
    private javax.swing.JComboBox cbSucursal;
    private javax.swing.JLabel labelAgregarInventario;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JLabel labelConsultarCaminos;
    private javax.swing.JLabel labelConsultarInventario;
    private javax.swing.JLabel labelNombreProducto;
    private javax.swing.JLabel labelNombreSucursal1;
    private javax.swing.JLabel labelNombreSucursal3;
    private javax.swing.JLabel labelNombreSucursal4;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel lbCaminos;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbInventarios;
    private javax.swing.JLabel lbReportes;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JPanel panelAgregarProductos;
    private javax.swing.JPanel panelConCosasAgregarProductos;
    private javax.swing.JPanel panelConCosasConsultar;
    private javax.swing.JPanel panelConCosasConsultarCaminos;
    private javax.swing.JPanel panelConCosasConsultarProductos;
    private javax.swing.JPanel panelConsultarInventario;
    private javax.swing.JPanel panelConsultarModificarCaminos;
    private javax.swing.JPanel panelConsultarModificarSocursal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollCantidad;
    private javax.swing.JScrollPane scrollConsultarCaminos;
    private javax.swing.JScrollPane scrollConsultarInventario;
    private javax.swing.JScrollPane scrollConsultarSucursalInfo;
    private javax.swing.JScrollPane scrollConsultarSucursalInventario;
    private javax.swing.JScrollPane scrollPrecioUnit;
    private javax.swing.JScrollPane scrollProducto;
    private javax.swing.JTextField textFieldBuscarProducto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    // End of variables declaration//GEN-END:variables
}
