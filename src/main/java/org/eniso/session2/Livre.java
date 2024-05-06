/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session2;

/**
 *
 * @author bobmarley
 */
public class Livre {
    private String titre;
    private String auteur;
    protected int anneePublication;
    public String isbn;

    public Livre() {
        this.titre = "Titre par défaut";
        this.auteur = "Auteur par défaut";
        this.anneePublication = 0;
        this.isbn = "ISBN par défaut";
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = 0;
        this.isbn = "ISBN par défaut";
    }

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.isbn = "ISBN par défaut";
    }

    public Livre(String titre, String auteur, int anneePublication, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void afficherLivre() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Année de publication : " + anneePublication);
        System.out.println("ISBN : " + isbn);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Java Programming", "John Doe");
        Livre livre3 = new Livre("Python Programming", "Jane Smith", 2022);
        Livre livre4 = new Livre("C++ Programming", "James Brown", 2019, "978-3-16-148410-0");

        livre1.afficherLivre();
        livre2.afficherLivre();
        livre3.afficherLivre();
        livre4.afficherLivre();
    }
}

