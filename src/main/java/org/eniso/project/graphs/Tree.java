/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author bobmarley
 */
public class Tree extends Graph{

    private int root;
    private Map<Integer, Integer> parent;
    private Map<Integer, List<Integer>> children;
    private Map<Integer, Integer> depth;

    public Tree(int root, Map<Integer, Integer> parent, Map<Integer, List<Integer>> children, Map<Integer, Integer> depth) {
        super(new ArrayList<>(parent.keySet()), null);
        this.root = root;
        this.parent = parent;
        this.children = children;
        this.depth = depth;
    }

    @Override
    public void breadthFirstSearch(int startNode) {
        // Initialize a boolean array to keep track of visited nodes
        boolean[] visited = new boolean[getNodes().size()];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            startNode = queue.poll();
            System.out.print(startNode + " ");

            // Get all children of the dequeued vertex and enqueue them if they are not visited
            for (int child : this.children.get(startNode)) {
                if (!visited[child]) {
                    visited[child] = true;
                    queue.add(child);
                }
            }
        }
    }

   @Override
    public void depthFirstSearch(int startNode) {
        // Initialize a boolean array to keep track of visited nodes
        boolean[] visited = new boolean[getNodes().size()];

        // Perform DFS traversal starting from the given startNode
        dfsHelper(startNode, visited);
    }

    // Depth-First Search (DFS) Helper Method
    private void dfsHelper(int currentNode, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[currentNode] = true;
        System.out.print(currentNode + " ");

        // Recursively visit all children of the current node
        for (int child : this.children.get(currentNode)) {
            if (!visited[child]) {
                dfsHelper(child, visited);
            }
        }
    }
    
}
