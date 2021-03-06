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
        cbCaminoPantallaPrincipal.setBounds(20, 230, 140, 24);
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
        
//Panel que van dentro del principal
//Panel cliente
       panelGenerarCliente.setVisible(false);
        //Ubicacion y tamaño
        panelGenerarCliente.setBounds(new Rectangle(300, 150, 450, 400));
        //Boton x
        botonXpanelCliente.setBounds(170, 0, 5,5);
        labelTituloPanelCliente.setBounds(0, 0, 100, 30);
        labelConNombreSucursalDondeHayCliente.setBounds(500, 20, 50, 15);
        

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
        panelAgregarProductos.setBounds(0,0, 800, 600);
        //Ubicacion del titulo
        titulo8.setBounds(new Rectangle(0, 0, 800, 60));
        //Boton atras
        atrasAgregarInventario.setBounds(new Rectangle(20, 60, 52, 48));
        labelAgregarInventario.setBounds(new Rectangle(0, 0, 800, 60));
        labelNombreSucursalAgregInv.setBounds(new Rectangle(0, 65, 100, 20));
        CBAgregarInventario.setBounds(new Rectangle(80, 65, 200, 22));
        //Panel que acomoda cosas
        panelConCosasAgregarProductos.setLayout(null);
        panelConCosasAgregarProductos.setBounds(new Rectangle(80,50, 700, 500));
        
        botonAñadirProd.setBounds(new Rectangle(600, 140, 75, 20));
        botonSeleccionar.setBounds(new Rectangle(300, 65, 110, 20));

        labelNombreProducto.setBounds(new Rectangle(0, 110, 100, 20));
        TFProducto.setBounds(new Rectangle(0, 140, 190, 20));
        scrollProducto.setBounds(new Rectangle(0, 170, 190, 300));

        labelCantidad.setBounds(new Rectangle(200, 110, 100, 20));
        TFCantidad.setBounds(new Rectangle(200, 140, 190, 20));
        scrollCantidad.setBounds(new Rectangle(200, 170, 190, 300));

        labelPrecio.setBounds(new Rectangle(400, 110, 100, 20));
        TFPrecio.setBounds(new Rectangle(400, 140, 190, 20));
        scrollPrecioUnit.setBounds(new Rectangle(400, 170, 190, 300));

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
        scrollConsultarInventario.setBounds(new Rectangle(0, 100, 650, 60));
        scrollConsultarInventario1.setBounds(new Rectangle(0, 170, 650, 300));
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
        cbCaminoPantallaPrincipal = new javax.swing.JComboBox();
        cbInventario = new javax.swing.JComboBox();
        cbReporte = new javax.swing.JComboBox();
        panelGenerarCliente = new javax.swing.JPanel();
        botonXpanelCliente = new javax.swing.JButton();
        labelTituloPanelCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        labelConNombreSucursalDondeHayCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFCantidadQueSeDeseaAdquirir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonComprarProducto = new javax.swing.JButton();
        TFProductoQueSeDeseaAdquirir = new javax.swing.JTextField();
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
        botonEliminarConsultarCaminos = new javax.swing.JButton();
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
        labelNombreSucursalAgregInv = new javax.swing.JLabel();
        CBAgregarInventario = new javax.swing.JComboBox();
        botonSeleccionar = new javax.swing.JButton();
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
        scrollConsultarInventario1 = new javax.swing.JScrollPane();
        TPaneConsultarInventario1 = new javax.swing.JTextPane();

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

        cbCaminoPantallaPrincipal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar camino", "Consultar/Modificar" }));

        cbInventario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar producto", "Consultar/Modificar" }));
        cbInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInventarioActionPerformed(evt);
            }
        });

        cbReporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sucursal específica", "Todas sucursales" }));

        panelGenerarCliente.setBackground(new java.awt.Color(0, 0, 0));
        panelGenerarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelGenerarCliente.setForeground(new java.awt.Color(153, 153, 153));

        botonXpanelCliente.setBackground(new java.awt.Color(204, 204, 255));
        botonXpanelCliente.setText("Cerrar");
        botonXpanelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXpanelClienteActionPerformed(evt);
            }
        });

        labelTituloPanelCliente.setBackground(new java.awt.Color(0, 0, 0));
        labelTituloPanelCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTituloPanelCliente.setForeground(new java.awt.Color(255, 0, 0));
        labelTituloPanelCliente.setText("Cliente en espera");
        labelTituloPanelCliente.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se encuentra un cliente en espera de ser atendido en la sucursal:");

        labelConNombreSucursalDondeHayCliente.setBackground(new java.awt.Color(0, 0, 0));
        labelConNombreSucursalDondeHayCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelConNombreSucursalDondeHayCliente.setForeground(new java.awt.Color(51, 0, 204));
        labelConNombreSucursalDondeHayCliente.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El cliente desea comprar:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");

        botonComprarProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonComprarProducto.setText("Comprar Producto");
        botonComprarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGenerarClienteLayout = new javax.swing.GroupLayout(panelGenerarCliente);
        panelGenerarCliente.setLayout(panelGenerarClienteLayout);
        panelGenerarClienteLayout.setHorizontalGroup(
            panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGenerarClienteLayout.createSequentialGroup()
                .addComponent(labelTituloPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonXpanelCliente))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGenerarClienteLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGenerarClienteLayout.createSequentialGroup()
                        .addGroup(panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGenerarClienteLayout.createSequentialGroup()
                        .addComponent(botonComprarProducto)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGenerarClienteLayout.createSequentialGroup()
                        .addGroup(panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelConNombreSucursalDondeHayCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TFProductoQueSeDeseaAdquirir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFCantidadQueSeDeseaAdquirir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))))
        );
        panelGenerarClienteLayout.setVerticalGroup(
            panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenerarClienteLayout.createSequentialGroup()
                .addGroup(panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonXpanelCliente)
                    .addComponent(labelTituloPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(panelGenerarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGenerarClienteLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGenerarClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelConNombreSucursalDondeHayCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFProductoQueSeDeseaAdquirir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(TFCantidadQueSeDeseaAdquirir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botonComprarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonAtenderCliente)
                                    .addComponent(lbInventarios)
                                    .addComponent(cbInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbCaminoPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(botonCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(botonCrearInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(botonBuscarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panelGenerarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 584, Short.MAX_VALUE)))
                        .addContainerGap())
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
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarSucursal))
                        .addGap(38, 38, 38)
                        .addComponent(lbCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCaminoPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCamino)))
                    .addComponent(panelGenerarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCrearInventario))
                .addGap(41, 41, 41)
                .addComponent(lbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGenerarReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        TPaneConsultarSucursalesInfo.setBorder(null);
        TPaneConsultarSucursalesInfo.setToolTipText("");
        TPaneConsultarSucursalesInfo.setAutoscrolls(false);
        TPaneConsultarSucursalesInfo.setSelectionColor(new java.awt.Color(255, 255, 255));
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
        TPaneConsultarSucursalesInvent.setBorder(null);
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

        botonEliminarConsultarCaminos.setText("Eliminar");
        botonEliminarConsultarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarConsultarCaminosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasConsultarCaminosLayout = new javax.swing.GroupLayout(panelConCosasConsultarCaminos);
        panelConCosasConsultarCaminos.setLayout(panelConCosasConsultarCaminosLayout);
        panelConCosasConsultarCaminosLayout.setHorizontalGroup(
            panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollConsultarCaminos)
                .addGap(57, 57, 57))
            .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                .addGroup(panelConCosasConsultarCaminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelConCosasConsultarCaminosLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursal3)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(botonVerConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificarConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarConsultarCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
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
                    .addComponent(botonEliminarConsultarCaminos))
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

        labelNombreSucursalAgregInv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreSucursalAgregInv.setText("Sucursal:");

        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConCosasAgregarProductosLayout = new javax.swing.GroupLayout(panelConCosasAgregarProductos);
        panelConCosasAgregarProductos.setLayout(panelConCosasAgregarProductosLayout);
        panelConCosasAgregarProductosLayout.setHorizontalGroup(
            panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TFProducto)
                                .addComponent(scrollProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                            .addComponent(labelNombreProducto))
                        .addGap(44, 44, 44)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollPrecioUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(TFCantidad))
                            .addComponent(labelCantidad)))
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addComponent(labelNombreSucursalAgregInv)
                        .addGap(38, 38, 38)
                        .addComponent(CBAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSeleccionar)))
                .addGap(44, 44, 44)
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(TFPrecio))
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addComponent(labelPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(botonAñadirProd)))
                .addGap(39, 39, 39))
            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addComponent(labelAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConCosasAgregarProductosLayout.setVerticalGroup(
            panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConCosasAgregarProductosLayout.createSequentialGroup()
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAñadirProd)
                            .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                        .addComponent(labelAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConCosasAgregarProductosLayout.createSequentialGroup()
                                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombreSucursalAgregInv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonSeleccionar))
                                .addGap(3, 3, 3)
                                .addComponent(labelNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelConCosasAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addContainerGap(29, Short.MAX_VALUE))
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

        TPaneConsultarInventario1.setEditable(false);
        scrollConsultarInventario1.setViewportView(TPaneConsultarInventario1);

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
                        .addComponent(labelNombreSucursal4)
                        .addGap(31, 31, 31)
                        .addComponent(cbConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonVerConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarInventario)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(panelConCosasConsultarProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelConCosasConsultarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollConsultarInventario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollConsultarInventario1))))
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
                .addComponent(scrollConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollConsultarInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelConsultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(panelConsultarModificarSocursal, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(307, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(panelConsultarModificarCaminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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
                    //cadenaSupermercados.imprimeGrafo();
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


        JComboBox sucursalSalida = new JComboBox();
        JComboBox sucursalLlegada = new JComboBox();

        //Metodo de agregar camino
        if (cbCaminoPantallaPrincipal.getSelectedItem() == "Agregar camino") {

            JTextField campoDistKm = new JTextField();
            JTextField campoTiempo = new JTextField();
            //JLabel ejemplo = new JLabel("Ejemplo: A-B-C");

            //Font fuente = new Font("Tahoma", Font.ITALIC, 11);
            //ejemplo.setFont(fuente);

            JPanel panelMsjAgregarCamino = new JPanel(new GridLayout(0, 1));
            panelMsjAgregarCamino.add(new JLabel("Sucursal Salida:"));
            panelMsjAgregarCamino.add(sucursalSalida);
            panelMsjAgregarCamino.add(new JLabel("Sucursal Llegada:"));
            panelMsjAgregarCamino.add(sucursalLlegada);
            
        //Este metodo carga el combobox de  agregar caminos
            nodoEsp actual;
            String nomSucurs = null;
            for (int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++) {
                actual = cadenaSupermercados.SuperMercados.get(imprimir);
                
                nomSucurs = actual.nombreSuperMercado;
                //Aqui se llena el cb
                sucursalSalida.addItem(nomSucurs); 
                sucursalLlegada.addItem(nomSucurs);
            }    
            
            //panelMsjAgregarCamino.add(ejemplo);
            
            panelMsjAgregarCamino.add(new JLabel("Distancia en km:"));
            panelMsjAgregarCamino.add(campoDistKm);
            panelMsjAgregarCamino.add(new JLabel("Tiempo de recorrido en Min:"));
            panelMsjAgregarCamino.add(campoTiempo);

            int mensajeAgregarCamino = JOptionPane.showConfirmDialog(panelPrincipal, panelMsjAgregarCamino, "Agregar camino", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

            //Estas variables son para validar que los campos no esten vacios.
            String varDistanciaKm = campoDistKm.getText();
            String varDuracion = campoTiempo.getText();
               
            
            if (JOptionPane.CANCEL_OPTION != mensajeAgregarCamino) {

                //Valida si los espacios estan llenos
                varDistanciaKm = varDistanciaKm.replaceAll(" ", "");
                varDuracion = varDuracion.replaceAll(" ", "");

                if (varDistanciaKm.length() == 0 | varDuracion.length() == 0) {
                    JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, ingrese todos los datos que se le solicitan");

                } else {
                    //Se transforma el String de km y tiempo en int
                    String stringNumdeKm = campoDistKm.getText();
                    int cantKmEntreSucursales = Integer.parseInt(stringNumdeKm);
                    String stringTiempo = campoTiempo.getText();
                    int cantTiempoEntreSucursales = Integer.parseInt(stringTiempo);
                    
                    //Se transforma la info de los cb a string
                    Object selecionadoSalida= sucursalSalida.getSelectedItem();
                    String StringSeleccionadoSalida = String.valueOf(selecionadoSalida);
                    Object selecionadoLlegada = sucursalLlegada.getSelectedItem();
                    String StringSeleccionadoLlegada = String.valueOf(selecionadoLlegada);

                    
                    //Se llama al metodo de agregar caminos en grafo
                    cadenaSupermercados.agregarRutas(StringSeleccionadoSalida,StringSeleccionadoLlegada,cantKmEntreSucursales,cantTiempoEntreSucursales);
                    cadenaSupermercados.imprimirRutaDeterminada(StringSeleccionadoSalida);
                    JOptionPane.showMessageDialog(panelPrincipal, "Se han agregado los caminos correctamente");

                }
            }

        } //Metodo de consultar
        else{
            panelConsultarModificarCaminos.setVisible(true);
            panelPrincipal.setVisible(false);
            
            //Este metodo carga el combobox de  consultar las sucursales 
            nodoEsp actual;
            for (int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++) {
                actual = cadenaSupermercados.SuperMercados.get(imprimir);
                
                String nomSucurs = null;
                nomSucurs = actual.nombreSuperMercado;

                cbConsultarCaminos.addItem(nomSucurs); //revisar

            }

        }
    }//GEN-LAST:event_botonCaminoActionPerformed

    private void botonCrearInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearInventarioActionPerformed
       

        if (cbInventario.getSelectedItem() == "Insertar producto") {
                panelAgregarProductos.setVisible(true);
                panelPrincipal.setVisible(false);
                
                //CBAgregarInventario.removeAllItems();

                //Este metodo carga el combobox de agregar productos 
                nodoEsp aux;
                for (int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++) {
                    aux = cadenaSupermercados.SuperMercados.get(imprimir);

                    String nomSucurs = null;
                    nomSucurs = aux.nombreSuperMercado;
                    CBAgregarInventario.addItem(nomSucurs);
                }
               
        } 
        //Metodo que consulta y modifica
        else{
            panelConsultarInventario.setVisible(true);
            panelPrincipal.setVisible(false);
                            //Este metodo carga el combobox de agregar inventario 
                nodoEsp aux;
                for (int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++) {
                    aux = cadenaSupermercados.SuperMercados.get(imprimir);

                    String nomSucurs = null;
                    nomSucurs = aux.nombreSuperMercado;

                    cbConsultarInventario.addItem(nomSucurs);
                }
        }
    }//GEN-LAST:event_botonCrearInventarioActionPerformed

    private void textFieldBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarProductoActionPerformed

    private void botonLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLupaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLupaActionPerformed

    private void botonAtenderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtenderClienteActionPerformed
      if(cadenaSupermercados.cantidadSucursales> 0){
          panelGenerarCliente.setVisible(true);
          labelConNombreSucursalDondeHayCliente.setText(cadenaSupermercados.generarClienteRandom());
      }
      else{
          panelGenerarCliente.setVisible(false);
          JOptionPane.showMessageDialog(panelPrincipal, "No hay clientes que atender");

      }
       
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

        if(cbConsultarSucursal.getSelectedItem()!= null){
            TPaneConsultarSucursalesInfo.setText("INFORMACION DE LA SUCURSAL" + enter+ enter + ">> Nombre: " + tab + tab + tab + tab + cadenaSupermercados.buscarSuperMercado(StringSeleccionado).nombreSuperMercado + enter + enter + ">> Cantidad de empleados:" + tab + tab + cadenaSupermercados.buscarSuperMercado(StringSeleccionado).numEmpleados);//Falta agregarle lo de inventario

            Nodo_Arbol raizNodo = cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz;

            if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz != null){
               TPaneConsultarSucursalesInvent.setText("INVENTARIO DISPONIBLE"+ enter+enter+cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.consultarInventario(raizNodo)); 
            }
            else{
               TPaneConsultarSucursalesInvent.setText("INVENTARIO DISPONIBLE"+ enter+enter+" No hay productos disponibles");
            }
        }else{
            JOptionPane.showMessageDialog(panelPrincipal, "No hay sucursales registradas en el sistema");
                
        }

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
            TPaneConsultarSucursalesInvent.setText(null);
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
                    
                    JOptionPane.showMessageDialog(panelPrincipal, "Se ha modificado la información de la sucursal correctamente");
                }
        }
    }//GEN-LAST:event_botonModificarConsultarActionPerformed

    private void atrasConsultarModificarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasConsultarModificarCaminosActionPerformed
        panelConsultarModificarCaminos.setVisible(false);
        panelPrincipal.setVisible(true);

        cbConsultarCaminos.removeAllItems();
        TPaneConsultarCaminos.setText(null);
    }//GEN-LAST:event_atrasConsultarModificarCaminosActionPerformed

    private void botonVerConsultarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarCaminosActionPerformed
        TPaneConsultarCaminos.setText(null);
        
        Object selecionado = cbConsultarCaminos.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
       
        if(cbConsultarCaminos.getSelectedItem()!= null){
            cadenaSupermercados.buscarSuperMercado(StringSeleccionado);

            TPaneConsultarCaminos.setText("INFORMACION DE LA SUCURSAL" + enter+ enter + ">> Nombre: " +tab+ tab + tab + cadenaSupermercados.buscarSuperMercado(StringSeleccionado).nombreSuperMercado + enter + enter + "CAMINOS:" + enter+ cadenaSupermercados.imprimirRutaDeterminada(StringSeleccionado));
        }else{
            JOptionPane.showMessageDialog(panelPrincipal, "No hay sucursales registradas en el sistema");
              
        }
         
    }//GEN-LAST:event_botonVerConsultarCaminosActionPerformed

    private void botonModificarConsultarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarCaminosActionPerformed
        Object selecionado = cbConsultarCaminos.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
        
        JComboBox cbCaminoModificarInfo = new JComboBox(); 

        JTextField campoDistKm = new JTextField();
        JTextField campoTiempo = new JTextField();
  
        JPanel panelMsjAgregarCamino = new JPanel(new GridLayout(0, 1));
        panelMsjAgregarCamino.add(new JLabel("Seleccione un camino:"));
        panelMsjAgregarCamino.add(cbCaminoModificarInfo);
        panelMsjAgregarCamino.add(new JLabel("Distancia en km:"));
        panelMsjAgregarCamino.add(campoDistKm);
        panelMsjAgregarCamino.add(new JLabel("Tiempo de recorrido:"));
        panelMsjAgregarCamino.add(campoTiempo);
        
        nodoEsp actual;
        for(int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++){
            actual = cadenaSupermercados.SuperMercados.get(imprimir);
            if(actual.nombreSuperMercado == StringSeleccionado){
                for(int ruta = 0; ruta < actual.Rutas.size(); ruta++){
                   cbCaminoModificarInfo.addItem(actual.Rutas.get(ruta).Ruta);//Asi se accede a la lista con las rutas
                }
            }
        }

        int msjModificarCamino = JOptionPane.showConfirmDialog(panelPrincipal, panelMsjAgregarCamino, "Modificar información de caminos", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        //Estas variables son para validar que los campos no esten vacios.
        String varDistanciaKm = campoDistKm.getText();
        String varDuracion = campoTiempo.getText();


        if (JOptionPane.CANCEL_OPTION != msjModificarCamino) {
            TPaneConsultarCaminos.setText(null);
 
            //Valida si los espacios estan llenos
            varDistanciaKm = varDistanciaKm.replaceAll(" ", "");
            varDuracion = varDuracion.replaceAll(" ", "");
            if (varDistanciaKm.length() == 0 & varDuracion.length() == 0) {
                JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, no ha ingresado datos que modificar");
            }
            Object rutaElegida = cbConsultarCaminos.getSelectedItem();
            String StringrutaElegida = String.valueOf(rutaElegida); 
            
            if (StringrutaElegida.length()== 0) {
                JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, La sucursal no tiene rutas registradas");
            }
            else{ 
                Object caminoSelecionado = cbCaminoModificarInfo.getSelectedItem();
                String StringCaminoSeleccionado = String.valueOf(caminoSelecionado);
                if(varDistanciaKm.length() != 0){
                    
                    String stringNumdeKm = campoDistKm.getText();
                    int cantKmEntreSucursales = Integer.parseInt(stringNumdeKm);
                    
                    //Metodo para modificar la informacion de una ruta
                    nodoEsp current;
                    for(int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++){
                        current = cadenaSupermercados.SuperMercados.get(imprimir);
                        if(current.nombreSuperMercado == StringSeleccionado){
                            for(int ruta = 0; ruta < current.Rutas.size(); ruta++){
                               if (StringCaminoSeleccionado == current.Rutas.get(ruta).Ruta){
                                   current.Rutas.get(ruta).setDistancia(cantKmEntreSucursales);
                               }
                            }
                        }
                    }
                if (varDuracion.length() != 0) {

                    String stringTiempo = campoTiempo.getText();
                    int cantTiempoEntreSucursales = Integer.parseInt(stringTiempo);
                    
                    nodoEsp current2;
                    for(int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++){
                        current2 = cadenaSupermercados.SuperMercados.get(imprimir);
                        if(current2.nombreSuperMercado == StringSeleccionado){
                            for(int ruta = 0; ruta < current2.Rutas.size(); ruta++){
                               if (StringCaminoSeleccionado == current2.Rutas.get(ruta).Ruta){
                                   current2.Rutas.get(ruta).setTiempo(cantTiempoEntreSucursales);
                               }
                            }
                        }
                    }
                }
                JOptionPane.showMessageDialog(panelPrincipal, "Se ha modificado la informacion de los caminos correctamente");
            }
            }  
        }
    }//GEN-LAST:event_botonModificarConsultarCaminosActionPerformed
            
    private void atrasConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasConsultarInventarioActionPerformed
        panelConsultarInventario.setVisible(false);
        panelPrincipal.setVisible(true);
        TPaneConsultarInventario.setText(null);
        TPaneConsultarInventario1.setText(null);
        
        cbConsultarInventario.removeAllItems();
    }//GEN-LAST:event_atrasConsultarInventarioActionPerformed

    private void botonVerConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerConsultarInventarioActionPerformed
        TPaneConsultarInventario.setText(null);
        TPaneConsultarInventario1.setText(null);
        Object selecionado = cbConsultarInventario.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);

        if(cbConsultarInventario.getSelectedItem()!= null){
            Nodo_Arbol raizNodo = cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz;

            TPaneConsultarInventario.setText("INFORMACION DE LA SUCURSAL" + enter+ enter + ">> Nombre: " + tab + tab + tab + tab + cadenaSupermercados.buscarSuperMercado(StringSeleccionado).nombreSuperMercado);

            if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz != null){
               TPaneConsultarInventario1.setText("INVENTARIO DISPONIBLE"+ enter+enter+cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.consultarInventario(raizNodo)); 
            }
            else{
               TPaneConsultarInventario1.setText("INVENTARIO DISPONIBLE"+ enter+enter+" No hay productos disponibles");
            }
        }else{
            JOptionPane.showMessageDialog(panelConsultarInventario, "Operación inválida, No hay sucursales registradas en el sistema");
        }
    }//GEN-LAST:event_botonVerConsultarInventarioActionPerformed

    private void botonModificarConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarConsultarInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarConsultarInventarioActionPerformed

    private void botonEliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarInventarioActionPerformed

        Object selecionado = cbConsultarInventario.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
        JCheckBox eliminarTodoInventario = new JCheckBox();
        eliminarTodoInventario.setText("Eliminar Todo el Inventario");

        JTextField StringProductoEliminar = new JTextField();
        JPanel panelMsjEliminar = new JPanel(new GridLayout(0, 1));
        
        panelMsjEliminar.add(eliminarTodoInventario);      
        panelMsjEliminar.add(new JLabel("Ingrese el producto a eliminar:"));
        panelMsjEliminar.add(StringProductoEliminar);

        
        //Valida que haya sucursales registradas y cargadas en el combobox
        if (cbConsultarInventario.getSelectedItem()!=null){
        
            //Este metodo carga el combobox de eliminar inventario.
            
            Nodo_Arbol raizNodo = cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz;

            nodoEsp actual;
            //Valida que el supermercado tenga registrado un inventario
            if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.esVacio()){
                 JOptionPane.showMessageDialog(panelConsultarInventario, "Operación inválida, La sucursal seleccionada \n no tiene inventario registrado en el sistema");
            }
            else{
                int mensajeEliminarInv = JOptionPane.showConfirmDialog(panelConsultarInventario,panelMsjEliminar, "Eliminar Inventario", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (JOptionPane.CANCEL_OPTION != mensajeEliminarInv) {
                    if(eliminarTodoInventario.isSelected()){
                        cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz= null;
                        TPaneConsultarInventario1.setText(null);
                        JOptionPane.showMessageDialog(panelPrincipal, "Se ha eliminado el inventario correctamente");

                    }
                    else{
                        String varProductoQueSeVaAeliminar= StringProductoEliminar.getText();
                        varProductoQueSeVaAeliminar = varProductoQueSeVaAeliminar.replaceAll(" ", "");

                        if (varProductoQueSeVaAeliminar.length() == 0) {
                            JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, ingrese el producto que desea eliminar");
                        }
                        else{
                            String cadenaNombreProductoEliminar = StringProductoEliminar.getText(); 
                            cadenaNombreProductoEliminar = cadenaNombreProductoEliminar.replaceAll(cadenaNombreProductoEliminar.toLowerCase(),cadenaNombreProductoEliminar.toUpperCase());           
                            char charLetraNodoEliminar [] = cadenaNombreProductoEliminar.toCharArray();
                            //Verifica que el nodo existe
                            
                            String aux = StringProductoEliminar.getText(); 
                            
                            if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.buscarSiExiste(charLetraNodoEliminar[0])){
                                if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.getNodo(charLetraNodoEliminar[0]).listaDeProductos.existeProducto(aux)==true){
                                    
                                    //Verifica que la lista dentro del nodo tenga solo un elemento
                                    if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.getNodo(charLetraNodoEliminar[0]).listaDeProductos.tamaño==1){
                                        if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.getNodo(charLetraNodoEliminar[0])==cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz &&cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.tamañoArbol==1){
                                            cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.raiz= null;
                                            System.out.println(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.tamañoArbol);
                                            cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.tamañoArbol--;
                                            System.out.println(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.tamañoArbol);
                                    
                                        }else{
                                        //Revisar porque se cae el eliminar.. agregar contador a metodo eliminar en clase ABB
                                        cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.eliminar(charLetraNodoEliminar[0]);
                                        
                                        }
                                    }
                                    else{
                                        //Si la lista de productos del inventario es mayor a 1 elimina solo el nodo de la lista
                                        cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.getNodo(charLetraNodoEliminar[0]).listaDeProductos.eliminar(aux);
                                        
                                    }
                                    
                                TPaneConsultarInventario1.setText(null);
                                JOptionPane.showMessageDialog(panelPrincipal, "Se ha eliminado el producto correctamente");
                                }else{
                                    JOptionPane.showMessageDialog(panelPrincipal, "El producto no existe en el inventario");
                            
                                }
                            
                            }else{
                                JOptionPane.showMessageDialog(panelPrincipal, "El producto no existe en el inventario");
                            
                            }
                        }
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(panelPrincipal, "No hay sucursales registradas en el sistema");
        }
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
        CBAgregarInventario.removeAllItems();
    }//GEN-LAST:event_atrasAgregarInventarioActionPerformed

    private void botonAñadirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirProdActionPerformed
        //Aqui se escriben los productos en la pantalla
        //VariablesPrueba
        String varPrueba,varPrueba2,varPrueba3 = null;
        
        Object selecionado = CBAgregarInventario.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
        
        varPrueba = TFProducto.getText();
        varPrueba2 = TFCantidad.getText();
        varPrueba3 = TFPrecio.getText();
        
        varPrueba = varPrueba.replaceAll(" ", "");
        varPrueba2 = varPrueba2.replaceAll(" ", "");
        varPrueba3 = varPrueba3.replaceAll(" ", "");
             
        if (varPrueba.length() == 0 || varPrueba2.length() == 0 || varPrueba3.length()==0) {
            JOptionPane.showMessageDialog(panelPrincipal, "Operación Invalida, ingrese todos los datos que se le solicitan");

        } else {
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

            int numCantProd = Integer.parseInt(cantidad);

            String precioUnit = null;
            precioUnit = TFPrecio.getText();
            variabImprimir3 = variabImprimir3 + "\n" + precioUnit;
            TPanePrecio.setText(variabImprimir3);
            TFPrecio.setText(null);

            int numPrecioProd = Integer.parseInt(precioUnit);
            
            //Aqui se extrae el char
            String cadenaNombreProducto = producto; 
            cadenaNombreProducto = cadenaNombreProducto.replaceAll(cadenaNombreProducto.toLowerCase(),cadenaNombreProducto.toUpperCase());           
            char charLetraNodo [] = cadenaNombreProducto.toCharArray();
            

            if(cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.buscarSiExiste(charLetraNodo[0])== true){
                cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.agregarProductos(charLetraNodo[0], producto, numCantProd, numPrecioProd);
               System.out.println("Aqui entro al if que ya esta el nodo echo");
            }
            else{
                cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.insertar(charLetraNodo[0]);
                cadenaSupermercados.buscarSuperMercado(StringSeleccionado).inventario.agregarProductos(charLetraNodo[0], producto, numCantProd, numPrecioProd);
                System.out.println("Aqui entro al else que crea el nodo con el char");
            }           
        }
       
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
                cbConsultarSucursal.removeItem(selecionado);
                TPaneConsultarSucursalesInfo.setText(null);
                TPaneConsultarSucursalesInvent.setText(null);
                JOptionPane.showMessageDialog(panelPrincipal, "Se ha eliminado la sucursal correctamente");

            }
        }
    }//GEN-LAST:event_botonEliminarSucursalActionPerformed

    private void cbConsultarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultarSucursalActionPerformed

    }//GEN-LAST:event_cbConsultarSucursalActionPerformed

    private void botonEliminarConsultarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarConsultarCaminosActionPerformed

        Object selecionado = cbConsultarCaminos.getSelectedItem();
        String StringSeleccionado = String.valueOf(selecionado);
        
        JComboBox cbEliminarCaminoLlegada = new JComboBox();   
        JPanel panelMsjEliminar = new JPanel(new GridLayout(0, 1));

        panelMsjEliminar.add(new JLabel("Camino a eliminar:"));
        panelMsjEliminar.add(cbEliminarCaminoLlegada);

        //Este metodo carga el combobox de eliminar caminos
        nodoEsp actual;
        for(int imprimir = 0; imprimir < cadenaSupermercados.SuperMercados.size(); imprimir++){
            actual = cadenaSupermercados.SuperMercados.get(imprimir);
            if(actual.nombreSuperMercado == StringSeleccionado){
                for(int ruta = 0; ruta < actual.Rutas.size(); ruta++){
                   cbEliminarCaminoLlegada.addItem(actual.Rutas.get(ruta).Ruta);//Asi se accede a la lista con las rutas
                }
            }
        }
                     
        int mensajeEliminarCamino = JOptionPane.showConfirmDialog(panelConsultarModificarCaminos,panelMsjEliminar, "Eliminar camino", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
        if (JOptionPane.CANCEL_OPTION != mensajeEliminarCamino) {
            if (cbEliminarCaminoLlegada.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(panelPrincipal, "Operación inválida, La sucursal seleccionada no tiene caminos registrados en el sistema");

            } else {
                Object caminoElimin = cbEliminarCaminoLlegada.getSelectedItem();
                String StringcaminoElimin = String.valueOf(caminoElimin);
                
                cadenaSupermercados.eliminarRutas(StringSeleccionado, StringcaminoElimin);
                cbEliminarCaminoLlegada.removeItem(StringcaminoElimin);
                TPaneConsultarCaminos.setText(null);
                JOptionPane.showMessageDialog(panelPrincipal, "Se ha eliminado la ruta correctamente");

            }
        }
    }//GEN-LAST:event_botonEliminarConsultarCaminosActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        TPaneProducto.setText(null);
        TPaneCantidad.setText(null);
        TPanePrecio.setText(null);
        variabImprimir = "";
        TPaneProducto.setText(null);
        variabImprimir2 = "";
        TPaneCantidad.setText(null);
        variabImprimir3 = "";
        TPanePrecio.setText(null);
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void botonXpanelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXpanelClienteActionPerformed
        panelGenerarCliente.setVisible(false);
        labelConNombreSucursalDondeHayCliente.setText(null);
          
    }//GEN-LAST:event_botonXpanelClienteActionPerformed

    private void botonComprarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarProductoActionPerformed
        String productoComprado = TFProductoQueSeDeseaAdquirir.getText();
        String cantidCosas = TFCantidadQueSeDeseaAdquirir.getText();
        String sucursal = labelConNombreSucursalDondeHayCliente.getText();
        int numCantProductos = Integer.parseInt(cantidCosas);
        
        String cadenaNombreProducto = productoComprado; 
        cadenaNombreProducto = cadenaNombreProducto.replaceAll(cadenaNombreProducto.toLowerCase(),cadenaNombreProducto.toUpperCase());           
        char charLetraNodo [] = cadenaNombreProducto.toCharArray();
                    
        
        
        if(cadenaSupermercados.buscarSuperMercado(sucursal).inventario.getNodo(charLetraNodo[0]).listaDeProductos.BuscarProducto(productoComprado).cantidadProducto>=numCantProductos){
           cadenaSupermercados.buscarSuperMercado(sucursal).inventario.getNodo(charLetraNodo[0]).listaDeProductos.eliminarCantProduto(productoComprado, numCantProductos);
            System.out.println(cadenaSupermercados.buscarSuperMercado(sucursal).inventario.getNodo(charLetraNodo[0]).listaDeProductos.BuscarProducto(productoComprado).cantidadProducto+ " esta es la canntidad de productos que quedan");
            JOptionPane.showMessageDialog(panelPrincipal, "Se ha comprado el producto deseado");

        }else{
           JOptionPane.showMessageDialog(panelPrincipal, "No hay producto disponible");

        }
        
        
    }//GEN-LAST:event_botonComprarProductoActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecMarketInterfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBAgregarInventario;
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFCantidadQueSeDeseaAdquirir;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTextField TFProducto;
    private javax.swing.JTextField TFProductoQueSeDeseaAdquirir;
    private javax.swing.JTextPane TPaneCantidad;
    private javax.swing.JTextPane TPaneConsultarCaminos;
    private javax.swing.JTextPane TPaneConsultarInventario;
    private javax.swing.JTextPane TPaneConsultarInventario1;
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
    private javax.swing.JButton botonComprarProducto;
    private javax.swing.JButton botonCrearInventario;
    private javax.swing.JButton botonEliminarConsultarCaminos;
    private javax.swing.JButton botonEliminarInventario;
    private javax.swing.JButton botonEliminarSucursal;
    private javax.swing.JButton botonGenerarReporte;
    private javax.swing.JButton botonLupa;
    private javax.swing.JButton botonModificarConsultar;
    private javax.swing.JButton botonModificarConsultarCaminos;
    private javax.swing.JButton botonModificarConsultarInventario;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton botonVerConsultar;
    private javax.swing.JButton botonVerConsultarCaminos;
    private javax.swing.JButton botonVerConsultarInventario;
    private javax.swing.JButton botonXpanelCliente;
    private javax.swing.JComboBox cbCaminoPantallaPrincipal;
    private javax.swing.JComboBox cbConsultarCaminos;
    private javax.swing.JComboBox cbConsultarInventario;
    private javax.swing.JComboBox cbConsultarSucursal;
    private javax.swing.JComboBox cbInventario;
    private javax.swing.JComboBox cbMenorDistanciaTiempo;
    private javax.swing.JComboBox cbReporte;
    private javax.swing.JComboBox cbSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAgregarInventario;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelConNombreSucursalDondeHayCliente;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JLabel labelConsultarCaminos;
    private javax.swing.JLabel labelConsultarInventario;
    private javax.swing.JLabel labelNombreProducto;
    private javax.swing.JLabel labelNombreSucursal1;
    private javax.swing.JLabel labelNombreSucursal3;
    private javax.swing.JLabel labelNombreSucursal4;
    private javax.swing.JLabel labelNombreSucursalAgregInv;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTituloPanelCliente;
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
    private javax.swing.JPanel panelGenerarCliente;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollCantidad;
    private javax.swing.JScrollPane scrollConsultarCaminos;
    private javax.swing.JScrollPane scrollConsultarInventario;
    private javax.swing.JScrollPane scrollConsultarInventario1;
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
