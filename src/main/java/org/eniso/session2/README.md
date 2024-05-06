
## Exercice 1 :

### Partie 1
**Introduction :**

Dans cet exercice, l'objectif est de mettre en place un système de gestion des étudiants dans une école. Chaque étudiant est représenté par un objet `Etudiant`, défini par les attributs suivants : Nom, Prénom, Numéro d'inscription et Email. Les étudiants seront stockés dans une collection de type ArrayList.

Créer un projet Maven sous le nom `TP2-SystemeGestionEtudiants`, et Artifact `com.eniso`

**Instructions :**

1. **Création de la classe Etudiant :**
    - Définissez une classe `Etudiant` avec les attributs suivants : **Nom**, **Prénom**, **Numéro d'inscription** et **Email**. Définir une classe `SystemeGestionEtudiants` qui prend une Liste des étudiants comme attributs. Assurez-vous que les attributs sont `private` et que des méthodes d'accès appropriées sont fournies **constructeur**, **getter** et **setter**.
    - Implémenter la méthode `toString` pour afficher les informations de l'étudiant.
2. **Ajout d'un Étudiant :**
    - Implémentez une méthode `ajouterEtudiant` dans la classe `SystemeGestionEtudiants` qui prend en paramètre les informations d'un étudiant (Nom, Prénom, Numéro d'inscription, Email) et l'ajoute à la liste des étudiants.

   ```java
   public void ajouterEtudiant(String nom, String prenom, int numeroInscription, String email) {
       // Implémentation à réaliser
   }
   ```

3. **Affichage des Étudiants :**
    - Écrivez une méthode `afficherEtudiants` dans la classe `SystemeGestionEtudiants` qui affiche les informations essentielles de tous les étudiants de la liste (Nom, Prénom, Email).

   ```java
   public void afficherEtudiants() {
       // Implémentation à réaliser
   }
   ```

4. **Modification de l'Email d'un Étudiant :**
    - Implémentez une méthode `modifierEmailEtudiant` dans la classe `SystemeGestionEtudiants` qui prend en paramètre le numéro d'inscription d'un étudiant et son nouvel email, et modifie l'email de cet étudiant dans la liste.

   ```java
   public void modifierEmailEtudiant(int numeroInscription, String nouvelEmail) {
       // Implémentation à réaliser
   }
   ```

5. **Suppression d'un Étudiant par Numéro d'Inscription :**
    - Écrivez une méthode `supprimerEtudiant` dans la classe `SystemeGestionEtudiants` qui prend en paramètre le numéro d'inscription d'un étudiant et le supprime de la liste.

   ```java
   public void supprimerEtudiant(int numeroInscription) {
       // Implémentation à réaliser
   }
   ```

6. **Tests dans la méthode main :**
    - Dans la méthode main, créez une instance de la classe `SystemeGestionEtudiants`, ajoutez quelques étudiants, affichez-les, modifiez l'email de l'un d'entre eux et supprimez un étudiant. Testez toutes les fonctionnalités pour vous assurer qu'elles fonctionnent correctement.

    - Ajouter une question concernant l'encapsulation des attributs dans l'exercice :
7. **Méthode Main :**
    - Dans la méthode `main`, instanciez un objet de type `SystemeGestionEtudiants`. Ensuite, ajoutez trois étudiants (avec des attributs au choix), affichez-les, modifiez l'email d'un étudiant, supprimez un autre étudiant, puis affichez à nouveau tous les étudiants restants.
    -
**Question supplémentaire :**

Si l'encapsulation des attributs de la classe `Etudiant` est modifiée pour les déclarer comme `public` ou `protected`, est-il nécessaire de créer des méthodes getter et setter pour accéder et modifier ces attributs ?


### Partie 2 :

Dans cette partie, nous allons améliorer le système de gestion des étudiants dans une école en mettant en œuvre les concepts de classe externe, classe interne, classe locale et classe anonyme.

**Instructions :**

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

## Exercice 2

**Instructions :**

Considérons une classe `Livre` qui représente un livre avec les attributs suivants :
- Titre (`private`)
- Auteur (`private`)
- Année de publication (`protected`)
- ISBN (International Standard Book Number) (`public`)

1. Implémentez les méthodes getter et setter pour les attributs privés.

2. **Création de la Classe Livre :**
    - Créez une classe `Livre` avec les attributs mentionnés ci-dessus, en respectant les niveaux d'encapsulation définis.

3. **Constructeur par Défaut :**
- Implémentez un constructeur par défaut qui initialise tous les attributs à des valeurs par défaut.

4. **Constructeur avec Titre et Auteur :**
    - Implémentez un constructeur qui prend en paramètre le titre et l'auteur du livre et initialise les autres attributs à des valeurs par défaut.

5. **Constructeur avec Titre, Auteur et Année de Publication :**
    - Ajoutez un constructeur qui prend le titre, l'auteur et l'année de publication du livre comme paramètres et initialise les autres attributs à des valeurs par défaut.

6. **Constructeur avec Titre, Auteur, Année de Publication et ISBN :**
    - Ajoutez un constructeur qui prend tous les attributs comme paramètres et initialise les valeurs correspondantes.

7. **Tests dans la Méthode Main :**
    - Dans la méthode main, créez plusieurs objets `Livre` en utilisant les différents constructeurs.
    - Affichez les détails de chaque livre créé en utilisant une méthode d'affichage appropriée.

**Consignes :**
- Assurez-vous que chaque constructeur initialise correctement les attributs de la classe `Livre` tout en respectant les niveaux d'encapsulation.
- Testez chaque constructeur en créant au moins un objet `Livre` pour chaque cas.
- Assurez-vous que la classe `Livre` offre une flexibilité dans la création d'objets en fournissant différents constructeurs adaptés à divers scénarios d'utilisation.
