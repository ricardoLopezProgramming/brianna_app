package com.brianna.catalogo_ventas.v1.Modelo.servicio;

import com.brianna.catalogo_ventas.v1.Modelo.entidad.Usuario;
import java.util.List;

public interface UsuarioServicio<T extends Usuario> extends PersonaServicio<T>{

    T filtrarPorUsuario(String usuario);

    T iniciarSesion(String usuario, String contraseña);
        
    void eliminarUsuario(String usuario, String contraseña);
}
