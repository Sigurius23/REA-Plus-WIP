package com.google.crypto.tink.internal;

import java.util.Objects;
import p075ct.C11105a;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5107o0 {

    /* JADX INFO: renamed from: a */
    public final Class f21448a;

    /* JADX INFO: renamed from: b */
    public final C11105a f21449b;

    public C5107o0(Class cls, C11105a c11105a) {
        this.f21448a = cls;
        this.f21449b = c11105a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5107o0)) {
            return false;
        }
        C5107o0 c5107o0 = (C5107o0) obj;
        return c5107o0.f21448a.equals(this.f21448a) && c5107o0.f21449b.equals(this.f21449b);
    }

    public final int hashCode() {
        return Objects.hash(this.f21448a, this.f21449b);
    }

    public final String toString() {
        return this.f21448a.getSimpleName() + ", object identifier: " + this.f21449b;
    }
}
