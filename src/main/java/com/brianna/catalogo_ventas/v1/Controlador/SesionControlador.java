package com.brianna.catalogo_ventas.v1.Controlador;

import com.brianna.catalogo_ventas.v1.Modelo.dao.DAO;
import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.ClienteDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.EncargadoInventarioDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.EncargadoVentaDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Cliente;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.EncargadoVenta;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.Servicio;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl.ClienteServicioImpl;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl.EncargadoInventarioServicioImpl;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl.EncargadoVentaServicioImpl;

import com.brianna.catalogo_ventas.v1.Vista.Vista;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SesionControlador implements ActionListener, FocusListener {

    private Vista vista;

    // Constructor recibe la vista y la fábrica de DAO como dependencias
    public SesionControlador(Vista vista) {
        this.vista = vista;
        vista.sesion.btnSesion.addActionListener(this);
        vista.sesion.btnRegistrarse.addActionListener(this);
        vista.sesion.txtUsuario.addFocusListener(this);
        vista.sesion.txtContraseña.addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.sesion.btnSesion) {
            //Inicio de sesion
            String usuario = vista.sesion.txtUsuario.getText();
            String contraseña = new String(vista.sesion.txtContraseña.getPassword());

            if (vista.sesion.cbxUsuario.getSelectedItem().toString().equals("Cliente")) {
                ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
                /* ClienteServicioImpl clienteServicioImpl = new ClienteServicioImpl(clienteDAOImpl);
                Cliente cliente = clienteServicioImpl.iniciarSesion(usuario, contraseña); // Llamar al método de inicio de sesión*/

                if (clienteDAOImpl.getUserByUsernameAndPassword(usuario, contraseña) != null) {

                    vista.serviciosCliente();
                    ServiciosControlador servicios = new ServiciosControlador(vista);

                }
            } else if (vista.sesion.cbxUsuario.getSelectedItem().toString().equals("Encargado de ventas")) {
                EncargadoVentaDAOImpl encargadoVentaDAOImpl = new EncargadoVentaDAOImpl();
                /* EncargadoVentaServicioImpl encargadoVentaServicioImpl = new EncargadoVentaServicioImpl(encargadoVentaDAOImpl);
                EncargadoVenta encargadoVenta = encargadoVentaServicioImpl.iniciarSesion(usuario, contraseña);*/

                if (encargadoVentaDAOImpl.getUserByUsernameAndPassword(usuario, contraseña) != null) {

                    vista.serviciosEncargadoVenta();
                    ServiciosControlador servicios = new ServiciosControlador(vista);

                }
            } else if (vista.sesion.cbxUsuario.getSelectedItem().toString().equals("Encargado de inventario")) {
                EncargadoInventarioDAOImpl encargadoInventarioDAOImpl = new EncargadoInventarioDAOImpl();
                EncargadoInventarioServicioImpl encargadoInventarioServicioImpl = new EncargadoInventarioServicioImpl(encargadoInventarioDAOImpl);
                if (encargadoInventarioServicioImpl.iniciarSesion(usuario, contraseña) != null) {
                    vista.serviciosEncargadoInventario();
                    
                }
            }
        } else if (e.getSource() == vista.sesion.btnRegistrarse) {
            vista.registro();
            RegistroControlador registroControlador = new RegistroControlador(vista);
        }
        /*else if (e.getSource() == vista.btnVolver) {
            //Regreso a inicio de sesion
            vista.sesionVista.setLocation(0, 40);
            vista.img1.setLocation(0, 0);
            vista.registroVista.setLocation(-1080, 40);
        }*/

    }

    @Override
    public void focusGained(FocusEvent e
    ) {
        if (e.getSource() == vista.sesion.txtUsuario) {
            if (vista.sesion.txtUsuario.getText().equals("Ingresar usuario")) {
                vista.sesion.txtUsuario.setText("");
                vista.sesion.txtUsuario.setForeground(Color.BLACK);
            }
        }

        if (e.getSource() == vista.sesion.txtContraseña) {
            if (new String((char[]) vista.sesion.txtContraseña.getPassword()).equals("Ingresar contraseña")) {
                vista.sesion.txtContraseña.setText("");
                vista.sesion.txtContraseña.setForeground(Color.BLACK);
                vista.sesion.txtContraseña.setEchoChar('*');

            }
        }
    }

    @Override
    public void focusLost(FocusEvent e
    ) {
        if (e.getSource() == vista.sesion.txtUsuario) {
            if (vista.sesion.txtUsuario.getText().equals("")) {
                vista.sesion.txtUsuario.setText("Ingresar usuario");
                vista.sesion.txtUsuario.setForeground(new Color(91, 91, 91));
            }
        }

        if (e.getSource() == vista.sesion.txtContraseña) {
            if (new String((char[]) vista.sesion.txtContraseña.getPassword()).equals("")) {
                vista.sesion.txtContraseña.setText("Ingresar contraseña");
                vista.sesion.txtContraseña.setForeground(new Color(91, 91, 91));
                vista.sesion.txtContraseña.setEchoChar('\u0000');
            }
        }
    }

}
