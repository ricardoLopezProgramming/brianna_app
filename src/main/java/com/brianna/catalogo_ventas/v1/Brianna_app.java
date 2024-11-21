package com.brianna.catalogo_ventas.v1;

import com.brianna.catalogo_ventas.v1.Controlador.SesionControlador;
import com.brianna.catalogo_ventas.v1.Modelo.persistencia.BD;
import com.brianna.catalogo_ventas.v1.Vista.Vista;
import com.formdev.flatlaf.FlatLightLaf;

public class Brianna_app {

    public static void main(String[] args) throws java.text.ParseException {

        FlatLightLaf.setup();
        Vista vista = new Vista();
        SesionControlador sesion = new SesionControlador(vista);

        vista.setVisible(true); // Mostrar la ventana
    }
}
