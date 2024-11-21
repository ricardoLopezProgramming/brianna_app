package com.brianna.catalogo_ventas.v1.Modelo.dao;

import com.brianna.catalogo_ventas.v1.Modelo.entidad.Usuario;

public interface UsuarioDAO<T extends Usuario> extends PersonaDAO<T>{

    T getUserByUsername(String usuario);

    T getUserByUsernameAndPassword(String usuario, String contraseña);

    void deleteUserByUsernameAndPassword(String usuario, String contraseña);

}
