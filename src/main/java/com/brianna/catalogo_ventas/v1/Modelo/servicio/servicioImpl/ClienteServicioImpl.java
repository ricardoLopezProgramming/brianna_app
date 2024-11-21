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
        return null;
    }

    @Override
    public Cliente iniciarSesion(String usuario, String contraseña) {
                return null;

    }

    @Override
    public void eliminarUsuario(String usuario, String contraseña) {
    }

    @Override
    public Cliente filtrarPorId(Long id) {
                return null;

    }

    @Override
    public List<Cliente> filtrarPorAtributo(String atributo) {
                return null;

    }

    @Override
    public List<Cliente> listarRegistros() {
                return null;

    }

    @Override
    public void registrar(Cliente entidad) {
    }

    @Override
    public void actualizarRegistroPorID(Long id) {
    }

    @Override
    public void eliminarRegistro(Long id) {
    }


}
