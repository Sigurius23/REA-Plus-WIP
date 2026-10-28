package androidx.compose.foundation.layout;

import androidx.compose.p018ui.Modifier;
import p026b2.C2299e;
import p026b2.InterfaceC2302h;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23004v;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1101c implements InterfaceC23004v, InterfaceC23001u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39171c f4584a;

    /* JADX INFO: renamed from: b */
    public final long f4585b;

    public C1101c(InterfaceC39140v1 interfaceC39140v1, long j7) {
        this.f4584a = interfaceC39140v1;
        this.f4585b = j7;
    }

    @Override // p291l0.InterfaceC23001u
    /* JADX INFO: renamed from: a */
    public final Modifier mo3400a(Modifier modifier, InterfaceC2302h interfaceC2302h) {
        return modifier.mo3471e(new BoxChildDataElement(interfaceC2302h, false));
    }

    @Override // p291l0.InterfaceC23001u
    /* JADX INFO: renamed from: b */
    public final Modifier mo3401b(Modifier modifier) {
        return new BoxChildDataElement(C2299e.f9102E, true);
    }

    /* JADX INFO: renamed from: c */
    public final float m3402c() {
        long j7 = this.f4585b;
        if (!C39169a.m124760d(j7)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f4584a.mo733e0(C39169a.m124764h(j7));
    }

    /* JADX INFO: renamed from: d */
    public final float m3403d() {
        long j7 = this.f4585b;
        if (!C39169a.m124761e(j7)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f4584a.mo733e0(C39169a.m124765i(j7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101c)) {
            return false;
        }
        C1101c c1101c = (C1101c) obj;
        return AbstractC22676k.m65745e(this.f4584a, c1101c.f4584a) && C39169a.m124759c(this.f4585b, c1101c.f4585b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4585b) + (this.f4584a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f4584a + ", constraints=" + ((Object) C39169a.m124768l(this.f4585b)) + ')';
    }
}
