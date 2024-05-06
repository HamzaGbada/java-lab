package org.eniso.session5.exercice2;

import java.io.FileNotFoundException;

class FileManager {
    public void readFile(String filePath) throws FileNotFoundException {
        throw new FileNotFoundException("Fichier non trouvé : " + filePath);
    }
}