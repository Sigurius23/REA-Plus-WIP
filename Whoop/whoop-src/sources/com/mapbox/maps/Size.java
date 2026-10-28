package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Size implements Serializable {
    private final float height;
    private final float width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Size(float f13, float f14) {
        this.width = f13;
        this.height = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Size.class != obj.getClass()) {
            return false;
        }
        Size size = (Size) obj;
        return PartialEq.compare(this.width, size.width) && PartialEq.compare(this.height, size.height);
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.width), Float.valueOf(this.height));
    }

    public String toString() {
        return "[width: " + RecordUtils.fieldToString(Float.valueOf(this.width)) + ", height: " + RecordUtils.fieldToString(Float.valueOf(this.height)) + "]";
    }
}
