/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session3;

/**
 *
 * @author bobmarley
 */
public class XORCipher {
    private String key;

    public XORCipher(String key) {
        this.key = key;
    }

    public String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);
            char keyChar = this.key.charAt(i % this.key.length()); // Répéter la clé si nécessaire
            char encryptedChar = (char) (plainChar ^ keyChar); // Opération XOR
            ciphertext.append(encryptedChar);
        }
        return ciphertext.toString();
    }

    public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char encryptedChar = ciphertext.charAt(i);
            char keyChar = this.key.charAt(i % this.key.length()); // Répéter la clé si nécessaire
            char decryptedChar = (char) (encryptedChar ^ keyChar); // Opération XOR
            plaintext.append(decryptedChar);
        }
        return plaintext.toString();
    }
       public static void main(String[] args) {
        String key = "secret";

        String plaintext = "Hello, world";

        XORCipher xorCipher = new XORCipher(key);

        String encryptedText = xorCipher.encrypt(plaintext);
        System.out.println("Texte chiffré : " + encryptedText);

        String decryptedText = xorCipher.decrypt(encryptedText);
        System.out.println("Texte déchiffré : " + decryptedText);
    }
}

