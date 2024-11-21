/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brianna.catalogo_ventas.v1.Controlador.util;

/**
 *
 * @author Usuario
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicGridExample {
    private JFrame frame;
    private JPanel panel;  // El panel principal que contendrá todos los paneles hijos
    private JButton addButton; // Botón para agregar más paneles
    private int rowCount = 0; // Contador de filas agregadas
    private int columnCount = 0; // Contador de paneles en la fila actual

    public DynamicGridExample() {
        frame = new JFrame("Dynamic Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Crear el panel principal con GridBagLayout
        panel = new JPanel(new GridBagLayout());
        frame.add(new JScrollPane(panel), BorderLayout.CENTER);  // Usamos JScrollPane para que el panel sea desplazable.

        // Botón para agregar más paneles
        addButton = new JButton("Agregar Panel");
        frame.add(addButton, BorderLayout.SOUTH);

        // Acción del botón para agregar un panel
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addSinglePanel(); // Agregar un solo panel
            }
        });

        frame.setVisible(true);
    }

    // Método para agregar un único panel al GridBagLayout
    private void addSinglePanel() {
        // Crear un nuevo panel de 200x200
        JPanel newPanel = createPanel();

        // Configuración de GridBagConstraints para este panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE; // Los paneles no deben expandirse
        gbc.weightx = 0.0; // Sin expansión en el eje horizontal

        // Asignar la posición de cada panel en la fila actual
        gbc.gridx = columnCount;  // La columna actual (de 0 a 3)
        gbc.gridy = rowCount;  // La fila actual

        // Añadir el nuevo panel al layout
        panel.add(newPanel, gbc);

        // Incrementar el contador de columnas
        columnCount++;

        // Si ya hay 4 paneles en la fila, cambiar a la siguiente fila
        if (columnCount >= 4) {
            columnCount = 0; // Reiniciar el contador de columnas (empezar de nuevo en la siguiente fila)
            rowCount++; // Avanzar a la siguiente fila
        }

        // Revalidar y repintar para ajustar el diseño del panel
        panel.revalidate();
        panel.repaint();
    }

    // Crear un JPanel de 200x200
    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color((int)(Math.random() * 0x1000000))); // Color aleatorio para el panel
        panel.add(new JLabel("Panel", SwingConstants.CENTER));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DynamicGridExample();
            }
        });
    }
}
