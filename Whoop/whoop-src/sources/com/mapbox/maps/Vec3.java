package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Vec3 implements Serializable {

    /* JADX INFO: renamed from: x */
    private final double f22018x;

    /* JADX INFO: renamed from: y */
    private final double f22019y;

    /* JADX INFO: renamed from: z */
    private final double f22020z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec3(double d3, double d14, double d15) {
        this.f22018x = d3;
        this.f22019y = d14;
        this.f22020z = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec3.class != obj.getClass()) {
            return false;
        }
        Vec3 vec3 = (Vec3) obj;
        return PartialEq.compare(this.f22018x, vec3.f22018x) && PartialEq.compare(this.f22019y, vec3.f22019y) && PartialEq.compare(this.f22020z, vec3.f22020z);
    }

    public double getX() {
        return this.f22018x;
    }

    public double getY() {
        return this.f22019y;
    }

    public double getZ() {
        return this.f22020z;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f22018x), Double.valueOf(this.f22019y), Double.valueOf(this.f22020z));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[x: ");
        AbstractC3855a.m11835s(this.f22018x, ", y: ", sb4);
        AbstractC3855a.m11835s(this.f22019y, ", z: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.f22020z)));
        sb4.append("]");
        return sb4.toString();
    }
}
