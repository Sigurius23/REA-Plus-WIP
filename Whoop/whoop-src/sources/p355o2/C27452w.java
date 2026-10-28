package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C27452w extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110646c;

    /* JADX INFO: renamed from: d */
    public final float f110647d;

    /* JADX INFO: renamed from: e */
    public final float f110648e;

    /* JADX INFO: renamed from: f */
    public final float f110649f;

    public C27452w(float f13, float f14, float f15, float f16) {
        super(2);
        this.f110646c = f13;
        this.f110647d = f14;
        this.f110648e = f15;
        this.f110649f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27452w)) {
            return false;
        }
        C27452w c27452w = (C27452w) obj;
        return Float.compare(this.f110646c, c27452w.f110646c) == 0 && Float.compare(this.f110647d, c27452w.f110647d) == 0 && Float.compare(this.f110648e, c27452w.f110648e) == 0 && Float.compare(this.f110649f, c27452w.f110649f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110649f) + AbstractC11266d.m30447a(this.f110648e, AbstractC11266d.m30447a(this.f110647d, Float.hashCode(this.f110646c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb4.append(this.f110646c);
        sb4.append(", dy1=");
        sb4.append(this.f110647d);
        sb4.append(", dx2=");
        sb4.append(this.f110648e);
        sb4.append(", dy2=");
        return AbstractC30802r.m94763l(sb4, this.f110649f, ')');
    }
}
