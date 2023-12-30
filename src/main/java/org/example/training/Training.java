package org.example.training;
public class Training{
    private final int averageHeartRate;
    private final int trainingDuration;
    private final int sportsmanWeight;

    public Training(int averageHeartRate, int trainingDuration, int sportsmanWeight) {
        this.averageHeartRate = averageHeartRate;
        this.trainingDuration = trainingDuration;
        this.sportsmanWeight = sportsmanWeight;
    }

    public double calculateCaloriesBurned() {
        return 0.014 * sportsmanWeight * trainingDuration * (0.12 * averageHeartRate - 7);
    }

    public void trainingInfo() {
        System.out.println("Результат тренування! Час тренування: " + trainingDuration + " хвилин."
                + "Кілокалорій: " + calculateCaloriesBurned());
    }

    public int getTrainingDuration() {
        return trainingDuration;
    }
}
