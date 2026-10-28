package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MapPlayerOptions implements Serializable {
    private final boolean avoidPlaybackPauses;
    private final int playbackCount;
    private final double playbackSpeedMultiplier;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private int playbackCount = 1;
        private double playbackSpeedMultiplier = 1.0d;
        private boolean avoidPlaybackPauses = false;

        public Builder avoidPlaybackPauses(boolean z4) {
            this.avoidPlaybackPauses = z4;
            return this;
        }

        public MapPlayerOptions build() {
            return new MapPlayerOptions(this.playbackCount, this.playbackSpeedMultiplier, this.avoidPlaybackPauses);
        }

        public Builder playbackCount(int i13) {
            this.playbackCount = i13;
            return this;
        }

        public Builder playbackSpeedMultiplier(double d3) {
            this.playbackSpeedMultiplier = d3;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapPlayerOptions.class != obj.getClass()) {
            return false;
        }
        MapPlayerOptions mapPlayerOptions = (MapPlayerOptions) obj;
        return this.playbackCount == mapPlayerOptions.playbackCount && PartialEq.compare(this.playbackSpeedMultiplier, mapPlayerOptions.playbackSpeedMultiplier) && this.avoidPlaybackPauses == mapPlayerOptions.avoidPlaybackPauses;
    }

    public boolean getAvoidPlaybackPauses() {
        return this.avoidPlaybackPauses;
    }

    public int getPlaybackCount() {
        return this.playbackCount;
    }

    public double getPlaybackSpeedMultiplier() {
        return this.playbackSpeedMultiplier;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.playbackCount), Double.valueOf(this.playbackSpeedMultiplier), Boolean.valueOf(this.avoidPlaybackPauses));
    }

    public Builder toBuilder() {
        return new Builder().playbackCount(this.playbackCount).playbackSpeedMultiplier(this.playbackSpeedMultiplier).avoidPlaybackPauses(this.avoidPlaybackPauses);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[playbackCount: ");
        sb4.append(RecordUtils.fieldToString(Integer.valueOf(this.playbackCount)));
        sb4.append(", playbackSpeedMultiplier: ");
        AbstractC3855a.m11835s(this.playbackSpeedMultiplier, ", avoidPlaybackPauses: ", sb4);
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.avoidPlaybackPauses)));
        sb4.append("]");
        return sb4.toString();
    }

    private MapPlayerOptions(int i13, double d3, boolean z4) {
        this.playbackCount = i13;
        this.playbackSpeedMultiplier = d3;
        this.avoidPlaybackPauses = z4;
    }

    private MapPlayerOptions() {
        this.playbackCount = 1;
        this.playbackSpeedMultiplier = 1.0d;
        this.avoidPlaybackPauses = false;
    }
}
