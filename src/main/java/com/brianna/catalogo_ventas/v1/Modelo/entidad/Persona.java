package com.brianna.catalogo_ventas.v1.Modelo.entidad;

import java.util.Date;

public abstract class Persona {

    protected Long idUsuario;
    protected String nombre;
    protected String apellido;
    protected Date fechaNacimiento;
    protected String numero;
    protected String dni;
    protected String ruc;
    protected String distrito;
    protected String direccion;
    protected String correo;
    protected String rol;

    public Persona() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\n\"id\": ").append(idUsuario).append(", ")
                .append("\n\"nombre\": \"").append(nombre).append("\", ")
                .append("\n\"apellido\": \"").append(apellido).append("\", ")
                .append("\n\"fechaNacimiento\": \"").append(fechaNacimiento).append("\", ")
                .append("\n\"numero\": \"").append(numero).append("\", ")
                .append("\n\"dni\": \"").append(dni).append("\", ")
                .append("\n\"ruc\": \"").append(ruc).append("\", ")
                .append("\n\"distrito\": \"").append(distrito).append("\", ")
                .append("\n\"direccion\": \"").append(direccion).append("\", ")
                .append("\n\"correo\": \"").append(correo).append("\", ")
                .append("\n\"rol\": \"").append(rol).append("\"")
                .append("\n}");
        return sb.toString();
    }

}
