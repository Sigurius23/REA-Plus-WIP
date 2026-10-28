package p292l1;

import p000.AbstractC11266d;
import p636y3.C39174f;

/* JADX INFO: renamed from: l1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C23126l {

    /* JADX INFO: renamed from: a */
    public final float f91361a;

    /* JADX INFO: renamed from: b */
    public final float f91362b;

    /* JADX INFO: renamed from: c */
    public final float f91363c;

    /* JADX INFO: renamed from: d */
    public final float f91364d;

    /* JADX INFO: renamed from: e */
    public final float f91365e;

    public C23126l(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f91361a = f13;
        this.f91362b = f14;
        this.f91363c = f15;
        this.f91364d = f16;
        this.f91365e = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23126l)) {
            return false;
        }
        C23126l c23126l = (C23126l) obj;
        return C39174f.m124782b(this.f91361a, c23126l.f91361a) && C39174f.m124782b(this.f91362b, c23126l.f91362b) && C39174f.m124782b(this.f91363c, c23126l.f91363c) && C39174f.m124782b(this.f91364d, c23126l.f91364d) && C39174f.m124782b(this.f91365e, c23126l.f91365e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f91365e) + AbstractC11266d.m30447a(this.f91364d, AbstractC11266d.m30447a(this.f91363c, AbstractC11266d.m30447a(this.f91362b, Float.hashCode(this.f91361a) * 31, 31), 31), 31);
    }
}
