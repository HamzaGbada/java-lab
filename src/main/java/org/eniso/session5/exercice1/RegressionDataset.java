package org.eniso.session5.exercice1;




public class RegressionDataset extends Dataset {
    protected int numFeatures;
    protected double[] targets;

    public RegressionDataset(String path, boolean isTrain) {
        this.path = path;
        this.isTrain = isTrain;
    }

    @Override
    public void loadData() {
        System.out.println("Loading regression data from file: " + path);
    }

    @Override
    public void preprocessData() {
        System.out.println("Preprocessing regression data...");
    }
}
