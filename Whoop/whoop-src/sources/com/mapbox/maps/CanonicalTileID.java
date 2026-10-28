package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CanonicalTileID implements Serializable {

    /* JADX INFO: renamed from: x */
    private final int f21944x;

    /* JADX INFO: renamed from: y */
    private final int f21945y;

    /* JADX INFO: renamed from: z */
    private final byte f21946z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CanonicalTileID(byte b, int i13, int i14) {
        this.f21946z = b;
        this.f21944x = i13;
        this.f21945y = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CanonicalTileID.class != obj.getClass()) {
            return false;
        }
        CanonicalTileID canonicalTileID = (CanonicalTileID) obj;
        return this.f21946z == canonicalTileID.f21946z && this.f21944x == canonicalTileID.f21944x && this.f21945y == canonicalTileID.f21945y;
    }

    public int getX() {
        return this.f21944x;
    }

    public int getY() {
        return this.f21945y;
    }

    public byte getZ() {
        return this.f21946z;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.f21946z), Integer.valueOf(this.f21944x), Integer.valueOf(this.f21945y));
    }

    public String toString() {
        return "[z: " + RecordUtils.fieldToString(Byte.valueOf(this.f21946z)) + ", x: " + RecordUtils.fieldToString(Integer.valueOf(this.f21944x)) + ", y: " + RecordUtils.fieldToString(Integer.valueOf(this.f21945y)) + "]";
    }
}
