package com.whoop.analytics.strain.model;

import com.hubspot.immutables.style.HubSpotStyle;
import java.util.List;
import org.immutables.value.Value;

/* JADX INFO: loaded from: classes7.dex */
@HubSpotStyle
@Value.Immutable
public interface SmoothingResultIF {
    int getLastUsedIndex();

    long getLastUsedTime();

    List<HeartRateTimestamp> getSmoothedHrs();
}
