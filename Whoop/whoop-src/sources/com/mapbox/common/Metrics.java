package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Metrics implements Serializable {
    private final String name;
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Metrics(String str, Value value) {
        this.name = str;
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metrics.class != obj.getClass()) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        return Objects.equals(this.name, metrics.name) && Objects.equals(this.value, metrics.value);
    }

    public String getName() {
        return this.name;
    }

    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[name: ");
        AbstractC3855a.m11838v(this.name, ", value: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.value));
        sb4.append("]");
        return sb4.toString();
    }
}
