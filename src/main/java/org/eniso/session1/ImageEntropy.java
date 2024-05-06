/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session1;

import java.util.Arrays;

/**
 *
 * @author bobmarley
 */
public class ImageEntropy {

    public static double[] calculateProbability(int[][] image) {
        int totalPixels = image.length * image[0].length;
        double[] probabilities = new double[256];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                probabilities[image[i][j]]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            probabilities[i] /= totalPixels;
        }

        return probabilities;
    }

    public static double calculateEntropy(int[][] image) {
        double[] probabilities = calculateProbability(image);
        double entropy = 0;

        for (int i = 0; i < 256; i++) {
            if (probabilities[i] > 0) {
                entropy += probabilities[i] * Math.log(probabilities[i]) / Math.log(2);
            }
        }

        return -entropy;
    }

    public static void main(String[] args) {
        int[][] sampleImage = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };

        double[] probabilities = calculateProbability(sampleImage);
        double entropy = calculateEntropy(sampleImage);

        System.out.println("Probabilities: " + Arrays.toString(probabilities));
        System.out.println("Entropy: " + entropy);
    }
}
