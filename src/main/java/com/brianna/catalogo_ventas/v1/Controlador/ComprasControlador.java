package com.brianna.catalogo_ventas.v1.Controlador;

import com.brianna.catalogo_ventas.v1.Vista.Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class ComprasControlador implements ActionListener {

    private Vista vista;


    public ComprasControlador(Vista vista) {
        this.vista = vista;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}


/*
public class ComprasControlador implements ActionListener {

    private Vista vista;
    public static int cantidadColumnas = 0;
    public static int cantidadFilas = 0;
    public static int widthGallery = 800;
    public static int heightGallery = 600;
    public static int x = 0;
    public static int y = 0;

    public ComprasControlador(Vista vista) {
        this.vista = vista;
        vista.comprasVista.btnAgregar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.comprasVista.btnAgregar) {
            // Crear un nuevo JPanel
            JPanel p = new JPanel();
            p.setBackground(Color.BLUE);
            p.setPreferredSize(new Dimension(200, 200)); // Mejor usar PreferredSize

            // Si el contenedor tiene un LayoutManager, como FlowLayout o GridLayout,
            // no es necesario establecer la posición con setLocation
            // p.setLocation(x, y); // No es necesario si usas un LayoutManager adecuado

            // Si usas un LayoutManager adecuado (como FlowLayout o GridLayout),
            // los paneles se agregarán automáticamente en la posición correcta.

            // Agregar el JPanel al contenedor `galeria1`
            vista.comprasVista.galeria1.add(p); // Sin especificar BorderLayout.CENTER, ya que el LayoutManager lo maneja

            // Actualizar el layout y redibujar el contenedor
            vista.comprasVista.galeria1.revalidate();
            vista.comprasVista.galeria1.repaint();

            // Actualizar las variables de control para la disposición
            cantidadColumnas++;
            x += 200;

            // Ajustar el tamaño del contenedor si es necesario (preferido)
            vista.comprasVista.galeria1.setPreferredSize(new Dimension(widthGallery, cantidadFilas * 200)); // Ajuste dinámico

            // Volver a validar el contenedor después de cambiar su tamaño preferido
            vista.comprasVista.galeria1.revalidate();
            vista.comprasVista.galeria1.repaint();
        }
    }
}

*/