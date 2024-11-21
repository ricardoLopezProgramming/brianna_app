package com.brianna.catalogo_ventas.v1.Controlador;

import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.ClienteDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.ProductoDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Cliente;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Producto;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl.ClienteServicioImpl;
import com.brianna.catalogo_ventas.v1.Vista.Vista;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CatalogoControlador implements ActionListener, DocumentListener {

    private Vista vista;
    public static int cantidadColummnas = 0;
    public static int cantidadFilas = 1;
    public static int witdhGallery = 850;
    public static int heightGallery = 600;

    public CatalogoControlador(Vista vista) {
        this.vista = vista;
        vista.catalogoVista.txtSearchProduct.getDocument().addDocumentListener(this);
        ProductoDAOImpl productoDAOImpl = new ProductoDAOImpl();
        List<Producto> productos = productoDAOImpl.selectByAnyAtributte("");
        productos.forEach(System.out::println);
        List<String> nombres = new ArrayList<>();
        for (Producto p : productos) {
            nombres.add(p.getNombre());
        }
        // Imprime los resultados para depuración

        // Reinicia la galería antes de agregar nuevos elementos
        resetGaleria();

        // Llama al método cards con el tamaño de la lista filtrada
        cards(productos.size(), nombres);
    }

    public void cards(int cantidadCards, List<String> nombres) {
        // Asegúrate de que el panel esté limpio antes de agregar nuevos elementos
        // (esto ya lo hará `resetGaleria` si lo llamas antes)

        for (int i = 0; i < cantidadCards; i++) {
            // Crear un nuevo panel para agregar a la galería
            JPanel p = new JPanel();
            JLabel labelName = new JLabel(nombres.get(i));
            p.setBackground(new Color(254, 247, 255));
            p.setPreferredSize(new Dimension(200, 200)); // Tamaño fijo para los paneles
            p.add(labelName);
            vista.catalogoVista.galeria1.add(p); // Agregar el panel a galeria1

            // Incrementar la cantidad de columnas
            cantidadColummnas++;

            // Si alcanzamos 4 columnas, pasar a la siguiente fila
            if (cantidadColummnas == 4) {
                cantidadColummnas = 0; // Reiniciar columnas
                cantidadFilas++;      // Avanzar a la siguiente fila
            }
        }

        // Ajustar el tamaño del panel basado en las filas calculadas
        vista.catalogoVista.galeria1.setPreferredSize(new Dimension(witdhGallery, 200 * cantidadFilas));

        // Revalidar y repintar solo una vez al final
        vista.catalogoVista.galeria1.revalidate();
        vista.catalogoVista.galeria1.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public void resetGaleria() {
        // Reinicia las filas y columnas
        cantidadColummnas = 0;
        cantidadFilas = 1;

        // Limpia el panel y establece el tamaño inicial
        vista.catalogoVista.galeria1.removeAll();
        vista.catalogoVista.galeria1.setPreferredSize(new Dimension(witdhGallery, heightGallery));

        // Revalida y repinta para reflejar los cambios
        vista.catalogoVista.galeria1.revalidate();
        vista.catalogoVista.galeria1.repaint();

        // También actualiza el JScrollPane
        vista.catalogoVista.scrollGaleria1.revalidate();
        vista.catalogoVista.scrollGaleria1.repaint();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // Método llamado cuando se inserta texto en el JTextField
        String textoIngresado = vista.catalogoVista.txtSearchProduct.getText();

        // Aquí puedes agregar lógica adicional, como realizar una búsqueda
        realizarBusqueda(textoIngresado);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        // Método llamado cuando se elimina texto del JTextField
        String textoIngresado = vista.catalogoVista.txtSearchProduct.getText();
        System.out.println("Texto eliminado: " + textoIngresado);

        // Aquí también puedes realizar alguna acción, como actualizar la búsqueda
        realizarBusqueda(textoIngresado);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método generalmente no se usa para cambios de texto
        // pero es necesario implementarlo porque es parte de la interfaz DocumentListener
    }

    private void realizarBusqueda(String texto) {
        System.out.println("Realizando búsqueda con: " + texto);

        // Obtiene los clientes filtrados
        ProductoDAOImpl productoDAOImpl = new ProductoDAOImpl();
        List<Producto> productos = productoDAOImpl.selectByAnyAtributte(texto);
        productos.forEach(System.out::println);
        List<String> nombres = new ArrayList<>();
        for (Producto p : productos) {
            nombres.add(p.getNombre());
        }
        // Imprime los resultados para depuración

        // Reinicia la galería antes de agregar nuevos elementos
        resetGaleria();

        // Llama al método cards con el tamaño de la lista filtrada
        cards(productos.size(), nombres);
    }

}
//, ' ', YEAR(CURDATE()) - YEAR(fecha_nacimiento)
