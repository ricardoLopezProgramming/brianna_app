package com.brianna.catalogo_ventas.v1.Modelo.entidad;

import java.util.Date;

public class Cliente extends Usuario {

    private Long idCliente;
    private Long fkClienteUsuario;


    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getFkClienteUsuario() {
        return fkClienteUsuario;
    }

    public void setFkClienteUsuario(Long fkClienteUsuario) {
        this.fkClienteUsuario = fkClienteUsuario;
    }

   

}
