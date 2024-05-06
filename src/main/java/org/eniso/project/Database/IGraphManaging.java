/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.project.Database;


import org.eniso.project.graphs.Graph;

import java.util.List;

/**
 *
 * @author bobmarley
 */
public interface IGraphManaging {
    void createGraph();
    void addGraph(Graph graph);
    void updateGraph(Graph graph);
    void deleteGraph(int graphId);
    Graph getGraphById(int graphId);
    List<Graph> getAllGraphs();
}
