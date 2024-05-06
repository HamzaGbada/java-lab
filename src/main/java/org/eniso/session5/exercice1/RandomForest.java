package org.eniso.session5.exercice1;

public class RandomForest extends BaseModel {
    private int numTrees;
    private int maxDepth;

    public RandomForest(String name, int version, int maxDepth) {
        super(name, version, "Random Forest Model");
        this.numTrees = 100;
        this.maxDepth = maxDepth;
    }

    @Override
    public void train(Dataset dataset) {
        System.out.println("Training Random Forest model...");
    }

    @Override
    public double predict(Dataset dataset) {
        System.out.println("Predicting with Random Forest model...");
        return 0.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Model Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Description: " + description);
        System.out.println("Device: " + device);
        System.out.println("Number of Trees: " + numTrees);
        System.out.println("Max Depth: " + maxDepth);
    }
}
