package org.eniso.session5.exercice2;

class MathOperations {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nombre négatif passé : " + n);
        }
        return 0;
    }

    public double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Tentative de calcul de la racine carrée d'un nombre négatif : " + num);
        }
        return 0.0;
    }
}
