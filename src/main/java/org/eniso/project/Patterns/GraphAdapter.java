/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.Patterns;

/**
 *
 * @author bobmarley
 */
import java.util.*;

public class GraphAdapter {
    private List<List<Integer>> adjacencyList;
    private int[][] adjacencyMatrix;

    // Constructor
    public GraphAdapter(List<List<Integer>> adjacencyList) {
        this.adjacencyList = adjacencyList;
        convertToAdjacencyMatrix();
    }

    // Method to convert adjacency list to adjacency matrix
    private void convertToAdjacencyMatrix() {
        int n = adjacencyList.size();
        adjacencyMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(adjacencyMatrix[i], 0); // Initialize with zeros
            for (int j : adjacencyList.get(i)) {
                adjacencyMatrix[i][j] = 1; // Set adjacent vertices to 1
            }
        }
    }

    // Method to convert adjacency matrix to adjacency list
    public void convertToAdjacencyList() {
        int n = adjacencyMatrix.length;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    neighbors.add(j); // Add adjacent vertices
                }
            }
            adjacencyList.add(neighbors);
        }
    }

    // Getter for adjacency list
    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    // Getter for adjacency matrix
    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    // Method to update adjacency list
    public void updateAdjacencyList(List<List<Integer>> newList) {
        this.adjacencyList = newList;
        convertToAdjacencyMatrix();
    }

    // Method to update adjacency matrix
    public void updateAdjacencyMatrix(int[][] newMatrix) {
        this.adjacencyMatrix = newMatrix;
        convertToAdjacencyList();
    }
}

