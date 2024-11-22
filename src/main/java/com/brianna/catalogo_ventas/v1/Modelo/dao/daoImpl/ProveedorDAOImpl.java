package com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.ProveedorDAO;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Proveedor;
import com.brianna.catalogo_ventas.v1.Modelo.persistencia.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAOImpl implements ProveedorDAO {

    private Connection conn = BD.getInstance().getConnection();

    @Override
    public Proveedor selectByID(Long id) {
        Proveedor proveedor = null;
        String query = "SELECT * FROM proveedor pr INNER JOIN persona pe ON pr.id_persona = pe.id WHERE pr.id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    proveedor = new Proveedor();
                    proveedor.setIdProveedor(rs.getLong("pr.id"));
                    proveedor.setFkProveedorPersona(rs.getLong("pr.id_persona"));
                    proveedor.setEmpresa(rs.getString("pr.empresa"));
                    proveedor.setIdPersona(rs.getLong("pe.id"));
                    proveedor.setNombre(rs.getString("pe.nombre"));
                    proveedor.setApellido(rs.getString("pe.apellido"));
                    proveedor.setFechaNacimiento(rs.getDate("pe.fecha_nacimiento"));
                    proveedor.setNumero(rs.getString("pe.numero"));
                    proveedor.setDni(rs.getString("pe.dni"));
                    proveedor.setRuc(rs.getString("pe.ruc"));
                    proveedor.setDistrito(rs.getString("pe.distrito"));
                    proveedor.setDireccion(rs.getString("pe.direccion"));
                    proveedor.setCorreo(rs.getString("pe.correo"));
                    proveedor.setRol(rs.getString("pe.rol"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return proveedor;
    }

    @Override
    public List<Proveedor> selectByAnyAtributte(String atributte) {
        List<Proveedor> proveedores = new ArrayList<>();
        String query = """
        SELECT * 
        FROM proveedor pr INNER JOIN persona pe ON pr.id_persona = pe.id 
        WHERE CONCAT(usuario, ' ', nombre, ' ', apellido) LIKE ?;
    """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {

            // Configura el parámetro de búsqueda
            ps.setString(1, "%" + atributte + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Proveedor proveedor = new Proveedor();
                    proveedor.setIdProveedor(rs.getLong("pr.id"));
                    proveedor.setFkProveedorPersona(rs.getLong("pr.id_persona"));
                    proveedor.setEmpresa(rs.getString("pr.empresa"));
                    proveedor.setIdPersona(rs.getLong("pe.id"));
                    proveedor.setNombre(rs.getString("pe.nombre"));
                    proveedor.setApellido(rs.getString("pe.apellido"));
                    proveedor.setFechaNacimiento(rs.getDate("pe.fecha_nacimiento"));
                    proveedor.setNumero(rs.getString("pe.numero"));
                    proveedor.setDni(rs.getString("pe.dni"));
                    proveedor.setRuc(rs.getString("pe.ruc"));
                    proveedor.setDistrito(rs.getString("pe.distrito"));
                    proveedor.setDireccion(rs.getString("pe.direccion"));
                    proveedor.setCorreo(rs.getString("pe.correo"));
                    proveedor.setRol(rs.getString("pe.rol"));
                    proveedores.add(proveedor);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al filtrar proveedores: " + e.getMessage(), e);
        }
        return proveedores;
    }

    @Override
    public List<Proveedor> selectALL() {
         List<Proveedor> proveedores = new ArrayList<>();
         String query = "SELECT * FROM proveedor pr INNER JOIN persona pe ON pr.id_persona = pe.id";
         try (PreparedStatement ps = conn.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Proveedor proveedor = new Proveedor();
                    proveedor.setIdProveedor(rs.getLong("pr.id"));
                    proveedor.setFkProveedorPersona(rs.getLong("pr.id_persona"));
                    proveedor.setEmpresa(rs.getString("pr.empresa"));
                    proveedor.setIdPersona(rs.getLong("pe.id"));
                    proveedor.setNombre(rs.getString("pe.nombre"));
                    proveedor.setApellido(rs.getString("pe.apellido"));
                    proveedor.setFechaNacimiento(rs.getDate("pe.fecha_nacimiento"));
                    proveedor.setNumero(rs.getString("pe.numero"));
                    proveedor.setDni(rs.getString("pe.dni"));
                    proveedor.setRuc(rs.getString("pe.ruc"));
                    proveedor.setDistrito(rs.getString("pe.distrito"));
                    proveedor.setDireccion(rs.getString("pe.direccion"));
                    proveedor.setCorreo(rs.getString("pe.correo"));
                    proveedor.setRol(rs.getString("pe.rol"));
                    proveedores.add(proveedor);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al listar proveedores: " + e.getMessage(), e);
        }
        return proveedores;
    }

    @Override
    public void insert(Proveedor t) {
    }

    @Override
    public void updateByID(Long id) {
    }

    @Override
    public void deleteByID(Long id) {
    }

}
