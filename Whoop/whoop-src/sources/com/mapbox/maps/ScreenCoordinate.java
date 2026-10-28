package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenCoordinate implements Serializable {

    /* JADX INFO: renamed from: x */
    private final double f22013x;

    /* JADX INFO: renamed from: y */
    private final double f22014y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ScreenCoordinate(double d3, double d14) {
        this.f22013x = d3;
        this.f22014y = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScreenCoordinate.class != obj.getClass()) {
            return false;
        }
        ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
        return PartialEq.compare(this.f22013x, screenCoordinate.f22013x) && PartialEq.compare(this.f22014y, screenCoordinate.f22014y);
    }

    public double getX() {
        return this.f22013x;
    }

    public double getY() {
        return this.f22014y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f22013x), Double.valueOf(this.f22014y));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[x: ");
        AbstractC3855a.m11835s(this.f22013x, ", y: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.f22014y)));
        sb4.append("]");
        return sb4.toString();
    }
}
