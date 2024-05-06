/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.eniso.session1;

import java.util.Scanner;

/**
 *
 * @author bobmarley
 */
public class TP1 {

    public static void main(String[] args) {
        System.out.println("Bonjour, mon premier TP en POO");
        //lecture du nom
        System.out.println("Quelle est votre nom ?\n");
        Scanner read = new Scanner(System.in);
        String name = read.next();
        //lecture de l'age
        System.out.println ("Bonjour " + name);
        System.out.println("Quel est votre age " + name + "?\n");
        read=new Scanner(System.in);
        int a;
        a=read.nextInt();
        System.out.println(name + " votre age est "+ a);
    }
}
