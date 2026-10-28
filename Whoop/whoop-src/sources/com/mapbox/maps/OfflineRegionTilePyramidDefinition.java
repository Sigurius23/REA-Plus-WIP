package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OfflineRegionTilePyramidDefinition implements Serializable {
    private final CoordinateBounds bounds;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private CoordinateBounds bounds;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public Builder bounds(CoordinateBounds coordinateBounds) {
            this.bounds = coordinateBounds;
            return this;
        }

        public OfflineRegionTilePyramidDefinition build() {
            if (this.styleURL == null) {
                throw new NullPointerException("styleURL shouldn't be null");
            }
            if (this.bounds == null) {
                throw new NullPointerException("bounds shouldn't be null");
            }
            if (this.glyphsRasterizationMode != null) {
                return new OfflineRegionTilePyramidDefinition(this.styleURL, this.bounds, this.minZoom, this.maxZoom, this.pixelRatio, this.glyphsRasterizationMode);
            }
            throw new NullPointerException("glyphsRasterizationMode shouldn't be null");
        }

        public Builder glyphsRasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.glyphsRasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public Builder maxZoom(double d3) {
            this.maxZoom = d3;
            return this;
        }

        public Builder minZoom(double d3) {
            this.minZoom = d3;
            return this;
        }

        public Builder pixelRatio(float f13) {
            this.pixelRatio = f13;
            return this;
        }

        public Builder styleURL(String str) {
            this.styleURL = str;
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
        if (obj == null || OfflineRegionTilePyramidDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition = (OfflineRegionTilePyramidDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionTilePyramidDefinition.styleURL) && Objects.equals(this.bounds, offlineRegionTilePyramidDefinition.bounds) && PartialEq.compare(this.minZoom, offlineRegionTilePyramidDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionTilePyramidDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionTilePyramidDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionTilePyramidDefinition.glyphsRasterizationMode);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    public int hashCode() {
        return Objects.hash(this.styleURL, this.bounds, Double.valueOf(this.minZoom), Double.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).bounds(this.bounds).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[styleURL: ");
        AbstractC3855a.m11838v(this.styleURL, ", bounds: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.bounds));
        sb4.append(", minZoom: ");
        AbstractC3855a.m11835s(this.minZoom, ", maxZoom: ", sb4);
        AbstractC3855a.m11835s(this.maxZoom, ", pixelRatio: ", sb4);
        sb4.append(RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)));
        sb4.append(", glyphsRasterizationMode: ");
        sb4.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb4.append("]");
        return sb4.toString();
    }

    private OfflineRegionTilePyramidDefinition(String str, CoordinateBounds coordinateBounds, double d3, double d14, float f13, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.bounds = coordinateBounds;
        this.minZoom = d3;
        this.maxZoom = d14;
        this.pixelRatio = f13;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }
}
