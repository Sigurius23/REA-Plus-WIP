package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C27451v extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110642c;

    /* JADX INFO: renamed from: d */
    public final float f110643d;

    /* JADX INFO: renamed from: e */
    public final float f110644e;

    /* JADX INFO: renamed from: f */
    public final float f110645f;

    public C27451v(float f13, float f14, float f15, float f16) {
        super(1);
        this.f110642c = f13;
        this.f110643d = f14;
        this.f110644e = f15;
        this.f110645f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27451v)) {
            return false;
        }
        C27451v c27451v = (C27451v) obj;
        return Float.compare(this.f110642c, c27451v.f110642c) == 0 && Float.compare(this.f110643d, c27451v.f110643d) == 0 && Float.compare(this.f110644e, c27451v.f110644e) == 0 && Float.compare(this.f110645f, c27451v.f110645f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110645f) + AbstractC11266d.m30447a(this.f110644e, AbstractC11266d.m30447a(this.f110643d, Float.hashCode(this.f110642c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeQuadTo(dx1=");
        sb4.append(this.f110642c);
        sb4.append(", dy1=");
        sb4.append(this.f110643d);
        sb4.append(", dx2=");
        sb4.append(this.f110644e);
        sb4.append(", dy2=");
        return AbstractC30802r.m94763l(sb4, this.f110645f, ')');
    }
}
