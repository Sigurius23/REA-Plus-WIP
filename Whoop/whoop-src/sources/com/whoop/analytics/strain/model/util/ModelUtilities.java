package com.whoop.analytics.strain.model.util;

import com.whoop.analytics.strain.model.AnalyticsState;
import com.whoop.analytics.strain.model.BiologicalSex;
import com.whoop.analytics.strain.model.FitnessLevel;
import com.whoop.analytics.strain.model.State;
import com.whoop.analytics.strain.model.StrainScore;
import com.whoop.analytics.strain.model.UserProfile;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ModelUtilities {
    public static final AnalyticsState DefaultAnalyticsState;
    public static final State DefaultState;
    public static final StrainScore DefaultStrainScore;
    public static final UserProfile DefaultUserProfile;

    static {
        AnalyticsState analyticsStateBuild = AnalyticsState.builder().setLastUsed((Long) 0L).setLeftOvers(new ArrayList()).setLeftOverAccelX(new ArrayList()).setLeftOverHrc(new ArrayList()).build();
        DefaultAnalyticsState = analyticsStateBuild;
        StrainScore.Builder builder = StrainScore.builder();
        Double dValueOf = Double.valueOf(0.0d);
        DefaultStrainScore = builder.setAvgHr(dValueOf).setKilojoules(dValueOf).setStrainScore(dValueOf).setProjectedStrainScore(dValueOf).setMaxHr(dValueOf).setState(analyticsStateBuild).build();
        DefaultState = State.builder().setAnaState(analyticsStateBuild).setPrevMaxTime(0L).setUserId((Integer) 0).build();
        DefaultUserProfile = UserProfile.builder().setBiologicalSex(BiologicalSex.female).setBirthday(0L).setFitnessLevel(FitnessLevel.inactive).setMaxHeartRate(200.0d).setRestingHeartRate(50.0d).setHeight(1.6d).setWeight(1.3d).setId(-1).build();
    }
}
