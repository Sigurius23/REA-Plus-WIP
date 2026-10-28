package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class GroupPerformanceStatistics implements Serializable {
    private final double durationMillis;
    private final String name;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public GroupPerformanceStatistics(double d3, String str) {
        this.durationMillis = d3;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GroupPerformanceStatistics.class != obj.getClass()) {
            return false;
        }
        GroupPerformanceStatistics groupPerformanceStatistics = (GroupPerformanceStatistics) obj;
        return PartialEq.compare(this.durationMillis, groupPerformanceStatistics.durationMillis) && Objects.equals(this.name, groupPerformanceStatistics.name);
    }

    public double getDurationMillis() {
        return this.durationMillis;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.durationMillis), this.name);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[durationMillis: ");
        AbstractC3855a.m11835s(this.durationMillis, ", name: ", sb4);
        return AbstractC3855a.m11826j(this.name, "]", sb4);
    }
}
