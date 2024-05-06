package org.eniso.session5.exercice1;

public class ClassificationDataset extends Dataset {
    protected String[] labels;
    protected int numClasses;

    public ClassificationDataset(String path, boolean isTrain) {
        this.path = path;
        this.isTrain = isTrain;
    }

    @Override
    public void loadData() {
        System.out.println("Loading classification data from file: " + path);
    }

    @Override
    public void preprocessData() {
        System.out.println("Preprocessing classification data...");
    }
}
