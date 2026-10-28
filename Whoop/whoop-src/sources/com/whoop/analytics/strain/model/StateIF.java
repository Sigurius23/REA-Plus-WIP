package com.whoop.analytics.strain.model;

import com.hubspot.immutables.style.HubSpotStyle;
import java.util.Optional;
import org.immutables.value.Value;

/* JADX INFO: loaded from: classes7.dex */
@HubSpotStyle
@Value.Immutable
public interface StateIF {
    Optional<AnalyticsState> getAnaState();

    long getPrevMaxTime();

    Optional<Integer> getUserId();
}
