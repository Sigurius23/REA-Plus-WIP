package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes7.dex */
public interface BaseHeartRateTimestamp {
    @JsonProperty("heart_rate")
    double getHeartRate();

    long getTime();
}
