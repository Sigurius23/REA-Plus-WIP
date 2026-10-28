package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OfflineRegionGeometryDefinition implements Serializable {
    private final Geometry geometry;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private Geometry geometry;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public OfflineRegionGeometryDefinition build() {
            if (this.styleURL == null) {
                throw new NullPointerException("styleURL shouldn't be null");
            }
            if (this.geometry == null) {
                throw new NullPointerException("geometry shouldn't be null");
            }
            if (this.glyphsRasterizationMode != null) {
                return new OfflineRegionGeometryDefinition(this.styleURL, this.geometry, this.minZoom, this.maxZoom, this.pixelRatio, this.glyphsRasterizationMode);
            }
            throw new NullPointerException("glyphsRasterizationMode shouldn't be null");
        }

        public Builder geometry(Geometry geometry) {
            this.geometry = geometry;
            return this;
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
        if (obj == null || OfflineRegionGeometryDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionGeometryDefinition offlineRegionGeometryDefinition = (OfflineRegionGeometryDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionGeometryDefinition.styleURL) && Objects.equals(this.geometry, offlineRegionGeometryDefinition.geometry) && PartialEq.compare(this.minZoom, offlineRegionGeometryDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionGeometryDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionGeometryDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionGeometryDefinition.glyphsRasterizationMode);
    }

    public Geometry getGeometry() {
        return this.geometry;
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
        return Objects.hash(this.styleURL, this.geometry, Double.valueOf(this.minZoom), Double.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).geometry(this.geometry).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[styleURL: ");
        AbstractC3855a.m11838v(this.styleURL, ", geometry: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.geometry));
        sb4.append(", minZoom: ");
        AbstractC3855a.m11835s(this.minZoom, ", maxZoom: ", sb4);
        AbstractC3855a.m11835s(this.maxZoom, ", pixelRatio: ", sb4);
        sb4.append(RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)));
        sb4.append(", glyphsRasterizationMode: ");
        sb4.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb4.append("]");
        return sb4.toString();
    }

    private OfflineRegionGeometryDefinition(String str, Geometry geometry, double d3, double d14, float f13, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.geometry = geometry;
        this.minZoom = d3;
        this.maxZoom = d14;
        this.pixelRatio = f13;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }
}
