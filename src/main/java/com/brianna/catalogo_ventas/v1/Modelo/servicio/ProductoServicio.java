package com.brianna.catalogo_ventas.v1.Modelo.servicio;

import com.brianna.catalogo_ventas.v1.Modelo.entidad.Producto;

public interface ProductoServicio extends Servicio<Producto> {

    void registrarProducto(Producto producto);

    Producto buscarProductoPorNombre(String nombre);

    void actualizarProductoPorID(Long id);

    void actualizarProducto(Producto producto);

    void eliminarProductoPorID(Long id);

}
