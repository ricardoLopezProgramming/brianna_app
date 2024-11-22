package com.brianna.catalogo_ventas.v1.Modelo.dao.daoImpl;

import com.brianna.catalogo_ventas.v1.Modelo.dao.ClienteDAO;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Cliente;
import com.brianna.catalogo_ventas.v1.Modelo.entidad.Usuario;
import com.brianna.catalogo_ventas.v1.Modelo.persistencia.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAOImpl implements ClienteDAO {

    private final Connection conn = BD.getInstance().getConnection();

    @Override
    public Cliente getUserByUsernameAndPassword(String usuario, String contraseña) {
        Cliente cliente = null;
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.id_usuario = u.id INNER JOIN persona p ON u.id_persona = p.id WHERE u.usuario = ? AND u.contraseña = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                if (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    cliente = new Cliente();
                   // cliente.setIdUsuario(rs.getLong("id"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    cliente.setNumero(rs.getString("numero"));
                    cliente.setDni(rs.getString("dni"));
                    cliente.setRuc(rs.getString("ruc"));
                    cliente.setDistrito(rs.getString("distrito"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setUsuario(rs.getString("usuario"));
                    cliente.setContraseña(rs.getString("contraseña"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setRol(rs.getString("rol"));
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return cliente;
    }

    @Override
    public Cliente selectByID(Long id) {
        Cliente cliente = null;
        // Implementación de la consulta SQL para obtener un Cliente por ID
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.usuario_id = u.id WHERE c.id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                if (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    cliente = new Cliente();
                    cliente.setIdCliente(rs.getLong("id"));
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
    public List<Cliente> selectALL() {
        List<Cliente> clientes = new ArrayList<>();
        // Implementación para obtener todos los clientes
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.usuario_id = u.id";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                while (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getLong("id"));
                    cliente.setFkClienteUsuario(rs.getLong("u.id"));
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
                    clientes.add(cliente);
                    System.out.println(cliente.toString());
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return clientes;
    }

    @Override
    public void updateByID(Long id) {

    }

    @Override
    public void deleteByID(Long id) {
    }

    @Override
    public Cliente getUserByUsername(String username) {
        Cliente cliente = null;
        String query = "SELECT * FROM cliente c INNER JOIN usuario u ON c.usuario_id = u.id WHERE usuario = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {  // El ResultSet también se cierra automáticamente
                if (rs.next()) {
                    // Crear un objeto Cliente y asignar valores del ResultSet
                    cliente = new Cliente();
                    cliente.setIdCliente(rs.getLong("id"));
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
                }
            }
        } catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage());
        }
        return cliente;
    }

    @Override
    public void insert(Cliente cliente) {
        String usuarioQuery = "INSERT INTO usuario (nombre, apellido, fecha_nacimiento, numero, dni, ruc, distrito, direccion, correo, rol) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String clienteQuery = "INSERT INTO cliente (id_usuario, usuario, contraseña) VALUES (?, ?, ?)";

        try {
            // Iniciar transacción
            conn.setAutoCommit(false);

            // Insertar en la tabla usuario
            try (PreparedStatement psUsuario = conn.prepareStatement(usuarioQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psUsuario.setString(1, cliente.getNombre());
                psUsuario.setString(2, cliente.getApellido());
                psUsuario.setDate(3, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
                psUsuario.setString(4, cliente.getNumero());
                psUsuario.setString(5, cliente.getDni());
                psUsuario.setString(6, cliente.getRuc());
                psUsuario.setString(7, cliente.getDistrito());
                psUsuario.setString(8, cliente.getDireccion());
                psUsuario.setString(9, cliente.getCorreo());
                psUsuario.setString(10, cliente.getRol());

                int usuarioRowsAffected = psUsuario.executeUpdate();

                if (usuarioRowsAffected > 0) {
                    // Obtener el ID generado para usuario
                    try (ResultSet generatedKeys = psUsuario.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int usuarioId = generatedKeys.getInt(1);

                            // Insertar en la tabla cliente usando el usuario_id
                            try (PreparedStatement psCliente = conn.prepareStatement(clienteQuery)) {
                                psCliente.setInt(1, usuarioId);
                                psCliente.setString(2, cliente.getUsuario());
                                psCliente.setString(3, cliente.getContraseña());
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

    @Override
    public List<Cliente> selectByAnyAtributte(String atributte) {
        List<Cliente> clientes = new ArrayList<>();
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
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getLong("id"));
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
