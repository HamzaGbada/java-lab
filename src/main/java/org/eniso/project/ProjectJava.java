/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.eniso.project;
import org.eniso.project.Patterns.DatabaseManager;

/**
 *
 * @author bobmarley
 */
public class ProjectJava {

    public static void main(String[] args) {
        DatabaseManager databaseConnection = DatabaseManager.getInstance();

        // Test database connectivity and print the result
        String connectivityMessage = databaseConnection.testConnectivityMessage();
        System.out.println("Database Connectivity Status: " + connectivityMessage);
    }
}
