# TP1: Fondements de Java et Environnement de Développement

**Exercice 1:**

a) **Utilisation du Terminal pour Compiler et Exécuter le Code Java**

1. **Lancement du Terminal**
    - Ouvrez le terminal sur votre système d'exploitation.

2. **Création d'un Fichier Java avec nano**
    - Utilisez la commande `nano` pour créer un nouveau fichier Java. Par exemple, saisissez `nano TP1.java` et appuyez sur Entrée.
    - Copiez-collez le code Java fourni dans le fichier.

   ```java
   import java.util.Scanner;

   public class TP1 {
       public static void main(String[] args) {
           System.out.println("Bonjour, mon premier TP en POO");
       }
   }
   ```

    - Utilisez `Ctrl` + `X` pour quitter nano, confirmez la sauvegarde avec `Y`, puis appuyez sur Entrée.

3. **Compilation avec javac**
    - Utilisez la commande `javac TP1.java` pour compiler le fichier Java que vous venez de créer.

4. **Exécution avec java**
    - Exécutez le code compilé avec la commande `java TP1`.

- Expliquez la différence entre la JVM (Java Virtual Machine) et le JDK (Java Development Kit).
- Quel rôle joue la JVM dans l'exécution du code Java ?

b) **Pousser un TP (Travaux Pratiques) dans GitHub**

