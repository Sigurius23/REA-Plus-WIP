package p026b2;

import p000.AbstractC30802r;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: b2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2307m implements InterfaceC2302h {

    /* JADX INFO: renamed from: a */
    public final float f9121a;

    /* JADX INFO: renamed from: b */
    public final float f9122b;

    public C2307m(float f13, float f14) {
        this.f9121a = f13;
        this.f9122b = f14;
    }

    @Override // p026b2.InterfaceC2302h
    /* JADX INFO: renamed from: a */
    public final long mo7156a(long j7, long j13, EnumC39181m enumC39181m) {
        float f13 = (((int) (j13 >> 32)) - ((int) (j7 >> 32))) / 2.0f;
        float f14 = (((int) (j13 & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f;
        EnumC39181m enumC39181m2 = EnumC39181m.f168423w;
        float f15 = this.f9121a;
        if (enumC39181m != enumC39181m2) {
            f15 *= -1;
        }
        float f16 = 1;
        float f17 = (f15 + f16) * f13;
        return (((long) Math.round((f16 + this.f9122b) * f14)) & 4294967295L) | (((long) Math.round(f17)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2307m)) {
            return false;
        }
        C2307m c2307m = (C2307m) obj;
        return Float.compare(this.f9121a, c2307m.f9121a) == 0 && Float.compare(this.f9122b, c2307m.f9122b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9122b) + (Float.hashCode(this.f9121a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb4.append(this.f9121a);
        sb4.append(", verticalBias=");
        return AbstractC30802r.m94763l(sb4, this.f9122b, ')');
    }
}
