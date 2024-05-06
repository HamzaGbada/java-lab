

## Exercice 1

**Objectif :** Développer un système de machine learning sophistiqué pour faciliter l'entraînement et l'évaluation de plusieurs algorithmes sur des ensembles de données diversifiés.

### Instructions :
1. **Note : les emplacements des méthodes ne contiennent que des messages descriptifs plutôt que la logique réelle**
2. Implémentez les classes et interfaces fournies selon les spécifications données.
3. Assurez-vous que chaque méthode est correctement définie et que sa fonctionnalité correspond aux descriptions de classe/interface.
4. Dans la méthode `main`, instanciez différents ensembles de données et modèles de machine learning pour démontrer les capacités du système.
5. Utilisez des données d'exemple ou créez des ensembles de données fictifs pour entraîner et prédire en utilisant les modèles de machine learning.
6. Affichez les résultats des prédictions et tout détail pertinent sur les modèles en utilisant la méthode `displayDetails()` fournie.

### Classes et Interfaces Requises :

1. **Interface `MachineLearningModel` :**
    - Méthodes :
        - `void train(Dataset dataset)` : Entraîne le modèle en utilisant l'ensemble de données fourni.
        - `double predict(Dataset dataset)` : Prédit un résultat basé sur une instance donnée.

2. **Classe Abstraite `BaseModel` (implémente `MachineLearningModel`) :**
    - Attributs :
        - `protected String name` : Nom du modèle.
        - `int version` : Version du modèle.
        - `String description` : Description ou détails sur le modèle.
        - `String device` : Le paramètre de périphérique par défaut défini sur `"cpu"`.
    - Méthodes :
        - Constructeur pour initialiser `name`, `version` et `description`.
        - `void displayDetails()` : Affiche les détails sur le modèle.

3. **Classe Abstraite `Dataset` :**
    - Attributs :
        - `protected boolean isTrain` : Indique si l'ensemble de données est destiné à l'entraînement ou au test.
        - `protected String path` : Chemin vers le fichier de l'ensemble de données.
    - Méthodes :
        - Méthodes abstraites pour le chargement et la prétraitement des données.

4. **Classes Concrètes `ClassificationDataset` et `RegressionDataset` (étendent `Dataset`) :**
    - Pour `ClassificationDataset` :
        - Attributs :
            - `String[] labels` : Tableau d'étiquettes/classes uniques.
            - `int numClasses` : Nombre de classes distinctes.
        - Méthodes :
            - Implémentation du chargement des données et du prétraitement spécifique aux tâches de classification.

    - Pour `RegressionDataset` :
        - Attributs :
            - `int numFeatures` : Nombre de caractéristiques d'entrée.
            - `double[] targets` : Tableau de valeurs cibles.
        - Méthodes :
            - Implémentation du chargement des données et du prétraitement spécifique aux tâches de régression.

5. **Classes Concrètes `SupportVectorMachine`, `RandomForest`, `NeuralNetwork` (étendent `BaseModel`) :**
    - Pour `SupportVectorMachine` :
        - Attributs :
            - `int iterations` : Nombre d'itérations d'entraînement.
            - `double learningRate` : Taux d'apprentissage pour l'optimisation.
        - Méthodes :
            - Méthode `train()` surchargée pour implémenter l'entraînement de la régression linéaire.
            - Méthode `predict()` surchargée pour implémenter la prédiction de la régression linéaire.

    - Pour `RandomForest` :
        - Attributs :
            - `int numTrees` : Nombre d'arbres dans la forêt.
            - `int maxDepth` : Profondeur maximale des arbres.
        - Méthodes :
            - Méthode `train()` surchargée pour implémenter l'entraînement de la forêt aléatoire.
            - Méthode `predict()` surchargée pour implémenter la prédiction de la forêt aléatoire.

    - Pour `NeuralNetwork` :
        - Attributs :
            - `int[] layers` : Tableau définissant le nombre de nœuds dans chaque couche.
            - `String activationFunction` : Type de fonction d'activation utilisée.
        - Méthodes :
            - Méthode `train()` surchargée pour implémenter l'entraînement du réseau de neurones.
            - Méthode `predict()` surchargée pour implémenter la prédiction du réseau de neurones.

