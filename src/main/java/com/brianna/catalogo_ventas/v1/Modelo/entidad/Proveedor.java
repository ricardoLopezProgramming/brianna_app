
package com.brianna.catalogo_ventas.v1.Modelo.entidad;


public class Proveedor extends Persona{
    
    private Long idProveedor;
    private Long fkProveedorPersona;
    private String empresa;

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Long getFkProveedorPersona() {
        return fkProveedorPersona;
    }

    public void setFkProveedorPersona(Long fkProveedorPersona) {
        this.fkProveedorPersona = fkProveedorPersona;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    
}
