package p292l1;

import p000.AbstractC11266d;
import p636y3.C39174f;

/* JADX INFO: renamed from: l1.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C23102h {

    /* JADX INFO: renamed from: a */
    public final float f91224a;

    /* JADX INFO: renamed from: b */
    public final float f91225b;

    /* JADX INFO: renamed from: c */
    public final float f91226c;

    /* JADX INFO: renamed from: d */
    public final float f91227d;

    /* JADX INFO: renamed from: e */
    public final float f91228e;

    public C23102h(float f13, float f14, float f15, float f16, float f17) {
        this.f91224a = f13;
        this.f91225b = f14;
        this.f91226c = f15;
        this.f91227d = f16;
        this.f91228e = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23102h)) {
            return false;
        }
        C23102h c23102h = (C23102h) obj;
        return C39174f.m124782b(this.f91224a, c23102h.f91224a) && C39174f.m124782b(this.f91225b, c23102h.f91225b) && C39174f.m124782b(this.f91226c, c23102h.f91226c) && C39174f.m124782b(this.f91227d, c23102h.f91227d) && C39174f.m124782b(this.f91228e, c23102h.f91228e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f91228e) + AbstractC11266d.m30447a(this.f91227d, AbstractC11266d.m30447a(this.f91226c, AbstractC11266d.m30447a(this.f91225b, Float.hashCode(this.f91224a) * 31, 31), 31), 31);
    }
}
