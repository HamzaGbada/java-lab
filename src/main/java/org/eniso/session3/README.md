**Exercice 1:**

1. **Création de la classe FileHandler :**
   - Créez une classe `FileHandler` avec les attributs suivants :
      - `filePath` : de type `String`, pour représenter le chemin du fichier.
      - `fileSizeInKb` : de type `Integer`, pour représenter la taille du fichier en Ko.
      - `numberOfLines` : de type `Integer`, pour représenter le nombre de lignes dans le fichier.
      - `fileContent` : de type `ArrayList<String>`, pour stocker le contenu du fichier ligne par ligne.
   - **Remarque :** Tous les attributs sont privés (`private`).
2. **Constructeur et Vérification du Chemin :**
   - Implémentez un constructeur qui prend en paramètre un chemin de fichier (`filePath`) et vérifie si le chemin existe.
   - Si le chemin existe, initialisez les attributs `filePath`, `fileSizeInKb`, `numberOfLines` et `fileContent`.
   - Si le chemin n'existe pas, affichez un message d'erreur approprié, et l'objet ne sera pas créé.

3. **Lecture du Fichier et Traitement des Chaînes :**
   - Créez une méthode `readFile()` pour lire le contenu du fichier ligne par ligne et le stocker dans l'attribut `fileContent`.
   - Implémentez une méthode `findLinesWithPattern(String pattern)` qui recherche les lignes du fichier contenant un motif spécifié (`pattern`) et les renvoie sous forme de liste.
   - Implémentez 3 méthodes static `compareStrings1(String str1, String str2)`, `compareStrings2(String str1, String str2)` et `compareStrings3(String str1, String str2)` qui compare deux chaînes de caractères `str1` et `str2` en utilisant différentes méthodes de comparaison.
   - Utilisez différentes méthodes de comparaison, telles que `equals()`, `equalsIgnoreCase()`, et les opérateurs de comparaison (`==` et `!=`), et comparez leurs performances et leurs résultats dans différents contextes.
   - **Question :** Quelle est la différence entre ses méthodes de comparaison ?
4. **Manipulation des Chaînes de Caractères :**
   - Créez une méthode `reverseString(int lineIndex)` qui renverse une ligne de fichiers.
   - Implémentez une méthode `removeDuplicates(int lineIndex)` qui supprime les caractères dupliqués d'une ligne du fichier de caractères tout en préservant l'ordre des caractères originaux.

5. **Tests dans la Méthode Main :**

Tester le code suivant dans la méthode `main`:

```java

package com.eniso.tp3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TP3 {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("file.log");
        

        int lineIndexToReverse = 1; 
        fileHandler.reverseString(lineIndexToReverse);

        int lineIndexToRemoveDuplicates = 2; 
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
        String str8 = "hello"; 
        System.out.println("Comparaison avec == : " + fileHandler.compareStrings4(str7, str8));
        System.out.println("Comparaison avec == : "+ fileHandler.compareStrings4(new String("hello"),"hello")); 
        System.out.println("Comparaison avec == : "+ fileHandler.compareStrings4(new String("hello"), new String("hello"))); 
        
        
        System.out.println("Ligne contenant le motif '" + pattern + "' : " + linesWithPattern.get(0));
    }
}

```

**Question:** Quelle est la différence entre les 3 méthodes de comparison ?




**Exercice 2:**

**Introduction :**

Le chiffrement XOR (OU exclusif) est une technique de chiffrement simple mais puissante qui utilise l'opération XOR pour combiner les bits du texte clair avec ceux de la clé de chiffrement. Dans cet exercice, nous allons explorer comment implémenter le chiffrement XOR pour chiffrer et déchiffrer des strings en Java.

**Algorithme de chiffrement XOR :**

L'algorithme de chiffrement XOR fonctionne de la manière suivante :

1. **Chiffrement :**
   - Chaque caractère du texte clair est converti en sa représentation binaire.
   - Chaque caractère de la clé de chiffrement est également converti en sa représentation binaire.
   - Les bits de chaque caractère du texte clair sont combinés avec les bits correspondants de la clé de chiffrement à l'aide de l'opérateur XOR.
   - Le résultat du XOR est converti en caractère et ajouté au texte chiffré.

