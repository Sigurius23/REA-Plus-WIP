package p026b2;

import p000.AbstractC30802r;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: b2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2306l implements InterfaceC2301g {

    /* JADX INFO: renamed from: a */
    public final float f9120a;

    public C2306l(float f13) {
        this.f9120a = f13;
    }

    /* JADX INFO: renamed from: a */
    public final int m7157a(int i13, int i14) {
        return AbstractC11895b.m31982a(1, this.f9120a, (i14 - i13) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2306l) && Float.compare(this.f9120a, ((C2306l) obj).f9120a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9120a);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("Vertical(bias="), this.f9120a, ')');
    }
}
