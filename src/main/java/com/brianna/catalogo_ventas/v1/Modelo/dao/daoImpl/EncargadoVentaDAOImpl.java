package com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.EncargadoVentaDAO;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.EncargadoVenta;
import com.brianna.catalogo_ventas.v1.Modelo.persistencia.BD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EncargadoVentaDAOImpl implements EncargadoVentaDAO {
    
    private final Connection conn = BD.getInstance().getConnection();
    
    @Override
    public EncargadoVenta getUserByUsernameAndPassword(String usuario, String contraseña) {
        EncargadoVenta encargadoVenta = null;
        String query = "SELECT * FROM encargado_venta e INNER JOIN usuario u ON e.id_usuario = u.id INNER JOIN persona p ON u.id_persona = p.id WHERE u.usuario = ? AND u.contraseña = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                if (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    encargadoVenta = new EncargadoVenta();
                   // cliente.setIdUsuario(rs.getLong("id"));
                    encargadoVenta.setNombre(rs.getString("nombre"));
                    encargadoVenta.setApellido(rs.getString("apellido"));
                    encargadoVenta.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    encargadoVenta.setNumero(rs.getString("numero"));
                    encargadoVenta.setDni(rs.getString("dni"));
                    encargadoVenta.setRuc(rs.getString("ruc"));
                    encargadoVenta.setDistrito(rs.getString("distrito"));
                    encargadoVenta.setDireccion(rs.getString("direccion"));
                    encargadoVenta.setUsuario(rs.getString("usuario"));
                    encargadoVenta.setContraseña(rs.getString("contraseña"));
                    encargadoVenta.setCorreo(rs.getString("correo"));
                    encargadoVenta.setRol(rs.getString("rol"));
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return encargadoVenta;
    }

    @Override
    public EncargadoVenta selectByID(Long id) {
        EncargadoVenta cliente = null;
        // Implementación de la consulta SQL para obtener un Cliente por ID
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.usuario_id = u.id WHERE c.id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                if (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    cliente = new EncargadoVenta();
                    cliente.setIdUsuario(rs.getLong("id"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    cliente.setNumero(rs.getString("numero"));
                    cliente.setDni(rs.getString("dni"));
                    cliente.setRuc(rs.getString("ruc"));
                    cliente.setDistrito(rs.getString("distrito"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setUsuario(rs.getString("usuario"));
                    cliente.setContraseña(rs.getString("contraseña"));
                    cliente.setRol(rs.getString("rol"));
                    System.out.println(cliente.toString());
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return cliente;
    }

    @Override
    public List<EncargadoVenta> selectALL() {
        List<EncargadoVenta> encargadoVentas = new ArrayList<>();
        // Implementación para obtener todos los clientes
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.usuario_id = u.id";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                while (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    EncargadoVenta EncargadoVenta = new EncargadoVenta();
                    EncargadoVenta.setIdEncargadoVenta(rs.getLong("id"));
                    EncargadoVenta.setNombre(rs.getString("nombre"));
                    EncargadoVenta.setApellido(rs.getString("apellido"));
                    EncargadoVenta.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    EncargadoVenta.setNumero(rs.getString("numero"));
                    EncargadoVenta.setDni(rs.getString("dni"));
                    EncargadoVenta.setRuc(rs.getString("ruc"));
                    EncargadoVenta.setDistrito(rs.getString("distrito"));
                    EncargadoVenta.setDireccion(rs.getString("direccion"));
                    EncargadoVenta.setCorreo(rs.getString("correo"));
                    EncargadoVenta.setUsuario(rs.getString("usuario"));
                    EncargadoVenta.setContraseña(rs.getString("contraseña"));
                    EncargadoVenta.setRol(rs.getString("rol"));
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return encargadoVentas;
    }

    @Override
    public void updateByID(Long id) {

    }

    @Override
    public void deleteByID(Long id) {
    }

    @Override
    public EncargadoVenta getUserByUsername(String username) {
        EncargadoVenta encargadoVenta = null;
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.usuario_id = u.id WHERE usuario = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                if (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    encargadoVenta = new EncargadoVenta();
                    encargadoVenta.setIdEncargadoVenta(rs.getLong("id"));
                    encargadoVenta.setNombre(rs.getString("nombre"));
                    encargadoVenta.setApellido(rs.getString("apellido"));
                    encargadoVenta.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    encargadoVenta.setNumero(rs.getString("numero"));
                    encargadoVenta.setDni(rs.getString("dni"));
                    encargadoVenta.setRuc(rs.getString("ruc"));
                    encargadoVenta.setDistrito(rs.getString("distrito"));
                    encargadoVenta.setDireccion(rs.getString("direccion"));
                    encargadoVenta.setCorreo(rs.getString("correo"));
                    encargadoVenta.setUsuario(rs.getString("usuario"));
                    encargadoVenta.setContraseña(rs.getString("contraseña"));
                    encargadoVenta.setRol(rs.getString("rol"));
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return encargadoVenta;
    }

    @Override
    public void insert(EncargadoVenta encargadoVenta) {
        String usuarioQuery = "INSERT INTO usuario (nombre, apellido, fecha_nacimiento, numero, dni, ruc, distrito, direccion, correo, rol) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String clienteQuery = "INSERT INTO cliente (id_usuario, usuario, contraseña) VALUES (?, ?, ?)";

        try {
            // Iniciar transacción
            conn.setAutoCommit(false);

            // Insertar en la tabla usuario
            try (PreparedStatement psUsuario = conn.prepareStatement(usuarioQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psUsuario.setString(1, encargadoVenta.getNombre());
                psUsuario.setString(2, encargadoVenta.getApellido());
                psUsuario.setDate(3, new java.sql.Date(encargadoVenta.getFechaNacimiento().getTime()));
                psUsuario.setString(4, encargadoVenta.getNumero());
                psUsuario.setString(5, encargadoVenta.getDni());
                psUsuario.setString(6, encargadoVenta.getRuc());
                psUsuario.setString(7, encargadoVenta.getDistrito());
                psUsuario.setString(8, encargadoVenta.getDireccion());
                psUsuario.setString(9, encargadoVenta.getCorreo());
                psUsuario.setString(10, encargadoVenta.getRol());

                int usuarioRowsAffected = psUsuario.executeUpdate();

                if (usuarioRowsAffected > 0) {
                    // Obtener el ID generado para usuario
                    try (ResultSet generatedKeys = psUsuario.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int usuarioId = generatedKeys.getInt(1);

                            // Insertar en la tabla cliente usando el usuario_id
                            try (PreparedStatement psCliente = conn.prepareStatement(clienteQuery)) {
                                psCliente.setInt(1, usuarioId);
                                psCliente.setString(2, encargadoVenta.getUsuario());
                                psCliente.setString(3, encargadoVenta.getContraseña());
                                int clienteRowsAffected = psCliente.executeUpdate();

                                if (clienteRowsAffected > 0) {
                                    System.out.println("Cliente guardado correctamente.");
                                    conn.commit(); // Confirmar transacción
                                } else {
                                    System.out.println("No se pudo guardar el cliente.");
                                    conn.rollback(); // Revertir transacción
                                }
                            }
                        } else {
                            System.out.println("No se pudo obtener el ID de usuario.");
                            conn.rollback(); // Revertir transacción
                        }
                    }
                } else {
                    System.out.println("No se pudo guardar el usuario.");
                    conn.rollback(); // Revertir transacción
                }
            }
        } catch (SQLException sqlE) {
            sqlE.printStackTrace();  // Proporciona más detalles del error SQL
            try {
                conn.rollback(); // Revertir transacción en caso de error
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            try {
                conn.setAutoCommit(true); // Restaurar auto-commit
            } catch (SQLException autoCommitEx) {
                autoCommitEx.printStackTrace();
            }
        }
    }

    @Override
    public void deleteUserByUsernameAndPassword(String usuario, String contraseña) {
        String query = "DELETE FROM usuario WHERE usuario = ? AND contraseña = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            // Establecer el valor del ID del cliente
            ps.setString(1, usuario);

            // Ejecutar la eliminación
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cliente eliminado correctamente.");
            } else {
                System.out.println("No se encontró el cliente con ese usuario.");
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
    }

    /*  @Override
    public void updateByEntity(Cliente cliente) {
        // Implementación para actualizar un Cliente
        String query = "UPDATE usuario SET "
                + "nombre = ?, "
                + "apellido = ?, "
                + "fechaNacimiento = ?, "
                + "numero = ?, "
                + "dni = ?, "
                + "ruc = ?, "
                + "distrito = ?, "
                + "direccion = ?, "
                + "correo = ?, "
                + "usuario = ?, "
                + "contraseña = ?, "
                + "rol = ? "
                + "WHERE usuario = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            // Establecer los valores de los parámetros
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setDate(3, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
            ps.setString(4, cliente.getNumero());
            ps.setString(5, cliente.getDni());
            ps.setString(6, cliente.getRuc());
            ps.setString(7, cliente.getDistrito());
            ps.setString(8, cliente.getDireccion());
            ps.setString(9, cliente.getCorreo());
            ps.setString(10, cliente.getUsuario());
            ps.setString(11, cliente.getContraseña());
            ps.setString(12, cliente.getRol());
            ps.setString(13, cliente.getUsuario()); // Establecer el usuario del cliente

            // Ejecutar la actualización
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cliente actualizado correctamente.");
            } else {
                System.out.println("No se encontró el cliente con ese usuario.");
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
    }*/

    @Override
    public List<EncargadoVenta> selectByAnyAtributte(String atributte) {
        List<EncargadoVenta> clientes = new ArrayList<>();
        String query = """
        SELECT * 
        FROM usuario
        WHERE CONCAT(usuario, ' ', nombre, ' ', apellido) LIKE ?;
    """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {

            // Configura el parámetro de búsqueda
            ps.setString(1, "%" + atributte + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    EncargadoVenta cliente = new EncargadoVenta();
                    cliente.setIdEncargadoVenta(rs.getLong("id"));
                    cliente.setUsuario(rs.getString("usuario"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    cliente.setNumero(rs.getString("numero"));
                    cliente.setDni(rs.getString("dni"));
                    cliente.setRuc(rs.getString("ruc"));
                    cliente.setDistrito(rs.getString("distrito"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setRol(rs.getString("rol"));
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al filtrar usuarios: " + e.getMessage(), e);
        }

        return clientes;
    }
}
