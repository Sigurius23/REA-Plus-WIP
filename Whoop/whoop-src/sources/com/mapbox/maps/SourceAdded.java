package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class SourceAdded implements Serializable {
    private final String sourceId;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public SourceAdded(String str, Date date) {
        this.sourceId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceAdded.class != obj.getClass()) {
            return false;
        }
        SourceAdded sourceAdded = (SourceAdded) obj;
        return Objects.equals(this.sourceId, sourceAdded.sourceId) && Objects.equals(this.timestamp, sourceAdded.timestamp);
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.sourceId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[sourceId: ");
        AbstractC3855a.m11838v(this.sourceId, ", timestamp: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.timestamp));
        sb4.append("]");
        return sb4.toString();
    }
}
