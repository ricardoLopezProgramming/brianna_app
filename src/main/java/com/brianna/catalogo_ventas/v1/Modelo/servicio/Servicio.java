
package com.brianna.catalogo_ventas.v1.Modelo.servicio;

import java.util.List;


public interface Servicio<T> {
    
    T filtrarPorId(Long id);
    
    List<T> filtrarPorAtributo(String atributo);
    
    List<T> listarRegistros();

    void registrar(T entidad);

    void actualizarRegistroPorID(Long id);
      
    void eliminarRegistro(Long id);
    
 
    
}
