package p635y2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: y2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C39108l implements InterfaceC39105k {

    /* JADX INFO: renamed from: w */
    public final float f168220w;

    public C39108l(float f13) {
        this.f168220w = f13;
    }

    @Override // p635y2.InterfaceC39105k
    /* JADX INFO: renamed from: a */
    public final long mo124615a(long j7, long j13) {
        float f13 = this.f168220w;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f13)));
        int i13 = AbstractC39122p1.f168258a;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39108l) && Float.compare(this.f168220w, ((C39108l) obj).f168220w) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f168220w);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("FixedScale(value="), this.f168220w, ')');
    }
}
