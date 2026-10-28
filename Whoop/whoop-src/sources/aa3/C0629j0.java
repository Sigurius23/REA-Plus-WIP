package aa3;

import l83.C23474t;

/* JADX INFO: renamed from: aa3.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0629j0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final int f2201a;

    public C0629j0(int i13) {
        this.f2201a = i13;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return new C23474t(this.f2201a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0629j0) && this.f2201a == ((C0629j0) obj).f2201a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2201a);
    }
}
