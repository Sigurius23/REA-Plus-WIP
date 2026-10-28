package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Vec2 implements Serializable {

    /* JADX INFO: renamed from: x */
    private final double f22016x;

    /* JADX INFO: renamed from: y */
    private final double f22017y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec2(double d3, double d14) {
        this.f22016x = d3;
        this.f22017y = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec2.class != obj.getClass()) {
            return false;
        }
        Vec2 vec2 = (Vec2) obj;
        return PartialEq.compare(this.f22016x, vec2.f22016x) && PartialEq.compare(this.f22017y, vec2.f22017y);
    }

    public double getX() {
        return this.f22016x;
    }

    public double getY() {
        return this.f22017y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f22016x), Double.valueOf(this.f22017y));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[x: ");
        AbstractC3855a.m11835s(this.f22016x, ", y: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.f22017y)));
        sb4.append("]");
        return sb4.toString();
    }
}
