package io.sentry.android.replay.capture;

import io.sentry.C20337g0;
import io.sentry.C20542s6;
import io.sentry.C20626x3;
import io.sentry.InterfaceC20308d1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20193i extends AbstractC20195k {

    /* JADX INFO: renamed from: a */
    public final C20542s6 f75861a;

    /* JADX INFO: renamed from: b */
    public final C20626x3 f75862b;

    public C20193i(C20542s6 c20542s6, C20626x3 c20626x3) {
        this.f75861a = c20542s6;
        this.f75862b = c20626x3;
    }

    /* JADX INFO: renamed from: a */
    public final void m56120a(InterfaceC20308d1 interfaceC20308d1, C20337g0 c20337g0) {
        if (interfaceC20308d1 != null) {
            c20337g0.f76354g = this.f75862b;
            interfaceC20308d1.mo56440t(this.f75861a, c20337g0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20193i)) {
            return false;
        }
        C20193i c20193i = (C20193i) obj;
        return AbstractC22676k.m65745e(this.f75861a, c20193i.f75861a) && AbstractC22676k.m65745e(this.f75862b, c20193i.f75862b);
    }

    public final int hashCode() {
        return this.f75862b.hashCode() + (this.f75861a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.f75861a + ", recording=" + this.f75862b + ')';
    }
}