### Méthode Principale :

```java
public class Exercice1 {
    public static void main(String[] args) {
        ClassificationDataset classificationData = new ClassificationDataset("chemin/vers/classification_data.csv", true);
        RegressionDataset regressionData = new RegressionDataset("chemin/vers/regression_data.csv", false);

        SupportVectorMachine svm = new SupportVectorMachine("SVM", 1, 0.01);
        svm.train(classificationData);
        svm.displayDetails();

        RandomForest rf = new RandomForest("RandomForest", 100, 10);
        rf.train(regressionData);
        rf.displayDetails();

        NeuralNetwork nn = new NeuralNetwork("NeuralNetwork", new int[]{10, 5, 1}, "sigmoid");
        nn.train(classificationData);
        nn.displayDetails();

        System.out.println("Prédiction SVM : " + svm.predict(classificationData));
        System.out.println("Prédiction RandomForest : " + rf.predict(regressionData));
        System.out.println("Prédiction NeuralNetwork : " + nn.predict(classificationData));
    }
}
```


## Exercice 2:

**Introduction :**

La gestion des exceptions en Java est une compétence cruciale pour développer des applications robustes et fiables. Dans cet exercice, nous allons explorer en profondeur les exceptions vérifiées et non vérifiées, ainsi que les meilleures pratiques pour les traiter.

**Concepts Clés :**

- **Exceptions vérifiées (Checked Exceptions)** : Doivent être déclarées dans la signature d'une méthode ou d'un constructeur avec le mot-clé `throws` ou être entourées par un bloc `try-catch`. Exemple : `IOException`.

- **Exceptions non vérifiées (Unchecked Exceptions)** : Pas besoin de déclaration dans la signature d'une méthode ou d'un constructeur. Exemple : `RuntimeException`.

**Exercice :**

1. **Gestion de Fichiers** :
    - Créez une classe `FileManager` avec une méthode `readFile` qui lève une `FileNotFoundException` si un fichier spécifié n'est pas trouvé.

2. **Opérations Mathématiques** :
    - Créez une classe `MathOperations` avec une méthode `calculateFactorial` qui lève une `IllegalArgumentException` si un nombre négatif est passé comme argument.
    - Ajoutez une méthode `calculateSquareRoot` qui lève une `ArithmeticException` si la racine carrée d'un nombre négatif est tentée.

3. **Gestion des Utilisateurs** :
    - Créez une classe `UserValidator` avec une méthode `validateAge` qui lève une `UserAgeException` si l'âge d'un utilisateur est inférieur à 18 ans.
    - La classe `UserAgeException` doit être une exception personnalisée avec un message explicite.

4. **Main Method** :
    - Dans la méthode `main`, créez des instances des classes précédentes et essayez de provoquer chaque exception.
    - Utilisez un bloc `try-catch` approprié pour gérer chaque exception et afficher des messages descriptifs.

**Instructions supplémentaires :**

- Assurez-vous de créer des messages descriptifs pour chaque type d'exception attrapée dans les blocs `catch`.
- Pour l'exception personnalisée `UserAgeException`, assurez-vous d'inclure des détails pertinents sur l'utilisateur concerné dans le message d'erreur.

**Méthode `Main`**

```java
public class Execice2 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        MathOperations mathOperations = new MathOperations();
        UserValidator userValidator = new UserValidator();

        try {
            fileManager.readFile("invalid/file/path.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            mathOperations.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            mathOperations.calculateSquareRoot(-10);
        } catch (ArithmeticException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            userValidator.validateAge(16);
        } catch (UserAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
```

