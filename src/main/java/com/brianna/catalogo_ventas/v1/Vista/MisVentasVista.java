/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.brianna.catalogo_ventas.v1.Vista;

/**
 *
 * @author Usuario
 */
public class MisVentasVista extends javax.swing.JPanel {

    /**
     * Creates new form MisVentasVista
     */
    public MisVentasVista() {
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

        jLabel15 = new javax.swing.JLabel();
        txtBuscarKardex = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKardex = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(98, 91, 113));
        jLabel15.setText("Barra de busqueda");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));
        add(txtBuscarKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 200, 40));

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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKardex;
    private javax.swing.JTextField txtBuscarKardex;
    // End of variables declaration//GEN-END:variables
}
