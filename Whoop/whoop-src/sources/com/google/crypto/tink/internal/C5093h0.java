package com.google.crypto.tink.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5093h0 {

    /* JADX INFO: renamed from: a */
    public final Class f21421a;

    /* JADX INFO: renamed from: b */
    public final Class f21422b;

    public C5093h0(Class cls, Class cls2) {
        this.f21421a = cls;
        this.f21422b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5093h0)) {
            return false;
        }
        C5093h0 c5093h0 = (C5093h0) obj;
        return c5093h0.f21421a.equals(this.f21421a) && c5093h0.f21422b.equals(this.f21422b);
    }

    public final int hashCode() {
        return Objects.hash(this.f21421a, this.f21422b);
    }

    public final String toString() {
        return this.f21421a.getSimpleName() + " with primitive type: " + this.f21422b.getSimpleName();
    }
}
