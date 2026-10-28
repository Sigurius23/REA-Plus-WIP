package com.whoop.analytics.strain.model;

import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

/* JADX INFO: loaded from: classes7.dex */
@HubSpotStyle
@Value.Immutable
public interface UserProfileIF {
    BiologicalSex getBiologicalSex();

    long getBirthday();

    FitnessLevel getFitnessLevel();

    double getHeight();

    int getId();

    double getMaxHeartRate();

    double getRestingHeartRate();

    double getWeight();
}
