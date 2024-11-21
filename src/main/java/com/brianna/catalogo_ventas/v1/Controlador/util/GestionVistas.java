package com.brianna.catalogo_ventas.v1.Controlador.util;

import Animacion.Animacion;
import com.brianna.catalogo_ventas.v1.Controlador.MenuClienteController;
import com.brianna.catalogo_ventas.v1.Vista.MenuClienteVista;
import com.brianna.catalogo_ventas.v1.Vista.MenuEncargadoVentaVista;
import com.brianna.catalogo_ventas.v1.Vista.RegistroVista;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class GestionVistas {

    public static void transicionVistaContenedor(JPanel contenedor, JPanel posterior) {
        JPanel panelPosterior = posterior;
        panelPosterior.setSize(1080, 728);
        panelPosterior.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(panelPosterior, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void transicionVistaServiciosCliente(JPanel contenedor, JPanel posterior, JPanel menu) {
        JPanel panelMenu = menu;
        panelMenu.setSize(150, 728);
        panelMenu.setLocation(0, 0);
        JPanel panelPosterior = posterior;
        panelPosterior.setSize(930, 728);
        panelPosterior.setLocation(150, 0);
        contenedor.removeAll();
        contenedor.add(panelMenu, BorderLayout.CENTER);
        contenedor.add(panelPosterior, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }



}
