/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.eniso.session2;

/**
 *
 * @author bobmarley
 */
public class TP2SystemeGestionEtudiants {

    public static void main(String[] args) {
        SystemeGestionEtudiants gestionnaire = new SystemeGestionEtudiants();

        gestionnaire.ajouterEtudiant("bob", "azertty", 1, "string@string.com");
        gestionnaire.ajouterEtudiant("bobf", "zerty", 2, "string@string.com");
        gestionnaire.ajouterEtudiant("bobe", "azer", 3, "string@string.com");

        gestionnaire.afficherEtudiants();

        gestionnaire.modifierEmailEtudiant(2, "string@string.com");

        gestionnaire.supprimerEtudiant(1);

        gestionnaire.afficherEtudiants();
    }
}
