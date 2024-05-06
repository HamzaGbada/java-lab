/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.eniso.session3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author bobmarley
 */
public class FileManger {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("file.log");
        

        int lineIndexToReverse = 1; // Supposons que vous voulez renverser la deuxième ligne
        fileHandler.reverseString(lineIndexToReverse);

        int lineIndexToRemoveDuplicates = 2; // Supposons que vous voulez supprimer les duplicata de la troisième ligne
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);

        String pattern = "epoch";
        ArrayList<String> linesWithPattern = fileHandler.findLinesWithPattern(pattern);

        String str1 = "hello";
        String str2 = "Hello";
        System.out.println("Comparaison avec equals : " + fileHandler.compareStrings1(str1, str2));

        String str5 = "hello";
        String str6 = "HELLO";
        System.out.println("Comparaison avec equalsIgnoreCase : " + fileHandler.compareStrings3(str5, str6));

        String str7 = "hello";
        String str8 = "hello"; //Does not create new string
        System.out.println("Comparaison avec == : " + fileHandler.compareStrings4(str7, str8));
        System.out.println("Comparaison avec == : "+ fileHandler.compareStrings4(new String("hello"),"hello")); // --> false 
        System.out.println("Comparaison avec == : "+ fileHandler.compareStrings4(new String("hello"), new String("hello"))); // --> false 

        
        
        System.out.println("Ligne contenant le motif '" + pattern + "' : " + linesWithPattern.get(0));
    }
}
