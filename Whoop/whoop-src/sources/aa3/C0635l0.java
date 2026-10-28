package aa3;

import l83.C23479y;

/* JADX INFO: renamed from: aa3.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0635l0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final short f2214a;

    public C0635l0(short s13) {
        this.f2214a = s13;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return new C23479y(this.f2214a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0635l0) && this.f2214a == ((C0635l0) obj).f2214a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f2214a);
    }
}
