package org.eniso.session5.exercice1;

public interface MachineLearningModel {
    void train(Dataset dataset);  // Trains the model using the provided dataset.
    double predict(Dataset dataset);  // Predicts an outcome based on a given instance.
}
