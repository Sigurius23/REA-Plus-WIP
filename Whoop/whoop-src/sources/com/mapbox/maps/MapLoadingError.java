package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MapLoadingError implements Serializable {
    private final String message;
    private final String sourceId;
    private final CanonicalTileID tileId;
    private final Date timestamp;
    private final MapLoadingErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapLoadingError(MapLoadingErrorType mapLoadingErrorType, String str, String str2, CanonicalTileID canonicalTileID, Date date) {
        this.type = mapLoadingErrorType;
        this.message = str;
        this.sourceId = str2;
        this.tileId = canonicalTileID;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapLoadingError.class != obj.getClass()) {
            return false;
        }
        MapLoadingError mapLoadingError = (MapLoadingError) obj;
        return Objects.equals(this.type, mapLoadingError.type) && Objects.equals(this.message, mapLoadingError.message) && Objects.equals(this.sourceId, mapLoadingError.sourceId) && Objects.equals(this.tileId, mapLoadingError.tileId) && Objects.equals(this.timestamp, mapLoadingError.timestamp);
    }

    public String getMessage() {
        return this.message;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public MapLoadingErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, this.sourceId, this.tileId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[type: ");
        sb4.append(RecordUtils.fieldToString(this.type));
        sb4.append(", message: ");
        AbstractC3855a.m11838v(this.message, ", sourceId: ", sb4);
        AbstractC3855a.m11838v(this.sourceId, ", tileId: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.tileId));
        sb4.append(", timestamp: ");
        sb4.append(RecordUtils.fieldToString(this.timestamp));
        sb4.append("]");
        return sb4.toString();
    }
}
