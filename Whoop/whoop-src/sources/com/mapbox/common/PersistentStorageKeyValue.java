package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class PersistentStorageKeyValue implements Serializable {
    private final String key;
    private final DataRef value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageKeyValue(String str, DataRef dataRef) {
        this.key = str;
        this.value = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageKeyValue persistentStorageKeyValue = (PersistentStorageKeyValue) obj;
        return Objects.equals(this.key, persistentStorageKeyValue.key) && Objects.equals(this.value, persistentStorageKeyValue.value);
    }

    public String getKey() {
        return this.key;
    }

    public DataRef getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[key: ");
        AbstractC3855a.m11838v(this.key, ", value: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.value));
        sb4.append("]");
        return sb4.toString();
    }
}
