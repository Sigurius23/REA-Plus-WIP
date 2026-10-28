package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Vec4 implements Serializable {

    /* JADX INFO: renamed from: w */
    private final double f22021w;

    /* JADX INFO: renamed from: x */
    private final double f22022x;

    /* JADX INFO: renamed from: y */
    private final double f22023y;

    /* JADX INFO: renamed from: z */
    private final double f22024z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec4(double d3, double d14, double d15, double d16) {
        this.f22022x = d3;
        this.f22023y = d14;
        this.f22024z = d15;
        this.f22021w = d16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec4.class != obj.getClass()) {
            return false;
        }
        Vec4 vec4 = (Vec4) obj;
        return PartialEq.compare(this.f22022x, vec4.f22022x) && PartialEq.compare(this.f22023y, vec4.f22023y) && PartialEq.compare(this.f22024z, vec4.f22024z) && PartialEq.compare(this.f22021w, vec4.f22021w);
    }

    public double getW() {
        return this.f22021w;
    }

    public double getX() {
        return this.f22022x;
    }

    public double getY() {
        return this.f22023y;
    }

    public double getZ() {
        return this.f22024z;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f22022x), Double.valueOf(this.f22023y), Double.valueOf(this.f22024z), Double.valueOf(this.f22021w));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[x: ");
        AbstractC3855a.m11835s(this.f22022x, ", y: ", sb4);
        AbstractC3855a.m11835s(this.f22023y, ", z: ", sb4);
        AbstractC3855a.m11835s(this.f22024z, ", w: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.f22021w)));
        sb4.append("]");
        return sb4.toString();
    }
}
