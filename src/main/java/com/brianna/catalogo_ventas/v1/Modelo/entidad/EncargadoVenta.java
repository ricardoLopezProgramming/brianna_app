package com.brianna.catalogo_ventas.v1.Modelo.entidad;

import java.util.Date;

public class EncargadoVenta extends Usuario {

    private Long idEncargadoVenta;
    private Long fkEncargadoVentaUsuario;

    public EncargadoVenta() {
    }

    public Long getIdEncargadoVenta() {
        return idEncargadoVenta;
    }

    public void setIdEncargadoVenta(Long idEncargadoVenta) {
        this.idEncargadoVenta = idEncargadoVenta;
    }

    public Long getFkEncargadoVentaUsuario() {
        return fkEncargadoVentaUsuario;
    }

    public void setFkEncargadoVentaUsuario(Long fkEncargadoVentaUsuario) {
        this.fkEncargadoVentaUsuario = fkEncargadoVentaUsuario;
    }
    
    

}
