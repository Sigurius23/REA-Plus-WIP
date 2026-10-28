package com.google.crypto.tink.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5109p0 {

    /* JADX INFO: renamed from: a */
    public final Class f21453a;

    /* JADX INFO: renamed from: b */
    public final Class f21454b;

    public C5109p0(Class cls, Class cls2) {
        this.f21453a = cls;
        this.f21454b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5109p0)) {
            return false;
        }
        C5109p0 c5109p0 = (C5109p0) obj;
        return c5109p0.f21453a.equals(this.f21453a) && c5109p0.f21454b.equals(this.f21454b);
    }

    public final int hashCode() {
        return Objects.hash(this.f21453a, this.f21454b);
    }

    public final String toString() {
        return this.f21453a.getSimpleName() + " with serialization type: " + this.f21454b.getSimpleName();
    }
}
