package com.iterable.iterableapi;

import java.util.Date;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.iterable.iterableapi.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5314d0 {

    /* JADX INFO: renamed from: a */
    public final Date f21656a;

    /* JADX INFO: renamed from: b */
    public final String f21657b;

    public C5314d0(Date date) {
        String strM31995n = AbstractC11895b.m31995n("toString(...)");
        this.f21656a = date;
        this.f21657b = strM31995n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5314d0)) {
            return false;
        }
        C5314d0 c5314d0 = (C5314d0) obj;
        return AbstractC22676k.m65745e(this.f21656a, c5314d0.f21656a) && AbstractC22676k.m65745e(this.f21657b, c5314d0.f21657b);
    }

    public final int hashCode() {
        Date date = this.f21656a;
        return this.f21657b.hashCode() + ((date == null ? 0 : date.hashCode()) * 29791);
    }

    public final String toString() {
        return "IterableEmbeddedSession(start=" + this.f21656a + ", end=null, impressions=null, id=" + this.f21657b + ")";
    }
}
