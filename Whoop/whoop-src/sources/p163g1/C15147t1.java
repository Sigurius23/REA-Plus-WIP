package p163g1;

import p000.AbstractC11266d;
import p636y3.C39174f;

/* JADX INFO: renamed from: g1.t1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15147t1 {

    /* JADX INFO: renamed from: a */
    public final float f56810a;

    /* JADX INFO: renamed from: b */
    public final float f56811b;

    /* JADX INFO: renamed from: c */
    public final float f56812c;

    /* JADX INFO: renamed from: d */
    public final float f56813d;

    public C15147t1(float f13, float f14, float f15, float f16) {
        this.f56810a = f13;
        this.f56811b = f14;
        this.f56812c = f15;
        this.f56813d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15147t1)) {
            return false;
        }
        C15147t1 c15147t1 = (C15147t1) obj;
        if (C39174f.m124782b(this.f56810a, c15147t1.f56810a) && C39174f.m124782b(this.f56811b, c15147t1.f56811b) && C39174f.m124782b(this.f56812c, c15147t1.f56812c)) {
            return C39174f.m124782b(this.f56813d, c15147t1.f56813d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f56813d) + AbstractC11266d.m30447a(this.f56812c, AbstractC11266d.m30447a(this.f56811b, Float.hashCode(this.f56810a) * 31, 31), 31);
    }
}
