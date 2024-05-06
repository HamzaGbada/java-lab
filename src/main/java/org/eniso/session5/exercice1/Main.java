package org.eniso.session5.exercice1;

public class Main {
    public static void main(String[] args) {

        ClassificationDataset classificationData = new ClassificationDataset("path/to/classification_data.csv", true);
        RegressionDataset regressionData = new RegressionDataset("path/to/regression_data.csv", false);

        SupportVectorMachine svm = new SupportVectorMachine("SVM", 1, 0.01);
        svm.train(classificationData);
        svm.displayDetails();

        RandomForest rf = new RandomForest("RandomForest", 1, 10);
        rf.train(regressionData);
        rf.displayDetails();

        NeuralNetwork nn = new NeuralNetwork("NeuralNetwork", 1, new int[]{10, 5, 1}, "sigmoid");
        nn.train(classificationData);
        nn.displayDetails();

        // Make predictions
        System.out.println("SVM Prediction: " + svm.predict(classificationData));
        System.out.println("RandomForest Prediction: " + rf.predict(regressionData));
        System.out.println("NeuralNetwork Prediction: " + nn.predict(classificationData));
    }
}