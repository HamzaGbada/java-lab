/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author bobmarley
 */
public class WeightedGraph extends Graph{

    public WeightedGraph(List<Integer> nodes, Integer[][] edges) {
        super(nodes, edges);
    }

 @Override
    public void breadthFirstSearch(int startNode) {
        // Initialize a boolean array to keep track of visited nodes
        boolean[] visited = new boolean[this.getNodes().size()];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            startNode = queue.poll();
            System.out.print(startNode + " ");

            // Get all adjacent vertices of the dequeued vertex and enqueue them if they are not visited
            for (int i = 0; i < this.getNodes().size(); i++) {
                if (this.getEdges()[startNode][i] != null && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    @Override
    public void depthFirstSearch(int startNode) {
        // Initialize a boolean array to keep track of visited nodes
        boolean[] visited = new boolean[this.getNodes().size()];

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Mark the current node as visited and push it onto the stack
        visited[startNode] = true;
        stack.push(startNode);

        while (!stack.isEmpty()) {
            // Pop a vertex from the stack and print it
            startNode = stack.pop();
            System.out.print(startNode + " ");

            // Get all adjacent vertices of the popped vertex and push them onto the stack if they are not visited
            for (int i = 0; i < this.getNodes().size(); i++) {
                if (this.getEdges()[startNode][i] != null && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }
    
    public void dijkstraAlgorithm(int source) {
        // Initialize distances to all nodes as infinity and mark all nodes as unvisited
        int n = getNodes().size();
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n];

        // Set the distance of the source node to 0
        distances[source] = 0;

        // Process nodes until all nodes are visited
        for (int i = 0; i < n; i++) {
            // Find the node with the minimum distance among the unvisited nodes
            int minNode = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (minNode == -1 || distances[j] < distances[minNode])) {
                    minNode = j;
                }
            }

            // Mark the selected node as visited
            visited[minNode] = true;

            // Update distances to neighboring nodes
            for (int j = 0; j < n; j++) {
                if (getEdges()[minNode][j] != null && !visited[j]) {
                    int newDistance = distances[minNode] + getEdges()[minNode][j];
                    if (newDistance < distances[j]) {
                        distances[j] = newDistance;
                    }
                }
            }
        }

        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Node " + i + ": " + distances[i]);
        }
    }

    
}
