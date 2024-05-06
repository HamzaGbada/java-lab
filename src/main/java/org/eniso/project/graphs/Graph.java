/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.graphs;

import java.util.List;

/**
 *
 * @author bobmarley
 */
public abstract class Graph {
    private List<Integer> nodes;
    private Integer[][] edges;

    public Graph(List<Integer> nodes, Integer[][] edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Integer> getNodes() {
        return nodes;
    }

    public void setNodes(List<Integer> nodes) {
        this.nodes = nodes;
    }

    public Integer[][] getEdges() {
        return edges;
    }

    public void setEdges(Integer[][] edges) {
        this.edges = edges;
    }
    
    public abstract void breadthFirstSearch(int startNode);
    public abstract void depthFirstSearch(int startNode);

    
    
}
