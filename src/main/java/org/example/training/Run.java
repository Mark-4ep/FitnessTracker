package org.example.training;

public class Run extends Training{
    int distance;
    public Run(int averageHeartRate, int trainingDuration, int sportsmanWeight, int distance) {
        super(averageHeartRate, trainingDuration, sportsmanWeight);
        this.distance = distance;
    }


    public void trainingInfo() {
        System.out.println("Бігове тренування! Час тренування: " + getTrainingDuration() + " хвилин."
                            + " Дистанція: " + distance + " км. "
                            + "Кілокалорій: " + calculateCaloriesBurned());
    }
}
