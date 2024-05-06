/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bobmarley
 */
public class FileHandler {
    private String filePath;
    private Integer fileSizeInKb;
    private Integer numberOfLines;
    private ArrayList<String> fileContent;

    public FileHandler(String filePath) {
        this.filePath = filePath;
        File file = new File(filePath);
        if (file.exists()) {
            this.fileSizeInKb = (int) (file.length() / 1024); // Taille du fichier en Ko
            this.numberOfLines = 0;
            this.fileContent = new ArrayList<>();
            readFile();
        } else {
            System.out.println("Le chemin spécifié n'existe pas.");
        }
    }

    private void readFile() {
        try {
            Scanner scanner = new Scanner(new File(this.filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.fileContent.add(line);
                this.numberOfLines++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> findLinesWithPattern(String pattern) {
        ArrayList<String> linesWithPattern = new ArrayList<>();
        for (String line : this.fileContent) {
            if (line.contains(pattern)) {
                linesWithPattern.add(line);
            }
        }
        return linesWithPattern;
    }

    public static boolean compareStrings1(String str1, String str2) {
        return str1.equals(str2);
    }

    public static int compareStrings2(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static boolean compareStrings3(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean compareStrings4(String str1, String str2) {
        return str1 == str2;
    }

    public String reverseString(int lineIndex) {
        if (lineIndex >= 0 && lineIndex < this.fileContent.size()) {
            String line = this.fileContent.get(lineIndex);
            return new StringBuilder(line).reverse().toString();
        } else {
            return "L'index de la ligne est invalide.";
        }
    }

    public String removeDuplicates(int lineIndex) {
        if (lineIndex >= 0 && lineIndex < this.fileContent.size()) {
            String line = this.fileContent.get(lineIndex);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                if (result.indexOf(String.valueOf(currentChar)) == -1) {
                    result.append(currentChar);
                }
            }
            return result.toString();
        } else {
            return "L'index de la ligne est invalide.";
        }
    }
    
}
