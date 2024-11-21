package com.brianna.catalogo_ventas.v1.Modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {

    // atributos privados
    private Connection conn = null;
    private static BD instance = null;

    private BD() {
    }

    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/brianna", "root", "");
            System.out.println("Conexion Exitosa!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static BD getInstance() {
        if (instance == null) {
            instance = new BD();
        }
        return instance;
    }

    public static boolean closeConnection() {
        try {
            Connection conn = getInstance().getConnection();
            if (conn != null && !conn.isClosed()) {
                conn.close();
                return true;
            }
        } catch (SQLException sqlE) {
            System.out.println("Error al cerrar la conexión: " + sqlE.getMessage());
        }
        return false;
    }

}
