package com.whoop.analytics.strain.model;

/* JADX INFO: loaded from: classes7.dex */
public class WorkoutBurnRate {
    private double intercept;
    private double slope;

    public WorkoutBurnRate(double d3, double d14) {
        this.slope = d3;
        this.intercept = d14;
    }

    public double getIntercept() {
        return this.intercept;
    }

    public double getSlope() {
        return this.slope;
    }
}