1. **Créer un Répertoire (Repository) sur GitHub :**
    - Allez sur GitHub (https://github.com/) et connectez-vous à votre compte.
    - Cliquez sur le bouton **New** pour créer un nouveau répertoire (la répertoire doit porte le meme nom du répertoire local). Donnez-lui un nom significatif, ajoutez une description (optionnelle), et configurez les autres options selon vos besoins.
    - Appuyez sur Create **repository**.

2. **Initialiser le Répertoire Local :**
    - Allez sur votre machine locale et assurez-vous que Git est installé.
    - Naviguez vers le répertoire de votre projet sur votre terminal.
    - Si votre projet n'est pas encore un dépôt Git, exécutez la commande suivante pour l'initialiser :
      ```bash
      git init
      ```

3. **Associer le Répertoire Local au Répertoire GitHub :**
    - Utilisez la commande suivante pour associer votre répertoire local à celui sur GitHub (remplacez `<votre-nom-d-utilisateur>` et `<nom-du-repo>` par vos informations) :
      ```bash
      git remote add origin https://github.com/<votre-nom-d-utilisateur>/<nom-du-repo>.git
      ```

4. **Ajouter et Valider les Modifications :**
    - Utilisez les commandes suivantes pour ajouter et valider vos modifications (remplacez `<nom-du-fichier>` par le nom de votre fichier ou `.` pour ajouter tous les fichiers) :
      ```bash
      git add <nom-du-fichier>
      git commit -m "Ajouter un message descriptif"
      ```

5. **Pousser les Modifications sur GitHub :**
    - Utilisez la commande suivante pour pousser vos modifications vers GitHub :
      ```bash
      git push -u origin master
      ```
        - Si vous travaillez sur une branche autre que `master`, remplacez `master` par le nom de votre branche.

6. **Authentification :**
    - Si c'est votre première fois, Git vous demandera de vous authentifier. Fournissez vos identifiants GitHub.

7. **Vérifier sur GitHub :**
    - Rafraîchissez votre page sur GitHub, et vous devriez voir vos fichiers poussés dans votre répertoire.

**Exercice 2:**

   - Lancez l'outil NetBeans.
   - Définissez un nouveau projet Java (File -> New Project -> Java With Maven -> Java Application) en lui attribuant le nom "Tp1" et "com.eniso" comme Group Id.
   - Fermez tous les autres projets ouverts.

   - Saisissez le code fourni et l'exécutez.

```java
package com.eniso.Tp1;
import java.util.Scanner;

public class Tp1 {
    public static void main(String[] args) {
        System.out.println("Bonjour, mon premier TP en POO");

        // Lecture du nom
        System.out.println("Quelle est votre nom ?");
        Scanner read = new Scanner(System.in);
        String name = read.next();

        // Lecture de l'âge
        System.out.println();
        System.out.println("Bonjour " + name);
        System.out.println("Quel est votre âge " + name + "?");
        read = new Scanner(System.in);
        int a;
        a = read.nextInt();
        System.out.println(name + " votre âge est " + a);
    }
}
```

Énoncé reformulé :

**Exercice 3:**

**Partie 1: Probabilité d'Occurrence**

Implémentez une méthode nommée `calculateProbability` en Java. Cette méthode prend en paramètre une image représentée par une matrice d'entiers et calcule la probabilité d'occurrence de chaque niveau de gris, allant de 0 à 255. Assurez-vous que les probabilités calculées sont normalisées, de manière à former une distribution de probabilités valide.

La formule pour calculer la probabilité d'occurrence \(P(i)\) est définie comme suit :
\[ P(i) = \frac{\text{Nombre d'occurrences de } i}{\text{Nombre total de pixels dans l'image}} \]

On suppose que les images sont codées sur 8 bits, donc \(i \in \{0, 255\}\).

```java
public static double[] calculateProbability(int[][] image) {
    // Implémentation à réaliser
}
```

**Partie 2: Calcul d'Entropie**

Écrivez une méthode appelée `calculateEntropy` en Java. Cette méthode prend en paramètre une matrice représentant une image (valeurs de niveaux de gris) et retourne l'entropie de l'image. Utilisez la formule suivante :
\[ H(X) = -\sum_{i=0}^{255} P(i) \cdot \log_2(P(i)) \]

La probabilité d'occurrence \(P(i)\) est celle calculée à l'aide de la méthode `calculateProbability`.

```java
public static double calculateEntropy(int[][] image) {
    // Implémentation à réaliser
}
```

**Question : Pourquoi avons-nous utilisé des méthodes statiques ?**

Nous avons utilisé des méthodes statiques pour permettre l'accès à ces fonctions sans avoir besoin d'instancier une classe. Les méthodes statiques peuvent être appelées directement sur la classe, ce qui est pratique dans le contexte de fonctions utilitaires comme celles-ci, qui ne nécessitent pas d'état spécifique de l'objet. Cela simplifie l'utilisation de ces méthodes sans créer d'instances inutiles de la classe.


**Exercice 3:**

- Ajoutez une classe `Student` comprenant :
    - Les attributs `name` (de type `String`) et `age` (de type `int`).
    - Un constructeur avec deux paramètres.
    - Trois méthodes : `changeName`, `changeAge`, et `display` qui affiche les attributs de l’étudiant.
  
- Ajoutez des instructions à la méthode `main` pour saisir le nom et l’âge de deux étudiants.
- Créez deux objets de type `Student` et appelez la méthode `changeAge` pour l’un des étudiants (utilisez votre nom comme exemple).
- Dans quelles méthodes on peut faire la saisie du nom et de l’âge ?


- Ajoutez une classe nommée `Computer` avec les attributs `brand` (chaîne de caractères), `processor` (chaîne de caractères), `memory` (taille de la mémoire), `state` (0 en panne, 1 en marche, 2 en réparation).
- Ajoutez deux constructeurs ayant un nombre de paramètres différents.

- Ajoutez une méthode `changeState` à la classe `Computer` permettant de changer l’état de l’ordinateur.

- Créez deux objets de types ordinateurs dans la méthode `main`.

- Ajoutez à la classe `Student` un attribut de type référence à un ordinateur et une méthode `buyComputer` permettant d’assigner un ordinateur à un étudiant.

- Créez un fichier `computerData.txt` (cliquez sur le nom de l’application (bouton droit) -> New -> Empty File) contenant des détails sur des ordinateurs sous la forme suivante : "marque processeur mémoire état".

- Ajoutez des instructions dans `main` pour lire du fichier `computerData.txt` les détails sauvegardés pour des objets ordinateurs, créer de nouveaux objets ordinateurs et les assigner à des étudiants. Affichez les noms des étudiants qui ont des ordinateurs en panne.

- Ajoutez à la classe `Student` un attribut de type tableau nommé `friends` pour contenir les références de cinq étudiants amis.

- Ajoutez des instructions dans `main` pour créer des objets `Student` et les assigner à vous comme amis.

