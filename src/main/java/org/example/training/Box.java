package org.example.training;

public class Box extends Training{
    public Box(int averageHeartRate, int trainingDuration, int sportsmanWeight) {
        super(averageHeartRate, trainingDuration, sportsmanWeight);
    }

    @Override
    public void trainingInfo() {
        System.out.println("Тренування по боксу! Час тренування: " + getTrainingDuration() + " хвилин."
                            + "Кілокалорій: " + calculateCaloriesBurned());
    }
}
