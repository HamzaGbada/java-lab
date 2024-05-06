# TP4
## Exercice 1 :

Vous avez pour tâche de concevoir un système bancaire complexe qui implique différentes classes représentant différents aspects du processus bancaire.

Pour chaque exercice create a package with name ExerciceX
### Exigences :

1. **Classe BankAccount :**
    - Représente un compte bancaire générique.
    - Propriétés : `protected Integer accountNumber`, `protected Double balance`.
    - Méthodes : `deposit(double montant)`, `withdraw(double montant)`, `Double getBalance()`.

2. **Classe SavingsAccount (hérite de BankAccount) :**
    - Représente un compte d'épargne avec un taux d'intérêt.
    - Propriétés : `private Double interestRate`.
    - Méthodes : `calculateInterest()`, `getInterestRate()`.
    - **Remplace** la méthode `withdraw()` pour inclure une pénalité pour les retraits excessifs.

3. **Classe CheckingAccount (hérite de BankAccount) :**
    - Représente un compte chèque avec une protection contre les découverts.
    - Propriétés : `private Double overdraftAllowed`
    - Méthodes : `setOverdraftAllowed(Double overdraftAllowed)`, `getOverdraftAllowed()`.
    - Remplace la méthode `withdraw()` pour gérer les découverts.

4. **Classe Customer :**
    - Représente un client de banque avec des comptes.
    - Propriétés : `private String firstName`, `private String lastName`, `private ArrayList<BankAccount> accounts`.
    - Méthodes : `addAccount(BankAccount compte)`, `removeAccount(BankAccount compte)`, `getTotalAccountBalance()`, `transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double amount)`.

5. **Classe Bank :**
    - Gère une collection de clients et de leurs comptes.
    - Propriétés : `private ArrayList<Customer> clients`.
    - Méthodes : `addCustomer(Customer client)`, `removeCustomer(Customer client)`, `getTotalBalance()`.

### Instructions :
1. Utilisez l'application en ligne https://app.diagrams.net/ pour créer un diagramme de classes de cet exercice.
2. Implémentez les classes conformément aux exigences fournies.
3. Utilisez l'héritage de constructeur pour initialiser les propriétés héritées des classes parentes.
4. Testez le code suivant dans la méthode `main` :

```java
public class Exercice1 {
   public static void main(String[] args) {
      // Exemple de conversions explicites des références
      BankAccount account = new SavingsAccount(201, 3.5);
      SavingsAccount savingsAccount = (SavingsAccount) account;
      System.out.println("Conversion explicite réussie : " + (savingsAccount != null));

      BankAccount anotherAccount = new CheckingAccount(202, 1000.0);
      CheckingAccount checkingAccount = (CheckingAccount) anotherAccount;
      System.out.println("Conversion explicite réussie : " + (checkingAccount != null));

      // Test de fonctionnalité existante
      SavingsAccount savingsAccount1 = new SavingsAccount(101, 5.0);
      savingsAccount1.deposit(1000.0);
      savingsAccount1.withdraw(200.0);
      System.out.println("Solde du compte épargne : " + savingsAccount1.getBalance());

      CheckingAccount checkingAccount1 = new CheckingAccount(102, 500.0);
      checkingAccount1.deposit(1500.0);
      checkingAccount1.withdraw(800.0);
      System.out.println("Solde du compte chèque : " + checkingAccount1.getBalance());

      Customer customer = new Customer("John", "Doe");
      customer.addAccount(savingsAccount1);
      customer.addAccount(checkingAccount1);

      System.out.println("Solde total du client : " + customer.getTotalAccountBalance());

      Bank bank = new Bank();
      bank.addCustomer(customer);
      System.out.println("Solde total de la banque : " + bank.getTotalBalance());
   }
}
```

## Exercice 2 :

**Instructions :**

1. Créez la classe `User` avec les attributs suivants : `private String firstName`, `private String lastName`, `private String email`, et `private Long cin`.

2. Héritez de la classe `User` pour créer les classes suivantes : `Student`, `Teacher` et `StaffMember`.

3. Définissez les caractéristiques de la classe `Student` comme suit : `private Double average`, `private Classe class`, et `private Status status` pour représenter sa moyenne, sa classe actuelle, et son statut (redoublant ou non).

4. Les classes `Classe` et `Status` sont des énumérations définies respectivement pour les classes (`IA1_1`, `IA1_2`, `GTE1`) et les statuts (`REDOUBLANT`, `NON_REDOUBLANT`).

