package com.whoop.domain.model;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p088dc.AbstractC11895b;
import uv0.AbstractC35283c;

/* JADX INFO: loaded from: classes4.dex */
public enum FitnessLevel {
    INACTIVE("inactive", AbstractC35283c.f150208y),
    RECREATIONAL("recreational_enthusiast", AbstractC35283c.f150163A),
    COLLEGIATE("collegiate", AbstractC35283c.f150207x),
    SERIOUS("serious_enthusiast", AbstractC35283c.f150164B),
    PROFESSIONAL("professional", AbstractC35283c.f150209z),
    TACTICAL("tactical", AbstractC35283c.f150165C);

    private static Map<String, FitnessLevel> map = new HashMap();
    private final int displayNameResId;
    private final String value;

    static {
        for (FitnessLevel fitnessLevel : values()) {
            map.put(fitnessLevel.value, fitnessLevel);
        }
    }

    FitnessLevel(String str, int i13) {
        this.value = str;
        this.displayNameResId = i13;
    }

    public static FitnessLevel fromNameKey(String str) throws IllegalArgumentException {
        FitnessLevel fitnessLevel = map.get(str);
        if (fitnessLevel != null) {
            return fitnessLevel;
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("value ", str, " is not a valid FitnessLevel value"));
    }

    public String getUserShortDisplayName(Context context) {
        return context.getString(this.displayNameResId);
    }

    public String toNameKey() {
        return this.value;
    }
}
