/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author bobmarley
 */
public class SystemeGestionEtudiants {
    private List<Etudiant> listEtudiants;
    
    public SystemeGestionEtudiants() {
        listEtudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(String nom, String prenom, int numeroInscription, String email) {
        Etudiant etudiant = new Etudiant(nom, prenom, numeroInscription, email);
        listEtudiants.add(etudiant);
    }

    public void afficherEtudiants() {
        System.out.println("Liste des étudiants :");
        for (Etudiant etudiant : listEtudiants) {
            System.out.println(etudiant);
        }
    }

    public void modifierEmailEtudiant(int numeroInscription, String nouvelEmail) {
        for (Etudiant etudiant : listEtudiants) {
            if (etudiant.getNumeroInscription() == numeroInscription) {
                etudiant.setEmail(nouvelEmail);
                System.out.println("Email de l'étudiant " + etudiant.getNom() + " modifié avec succès !");
                return;
            }
        }
        System.out.println("Aucun étudiant avec le numéro d'inscription " + numeroInscription + " trouvé !");
    }

    public void supprimerEtudiant(int numeroInscription) {
        int index = -1;
        for (int i = 0; i < listEtudiants.size(); i++) {
            Etudiant etudiant = listEtudiants.get(i);
            if (etudiant.getNumeroInscription() == numeroInscription) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            listEtudiants.remove(index);
            System.out.println("Etudiant avec le numéro d'inscription " + numeroInscription + " supprimé !");
        } else {
            System.out.println("Aucun étudiant avec le numéro d'inscription " + numeroInscription + " trouvé !");
        }
    }   
}
