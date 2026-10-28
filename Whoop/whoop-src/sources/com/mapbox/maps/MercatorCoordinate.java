package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MercatorCoordinate implements Serializable {

    /* JADX INFO: renamed from: x */
    private final double f21950x;

    /* JADX INFO: renamed from: y */
    private final double f21951y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MercatorCoordinate(double d3, double d14) {
        this.f21950x = d3;
        this.f21951y = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MercatorCoordinate.class != obj.getClass()) {
            return false;
        }
        MercatorCoordinate mercatorCoordinate = (MercatorCoordinate) obj;
        return PartialEq.compare(this.f21950x, mercatorCoordinate.f21950x) && PartialEq.compare(this.f21951y, mercatorCoordinate.f21951y);
    }

    public double getX() {
        return this.f21950x;
    }

    public double getY() {
        return this.f21951y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f21950x), Double.valueOf(this.f21951y));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[x: ");
        AbstractC3855a.m11835s(this.f21950x, ", y: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.f21951y)));
        sb4.append("]");
        return sb4.toString();
    }
}
