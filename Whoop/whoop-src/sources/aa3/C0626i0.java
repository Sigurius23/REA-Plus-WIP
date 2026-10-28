package aa3;

import l83.C23472r;

/* JADX INFO: renamed from: aa3.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0626i0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final byte f2193a;

    public C0626i0(byte b) {
        this.f2193a = b;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return new C23472r(this.f2193a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0626i0) && this.f2193a == ((C0626i0) obj).f2193a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f2193a);
    }
}
