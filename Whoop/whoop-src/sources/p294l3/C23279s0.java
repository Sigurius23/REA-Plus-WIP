package p294l3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23279s0 {

    /* JADX INFO: renamed from: a */
    public final C23267m0 f92237a;

    /* JADX INFO: renamed from: b */
    public final C23267m0 f92238b;

    /* JADX INFO: renamed from: c */
    public final C23267m0 f92239c;

    /* JADX INFO: renamed from: d */
    public final C23267m0 f92240d;

    public C23279s0(C23267m0 c23267m0, C23267m0 c23267m1, C23267m0 c23267m2, C23267m0 c23267m3) {
        this.f92237a = c23267m0;
        this.f92238b = c23267m1;
        this.f92239c = c23267m2;
        this.f92240d = c23267m3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23279s0)) {
            return false;
        }
        C23279s0 c23279s0 = (C23279s0) obj;
        return AbstractC22676k.m65745e(this.f92237a, c23279s0.f92237a) && AbstractC22676k.m65745e(this.f92238b, c23279s0.f92238b) && AbstractC22676k.m65745e(this.f92239c, c23279s0.f92239c) && AbstractC22676k.m65745e(this.f92240d, c23279s0.f92240d);
    }

    public final int hashCode() {
        C23267m0 c23267m0 = this.f92237a;
        int iHashCode = (c23267m0 != null ? c23267m0.hashCode() : 0) * 31;
        C23267m0 c23267m1 = this.f92238b;
        int iHashCode2 = (iHashCode + (c23267m1 != null ? c23267m1.hashCode() : 0)) * 31;
        C23267m0 c23267m2 = this.f92239c;
        int iHashCode3 = (iHashCode2 + (c23267m2 != null ? c23267m2.hashCode() : 0)) * 31;
        C23267m0 c23267m3 = this.f92240d;
        return iHashCode3 + (c23267m3 != null ? c23267m3.hashCode() : 0);
    }
}
