package com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.EncargadoInventarioDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.EncargadoInventario;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.EncargadoInventarioServicio;
import java.util.List;

public class EncargadoInventarioServicioImpl implements EncargadoInventarioServicio{

    private EncargadoInventarioDAOImpl encargadoInventarioDAOImpl;

    public EncargadoInventarioServicioImpl(EncargadoInventarioDAOImpl encargadoInventarioDAOImpl) {
        this.encargadoInventarioDAOImpl = encargadoInventarioDAOImpl;
    }
    
    @Override
    public EncargadoInventario filtrarPorUsuario(String usuario) {
        return encargadoInventarioDAOImpl.getUserByUsername(usuario);
    }

    @Override
    public EncargadoInventario iniciarSesion(String usuario, String contraseña) {
        return encargadoInventarioDAOImpl.getUserByUsernameAndPassword(usuario, contraseña);
    }

    @Override
    public void eliminarUsuario(String usuario, String contraseña) {
        encargadoInventarioDAOImpl.deleteUserByUsernameAndPassword(usuario, contraseña);
    }

    @Override
    public EncargadoInventario filtrarPorId(Long id) {
        return encargadoInventarioDAOImpl.selectByID(id);
    }

    @Override
    public List<EncargadoInventario> filtrarPorAtributo(String atributo) {
        return encargadoInventarioDAOImpl.selectByAnyAtributte(atributo);
    }

    @Override
    public List<EncargadoInventario> listarRegistros() {
        return encargadoInventarioDAOImpl.selectALL();
    }

    @Override
    public void registrar(EncargadoInventario entidad) {
        encargadoInventarioDAOImpl.insert(entidad);
    }

    @Override
    public void actualizarRegistroPorID(Long id) {
        encargadoInventarioDAOImpl.updateByID(id);
    }

    @Override
    public void eliminarRegistro(Long id) {
        encargadoInventarioDAOImpl.deleteByID(id);
    }

}
