/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.Database;

/**
 *
 * @author bobmarley
 */


import org.eniso.project.graphs.DirectedGraph;
import org.eniso.project.graphs.Graph;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GraphManaging implements IGraphManaging {

        private Connection connection;

    public GraphManaging(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void createGraph() {
        // SQL command to create the graph table with an auto-incremented ID field
        String createTableSQL = "CREATE TABLE IF NOT EXISTS graphs ("
                + "graph_id SERIAL PRIMARY KEY, "
                + "graph_nodes TEXT, "
                + "graph_edges TEXT"
                + ")";

        try (Statement statement = connection.createStatement()) {
            // Execute the SQL command to create the table
            statement.executeUpdate(createTableSQL);
            System.out.println("Graph table created successfully.");
        } catch (SQLException e) {
            System.err.println("Error creating graph table: " + e.getMessage());
        }
    }

    @Override
    public void addGraph(Graph graph) {
        String query = "INSERT INTO graphs (graph_id, graph_nodes, graph_edges) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, serializeNodes(graph.getNodes()));
            preparedStatement.setString(3, serializeEdges(graph.getEdges()));
            preparedStatement.executeUpdate();
            System.out.println("Graph inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateGraph(Graph graph) {
        String query = "UPDATE graphs SET graph_nodes = ?, graph_edges = ? WHERE graph_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, serializeNodes(graph.getNodes()));
            preparedStatement.setString(2, serializeEdges(graph.getEdges()));
            preparedStatement.setInt(3, 0);
            preparedStatement.executeUpdate();
            System.out.println("Graph updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteGraph(int graphId) {
        String query = "DELETE FROM graphs WHERE graph_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, graphId);
            preparedStatement.executeUpdate();
            System.out.println("Graph deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Graph getGraphById(int graphId) {
        String query = "SELECT * FROM graphs WHERE graph_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, graphId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                List<Integer> nodes = deserializeNodes(resultSet.getString("graph_nodes"));
                Integer[][] edges = deserializeEdges(resultSet.getString("graph_edges"));
                return new DirectedGraph(nodes, edges); // Assuming a constructor for Graph class
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Graph> getAllGraphs() {
        List<Graph> graphs = new ArrayList<>();
        String query = "SELECT * FROM graphs";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("graph_id");
                List<Integer> nodes = deserializeNodes(resultSet.getString("graph_nodes"));
                Integer[][] edges = deserializeEdges(resultSet.getString("graph_edges"));
                graphs.add(new DirectedGraph(nodes, edges)); // Assuming a constructor for Graph class
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return graphs;
    }
    private String serializeNodes(List<Integer> nodes) {
    StringBuilder sb = new StringBuilder();
    for (Integer node : nodes) {
        sb.append(node).append(",");
    }
    return sb.toString();
}

private String serializeEdges(Integer[][] edges) {
    StringBuilder sb = new StringBuilder();
    for (Integer[] edge : edges) {
        for (Integer vertex : edge) {
            sb.append(vertex).append(",");
        }
        sb.append("|");
    }
    return sb.toString();
}
  // Deserialize nodes string to a list of integers
    public static List<Integer> deserializeNodes(String nodesString) {
        List<Integer> nodes = new ArrayList<>();
        if (nodesString != null && !nodesString.isEmpty()) {
            String[] nodeArray = nodesString.split(",");
            for (String node : nodeArray) {
                nodes.add(Integer.parseInt(node));
            }
        }
        return nodes;
    }

    // Deserialize edges string to a 2D array of integers
    public static Integer[][] deserializeEdges(String edgesString) {
        Integer[][] edges = null;
        if (edgesString != null && !edgesString.isEmpty()) {
            String[] rowStrings = edgesString.split(";");
            edges = new Integer[rowStrings.length][];
            for (int i = 0; i < rowStrings.length; i++) {
                String[] colStrings = rowStrings[i].split(",");
                edges[i] = new Integer[colStrings.length];
                for (int j = 0; j < colStrings.length; j++) {
                    edges[i][j] = Integer.parseInt(colStrings[j]);
                }
            }
        }
        return edges;
    }

}

