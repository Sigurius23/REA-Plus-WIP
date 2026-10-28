package com.whoop.analytics.strain.model;

/* JADX INFO: loaded from: classes7.dex */
public enum BiologicalSex {
    male(-2.0229800401446663d, 6.2d, 12.0d, 6.8d, 60.0d, 0.6d, 0.19d, 0.2d, -50.0d),
    female(0.0d, 4.3d, 4.0d, 4.7d, 650.0d, 0.4d, -0.13d, 0.07d, -15.0d),
    nonBinary(-1.0114900200723d, 5.25d, 8.0d, 5.75d, 355.0d, 0.5d, 0.03d, 0.135d, -32.5d),
    maleNew(-2.0229800401446663d, 13.397d, 479.9d, 5.677d, 88.362d, 0.6309d, 0.1988d, 0.2017d, -55.0969d),
    femaleNew(0.0d, 9.247d, 309.8d, 4.33d, 447.593d, 0.4472d, -0.1263d, 0.074d, -20.4022d),
    nonBinaryNew(-1.0114900200723d, 11.322d, 394.85d, 5.0035d, 267.9775d, 0.53905d, 0.03625d, 0.13785d, -37.74955d);

    private final double calorieRestingAgeValue;
    private final double calorieRestingAlphaValue;
    private final double calorieRestingHeightValue;
    private final double calorieRestingWeightValue;
    private final double calorieWorkoutAgeValue;
    private final double calorieWorkoutAlphaValue;
    private final double calorieWorkoutHeartRateValue;
    private final double calorieWorkoutWeightValue;
    private final double heartRateWeightValue;

    BiologicalSex(double d3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25) {
        this.heartRateWeightValue = d3;
        this.calorieRestingWeightValue = d14;
        this.calorieRestingHeightValue = d15;
        this.calorieRestingAgeValue = d16;
        this.calorieRestingAlphaValue = d17;
        this.calorieWorkoutWeightValue = d19;
        this.calorieWorkoutHeartRateValue = d18;
        this.calorieWorkoutAgeValue = d24;
        this.calorieWorkoutAlphaValue = d25;
    }

    public double getCalorieRestingAgeValue() {
        return this.calorieRestingAgeValue;
    }

    public double getCalorieRestingAlphaValue() {
        return this.calorieRestingAlphaValue;
    }

    public double getCalorieRestingHeightValue() {
        return this.calorieRestingHeightValue;
    }

    public double getCalorieRestingWeightValue() {
        return this.calorieRestingWeightValue;
    }

    public double getCalorieWorkoutAgeValue() {
        return this.calorieWorkoutAgeValue;
    }

    public double getCalorieWorkoutAlphaValue() {
        return this.calorieWorkoutAlphaValue;
    }

    public double getCalorieWorkoutHeartRateValue() {
        return this.calorieWorkoutHeartRateValue;
    }

    public double getCalorieWorkoutWeightValue() {
        return this.calorieWorkoutWeightValue;
    }

    public double getHeartRateWeightValue() {
        return this.heartRateWeightValue;
    }
}
