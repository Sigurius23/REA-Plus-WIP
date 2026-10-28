package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class EdgeInsets implements Serializable {
    private final double bottom;
    private final double left;
    private final double right;
    private final double top;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EdgeInsets(double d3, double d14, double d15, double d16) {
        this.top = d3;
        this.left = d14;
        this.bottom = d15;
        this.right = d16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EdgeInsets.class != obj.getClass()) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        return PartialEq.compare(this.top, edgeInsets.top) && PartialEq.compare(this.left, edgeInsets.left) && PartialEq.compare(this.bottom, edgeInsets.bottom) && PartialEq.compare(this.right, edgeInsets.right);
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.top), Double.valueOf(this.left), Double.valueOf(this.bottom), Double.valueOf(this.right));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[top: ");
        AbstractC3855a.m11835s(this.top, ", left: ", sb4);
        AbstractC3855a.m11835s(this.left, ", bottom: ", sb4);
        AbstractC3855a.m11835s(this.bottom, ", right: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.right)));
        sb4.append("]");
        return sb4.toString();
    }
}
