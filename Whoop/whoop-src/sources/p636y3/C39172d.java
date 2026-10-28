package p636y3;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: y3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C39172d implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public final float f168408w;

    /* JADX INFO: renamed from: x */
    public final float f168409x;

    public C39172d(float f13, float f14) {
        this.f168408w = f13;
        this.f168409x = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39172d)) {
            return false;
        }
        C39172d c39172d = (C39172d) obj;
        return Float.compare(this.f168408w, c39172d.f168408w) == 0 && Float.compare(this.f168409x, c39172d.f168409x) == 0;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f168408w;
    }

    public final int hashCode() {
        return Float.hashCode(this.f168409x) + (Float.hashCode(this.f168408w) * 31);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float mo740m0() {
        return this.f168409x;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DensityImpl(density=");
        sb4.append(this.f168408w);
        sb4.append(", fontScale=");
        return AbstractC30802r.m94763l(sb4, this.f168409x, ')');
    }
}