2. **Déchiffrement :**
   - Le processus de déchiffrement est similaire à celui du chiffrement.
   - Chaque caractère du texte chiffré est combiné avec les bits correspondants de la clé de chiffrement à l'aide de l'opérateur XOR.
   - Le résultat du XOR est converti en caractère et ajouté au texte déchiffré.

**Consigner :**

Implémentez les méthodes suivantes dans une classe Java nommée `XORCipher`, qui a comme attribut la clé de chiffrement `key`, créer le constructeur nécessaire :

1. `encrypt(String plaintext)`: Cette méthode prend un texte clair, chiffre le texte clair à l'aide de la clé de chiffrement et renvoie le texte chiffré.
2. `decrypt(String ciphertext)`: Cette méthode prend un texte chiffré, déchiffre le texte chiffré à l'aide de la clé de chiffrement et renvoie le texte clair.

3. Tester le code suivant dans la méthode `main`:

```java
public class TP3{
   public static void main(String[] args) {
      // Clé de chiffrement
      String key = "secret";

      // Texte clair à chiffrer
      String plaintext = "Hello, world";

      // Création de l'objet XORCipher
      XORCipher xorCipher = new XORCipher(key);

      // Chiffrement du texte clair
      String encryptedText = xorCipher.encrypt(plaintext);
      System.out.println("Texte chiffré : " + encryptedText);

      // Déchiffrement du texte chiffré
      String decryptedText = xorCipher.decrypt(encryptedText);
      System.out.println("Texte déchiffré : " + decryptedText);
   }
}
```




**Exercice2**

Le chiffrement de Vigenère est une technique de cryptographie classique qui utilise un mot-clé pour chiffrer un message. Chaque lettre du message est décalée selon la lettre correspondante dans le mot-clé.

**Instructions :**
1. Implémentez une classe `VigenereCipher` avec les méthodes suivantes :
   - `encrypt(String message, String keyword)`: Cette méthode prend un message et un mot-clé en entrée, et renvoie le message chiffré en utilisant l'algorithme de Vigenère.
   - `decrypt(String encryptedMessage, String keyword)`: Cette méthode prend un message chiffré et le mot-clé utilisé pour le chiffrer, et renvoie le message d'origine.
   - Assurez-vous de gérer correctement les lettres majuscules et minuscules, ainsi que les caractères spéciaux dans le message d'entrée.

**Exemple d'utilisation :**

```java
public class Main {
    public static void main(String[] args) {
        String message = "HelloWorld";
        String keyword = "KEY";

        VigenereCipher cipher = new VigenereCipher();
        String encryptedMessage = cipher.encrypt(message, keyword);
        System.out.println("Message chiffré : " + encryptedMessage);

        String decryptedMessage = cipher.decrypt(encryptedMessage, keyword);
        System.out.println("Message déchiffré : " + decryptedMessage);
    }
}
```


**Exercice 2:**

1. **Création de la Classe Externe `Ecole` :**
   - Créez une classe externe `Ecole` qui servira de conteneur principal pour la gestion des étudiants.
   - Cette classe doit contenir une liste d'étudiants et des méthodes pour ajouter, afficher, modifier et supprimer des étudiants.

2. **Classe Interne `Student` :**
   - À l'intérieur de la classe `Ecole`, créez une classe interne `Student` qui représentera les informations spécifiques à chaque étudiant.
   - Les attributs de la classe `Student` doivent inclure le nom, le prénom, le numéro d'inscription et l'email.

3. **Classe Locale `GestionEtudiants` :**
   - Dans la méthode principale de la classe `Ecole`, créez une classe locale `GestionEtudiants`.
   - Cette classe locale doit fournir des méthodes pour manipuler les étudiants, telles que l'ajout, la suppression et la modification.

4. **Utilisation d'une Classe Anonyme pour le Tri :**
   - Utilisez une classe anonyme pour trier la liste des étudiants par ordre alphabétique selon leur nom.
   - Cette classe anonyme doit implémenter l'interface `Comparator` pour définir l'ordre de tri des étudiants.

**Remarques :**

- Assurez-vous d'encapsuler correctement les attributs de la classe `Student` en fournissant des méthodes d'accès appropriées.
- Veillez à tester toutes les fonctionnalités du système de gestion des étudiants pour vous assurer de leur bon fonctionnement.
- Prenez en compte la lisibilité, la modularité et la maintenabilité du code lors de son écriture.