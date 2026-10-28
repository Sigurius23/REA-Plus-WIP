package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class PersistentStorageData implements Serializable {
    private final String key;
    private final Date timestamp;
    private final DataRef value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageData(String str, Date date, DataRef dataRef) {
        this.key = str;
        this.timestamp = date;
        this.value = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageData persistentStorageData = (PersistentStorageData) obj;
        return Objects.equals(this.key, persistentStorageData.key) && Objects.equals(this.timestamp, persistentStorageData.timestamp) && Objects.equals(this.value, persistentStorageData.value);
    }

    public String getKey() {
        return this.key;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public DataRef getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.timestamp, this.value);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[key: ");
        AbstractC3855a.m11838v(this.key, ", timestamp: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.timestamp));
        sb4.append(", value: ");
        sb4.append(RecordUtils.fieldToString(this.value));
        sb4.append("]");
        return sb4.toString();
    }
}
