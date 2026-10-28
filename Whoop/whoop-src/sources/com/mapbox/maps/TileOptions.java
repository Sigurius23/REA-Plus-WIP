package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class TileOptions implements Serializable {
    private final short buffer;
    private final boolean clip;
    private final short tileSize;
    private final double tolerance;
    private final boolean wrap;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private double tolerance = 0.375d;
        private short tileSize = 512;
        private short buffer = 128;
        private boolean clip = false;
        private boolean wrap = false;

        public Builder buffer(short s13) {
            this.buffer = s13;
            return this;
        }

        public TileOptions build() {
            return new TileOptions(this.tolerance, this.tileSize, this.buffer, this.clip, this.wrap);
        }

        public Builder clip(boolean z4) {
            this.clip = z4;
            return this;
        }

        public Builder tileSize(short s13) {
            this.tileSize = s13;
            return this;
        }

        public Builder tolerance(double d3) {
            this.tolerance = d3;
            return this;
        }

        public Builder wrap(boolean z4) {
            this.wrap = z4;
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
        if (obj == null || TileOptions.class != obj.getClass()) {
            return false;
        }
        TileOptions tileOptions = (TileOptions) obj;
        return PartialEq.compare(this.tolerance, tileOptions.tolerance) && this.tileSize == tileOptions.tileSize && this.buffer == tileOptions.buffer && this.clip == tileOptions.clip && this.wrap == tileOptions.wrap;
    }

    public short getBuffer() {
        return this.buffer;
    }

    public boolean getClip() {
        return this.clip;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    public double getTolerance() {
        return this.tolerance;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.tolerance), Short.valueOf(this.tileSize), Short.valueOf(this.buffer), Boolean.valueOf(this.clip), Boolean.valueOf(this.wrap));
    }

    public Builder toBuilder() {
        return new Builder().tolerance(this.tolerance).tileSize(this.tileSize).buffer(this.buffer).clip(this.clip).wrap(this.wrap);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[tolerance: ");
        AbstractC3855a.m11835s(this.tolerance, ", tileSize: ", sb4);
        sb4.append(RecordUtils.fieldToString(Short.valueOf(this.tileSize)));
        sb4.append(", buffer: ");
        sb4.append(RecordUtils.fieldToString(Short.valueOf(this.buffer)));
        sb4.append(", clip: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.clip)));
        sb4.append(", wrap: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.wrap)));
        sb4.append("]");
        return sb4.toString();
    }

    private TileOptions(double d3, short s13, short s14, boolean z4, boolean z13) {
        this.tolerance = d3;
        this.tileSize = s13;
        this.buffer = s14;
        this.clip = z4;
        this.wrap = z13;
    }

    private TileOptions() {
        this.tolerance = 0.375d;
        this.tileSize = (short) 512;
        this.buffer = (short) 128;
        this.clip = false;
        this.wrap = false;
    }
}
