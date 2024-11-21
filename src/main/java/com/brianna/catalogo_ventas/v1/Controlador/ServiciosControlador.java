package com.brianna.catalogo_ventas.v1.Controlador;

import com.brianna.catalogo_ventas.v1.Vista.CatalogoVista;
import com.brianna.catalogo_ventas.v1.Vista.ComprasVista;
import com.brianna.catalogo_ventas.v1.Vista.MenuClienteVista;
import com.brianna.catalogo_ventas.v1.Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServiciosControlador implements ActionListener {

    private Vista vista;
    CatalogoControlador catalogo;

    public ServiciosControlador(Vista vista) {
        this.vista = vista;
        if (vista.menuClienteVista != null) {
            vista.menuClienteVista.btnCatalogo.addActionListener(this);
            vista.menuClienteVista.btnCompras.addActionListener(this);
            vista.menuClienteVista.btnSalir.addActionListener(this);
        } else if (vista.menuEncargadoVentaVista != null) {
            vista.menuEncargadoVentaVista.btnPerfil.addActionListener(this);
            vista.menuEncargadoVentaVista.btnMisVentas.addActionListener(this);
            vista.menuEncargadoVentaVista.btnClientes.addActionListener(this);
            vista.menuEncargadoVentaVista.btnReportes.addActionListener(this);
            vista.menuEncargadoVentaVista.btnCerrarSesion.addActionListener(this);
        }
        catalogo = new CatalogoControlador(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vista.menuClienteVista != null) {
            System.out.println("menu cliente");
            if (e.getSource() == vista.menuClienteVista.btnCatalogo) {
                if (vista.catalogoVista.getParent() != vista.contenedorServiciosVista) {
                    System.out.println(" poner catalogo");
                    vista.catalogo();
                    CatalogoControlador catalogo = new CatalogoControlador(vista);
                }
            } else if (e.getSource() == vista.menuClienteVista.btnCompras) {
                System.out.println("Boton compras");
                if (vista.comprasVista == null || vista.comprasVista.getParent() != vista.contenedorServiciosVista) {
                    System.out.println(" poner compras");
                    vista.compras();

                }
            } else if (e.getSource() == vista.menuClienteVista.btnSalir) {
                System.exit(0);
            }
        } else if (vista.menuEncargadoVentaVista != null) {
            if (e.getSource() == vista.menuEncargadoVentaVista.btnPerfil) {
                if (vista.catalogoVista.getParent() != vista.contenedorServiciosVista) {
                    vista.catalogo();
                    CatalogoControlador catalogo = new CatalogoControlador(vista);
                }
            } else if (e.getSource() == vista.menuEncargadoVentaVista.btnMisVentas) {
                if (vista.comprasVista == null || vista.comprasVista.getParent() != vista.contenedorServiciosVista) {
                    vista.compras();
                    
                }
            } else if (e.getSource() == vista.menuEncargadoVentaVista.btnClientes) {
                if (vista.registrarProductoVista == null || vista.registrarProductoVista.getParent() != vista.contenedorServiciosVista) {
                    vista.registroProducto();

                }
            }else if (e.getSource() == vista.menuEncargadoVentaVista.btnReportes) {
                if (vista.registrarProductoVista == null || vista.registrarProductoVista.getParent() != vista.contenedorServiciosVista) {
                    vista.registroProducto();

                }
            } else if (e.getSource() == vista.menuEncargadoVentaVista.btnCerrarSesion) {
                vista.initContent();
                //}
            }
        }
    }

}
