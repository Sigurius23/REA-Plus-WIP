package p026b2;

import p088dc.AbstractC11895b;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: b2.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2303i implements InterfaceC2300f {
    @Override // p026b2.InterfaceC2300f
    /* JADX INFO: renamed from: a */
    public final int mo7155a(int i13, int i14, EnumC39181m enumC39181m) {
        return AbstractC11895b.m31982a(1, -1.0f, (i14 - i13) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2303i) && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f);
    }

    public final String toString() {
        return "Horizontal(bias=-1.0)";
    }
}
