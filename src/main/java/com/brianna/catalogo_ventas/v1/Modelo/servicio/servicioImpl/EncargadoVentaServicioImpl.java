package com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.EncargadoVentaDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.EncargadoVenta;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.EncargadoVentaServicio;
import java.util.List;

public class EncargadoVentaServicioImpl implements EncargadoVentaServicio {
    
    private EncargadoVentaDAOImpl encargadoVentaDAOImpl;
    
    public EncargadoVentaServicioImpl(EncargadoVentaDAOImpl encargadoVentaDAOImpl) {
        this.encargadoVentaDAOImpl = encargadoVentaDAOImpl;
    }
    
    @Override
    public EncargadoVenta filtrarPorUsuario(String usuario) {
        return encargadoVentaDAOImpl.getUserByUsername(usuario);
    }
    
    @Override
    public EncargadoVenta iniciarSesion(String usuario, String contraseña) {
        return encargadoVentaDAOImpl.getUserByUsernameAndPassword(usuario, contraseña);
    }
    
    @Override
    public void eliminarUsuario(String usuario, String contraseña) {
        encargadoVentaDAOImpl.deleteUserByUsernameAndPassword(usuario, contraseña);
    }
    
    @Override
    public EncargadoVenta filtrarPorId(Long id) {
        return encargadoVentaDAOImpl.selectByID(id);
    }
    
    @Override
    public List<EncargadoVenta> filtrarPorAtributo(String atributo) {
        return encargadoVentaDAOImpl.selectByAnyAtributte(atributo);
    }
    
    @Override
    public List<EncargadoVenta> listarRegistros() {
        return encargadoVentaDAOImpl.selectALL();
    }
    
    @Override
    public void registrar(EncargadoVenta entidad) {
        encargadoVentaDAOImpl.insert(entidad);
    }
    
    @Override
    public void actualizarRegistroPorID(Long id) {
        encargadoVentaDAOImpl.updateByID(id);
    }
    
    @Override
    public void eliminarRegistro(Long id) {
        encargadoVentaDAOImpl.deleteByID(id);
    }
    
}
