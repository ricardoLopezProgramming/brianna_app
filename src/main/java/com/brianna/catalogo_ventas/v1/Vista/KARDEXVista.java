/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.brianna.catalogo_ventas.v1.Vista;

/**
 *
 * @author Usuario
 */
public class KARDEXVista extends javax.swing.JPanel {

    /**
     * Creates new form KARDEXVista
     */
    public KARDEXVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIGV = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetalleKardex = new javax.swing.JTextArea();
        txtCantIngreso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnDescargarKardex = new javax.swing.JButton();
        btnRegistrarKardex = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtFechaMovKardex = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTotalKardex = new javax.swing.JTextField();
        cbxSublinea = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbxProductoKardex = new javax.swing.JComboBox<>();
        cbxProveedor = new javax.swing.JComboBox<>();
        cbxAlmacen = new javax.swing.JComboBox<>();
        cbxLinea = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cbxMovKardex = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKardex = new javax.swing.JTable();
        txtBuscarKardex = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 200, 40));

        txtDetalleKardex.setColumns(20);
        txtDetalleKardex.setLineWrap(true);
        txtDetalleKardex.setRows(5);
        jScrollPane2.setViewportView(txtDetalleKardex);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 110));
        jPanel1.add(txtCantIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, 40));

        jLabel5.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(98, 91, 113));
        jLabel5.setText("Cantidad de productos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(98, 91, 113));
        jLabel7.setText("Detalle");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(98, 91, 113));
        jLabel8.setText("Producto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 91, 113));
        jLabel12.setText("Precio unitario");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        btnDescargarKardex.setText("Descargar KARDEX");
        jPanel1.add(btnDescargarKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 50));

        btnRegistrarKardex.setText("Registrar KARDEX");
        jPanel1.add(btnRegistrarKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 50));

        jLabel17.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(98, 91, 113));
        jLabel17.setText("Fecha de movimiento");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));
        jPanel1.add(txtFechaMovKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 200, 40));

        jLabel18.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(98, 91, 113));
        jLabel18.setText("Total");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));
        jPanel1.add(txtTotalKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 200, 40));

        cbxSublinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxSublinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 200, 40));

        jLabel19.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(98, 91, 113));
        jLabel19.setText("Almacen");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel20.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(98, 91, 113));
        jLabel20.setText("Linea");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jLabel21.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(98, 91, 113));
        jLabel21.setText("Sublinea");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel22.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(98, 91, 113));
        jLabel22.setText("Proveedor");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        cbxProductoKardex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxProductoKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 40));

        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 200, 40));

        cbxAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 200, 40));

        cbxLinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 200, 40));

        jLabel23.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(98, 91, 113));
        jLabel23.setText("Tipo de movimiento");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        cbxMovKardex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));
        jPanel1.add(cbxMovKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 370, 900, 350));

        tblKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblKardex);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 75, 900, 290));
        add(txtBuscarKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 200, 40));

        jLabel15.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(98, 91, 113));
        jLabel15.setText("Barra de busqueda");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargarKardex;
    private javax.swing.JButton btnRegistrarKardex;
    private javax.swing.JComboBox<String> cbxAlmacen;
    private javax.swing.JComboBox<String> cbxLinea;
    private javax.swing.JComboBox<String> cbxMovKardex;
    private javax.swing.JComboBox<String> cbxProductoKardex;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> cbxSublinea;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKardex;
    private javax.swing.JTextField txtBuscarKardex;
    private javax.swing.JTextField txtCantIngreso;
    private javax.swing.JTextArea txtDetalleKardex;
    private javax.swing.JTextField txtFechaMovKardex;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtTotalKardex;
    // End of variables declaration//GEN-END:variables
}
