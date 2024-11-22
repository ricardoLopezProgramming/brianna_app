package com.brianna.catalogo_ventas.v1.Modelo.servicio.servicioImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl.ClienteDAOImpl;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Cliente;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Usuario;
import com.brianna.catalogo_ventas.v1.Modelo.servicio.ClienteServicio;
import java.util.List;

public class ClienteServicioImpl implements ClienteServicio {

    private ClienteDAOImpl clienteDAOImpl;

    public ClienteServicioImpl(ClienteDAOImpl clienteDAOImpl) {
        this.clienteDAOImpl = clienteDAOImpl;
    }

    @Override
    public Cliente filtrarPorUsuario(String usuario) {
        return clienteDAOImpl.getUserByUsername(usuario);
    }

    @Override
    public Cliente iniciarSesion(String usuario, String contraseña) {
        return clienteDAOImpl.getUserByUsernameAndPassword(usuario, contraseña);
    }

    @Override
    public void eliminarUsuario(String usuario, String contraseña) {
        clienteDAOImpl.deleteUserByUsernameAndPassword(usuario, contraseña);
    }

    @Override
    public Cliente filtrarPorId(Long id) {
        return clienteDAOImpl.selectByID(id);
    }

    @Override
    public List<Cliente> filtrarPorAtributo(String atributo) {
        return clienteDAOImpl.selectByAnyAtributte(atributo);
    }

    @Override
    public List<Cliente> listarRegistros() {
        return clienteDAOImpl.selectALL();
    }

    @Override
    public void registrar(Cliente entidad) {
        clienteDAOImpl.insert(entidad);
    }

    @Override
    public void actualizarRegistroPorID(Long id) {
        clienteDAOImpl.updateByID(id);
    }

    @Override
    public void eliminarRegistro(Long id) {
        clienteDAOImpl.deleteByID(id);
    }

}
