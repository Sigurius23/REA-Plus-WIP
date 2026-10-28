package com.google.crypto.tink.internal;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C5092h extends Number {

    /* JADX INFO: renamed from: w */
    public final String f21420w;

    public C5092h(String str) {
        this.f21420w = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f21420w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5092h) {
            return this.f21420w.equals(((C5092h) obj).f21420w);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f21420w);
    }

    public final int hashCode() {
        return this.f21420w.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f21420w;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f21420w;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f21420w;
    }
}
