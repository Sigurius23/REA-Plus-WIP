package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.style.HubSpotStyle;
import java.util.Optional;
import org.immutables.value.Value;

/* JADX INFO: loaded from: classes7.dex */
@HubSpotStyle
@Value.Immutable
public interface StrainScoreIF {
    @JsonProperty("avgHr")
    Optional<Double> getAvgHr();

    @JsonProperty("kilojoules")
    Optional<Double> getKilojoules();

    @JsonProperty("maxHr")
    Optional<Double> getMaxHr();

    @JsonProperty("projectedStrainScore")
    Optional<Double> getProjectedStrainScore();

    @JsonProperty("scaledScore")
    Optional<Double> getScaledScore();

    Optional<AnalyticsState> getState();

    @JsonProperty("strainScore")
    Optional<Double> getStrainScore();
}
