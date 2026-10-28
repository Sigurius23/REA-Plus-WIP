package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C27443n extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110614c;

    /* JADX INFO: renamed from: d */
    public final float f110615d;

    /* JADX INFO: renamed from: e */
    public final float f110616e;

    /* JADX INFO: renamed from: f */
    public final float f110617f;

    public C27443n(float f13, float f14, float f15, float f16) {
        super(1);
        this.f110614c = f13;
        this.f110615d = f14;
        this.f110616e = f15;
        this.f110617f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27443n)) {
            return false;
        }
        C27443n c27443n = (C27443n) obj;
        return Float.compare(this.f110614c, c27443n.f110614c) == 0 && Float.compare(this.f110615d, c27443n.f110615d) == 0 && Float.compare(this.f110616e, c27443n.f110616e) == 0 && Float.compare(this.f110617f, c27443n.f110617f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110617f) + AbstractC11266d.m30447a(this.f110616e, AbstractC11266d.m30447a(this.f110615d, Float.hashCode(this.f110614c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("QuadTo(x1=");
        sb4.append(this.f110614c);
        sb4.append(", y1=");
        sb4.append(this.f110615d);
        sb4.append(", x2=");
        sb4.append(this.f110616e);
        sb4.append(", y2=");
        return AbstractC30802r.m94763l(sb4, this.f110617f, ')');
    }
}
