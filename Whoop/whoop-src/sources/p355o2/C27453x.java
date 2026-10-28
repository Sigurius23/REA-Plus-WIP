package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.x */
/* JADX INFO: loaded from: classes.dex */
public final class C27453x extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110650c;

    /* JADX INFO: renamed from: d */
    public final float f110651d;

    public C27453x(float f13, float f14) {
        super(1);
        this.f110650c = f13;
        this.f110651d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27453x)) {
            return false;
        }
        C27453x c27453x = (C27453x) obj;
        return Float.compare(this.f110650c, c27453x.f110650c) == 0 && Float.compare(this.f110651d, c27453x.f110651d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110651d) + (Float.hashCode(this.f110650c) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb4.append(this.f110650c);
        sb4.append(", dy=");
        return AbstractC30802r.m94763l(sb4, this.f110651d, ')');
    }
}
