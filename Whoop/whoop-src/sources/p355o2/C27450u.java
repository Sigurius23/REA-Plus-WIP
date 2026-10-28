package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C27450u extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110640c;

    /* JADX INFO: renamed from: d */
    public final float f110641d;

    public C27450u(float f13, float f14) {
        super(3);
        this.f110640c = f13;
        this.f110641d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27450u)) {
            return false;
        }
        C27450u c27450u = (C27450u) obj;
        return Float.compare(this.f110640c, c27450u.f110640c) == 0 && Float.compare(this.f110641d, c27450u.f110641d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110641d) + (Float.hashCode(this.f110640c) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeMoveTo(dx=");
        sb4.append(this.f110640c);
        sb4.append(", dy=");
        return AbstractC30802r.m94763l(sb4, this.f110641d, ')');
    }
}
