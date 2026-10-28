package aa3;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: aa3.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0648q0 extends AbstractC0650r0 {

    /* JADX INFO: renamed from: a */
    public final int f2273a;

    public C0648q0(int i13) {
        this.f2273a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0648q0) && this.f2273a == ((C0648q0) obj).f2273a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2273a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("TypeParameter(id="), this.f2273a, ')');
    }
}
