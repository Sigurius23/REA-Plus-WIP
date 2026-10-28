package p026b2;

import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: b2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2305k implements InterfaceC2300f {

    /* JADX INFO: renamed from: a */
    public final float f9119a;

    public C2305k(float f13) {
        this.f9119a = f13;
    }

    @Override // p026b2.InterfaceC2300f
    /* JADX INFO: renamed from: a */
    public final int mo7155a(int i13, int i14, EnumC39181m enumC39181m) {
        float f13 = (i14 - i13) / 2.0f;
        EnumC39181m enumC39181m2 = EnumC39181m.f168423w;
        float f14 = this.f9119a;
        if (enumC39181m != enumC39181m2) {
            f14 *= -1;
        }
        return AbstractC11895b.m31982a(1, f14, f13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2305k) && Float.compare(this.f9119a, ((C2305k) obj).f9119a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9119a);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("Horizontal(bias="), this.f9119a, ')');
    }
}
