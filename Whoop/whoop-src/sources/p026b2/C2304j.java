package p026b2;

import p636y3.EnumC39181m;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: b2.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C2304j implements InterfaceC2302h {

    /* JADX INFO: renamed from: a */
    public final float f9118a;

    public C2304j(float f13) {
        this.f9118a = f13;
    }

    @Override // p026b2.InterfaceC2302h
    /* JADX INFO: renamed from: a */
    public final long mo7156a(long j7, long j13, EnumC39181m enumC39181m) {
        long j14 = (((long) (((int) (j13 >> 32)) - ((int) (j7 >> 32)))) << 32) | (((long) (((int) (j13 & 4294967295L)) - ((int) (j7 & 4294967295L)))) & 4294967295L);
        float f13 = 1;
        float f14 = (this.f9118a + f13) * (((int) (j14 >> 32)) / 2.0f);
        return (((long) Math.round((f13 - 1.0f) * (((int) (j14 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f14)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2304j) && Float.compare(this.f9118a, ((C2304j) obj).f9118a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f9118a) * 31);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f9118a, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}
