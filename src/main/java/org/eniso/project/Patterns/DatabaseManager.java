/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.Patterns;

/**
 *
 * @author bobmarley
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    // Database connection parameters
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    // Singleton instance
    private static DatabaseManager instance;

    // Database connection object
    private Connection connection;

    // Private constructor to prevent instantiation from outside
    private DatabaseManager() {
        try {
            // Establish the database connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get the Singleton instance
    public static synchronized DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String testConnectivityMessage() {
        try {
            if (connection != null && !connection.isClosed()) {
                return "Database connectivity is established.";
            } else {
                return "Failed to establish database connectivity.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "An error occurred while testing database connectivity.";
        }
    }

}

