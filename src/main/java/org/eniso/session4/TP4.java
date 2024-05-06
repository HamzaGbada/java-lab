/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.eniso.session4;

/**
 *
 * @author bobmarley
 */
public class TP4 {
    // Méthode pour ajouter deux entiers et retourner le résultat
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Méthode pour ajouter trois entiers et retourner le résultat
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Méthode pour ajouter deux nombres à virgule flottante et retourner le résultat
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Méthode pour concaténer deux chaînes de caractères et retourner le résultat en tant qu'une seule chaîne
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        TP4 calculator = new TP4();

        // Appelez chaque méthode add surchargée avec différents ensembles de paramètres
        int sumIntegers = calculator.add(5, 10);
        int sumThreeIntegers = calculator.add(5, 10, 15);
        double sumDoubles = calculator.add(3.5, 2.5);
        String concatenatedString = calculator.add("Bonjour", "Monde");

        // Affichez les résultats de chaque appel de méthode
        System.out.println("Somme de 5 et 10 : " + sumIntegers);
        System.out.println("Somme de 5, 10 et 15 : " + sumThreeIntegers);
        System.out.println("Somme de 3.5 et 2.5 : " + sumDoubles);
        System.out.println("Chaîne concaténée : " + concatenatedString);
    }
}

