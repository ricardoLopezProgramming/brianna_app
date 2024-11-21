package com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.ProductoDAO;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Producto;
import com.brianna.catalogo_ventas.v1.Modelo.persistencia.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.*;

public class ProductoDAOImpl implements ProductoDAO {

    private Connection conn = BD.getInstance().getConnection();

    public ProductoDAOImpl() {
    }

    @Override
    public Producto selectByID(Long id) {
        Producto producto = null;
        String query = "SELECT * FROM producto WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    producto = new Producto();
                    producto.setIdProducto(rs.getLong("id"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setTalla(rs.getString("talla"));
                    producto.setColor(rs.getString("color"));
                    producto.setPrecioProveedor(rs.getDouble("precio_proveedor"));
                    producto.setPrecioBase(rs.getDouble("precio_base"));
                    producto.setIgv(rs.getDouble("igv"));
                    producto.setPrecioFinal(rs.getDouble("precio_final"));
                    producto.setStock(rs.getInt("stock"));
                    producto.setIdSubcategoria(rs.getInt("id_subcategoria"));
                    producto.setIdAlmacen(rs.getInt("id_almacen"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener producto por ID: " + e.getMessage(), e);
        }

        return producto;
    }

    @Override
    public List<Producto> selectByAnyAtributte(String atributte) {
        List<Producto> productos = new ArrayList<>();
        String query = """
        SELECT * 
        FROM producto
        WHERE CONCAT(nombre, ' ', descripcion, ' ', talla, ' ', color) LIKE ?;
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, "%" + atributte + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getLong("id"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setTalla(rs.getString("talla"));
                    producto.setColor(rs.getString("color"));
                    producto.setPrecioProveedor(rs.getDouble("precio_proveedor"));
                    producto.setPrecioBase(rs.getDouble("precio_base"));
                    producto.setIgv(rs.getDouble("igv"));
                    producto.setPrecioFinal(rs.getDouble("precio_final"));
                    producto.setStock(rs.getInt("stock"));
                    producto.setIdSubcategoria(rs.getInt("id_subcategoria"));
                    producto.setIdAlmacen(rs.getInt("id_almacen"));
                    productos.add(producto);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al filtrar productos: " + e.getMessage(), e);
        }

        return productos;
    }

    @Override
    public List<Producto> selectALL() {
        List<Producto> productos = new ArrayList<>();
        String query = "SELECT * FROM producto";

        try (PreparedStatement ps = conn.prepareStatement(query); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getLong("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setTalla(rs.getString("talla"));
                producto.setColor(rs.getString("color"));
                producto.setPrecioProveedor(rs.getDouble("precio_proveedor"));
                producto.setPrecioBase(rs.getDouble("precio_base"));
                producto.setIgv(rs.getDouble("igv"));
                producto.setPrecioFinal(rs.getDouble("precio_final"));
                producto.setStock(rs.getInt("stock"));
                producto.setIdSubcategoria(rs.getInt("id_subcategoria"));
                producto.setIdAlmacen(rs.getInt("id_almacen"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener todos los productos: " + e.getMessage(), e);
        }
        productos.forEach(System.out::println);
        return productos;
    }

    @Override
    public void insert(Producto producto) {
        String query = """
        INSERT INTO producto (nombre, descripcion, talla, color, precio_proveedor, 
                              precio_base, igv, precio_final, stock, id_subcategoria, id_almacen)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getTalla());
            ps.setString(4, producto.getColor());
            ps.setDouble(5, producto.getPrecioProveedor());
            ps.setDouble(6, producto.getPrecioBase());
            ps.setDouble(7, producto.getIgv());
            ps.setDouble(8, producto.getPrecioFinal());
            ps.setInt(9, producto.getStock());
            ps.setInt(10, producto.getIdSubcategoria());
            ps.setInt(11, producto.getIdAlmacen());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al insertar producto: " + e.getMessage(), e);
        }
    }

    @Override
    public void updateByID(Long id) {
        String query = """
        UPDATE producto
        SET nombre = ?, descripcion = ?, talla = ?, color = ?, precio_proveedor = ?, 
            precio_base = ?, igv = ?, precio_final = ?, stock = ?, id_subcategoria = ?, id_almacen = ?
        WHERE id = ?;
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            // Aquí debes obtener el Producto de algún lugar (por ejemplo, de un formulario o de un método)
            Producto producto = getProductoForUpdate(id);  // Método que debes implementar

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getTalla());
            ps.setString(4, producto.getColor());
            ps.setDouble(5, producto.getPrecioProveedor());
            ps.setDouble(6, producto.getPrecioBase());
            ps.setDouble(7, producto.getIgv());
            ps.setDouble(8, producto.getPrecioFinal());
            ps.setInt(9, producto.getStock());
            ps.setInt(10, producto.getIdSubcategoria());
            ps.setInt(11, producto.getIdAlmacen());
            ps.setLong(12, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar producto por ID: " + e.getMessage(), e);
        }
    }

    @Override
    public void deleteByID(Long id) {
        String query = "DELETE FROM producto WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar producto por ID: " + e.getMessage(), e);
        }
    }

    // Método auxiliar para obtener un Producto por su ID antes de hacer el update
    private Producto getProductoForUpdate(Long id) {
        Producto producto = null;
        String query = "SELECT * FROM producto WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    producto = new Producto();
                    producto.setIdProducto(rs.getLong("id"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setTalla(rs.getString("talla"));
                    producto.setColor(rs.getString("color"));
                    producto.setPrecioProveedor(rs.getDouble("precio_proveedor"));
                    producto.setPrecioBase(rs.getDouble("precio_base"));
                    producto.setIgv(rs.getDouble("igv"));
                    producto.setPrecioFinal(rs.getDouble("precio_final"));
                    producto.setStock(rs.getInt("stock"));
                    producto.setIdSubcategoria(rs.getInt("id_subcategoria"));
                    producto.setIdAlmacen(rs.getInt("id_almacen"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener producto para actualizar: " + e.getMessage(), e);
        }

        return producto;
    }
}
