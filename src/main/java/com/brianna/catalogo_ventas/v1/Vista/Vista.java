package com.brianna.catalogo_ventas.v1.Vista;

import Animacion.Animacion;
import com.brianna.catalogo_ventas.v1.Modelo.persistencia.BD;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends javax.swing.JFrame {

    public SesionVista sesion;
    public RegistroVista registroVista;
    public CatalogoVista catalogoVista;
    public ComprasVista comprasVista;
    public MisVentasVista misVentasVista;
    public RegistrarProductoVista registrarProductoVista;
    public MenuClienteVista menuClienteVista;
    public MenuEncargadoVentaVista menuEncargadoVentaVista;
    public MenuEncargadoInventarioVista menuEncargadoInventarioVista;

    public Vista() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        initContent();

    }

    public void initContent() {
        sesion = new SesionVista();
        sesion.setSize(1080, 728);
        sesion.setLocation(0, 0);
        contenedorVista.removeAll();
        contenedorVista.add(sesion, BorderLayout.CENTER);
        contenedorVista.revalidate();
        contenedorVista.repaint();

    }

    public void registro() {
        registroVista = new RegistroVista();
        registroVista.setSize(1080, 728);
        registroVista.setLocation(0, 0);
        contenedorVista.removeAll();
        contenedorVista.add(registroVista, BorderLayout.CENTER);
        contenedorVista.revalidate();
        contenedorVista.repaint();
    }

    public void serviciosCliente() {
        JPanel servicios = serviciosVista;
        JPanel contenedorServicios = contenedorServiciosVista;
        servicios.setSize(1080, 728);
        servicios.setLocation(0, 0);
        contenedorVista.removeAll();
        contenedorVista.add(servicios, BorderLayout.CENTER);
        contenedorVista.revalidate();
        contenedorVista.repaint();

        menuClienteVista = new MenuClienteVista();
        menuClienteVista.setSize(150, 728);
        menuClienteVista.setLocation(0, 0);
        contenedorServicios.setSize(930, 728);
        contenedorServicios.setLocation(150, 0);
        serviciosVista.removeAll();
        serviciosVista.add(menuClienteVista, BorderLayout.CENTER);
        serviciosVista.add(contenedorServicios, BorderLayout.CENTER);
        serviciosVista.revalidate();
        serviciosVista.repaint();

        catalogoVista = new CatalogoVista();
        catalogoVista.setSize(930, 728);
        catalogoVista.setLocation(0, 0);
        contenedorServiciosVista.removeAll();
        contenedorServiciosVista.add(catalogoVista, BorderLayout.CENTER);
        contenedorServiciosVista.revalidate();
        contenedorServiciosVista.repaint();
    }
    
        public void serviciosEncargadoVenta() {
        JPanel servicios = serviciosVista;
        JPanel contenedorServicios = contenedorServiciosVista;
        servicios.setSize(1080, 728);
        servicios.setLocation(0, 0);
        contenedorVista.removeAll();
        contenedorVista.add(servicios, BorderLayout.CENTER);
        contenedorVista.revalidate();
        contenedorVista.repaint();

        menuEncargadoVentaVista = new MenuEncargadoVentaVista();
        menuEncargadoVentaVista.setSize(150, 728);
        menuEncargadoVentaVista.setLocation(0, 0);
        contenedorServicios.setSize(930, 728);
        contenedorServicios.setLocation(150, 0);
        serviciosVista.removeAll();
        serviciosVista.add(menuEncargadoVentaVista, BorderLayout.CENTER);
        serviciosVista.add(contenedorServicios, BorderLayout.CENTER);
        serviciosVista.revalidate();
        serviciosVista.repaint();

        catalogoVista = new CatalogoVista();
        catalogoVista.setSize(930, 728);
        catalogoVista.setLocation(0, 0);
        contenedorServiciosVista.removeAll();
        contenedorServiciosVista.add(catalogoVista, BorderLayout.CENTER);
        contenedorServiciosVista.revalidate();
        contenedorServiciosVista.repaint();
    }
        public void serviciosEncargadoInventario() {
        JPanel servicios = serviciosVista;
        JPanel contenedorServicios = contenedorServiciosVista;
        servicios.setSize(1080, 728);
        servicios.setLocation(0, 0);
        contenedorVista.removeAll();
        contenedorVista.add(servicios, BorderLayout.CENTER);
        contenedorVista.revalidate();
        contenedorVista.repaint();

        menuEncargadoInventarioVista = new MenuEncargadoInventarioVista();
        menuEncargadoInventarioVista.setSize(150, 728);
        menuEncargadoInventarioVista.setLocation(0, 0);
        contenedorServicios.setSize(930, 728);
        contenedorServicios.setLocation(150, 0);
        serviciosVista.removeAll();
        serviciosVista.add(menuEncargadoInventarioVista, BorderLayout.CENTER);
        serviciosVista.add(contenedorServicios, BorderLayout.CENTER);
        serviciosVista.revalidate();
        serviciosVista.repaint();

        misVentasVista = new MisVentasVista();
        misVentasVista.setSize(930, 728);
        misVentasVista.setLocation(0, 0);
        contenedorServiciosVista.removeAll();
        contenedorServiciosVista.add(misVentasVista, BorderLayout.CENTER);
        contenedorServiciosVista.revalidate();
        contenedorServiciosVista.repaint();
    }

    public void catalogo() {
        catalogoVista = new CatalogoVista();
        catalogoVista.setSize(930, 728);
        catalogoVista.setLocation(0, 0);
        contenedorServiciosVista.removeAll();
        contenedorServiciosVista.add(catalogoVista, BorderLayout.CENTER);
        contenedorServiciosVista.revalidate();
        contenedorServiciosVista.repaint();
    }

    public void compras() {
        comprasVista = new ComprasVista();
        comprasVista.setSize(930, 728);
        comprasVista.setLocation(0, 0);
        contenedorServiciosVista.removeAll();
        contenedorServiciosVista.add(comprasVista, BorderLayout.CENTER);
        contenedorServiciosVista.revalidate();
        contenedorServiciosVista.repaint();
    }
    
    public void registroProducto() {
        registrarProductoVista = new RegistrarProductoVista();
        registrarProductoVista.setSize(930, 728);
        registrarProductoVista.setLocation(0, 0);
        contenedorServiciosVista.removeAll();
        contenedorServiciosVista.add(registrarProductoVista, BorderLayout.CENTER);
        contenedorServiciosVista.revalidate();
        contenedorServiciosVista.repaint();
    }

    /*  public void serviciosClienteContent() {
        menuCliente = new MenuClienteVista();
        menuCliente.setSize(150, 728);
        menuCliente.setLocation(0, 0);
        menuCliente.removeAll();
        menuCliente.add(sesion, BorderLayout.CENTER);
        menuCliente.revalidate();
        menuCliente.repaint();
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JPanel();
        btnSalirApp = new javax.swing.JButton();
        contenedorVista = new javax.swing.JPanel();
        serviciosVista = new javax.swing.JPanel();
        contenedorServiciosVista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirApp.setText("X");
        btnSalirApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAppActionPerformed(evt);
            }
        });
        barra.add(btnSalirApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 40, 40));

        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        contenedorVista.setBackground(new java.awt.Color(255, 255, 255));

        serviciosVista.setBackground(new java.awt.Color(0, 51, 51));
        serviciosVista.setPreferredSize(new java.awt.Dimension(150, 728));

        contenedorServiciosVista.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout contenedorServiciosVistaLayout = new javax.swing.GroupLayout(contenedorServiciosVista);
        contenedorServiciosVista.setLayout(contenedorServiciosVistaLayout);
        contenedorServiciosVistaLayout.setHorizontalGroup(
            contenedorServiciosVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        contenedorServiciosVistaLayout.setVerticalGroup(
            contenedorServiciosVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout serviciosVistaLayout = new javax.swing.GroupLayout(serviciosVista);
        serviciosVista.setLayout(serviciosVistaLayout);
        serviciosVistaLayout.setHorizontalGroup(
            serviciosVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviciosVistaLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(contenedorServiciosVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        serviciosVistaLayout.setVerticalGroup(
            serviciosVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorServiciosVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout contenedorVistaLayout = new javax.swing.GroupLayout(contenedorVista);
        contenedorVista.setLayout(contenedorVistaLayout);
        contenedorVistaLayout.setHorizontalGroup(
            contenedorVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serviciosVista, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        contenedorVistaLayout.setVerticalGroup(
            contenedorVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serviciosVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(contenedorVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 728));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAppActionPerformed
                BD.closeConnection();
                System.exit(0); // Terminar la aplicación

    }//GEN-LAST:event_btnSalirAppActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel barra;
    public javax.swing.JButton btnSalirApp;
    public javax.swing.JPanel contenedorServiciosVista;
    public javax.swing.JPanel contenedorVista;
    public javax.swing.JPanel serviciosVista;
    // End of variables declaration//GEN-END:variables
}
