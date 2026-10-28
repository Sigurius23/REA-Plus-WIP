package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TileRegionError implements Serializable {
    private final String message;
    private final TileRegionErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionError(TileRegionErrorType tileRegionErrorType, String str) {
        this.type = tileRegionErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionError tileRegionError = (TileRegionError) obj;
        return Objects.equals(this.type, tileRegionError.type) && Objects.equals(this.message, tileRegionError.message);
    }

    public String getMessage() {
        return this.message;
    }

    public TileRegionErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[type: ");
        sb4.append(RecordUtils.fieldToString(this.type));
        sb4.append(", message: ");
        return AbstractC3855a.m11826j(this.message, "]", sb4);
    }
}
