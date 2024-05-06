/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author bobmarley
 */
public class Ecole {

    private List<Student> listeEtudiants;

    public Ecole() {
        listeEtudiants = new ArrayList<>();
    }

    public class Student {
        private String nom;
        private String prenom;
        private int numeroInscription;
        private String email;

        public Student(String nom, String prenom, int numeroInscription, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.numeroInscription = numeroInscription;
            this.email = email;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public int getNumeroInscription() {
            return numeroInscription;
        }

        public void setNumeroInscription(int numeroInscription) {
            this.numeroInscription = numeroInscription;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


    public void ajouterEtudiant(String nom, String prenom, int numeroInscription, String email) {
        Student etudiant = new Student(nom, prenom, numeroInscription, email);
        listeEtudiants.add(etudiant);
    }

    public void afficherEtudiants() {
        for (Student etudiant : listeEtudiants) {
            System.out.println("Nom: " + etudiant.getNom() + ", Prénom: " + etudiant.getPrenom() + ", Email: " + etudiant.getEmail());
        }
    }

    public void modifierEmailEtudiant(int numeroInscription, String nouvelEmail) {
        for (Student etudiant : listeEtudiants) {
            if (etudiant.getNumeroInscription() == numeroInscription) {
                etudiant.setEmail(nouvelEmail);
                return;
            }
        }
        System.out.println("Aucun étudiant avec le numéro d'inscription " + numeroInscription + " trouvé !");
    }

    public void supprimerEtudiant(int numeroInscription) {
        Student etudiantToRemove = null;
        for (Student etudiant : listeEtudiants) {
            if (etudiant.getNumeroInscription() == numeroInscription) {
                etudiantToRemove = etudiant;
                break;
            }
        }
        if (etudiantToRemove != null) {
            listeEtudiants.remove(etudiantToRemove);
            System.out.println("Etudiant avec le numéro d'inscription " + numeroInscription + " supprimé !");
        } else {
            System.out.println("Aucun étudiant avec le numéro d'inscription " + numeroInscription + " trouvé !");
        }
    }

    public void trierEtudiantsParNom() {
        Collections.sort(listeEtudiants, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getNom().compareTo(student2.getNom());
            }
        });
    }

    public static void main(String[] args) {
        Ecole ecole = new Ecole();
        ecole.ajouterEtudiant("Jean", "Dupont", 1001, "jean.dupont@example.com");
        ecole.ajouterEtudiant("Alice", "Martin", 1002, "alice.martin@example.com");
        ecole.ajouterEtudiant("Paul", "Durand", 1003, "paul.durand@example.com");
        
        System.out.println("Etudiants avant le tri :");
        ecole.afficherEtudiants();
        
        ecole.trierEtudiantsParNom();
        
        System.out.println("\nEtudiants après le tri :");
        ecole.afficherEtudiants();
    }
}
