package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1262v1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C1218h.f5398y),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: w */
    public final Object f5499w;

    EnumC1262v1(Serializable serializable) {
        this.f5499w = serializable;
    }
}
