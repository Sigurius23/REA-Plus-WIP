package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1207d0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C1218h.class, C1218h.f5398y),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: w */
    public final Object f5378w;

    EnumC1207d0(Class cls, Serializable serializable) {
        this.f5378w = serializable;
    }
}
