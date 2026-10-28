package com.whoop.analytics.strain.model;

/* JADX INFO: loaded from: classes7.dex */
public enum FitnessLevel {
    collegiate(0.0d),
    serious_enthusiast(-0.6984338232663312d),
    tactical(-2.9930650327571664d),
    professional(-2.9930650327571664d),
    recreational_enthusiast(-3.295121377950899d),
    inactive(-3.6688917003869923d);

    private final double value;

    FitnessLevel(double d3) {
        this.value = d3;
    }

    public double getWeightForHeartRate() {
        return this.value;
    }
}