5. Définissez les caractéristiques de la classe `Teacher` comme suit : `private Long hIndex` pour l'index h et `private List<Course> courses` pour les cours enseignés.

6. La classe `Course` contient les attributs suivants : `private String name`, `private List<String> contents`, et `private Float coef`.

7. Définissez les caractéristiques de la classe `StaffMember` comme suit : `private String qualification`, `private Integer experience` et `private List<String> tasks`.

8. Implémentez pour les classes `User`, `Student`, `Teacher` et `StaffMember` les méthodes suivantes :
    - `displayInfo()`: Une méthode pour afficher les informations de l'utilisateur.
    - `updateProfile()`: Permet à l'utilisateur de mettre à jour ses informations de profil.
    - `authenticate()`: Effectue les tâches d'authentification pour l'utilisateur.

9. Ajoutez la méthode suivante pour la classe `Teacher` : `displayCoursesContent()`, utilisez les Streams en Java.

10. Ajoutez la méthode suivante pour la classe `StaffMember` : `finishTask()`.

11. Intégrez la dépendance Maven Lombok pour générer les Getter, Setters et les constructeurs en utilisant les annotations `@AllArgsConstructor`, `@NoArgsConstructor`, `@Getter` et `@Setter` pour réduire le code redondant. Ajoutez la dépendance Maven suivante :
```xml
<dependencies>
   <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.30</version>
      <scope>provided</scope>
   </dependency>
</dependencies>
```

Testez le code suivant dans la méthode `main` :
```java
public class Main {
   public static void main(String[] args) {
      Student student = new Student("student1", "student1", "student@email.com", 12345L, 15.0, Classe.IA1_2, Status.NON_REDOUBLANT);
      student.displayInfo();

      student.updateProfile("student11", "student11", "john.doe.new@email.com");
      student.displayInfo();

      boolean isAuthenticatedStudent = student.authenticate();
      System.out.println("Student Authentication: " + isAuthenticatedStudent);

      Course mathCourse = new Course("Math", new ArrayList(List.of("Algebra", "Calculus")), 2.0f);
      Course physicsCourse = new Course("Physics", new ArrayList(List.of("Mechanics", "Thermodynamics")), 1.5f);
      Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L, new ArrayList(List.of(mathCourse, physicsCourse)));
      teacher.setHIndex(10L);

      teacher.displayInfo();
      teacher.displayCoursesContent();

      StaffMember staffMember = new StaffMember("member1", "member1", "member1@email.com", 11111L, "Engineer", 5, new ArrayList(List.of("Task1", "Task2", "Task3")));

      staffMember.displayInfo();
      staffMember.finishTask("Task2");
      staffMember.displayInfo();
   }
}

```

## Exercice 3 :

L'objectif de cet exercice est de montrer un exemple de polymorphisme au moment de la compilation (compiled-time polymorphism).

1. Définissez une classe nommée `Calculator` avec les méthodes suivantes :
    - Méthode `add(int num1, int num2)` pour ajouter deux entiers et retourner le résultat.
    - Méthode `add(int num1, int num2, int num3)` pour ajouter trois entiers et retourner le résultat.
    - Méthode `add(double num1, double num2)` pour ajouter deux nombres à virgule flottante et retourner le résultat.
    - Méthode `add(String str1, String str2)` pour concaténer deux chaînes de caractères et retourner le résultat en tant qu'une seule chaîne.

2. Dans la méthode `main` de la classe `Calculator`, créez une instance de la classe et appelez chaque méthode `add` surchargée avec différents ensembles de paramètres.

3. Affichez les résultats de chaque appel de méthode en implémentant cette méthode `main` :

```java
public class Main {
   public static void main(String[] args) {
      Calculator calculator = new Calculator();

      // Appelez chaque méthode add surchargée avec différents ensembles de paramètres
      int sommeEntiers = calculator.add(5, 10);
      int sommeTroisEntiers = calculator.add(5, 10, 15);
      double sommeDoubles = calculator.add(3.5, 2.5);
      String chaineConcatenee = calculator.add("Bonjour", "Monde");

      // Affichez les résultats de chaque appel de méthode
      System.out.println("Somme de 5 et 10 : " + sommeEntiers);
      System.out.println("Somme de 5, 10 et 15 : " + sommeTroisEntiers);
      System.out.println("Somme de 3.5 et 2.5 : " + sommeDoubles);
      System.out.println("Chaîne concaténée : " + chaineConcatenee);
   }
}
```

