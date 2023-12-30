package org.example;

import org.example.training.Box;
import org.example.training.Crossfit;
import org.example.training.Run;
import org.example.training.Training;
public class Main {
    public static void main(String[] args) {

        Training[] weeklyTrainings = new Training[4];

        weeklyTrainings[0] = new Run(60, 50, 80, 40);
        weeklyTrainings[1] = new Run(80, 60, 90, 10);
        weeklyTrainings[2] = new Crossfit(70, 100, 80, 70);
        weeklyTrainings[3] = new Box(80, 60, 90);


        for (Training training : weeklyTrainings) {
            training.trainingInfo();
        }

    }
}