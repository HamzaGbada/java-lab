package org.eniso.session5.exercice1;

public abstract class Dataset {
    protected boolean isTrain;
    protected String path;

    public abstract void loadData();  // Loads data from the dataset file.
    public abstract void preprocessData();  // Preprocesses the loaded data.
}
