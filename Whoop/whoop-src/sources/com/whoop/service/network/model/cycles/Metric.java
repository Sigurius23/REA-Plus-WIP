package com.whoop.service.network.model.cycles;

/* JADX INFO: loaded from: classes10.dex */
public enum Metric {
    HEART_RATE("heart_rate"),
    GPS("gps"),
    TEMPERATURE("temperature"),
    GSR("gsr"),
    ACCELEROMETER_MAGNITUDE("accelerometer_magnitude"),
    RR_INTERVALS("rr_intervals");

    private String apiKey;

    Metric(String str) {
        this.apiKey = str;
    }

    public String getApiKey() {
        return this.apiKey;
    }
}
