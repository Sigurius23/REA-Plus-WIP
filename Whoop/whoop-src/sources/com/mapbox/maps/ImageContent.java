package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ImageContent implements Serializable {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ImageContent(float f13, float f14, float f15, float f16) {
        this.left = f13;
        this.top = f14;
        this.right = f15;
        this.bottom = f16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageContent.class != obj.getClass()) {
            return false;
        }
        ImageContent imageContent = (ImageContent) obj;
        return PartialEq.compare(this.left, imageContent.left) && PartialEq.compare(this.top, imageContent.top) && PartialEq.compare(this.right, imageContent.right) && PartialEq.compare(this.bottom, imageContent.bottom);
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.left), Float.valueOf(this.top), Float.valueOf(this.right), Float.valueOf(this.bottom));
    }

    public String toString() {
        return "[left: " + RecordUtils.fieldToString(Float.valueOf(this.left)) + ", top: " + RecordUtils.fieldToString(Float.valueOf(this.top)) + ", right: " + RecordUtils.fieldToString(Float.valueOf(this.right)) + ", bottom: " + RecordUtils.fieldToString(Float.valueOf(this.bottom)) + "]";
    }
}
