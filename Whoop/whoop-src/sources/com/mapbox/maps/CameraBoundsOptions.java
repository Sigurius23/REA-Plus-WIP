package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CameraBoundsOptions implements Serializable {
    private final CoordinateBounds bounds;
    private final Double maxPitch;
    private final Double maxZoom;
    private final Double minPitch;
    private final Double minZoom;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private CoordinateBounds bounds;
        private Double maxPitch;
        private Double maxZoom;
        private Double minPitch;
        private Double minZoom;

        public Builder bounds(CoordinateBounds coordinateBounds) {
            this.bounds = coordinateBounds;
            return this;
        }

        public CameraBoundsOptions build() {
            return new CameraBoundsOptions(this.bounds, this.maxZoom, this.minZoom, this.maxPitch, this.minPitch);
        }

        public Builder maxPitch(Double d3) {
            this.maxPitch = d3;
            return this;
        }

        public Builder maxZoom(Double d3) {
            this.maxZoom = d3;
            return this;
        }

        public Builder minPitch(Double d3) {
            this.minPitch = d3;
            return this;
        }

        public Builder minZoom(Double d3) {
            this.minZoom = d3;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraBoundsOptions cameraBoundsOptions = (CameraBoundsOptions) obj;
        return Objects.equals(this.bounds, cameraBoundsOptions.bounds) && Objects.equals(this.maxZoom, cameraBoundsOptions.maxZoom) && Objects.equals(this.minZoom, cameraBoundsOptions.minZoom) && Objects.equals(this.maxPitch, cameraBoundsOptions.maxPitch) && Objects.equals(this.minPitch, cameraBoundsOptions.minPitch);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public Double getMaxPitch() {
        return this.maxPitch;
    }

    public Double getMaxZoom() {
        return this.maxZoom;
    }

    public Double getMinPitch() {
        return this.minPitch;
    }

    public Double getMinZoom() {
        return this.minZoom;
    }

    public int hashCode() {
        return Objects.hash(this.bounds, this.maxZoom, this.minZoom, this.maxPitch, this.minPitch);
    }

    public Builder toBuilder() {
        return new Builder().bounds(this.bounds).maxZoom(this.maxZoom).minZoom(this.minZoom).maxPitch(this.maxPitch).minPitch(this.minPitch);
    }

    public String toString() {
        return "[bounds: " + RecordUtils.fieldToString(this.bounds) + ", maxZoom: " + RecordUtils.fieldToString(this.maxZoom) + ", minZoom: " + RecordUtils.fieldToString(this.minZoom) + ", maxPitch: " + RecordUtils.fieldToString(this.maxPitch) + ", minPitch: " + RecordUtils.fieldToString(this.minPitch) + "]";
    }

    private CameraBoundsOptions(CoordinateBounds coordinateBounds, Double d3, Double d14, Double d15, Double d16) {
        this.bounds = coordinateBounds;
        this.maxZoom = d3;
        this.minZoom = d14;
        this.maxPitch = d15;
        this.minPitch = d16;
    }
}
