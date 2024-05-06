/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author bobmarley
 */
public class DirectedGraph extends Graph{

    public DirectedGraph(List<Integer> nodes, Integer[][] edges) {
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
            // Dequeue a vertex from queue and print it
            startNode = queue.poll();
            System.out.print(startNode + " ");

            // Get all adjacent vertices of the dequeued vertex startNode
            // If an adjacent vertex has not been visited, then mark it visited and enqueue it
            for (int i = 0; i < this.getEdges().length; i++) {
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
        boolean[] visited = new boolean[getNodes().size()];

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the startNode onto the stack
        stack.push(startNode);

        // DFS traversal
        while (!stack.isEmpty()) {
            // Pop a vertex from the stack
            int currentNode = stack.pop();

            // If the vertex has not been visited, mark it as visited and process it
            if (!visited[currentNode]) {
                visited[currentNode] = true;
                System.out.print(currentNode + " ");

                // Explore all unvisited adjacent vertices and push them onto the stack
                for (int i = getNodes().size() - 1; i >= 0; i--) {
                    if (getEdges()[currentNode][i] != null && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }
    
}
