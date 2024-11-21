package com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.EncargadoVentaDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.EncargadoVenta;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.EncargadoVentaServicio;
import java.util.List;

public class EncargadoVentaServicioImpl implements EncargadoVentaServicio{
    
    private EncargadoVentaDAOImpl encargadoVentaDAOImpl;

    public EncargadoVentaServicioImpl(EncargadoVentaDAOImpl encargadoVentaDAOImpl) {
        this.encargadoVentaDAOImpl = encargadoVentaDAOImpl;
    }

    @Override
    public EncargadoVenta filtrarPorUsuario(String usuario) {
                return null;

    }

    @Override
    public EncargadoVenta iniciarSesion(String usuario, String contraseña) {
                return null;

    }

    @Override
    public void eliminarUsuario(String usuario, String contraseña) {
    }

    @Override
    public EncargadoVenta filtrarPorId(Long id) {
              return null;

    }

    @Override
    public List<EncargadoVenta> filtrarPorAtributo(String atributo) {
                return null;

    }

    @Override
    public List<EncargadoVenta> listarRegistros() {
              return null;

    }

    @Override
    public void registrar(EncargadoVenta entidad) {
    }

    @Override
    public void actualizarRegistroPorID(Long id) {
    }

    @Override
    public void eliminarRegistro(Long id) {
    }
    
   
    
    
}
