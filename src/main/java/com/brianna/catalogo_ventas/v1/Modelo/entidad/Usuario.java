package com.brianna.catalogo_ventas.v1.Modelo.entidad;

import java.util.Date;

public abstract class Usuario extends Persona {

    protected String usuario;
    protected String contraseña;

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

}
