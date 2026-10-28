package androidx.glance.appwidget.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.g0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC1386g0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC1391i.class, AbstractC1391i.f5905x),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: w */
    public final Object f5902w;

    EnumC1386g0(Class cls, Serializable serializable) {
        this.f5902w = serializable;
    }
}
