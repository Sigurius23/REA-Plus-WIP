package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MapRecorderOptions implements Serializable {
    private final boolean compressed;
    private final boolean loggingEnabled;
    private final Long timeWindow;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private Long timeWindow;
        private boolean loggingEnabled = false;
        private boolean compressed = true;

        public MapRecorderOptions build() {
            return new MapRecorderOptions(this.timeWindow, this.loggingEnabled, this.compressed);
        }

        public Builder compressed(boolean z4) {
            this.compressed = z4;
            return this;
        }

        public Builder loggingEnabled(boolean z4) {
            this.loggingEnabled = z4;
            return this;
        }

        public Builder timeWindow(Long l7) {
            this.timeWindow = l7;
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
        if (obj == null || MapRecorderOptions.class != obj.getClass()) {
            return false;
        }
        MapRecorderOptions mapRecorderOptions = (MapRecorderOptions) obj;
        return Objects.equals(this.timeWindow, mapRecorderOptions.timeWindow) && this.loggingEnabled == mapRecorderOptions.loggingEnabled && this.compressed == mapRecorderOptions.compressed;
    }

    public boolean getCompressed() {
        return this.compressed;
    }

    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public int hashCode() {
        return Objects.hash(this.timeWindow, Boolean.valueOf(this.loggingEnabled), Boolean.valueOf(this.compressed));
    }

    public Builder toBuilder() {
        return new Builder().timeWindow(this.timeWindow).loggingEnabled(this.loggingEnabled).compressed(this.compressed);
    }

    public String toString() {
        return "[timeWindow: " + RecordUtils.fieldToString(this.timeWindow) + ", loggingEnabled: " + RecordUtils.fieldToString(Boolean.valueOf(this.loggingEnabled)) + ", compressed: " + RecordUtils.fieldToString(Boolean.valueOf(this.compressed)) + "]";
    }

    private MapRecorderOptions(Long l7, boolean z4, boolean z13) {
        this.timeWindow = l7;
        this.loggingEnabled = z4;
        this.compressed = z13;
    }

    private MapRecorderOptions(Long l7) {
        this.timeWindow = l7;
        this.loggingEnabled = false;
        this.compressed = true;
    }
}
