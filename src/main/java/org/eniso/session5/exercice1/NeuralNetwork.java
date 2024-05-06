package org.eniso.session5.exercice1;

import java.util.Arrays;

public class NeuralNetwork extends BaseModel {
    private int[] layers;
    private String activationFunction;

    public NeuralNetwork(String name, int version, int[] layers, String activationFunction) {
        super(name, version, "Neural Network Model");
        this.layers = layers;
        this.activationFunction = activationFunction;
    }

    @Override
    public void train(Dataset dataset) {
        System.out.println("Training Neural Network model...");
    }

    @Override
    public double predict(Dataset dataset) {
        System.out.println("Predicting with Neural Network model...");
        return 0.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Model Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Description: " + description);
        System.out.println("Device: " + device);
        System.out.println("Layers: " + Arrays.toString(layers));
        System.out.println("Activation Function: " + activationFunction);
    }
}
