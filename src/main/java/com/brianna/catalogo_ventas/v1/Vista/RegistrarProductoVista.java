/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.brianna.catalogo_ventas.v1.Vista;

/**
 *
 * @author Usuario
 */
public class RegistrarProductoVista extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarProductoVista
     */
    public RegistrarProductoVista() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtIGV = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProveedor = new javax.swing.JTextField();
        txtPrecioBase = new javax.swing.JTextField();
        txtPrecioFinal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        btnRegistrarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        ToggleBtnSeleccionarProducto = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioBase1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecioBase2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPrecioBase3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPrecioBase4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtBuscarProducto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 200, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 40));
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 40));
        jPanel1.add(txtPrecioProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, 40));
        jPanel1.add(txtPrecioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 200, 40));
        jPanel1.add(txtPrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 200, 40));

        jLabel5.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(98, 91, 113));
        jLabel5.setText("Numero");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(98, 91, 113));
        jLabel7.setText("Descripcion del producto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(98, 91, 113));
        jLabel8.setText("Nombre de producto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(98, 91, 113));
        jLabel9.setText("RUC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(98, 91, 113));
        jLabel11.setText("Distrito");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 91, 113));
        jLabel12.setText("DNI");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        btnEliminarProducto.setText("Eliminar producto");
        jPanel1.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 150, 50));

        btnRegistrarProducto.setText("Registrar producto");
        jPanel1.add(btnRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 150, 50));

        btnActualizarProducto.setText("Actualizar producto");
        jPanel1.add(btnActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 150, 50));

        ToggleBtnSeleccionarProducto.setText("Seleccionar producto");
        jPanel1.add(ToggleBtnSeleccionarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 150, 50));

        jLabel14.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(98, 91, 113));
        jLabel14.setText("Direccion");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));
        jPanel1.add(txtPrecioBase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 200, 40));

        jLabel16.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(98, 91, 113));
        jLabel16.setText("Correo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));
        jPanel1.add(txtPrecioBase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 200, 40));

        jLabel17.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(98, 91, 113));
        jLabel17.setText("Usuario");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));
        jPanel1.add(txtPrecioBase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 40));

        jLabel18.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(98, 91, 113));
        jLabel18.setText("Contraseña");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));
        jPanel1.add(txtPrecioBase4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 370, 900, 350));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 75, 900, 290));
        add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 200, 40));

        jLabel15.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(98, 91, 113));
        jLabel15.setText("Barra de busqueda");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ToggleBtnSeleccionarProducto;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioBase;
    private javax.swing.JTextField txtPrecioBase1;
    private javax.swing.JTextField txtPrecioBase2;
    private javax.swing.JTextField txtPrecioBase3;
    private javax.swing.JTextField txtPrecioBase4;
    private javax.swing.JTextField txtPrecioFinal;
    private javax.swing.JTextField txtPrecioProveedor;
    // End of variables declaration//GEN-END:variables
}
