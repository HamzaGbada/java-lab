/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session3;

/**
 *
 * @author bobmarley
 */
public class VigenereCipher {
    private static final int ALPHABET_SIZE = 26;

    public String encrypt(String message, String keyword) {
        StringBuilder encryptedMessage = new StringBuilder();
        int keywordIndex = 0;

        for (char originalChar : message.toCharArray()) {
            if (Character.isLetter(originalChar)) {
                char keyChar = keyword.charAt(keywordIndex % keyword.length());
                int shift = Character.toUpperCase(keyChar) - 'A';
                char encryptedChar = encryptChar(originalChar, shift);
                encryptedMessage.append(encryptedChar);
                keywordIndex++;
            } else {
                encryptedMessage.append(originalChar);
            }
        }

        return encryptedMessage.toString();
    }

    public String decrypt(String encryptedMessage, String keyword) {
        StringBuilder decryptedMessage = new StringBuilder();
        int keywordIndex = 0;

        for (char encryptedChar : encryptedMessage.toCharArray()) {
            if (Character.isLetter(encryptedChar)) {
                char keyChar = keyword.charAt(keywordIndex % keyword.length());
                int shift = Character.toUpperCase(keyChar) - 'A';
                char originalChar = decryptChar(encryptedChar, shift);
                decryptedMessage.append(originalChar);
                keywordIndex++;
            } else {
                decryptedMessage.append(encryptedChar);
            }
        }

        return decryptedMessage.toString();
    }

    private char encryptChar(char originalChar, int shift) {
        char base = Character.isUpperCase(originalChar) ? 'A' : 'a';
        return (char) ((originalChar - base + shift) % ALPHABET_SIZE + base);
    }

    private char decryptChar(char encryptedChar, int shift) {
        char base = Character.isUpperCase(encryptedChar) ? 'A' : 'a';
        int decryptedChar = (encryptedChar - base - shift) % ALPHABET_SIZE;
        if (decryptedChar < 0) {
            decryptedChar += ALPHABET_SIZE;
        }
        return (char) (decryptedChar + base);
    }
}


