package com.whoop.domain.model;

import java.util.HashMap;
import java.util.Map;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes4.dex */
public enum UnitSystem {
    METRIC("metric"),
    IMPERIAL("imperial");

    private static Map<String, UnitSystem> map = new HashMap();
    private final String name;

    static {
        for (UnitSystem unitSystem : values()) {
            map.put(unitSystem.name, unitSystem);
        }
    }

    UnitSystem(String str) {
        this.name = str;
    }

    public static UnitSystem fromName(String str) throws IllegalArgumentException {
        UnitSystem unitSystem = map.get(str);
        if (unitSystem != null) {
            return unitSystem;
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("value ", str, " is not a valid UnitSystem value"));
    }

    public String toName() {
        return this.name;
    }
}
