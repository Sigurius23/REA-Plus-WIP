package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ViewAnnotationAnchorConfig implements Serializable {
    private final ViewAnnotationAnchor anchor;
    private final double offsetX;
    private final double offsetY;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private ViewAnnotationAnchor anchor;
        private double offsetX;
        private double offsetY;

        public Builder anchor(ViewAnnotationAnchor viewAnnotationAnchor) {
            this.anchor = viewAnnotationAnchor;
            return this;
        }

        public ViewAnnotationAnchorConfig build() {
            if (this.anchor != null) {
                return new ViewAnnotationAnchorConfig(this.anchor, this.offsetX, this.offsetY);
            }
            throw new NullPointerException("anchor shouldn't be null");
        }

        public Builder offsetX(double d3) {
            this.offsetX = d3;
            return this;
        }

        public Builder offsetY(double d3) {
            this.offsetY = d3;
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
        if (obj == null || ViewAnnotationAnchorConfig.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfig = (ViewAnnotationAnchorConfig) obj;
        return Objects.equals(this.anchor, viewAnnotationAnchorConfig.anchor) && PartialEq.compare(this.offsetX, viewAnnotationAnchorConfig.offsetX) && PartialEq.compare(this.offsetY, viewAnnotationAnchorConfig.offsetY);
    }

    public ViewAnnotationAnchor getAnchor() {
        return this.anchor;
    }

    public double getOffsetX() {
        return this.offsetX;
    }

    public double getOffsetY() {
        return this.offsetY;
    }

    public int hashCode() {
        return Objects.hash(this.anchor, Double.valueOf(this.offsetX), Double.valueOf(this.offsetY));
    }

    public Builder toBuilder() {
        return new Builder().anchor(this.anchor).offsetX(this.offsetX).offsetY(this.offsetY);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[anchor: ");
        sb4.append(RecordUtils.fieldToString(this.anchor));
        sb4.append(", offsetX: ");
        AbstractC3855a.m11835s(this.offsetX, ", offsetY: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.offsetY)));
        sb4.append("]");
        return sb4.toString();
    }

    private ViewAnnotationAnchorConfig(ViewAnnotationAnchor viewAnnotationAnchor, double d3, double d14) {
        this.anchor = viewAnnotationAnchor;
        this.offsetX = d3;
        this.offsetY = d14;
    }
}
