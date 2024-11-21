package com.brianna.catalogo_ventas.v1.Modelo.entidad;

import java.util.Date;

public class Kardex {

    private int idKardex;
    private int idProducto;
    private Date fechaMovimiento;
    private String tipoMovimiento; // "Entrada" o "Salida"
    private int cantidad;
    private int saldo;
    private String descripcion;

    public Kardex(int idKardex, int idProducto, Date fechaMovimiento, String tipoMovimiento, int cantidad, int saldo, String descripcion) {
        this.idKardex = idKardex;
        this.idProducto = idProducto;
        this.fechaMovimiento = fechaMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.saldo = saldo;
        this.descripcion = descripcion;
    }

    
}
