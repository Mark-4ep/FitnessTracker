package org.example.training;

public class Crossfit extends Training{
    int averageEquipmentWeight;
    public Crossfit(int averageHeartRate, int trainingDuration, int sportsmanWeight, int averageEquipmentWeight) {
        super(averageHeartRate, trainingDuration, sportsmanWeight);
        this.averageEquipmentWeight = averageEquipmentWeight;
    }
    @Override
    public void trainingInfo() {
        System.out.println("Кроссфіт тренування! Час тренування: " + getTrainingDuration() + " хвилин. "
                            + "Середня вага штанги: " + averageEquipmentWeight + "кг. "
                            + "Кілокалорій: " + calculateCaloriesBurned());
    }
}
