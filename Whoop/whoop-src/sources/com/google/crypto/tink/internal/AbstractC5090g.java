package com.google.crypto.tink.internal;

import com.google.gson.stream.JsonToken;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC5090g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f21419a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f21419a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21419a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21419a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21419a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21419a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21419a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
