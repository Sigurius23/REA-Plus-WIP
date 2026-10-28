package androidx.health.platform.client.proto;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.y0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC1553y0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C1468h.class, C1468h.f6044y),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: w */
    public final Object f6163w;

    EnumC1553y0(Class cls, Serializable serializable) {
        this.f6163w = serializable;
    }
}
