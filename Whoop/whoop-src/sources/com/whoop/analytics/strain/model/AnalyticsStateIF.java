package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.style.HubSpotStyle;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

/* JADX INFO: loaded from: classes7.dex */
@HubSpotStyle
@Value.Immutable
public interface AnalyticsStateIF {
    @JsonProperty("lastUsed")
    Optional<Long> getLastUsed();

    @JsonProperty("leftOverAccelX")
    Optional<List<Float>> getLeftOverAccelX();

    @JsonProperty("leftOverHrc")
    Optional<List<Integer>> getLeftOverHrc();

    @JsonProperty("leftOvers")
    List<List<Long>> getLeftOvers();

    @JsonProperty("modHrs")
    List<List<Long>> getModHrs();
}
