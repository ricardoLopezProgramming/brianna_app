package com.brianna.catalogo_ventas.v1.Controlador;

import com.brianna.catalogo_ventas.v1.Controlador.util.GestionVistas;
import com.brianna.catalogo_ventas.v1.Vista.CatalogoVista;
import com.brianna.catalogo_ventas.v1.Vista.MenuClienteVista;
import com.brianna.catalogo_ventas.v1.Vista.SesionVista;
import com.brianna.catalogo_ventas.v1.Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuClienteController implements ActionListener {

    private Vista vista;
    private MenuClienteVista menuCliente;
    private CatalogoVista catalogoVista;
    static String posicion = "catalogo";

    public MenuClienteController(Vista vista, MenuClienteVista menuCliente, CatalogoVista catalogoVista) {
        this.vista = vista;
        this.menuCliente = menuCliente;
        this.catalogoVista = catalogoVista;
        menuCliente.btnSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuCliente.btnCatalogo) {
            if (!posicion.equals("catalogo")) {
                CatalogoVista catalogoVista = new CatalogoVista();
                
            }
        } else if (e.getSource() == menuCliente.btnSalir) {
            SesionVista sesionVista = new SesionVista();
        }
    }

}
