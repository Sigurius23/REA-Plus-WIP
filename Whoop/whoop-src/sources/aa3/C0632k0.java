package aa3;

import l83.C23476v;

/* JADX INFO: renamed from: aa3.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0632k0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final long f2207a;

    public C0632k0(long j7) {
        this.f2207a = j7;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return new C23476v(this.f2207a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0632k0) && this.f2207a == ((C0632k0) obj).f2207a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2207a);
    }
}
