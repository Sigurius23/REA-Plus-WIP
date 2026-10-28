package p294l3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23255g0 {

    /* JADX INFO: renamed from: a */
    public final C23253f0 f92138a;

    /* JADX INFO: renamed from: b */
    public final C23251e0 f92139b;

    public C23255g0(C23253f0 c23253f0, C23251e0 c23251e0) {
        this.f92138a = c23253f0;
        this.f92139b = c23251e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23255g0)) {
            return false;
        }
        C23255g0 c23255g0 = (C23255g0) obj;
        return AbstractC22676k.m65745e(this.f92139b, c23255g0.f92139b) && AbstractC22676k.m65745e(this.f92138a, c23255g0.f92138a);
    }

    public final int hashCode() {
        C23253f0 c23253f0 = this.f92138a;
        int iHashCode = (c23253f0 != null ? c23253f0.hashCode() : 0) * 31;
        C23251e0 c23251e0 = this.f92139b;
        return iHashCode + (c23251e0 != null ? c23251e0.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f92138a + ", paragraphSyle=" + this.f92139b + ')';
    }

    public C23255g0(boolean z4) {
        this(null, new C23251e0(z4));
    }
}
