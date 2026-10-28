package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c0 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC5129c0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC5146i.class, AbstractC5146i.f21514x),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: w */
    public final Object f21497w;

    EnumC5129c0(Class cls, Serializable serializable) {
        this.f21497w = serializable;
    }
}