Output:
```text
Exception attrapée : Fichier non trouvé : invalid/file/path.txt
Exception attrapée : Nombre négatif passé : -5
Exception attrapée : Tentative de calcul de la racine carrée d'un nombre négatif : -10.0
Exception attrapée : Âge invalide : 16. L'utilisateur doit être âgé de 18 ans ou plus.
```

**Solution Squelette :**

```java
import java.io.FileNotFoundException;

class FileManager {
    public void readFile(String filePath) throws FileNotFoundException {
        // Code to read a file
        throw new FileNotFoundException("Fichier non trouvé : " + filePath);
    }
}

class MathOperations {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nombre négatif passé : " + n);
        }
        // Code to calculate factorial
        return 0;  // Placeholder
    }

    public double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Tentative de calcul de la racine carrée d'un nombre négatif : " + num);
        }
        // Code to calculate square root
        return 0.0;  // Placeholder
    }
}

class UserValidator {
    public void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException("Âge invalide : " + age + ". L'utilisateur doit être âgé de 18 ans ou plus.");
        }
    }
}

class UserAgeException extends Exception {
    public UserAgeException(String message) {
        super(message);
    }
}

public class AdvancedExceptionHandlingExercise {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        MathOperations mathOperations = new MathOperations();
        UserValidator userValidator = new UserValidator();

        try {
            fileManager.readFile("invalid/file/path.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            mathOperations.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            mathOperations.calculateSquareRoot(-10);
        } catch (ArithmeticException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            userValidator.validateAge(16);
        } catch (UserAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
```


## Exception Handiling in Java

In Java, exceptions are objects that represent exceptional conditions or errors that occur during the execution of a program. Java has three categories of exceptions: Checked exceptions, Unchecked exceptions, and Errors. Custom exceptions are user-defined exceptions that extend the base `Exception` class or one of its subclasses.

### Checked Exceptions

Checked exceptions are exceptions that are checked at compile-time. This means that the compiler checks to ensure that these exceptions are either caught by a `catch` block or declared in the method using the `throws` keyword.

Examples of checked exceptions include:
- `IOException`
- `SQLException`
- `ClassNotFoundException`

**Example:**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

In this example, the `IOException` is a checked exception that must be handled with a `catch` block or declared in the method using `throws`.

### Unchecked Exceptions

Unchecked exceptions are exceptions that are not checked at compile-time. They occur at runtime and are subclasses of `RuntimeException` or `Error`. These exceptions do not need to be caught or declared.

Examples of unchecked exceptions include:
- `ArithmeticException`
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`

**Example:**

```java
public class DivisionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b;  // This will throw an ArithmeticException at runtime
        System.out.println(result);
    }
}
```

In this example, the `ArithmeticException` is an unchecked exception that occurs at runtime.

### Custom Exceptions

Custom exceptions are user-defined exceptions that extend the base `Exception` class or one of its subclasses. They are useful when standard Java exceptions do not accurately represent the exceptional conditions specific to your application.

**Example:**

```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        try {
            validator.validateAge(200);  // This will throw a custom InvalidAgeException
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
```

In this example, `InvalidAgeException` is a custom exception that extends the base `Exception` class. The `validateAge` method throws this custom exception when an invalid age is detected.

To summarize:
- **Checked exceptions**: Must be handled with a `catch` block or declared using `throws`.
- **Unchecked exceptions**: Occur at runtime and do not need to be caught or declared.
- **Custom exceptions**: User-defined exceptions that extend the base `Exception` class or one of its subclasses.

A custom exception in Java can be either checked or unchecked, depending on its hierarchy. If the custom exception extends the `Exception` class or any of its subclasses other than `RuntimeException`, it is considered a checked exception. On the other hand, if the custom exception extends `RuntimeException` or any of its subclasses, it is considered an unchecked exception.

In the provided example:

```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

The `InvalidAgeException` extends the base `Exception` class, making it a checked exception. Therefore, any method that throws this custom exception must either handle it using a `catch` block or declare it using the `throws` keyword.