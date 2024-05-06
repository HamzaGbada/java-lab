package org.eniso.session5.exercice2;

class UserValidator {
    public void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException("Âge invalide : " + age + ". L'utilisateur doit être âgé de 18 ans ou plus.");
        }
    }
}